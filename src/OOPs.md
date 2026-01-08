**Abstract \+ Constructor \+ Method Overriding**

### **Concept:**

* **Parent constructor runs first when creating a subclass object.**

* **If the parent constructor calls an overridden method, the child’s version is executed.**

* **But: The child’s instance variables are not yet initialized, so they have default values (`0` for int, `null` for objects).**

**INTERFACE+POLYMORPHISM**

**Concept:**  
**C overrides `show()` → class version runs.**

**Default methods in interfaces are ignored if class provides its own.**

**Abstract class constructor runs first.**

1. **Reference type `A obj = new B();` → field access compile-time reference type, methods → runtime type.**

2. **Interface variables → always static final.**

---

## **⚡ Java Polymorphism & Abstract/Interface Cheat Sheet**

          **┌─────────────────────┐**  
           **│   interface I1      │**  
           **│  x \= 100 (static)   │**  
           **└─────────────────────┘**  
                      **▲**  
                      **│ implements**  
           **┌─────────────────────┐**  
           **│   abstract class A   │**  
           **│  int x \= 300         │**  
           **│  constructor A()     │**  
           **│  abstract hello()    │**  
           **│  show() (optional)   │**  
           **└─────────────────────┘**  
                      **▲**  
                      **│ extends**  
           **┌─────────────────────┐**  
           **│       class B        │**  
           **│  int x \= 400         │**  
           **│  constructor B()     │**  
           **│  hello() → prints x  │**  
           **│  show() → prints x   │**  
           **└─────────────────────┘**

---

### **🔹 Rules to Remember:**

1. **Constructors**

   * **Always run from top to bottom (super → subclass)**

   * **Abstract class constructor executes when subclass object is created**

   * **Field access inside constructor → class’s own field, runtime polymorphism doesn’t apply**

2. **Methods**

   * **Runtime polymorphism applies → overridden methods in subclass run**

   * **Reference type doesn’t matter**

3. **Fields / Variables**

   * **Reference type decides → hidden fields are not polymorphic**

**Example:**

 **A obj \= new B();**  
**obj.x → A.x (300)**

*   
4. **Interface variables**

   * **Always static final → accessed directly by `I1.x` or `I2.x`**

   * **Object reference not needed**

5. **Overrides**

   * **Final methods → cannot override**

   * **Static methods → not polymorphic**

   * **Abstract methods → must override in concrete subclass**

---

### **🔹 Quick Example (Reference vs Runtime)**

**A obj \= new B();  // Reference type A, Object type B**  
**System.out.println(obj.x); // 300 → A's field**  
**obj.show();                // B's method → runtime → prints B's x**

* **Interface constants:**

**System.out.println(I1.x); // 100**  
**System.out.println(I2.x); // 200**

---

**MEGA QUESTION**

**![][image1]**

### **Tasks/Questions:**

1. **What will be the exact output of the above program? Explain carefully.**

2. **How many objects are created in memory, and where are `deviceCount`, `id`, and `model/brand` stored (heap vs stack vs method area)?**

3. **Which polymorphism concepts are demonstrated in this code?**

4. **What would happen if `Device.clone()` was not overridden? Would `d3 = d1.clone()` work? Why or why not?**

5. **How does the `static` method `printDeviceCount()` differ in behavior from instance methods in terms of memory and invocation?**

6. **Can `Device d = new Device(5)` compile? Why or why not?**

---

## **⚡ Stack vs Heap – Allocation Based MCQs**

### **Q1**

**int a \= 10;**

**`a` kahaan store hota hai?**  
 **a) Heap**  
 **b) Stack**  
 **c) Method Area**  
 **d) Register**

---

### **Q2**

**String s \= new String("Hello");**

**Yahan `s` aur `"Hello"` kahaan store hote hain?**  
 **a) `s` → Stack, `"Hello"` → String Pool (Heap)**  
 **b) `s` → Heap, `"Hello"` → Stack**  
 **c) Dono Heap**  
 **d) Dono Stack**

---

### **Q3**

**String s1 \= "Java";**  
**String s2 \= "Java";**

**Kitni objects heap me banengi?**  
 **a) 0**  
 **b) 1**  
 **c) 2**  
 **d) 3**

---

### **Q4**

**class Test {**  
    **int x \= 100;**  
**}**  
**public class Main {**  
    **public static void main(String\[\] args) {**  
        **Test t1 \= new Test();**  
    **}**  
**}**

**`t1` reference aur `new Test()` object kahaan store honge?**  
 **a) `t1` → Heap, `new Test()` → Stack**  
 **b) `t1` → Stack, `new Test()` → Heap**  
 **c) Dono Stack**  
 **d) Dono Heap**

---

### **Q5**

**final int a \= 50;**

**`a` kahaan store hota hai?**  
 **a) Heap**  
 **b) Stack**  
 **c) Method Area (constant pool)**  
 **d) Register**

---

### **Q6**

**Integer i1 \= 127;**  
**Integer i2 \= 127;**

**Yahan objects kahaan store hote hain?**  
 **a) Heap only**  
 **b) Stack only**  
 **c) Integer Cache (special area in Heap)**  
 **d) Method Area**

---

### **Q7**

**static int count \= 0;**

**`count` kahaan store hota hai?**  
 **a) Heap**  
 **b) Stack**  
 **c) Method Area (Class Level Memory)**  
 **d) Register**

---

### **Q8**

**public void method() {**  
    **int x \= 5;**  
**}**

**`x` kahaan store hota hai?**  
 **a) Heap**  
 **b) Stack (inside method frame)**  
 **c) Method Area**  
 **d) Register**

---

### **Q9**

**String s \= new String("World");**

**Yahan kitni objects heap me banengi?**  
 **a) 0**  
 **b) 1**  
 **c) 2**  
 **d) 3**

---

### **Q10**

**class A {**  
    **static int x \= 10;**  
    **int y \= 20;**  
**}**  
**public class Main {**  
    **public static void main(String\[\] args) {**  
        **A obj \= new A();**  
    **}**  
**}**

**Memory allocation ka sahi jawab?**  
 **a) `x` → Stack, `y` → Heap, `obj` → Heap**  
 **b) `x` → Method Area, `y` → Heap, `obj` → Stack**  
 **c) `x` → Method Area, `y` → Heap, `obj` ref → Stack, object → Heap**  
 **d) `x` → Heap, `y` → Stack, `obj` → Stack**

---

# **Common gotchas to remember**

* **`private` ≠ overrideable; `static` methods are *hidden*, not overridden.**  
* **Don’t call overridable methods from constructors (state may be uninitialized in child).**

* **Prefer getters/setters only when they add value (validation, invariants).**

### **6\. Overriding Rules**

**State whether the following statements are True or False:**

**a) You can override a `final` method.**  
 **b) You can overload a `final` method.**  
 **c) You can call a superclass constructor using `this()`.**  
 **d) You can prevent inheritance by declaring the class `final`**

## **`🧩 6. Overriding Rules — Explained Clearly`**

---

### **`a) You can override a final method.`**

**`❌ False`**

**`👉 You cannot override a final method because the keyword final means “no modification allowed”.`**  
 **`If you try to override, Java gives a compile-time error.`**

**`Example:`**

**`class A {`**

    **`final void show() { System.out.println("A show");`**

**`class B extends A {`**

    **`void show() { System.out.println("B show"); } // ❌ Error: cannot override final method`**

**`}`**

**`🧠 Remember:`**

* **`final method = can be used, but not changed in subclasses.`**

---

### **`b) You can overload a final method.`**

**`✅ True`**

**`👉 Overloading means same method name, but different parameters — this is not overriding, so it’s allowed.`**

**`Example:`**

**`class A {`**

    **`final void show() { System.out.println("A show"); }`**

    **`void show(int x) { System.out.println("A show with int"); } // ✅ valid overload`**

**`}`**

**`🧠 Key point:`**  
 **`Overloading creates a new method, not a changed version of the old one.`**  
 **`So final doesn’t block overloading.`**

---

### **`c) You can call a superclass constructor using this().`**

**`❌ False`**

**`👉 this() is used to call another constructor of the same class, not the superclass.`**

**`Example:`**

**`class Parent {`**

    **`Parent() { System.out.println("Parent constructor"); }`**

**`}`**

**`class Child extends Parent {`**

    **`Child() {`**

        **`this(5);  // ✅ calls another Child constructor`**

        **`// super(); ❌ cannot appear with this()`**

    **`}`**

    **`Child(int x) { System.out.println("Child constructor " + x); }`**

**`}`**

**`🧠 Key difference:`**

* **`this() → calls another constructor in the same class.`**

* **`super() → calls the parent class constructor.`**  
   **`You cannot use both in one constructor — they must be the first statement.`**

---

### **`d) You can prevent inheritance by declaring the class final.`**

**`✅ True`**

**`👉 Declaring a class as final stops other classes from inheriting it.`**

**`Example:`**

**`final class A {}`**

**`class B extends A {}  // ❌ Error: cannot subclass final class A`**

**`🧠 Remember:`**  
 **`A final class cannot have child classes.`**  
 **`Example in Java: String class is final, so you can’t extend it.`**

---

## **🧩 1️⃣ “is-a” Relationship → Inheritance**

### **🔹 Meaning**

**“A is-a B” means class A inherits from class B.**  
 **It’s a parent-child relationship.**

### **🔹 Example**

**class Animal {**  
    **void eat() { System.out.println("Eating..."); }**  
**}**

**class Dog extends Animal {**  
    **void bark() { System.out.println("Barking..."); }**  
**}**

**public class Test {**  
    **public static void main(String\[\] args) {**  
        **Dog d \= new Dog();**  
        **d.eat();   // from Animal**  
        **d.bark();  // from Dog**  
    **}**  
**}**

### **🧠 Explanation**

* **`Dog` is-a kind of `Animal` (because it extends it).**

* **This is inheritance — Dog automatically gets Animal’s behaviors.**

**✅ So:**

**Dog is-a Animal**

---

## **🧩 2️⃣ “has-a” Relationship → Composition / Aggregation**

### **🔹 Meaning**

**“A has-a B” means class A contains an object of class B inside it.**

### **🔹 Example**

**class Engine {**  
    **void start() { System.out.println("Engine starting..."); }**  
**}**

**class Car {**  
    **Engine e \= new Engine();  // Car has an Engine**  
**}**

### **🧠 Explanation**

* **A `Car` has-a `Engine` → this is composition.**

* **The `Car` *owns* the `Engine` object and can use it.**

**✅ So:**

**Car has-a Engine**

**This is not inheritance — it’s object-to-object relation (called *composition*).**

---

## **🧩 3️⃣ “was-a” Relationship → Polymorphism (Upcasting)**

### **🔹 Meaning**

**“A was-a B” means an object of subclass was previously treated as an object of superclass.**  
 **It happens during upcasting.**

### **🔹 Example**

**Animal a \= new Dog();  // Dog object, Animal reference**

### **🧠 Explanation**

* **The actual object is a `Dog`, but it’s being treated as an `Animal`.**

**So, at runtime we say:**

 **Dog was-a Animal**

*  **(because it *was created as Dog* but *is used as Animal* now).**

**✅ This is runtime polymorphism — we can call only `Animal` methods through `a`.**

---

## **🧩 4️⃣ `instanceof` → Type Checking Operator**

### **🔹 Meaning**

**`instanceof` checks if an object belongs to a class (or subclass) at runtime.**

### **🔹 Example**

**Animal a \= new Dog();**

**System.out.println(a instanceof Animal);  // true**  
**System.out.println(a instanceof Dog);     // true**  
**System.out.println(a instanceof Object);  // true**

### **🧠 Explanation**

* **`a` refers to a `Dog` object.**

* **Since `Dog` extends `Animal`, both `a instanceof Dog` and `a instanceof Animal` are true.**

**✅ So:**  
 **`instanceof` tells you the actual type of object your reference is pointing to.**

---

## **🧾 Quick Summary Table**

| Relationship | Meaning | Example | Concept |
| ----- | ----- | ----- | ----- |
| **is-a** | **A inherits B** | **`class Dog extends Animal`** | **Inheritance** |
| **has-a** | **A contains B** | **`Car has an Engine`** | **Composition** |
| **was-a** | **A subclass object used as superclass** | **`Animal a = new Dog();`** | **Polymorphism (upcasting)** |
| **instanceof** | **Checks actual type at runtime** | **`a instanceof Dog`** | **Runtime type check** |

---

[image1]: <data:image/png;base64,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0Q/qaigszDlzx4Vjf9UcH8aP44K3AbGAZ4HjWZ5eW5oeDQtCbD/MvVTFAus3JqarF/KBKXvIiEcDI36tTX84t2gLgYag3JtWU3aY/nHOMPfijsHCORZCiJdiCwshkYCwHDp0SJo2berbRgipfFBYyAmTnp4uu3btks8++0z69+/v204IqVxQWAghhAQKhYUQQkigUFgIIYQECoWFEEJIoFBYCCGEBAqFhRBCSKBEnbAge27v3r31L67utpIQVD8u6Ldbt26+ckIIqSyUibAgv9S3334rP/74o2zbtk3LevbsKQcOHJAOHTr46nuZOHGifPfddzJo0CDftpKAh/o++ugj6dKli2/bicCn0AkhlZ1SFxZ4CR988EGhB+n69u0rO3bskB9++EGFBgkNb7jhBn2/x9ixY2XNmjVqsFFv/fr1snr16tALpSA048aNk7Vr18qsWbO0rHv37rq+ceNGrY927jjQ38cffyxLly7V/jt16qT1pk+fLvfcc4+sWrVK94FybEdf2BeeLp89e7ZMnTpVHnvsMRkwYID2h7po8+STT8pbb72lZfCGFi9erMfg7p8QQioqpS4sMMwwvPBO8IIolDVv3lzmzJmjT27DeEN0evXqJUeOHJE333xTjfOHH34oAwcOlAkTJsinn36qwoC2e/fula+//lpFBR7I5MmT5b333lPB2LJli6YaQf/uONAeWXkhBBAzpH2/77775I8//pANGzbI7t279WlyiM2UKVO0/88//1wWLFig3ta+fftUSGwqE7SHAGH7G2+8ofto06aNiijK3f0TQkhFpdSFBWAeAuGwb775Rp577jm9s3dDU/jEOsq98yHectR78cUX1TvB8ttvvy0rVqzQz2nTpqlB379/v2//wLs/u7xp0yZ55513dDtEAdvgsTz77LPy/vvvq9Ddf//9of2Dw4cPy/z58wv1xVAYIaQyUybCYgln3MMJi7eNW+4VFojCunXr1It45ZVX5IknnlBhcPfr7htp3+FFwQOxwmKBMEGgIGpIDe8KC5bhpeATk/YLFy4M9YE22GbDZYQQUhkodWHBpDtCSvAA4LE89dRTWo5wFQwytsGY33nnnT5hwZwLPASEq+w71l1hgTgg/PTrr7/K77//Ls8880zYUBjGgTkdzLN88cUX2hdCYa6wwItBvS+//FI/wwkLwnYIhaEOwnl2jgUh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>