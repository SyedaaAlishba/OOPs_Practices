# **CHAPTER \-1** 

### **🌟 Fundamental Principle of Software Design – Summary**

1. **Core Idea:**  
    A program should be designed so that **any change affects only a small, predictable portion** of the code.

2. **Purpose:**  
    This makes programs **easier to modify, debug, and maintain**.

3. **Example Concept – Variable Scope:**

   * The **scope** of a variable defines **where it can be legally accessed** in the program.

4. **Types of Scope in Java:**

   * **Global Scope:**  
      Variable declared **outside methods** (e.g., `x` in the class).  
      → Accessible from **anywhere** in the class.

   * **Local Scope:**  
      Variable declared **inside a method** (e.g., `y` in `f()` or `g()`).  
      → Accessible **only within that method**.

   * **Block Scope:**  
      Variable declared **inside a block** (e.g., `z` in the `for` loop).  
      → Accessible **only within that block**.

5. **Why Scope Matters:**

   * Changing a variable affects **all lines of code within its scope**.

   * **Smaller scope \= fewer affected lines** \= **safer and easier maintenance**.

6. **Practical Example:**

   * If variable `y` in method `f()` is renamed → only `f()` is affected.

   * If global variable `x` is renamed → the **entire class** may be affected.

7. **Design Guideline:**  
    Each variable should have the **smallest possible scope** to minimize unintended side effects.

8. **Conclusion:**  
    Limiting scope supports the **fundamental design principle**—changes remain **localized**, predictable, and easy to manage.

---

## **🧩 Object-Oriented Basics – Summary Notes**

### **1\. Objects and Classes**

* Objects are the **fundamental building blocks** of Java programs.

* Each **object belongs to a class**, which defines its **data (variables)** and **behavior (methods)**.

* A **class** serves as a **blueprint**, and an **object** is a specific instance created from that blueprint.

---

### **2\. Application Program Interface (API)**

* The **public variables and methods** of a class make up its **API**.

* The API defines **how other classes or programs can interact** with that class.

* It acts as a **boundary** between a class’s internal implementation and the outside world.

* Java provides a **Javadoc tool** to automatically generate API documentation.

---

### **3\. Clients and Dependencies**

* When one class **uses another class**, it becomes a **client** of that class.

The class being used is called a **dependency**.  
 Example:

public class StringClient {

  public static void main(String\[\] args) {

    String s \= "abc";

   System.out.println(s.length());

  }

}

*  → `StringClient` is the **client**, and `String` is the **dependency**.

* A **client depends** on the dependency’s **API** to work correctly.

---

### **4\. API as a Contract**

* An API is a **contract** between a class and its clients.

* The client relies on the **documented behavior** of methods but does not need to know **how they are implemented**.

* As long as the API’s **behavior remains the same**, the internal implementation of the class can change without affecting the client.

---

### **5\. Importance of Dependencies in Design**

* If a class’s **API changes**, all **clients depending on it** may need to be updated.

* Therefore, **minimizing dependencies** is a key goal in software design.

* Fewer dependencies lead to **better modularity**, **easier maintenance**, and **reduced errors** when updating code.

---

### **💡 Key Takeaways**

* Objects and classes are central to Java’s structure.

* APIs define how classes communicate.

* Clients depend on other classes through their APIs.

* APIs act as contracts — stable and predictable behavior.

* Minimize dependencies to keep programs **modular, reliable, and easy to modify**.

---

## **💡 Explanation: Modularity**

### **1\. What Modularity Means**

* **Modularity** means breaking a large program into **separate, smaller parts** (called **modules**).

* In Java, each **class** acts as a **module** that handles a specific job.

* Each class is designed and written **independently**, based on its **API contract** — meaning programmers rely on what other classes *promise to do*, not how they do it.

---

### **2\. How It Works**

* When designing a big program:

  * You divide it into multiple **classes**.

  * Each class has its own **responsibilities** and **methods**.

  * While coding one class, you can assume other classes will later **work correctly** according to their **API**.

* After all the classes are completed and tested, they are **combined** to form the **final working program**.

---

### **3\. Benefits of Modularity**

* **Easier Programming:** Each class is smaller and simpler to write and understand.

* **Easier Debugging:** If an error occurs, you can focus on a single module instead of the whole program.

* **Team Collaboration:** Different programmers can work on different classes **simultaneously**.

* **Faster Development:** Because multiple parts are developed in parallel, the whole program gets done sooner.

* **Reusability:** Well-designed modules (classes) can often be reused in other projects.

---

### **4\. Modularity Is Essential**

* Every **good program** must be **modular**.

* However, modularity alone isn’t enough — the **design quality** of each class and the **connections between classes** also matter.

* Later design rules (like encapsulation, low coupling, and high cohesion) focus on improving how modules interact.

---

## **🧱 Class Diagrams** 

1. **Definition:**  
    A **class diagram** shows the **functionality of each class** in a program and the **dependencies (relationships)** between them.

2. **Structure of a Class Diagram:**  
    Each class is represented by a **rectangle** divided into three parts:

   * **Top section:** Class **name**

   * **Middle section:** **Variable declarations**

   * **Bottom section:** **Method declarations**

3. **Dependencies:**

   * If class **X uses class Y**, then an **arrow** is drawn from X to Y.

   * The arrow can be read as “**X uses Y**.”

   * Example: `StringClient → String`

4. **UML (Universal Modeling Language):**

   * Class diagrams are part of **UML**, a standard system for visualizing software design.

   * UML class diagrams can also show:

     * **Visibility** (e.g., `public`, `private`)

     * **Default values** for variables

     * **Different types of dependencies**

   * In this context, the dependency shown is a **UML association** (a simpler form of dependency).

5. **Usage During Development Phases:**

   * **Implementation Phase:**

     * The diagram acts as **documentation** for each class’s variables and methods.

     * It is **detailed**, showing both **public and private** members.

   * **Design Phase:**

     * The diagram serves as a **communication tool** among designers.

     * It focuses on the **functionality and relationships** between classes.

     * Only **important classes and public methods/variables** are shown to keep it simple.

6. **Design-Level Class Diagrams:**

   * Used mainly for **program design** (as in this book).

   * Often show **only public methods and variables**.

   * The **middle section (variables)** is usually **empty**, since most well-designed classes have **no public variables**.

---

## 

## **⚙️ Static vs. Non static**

### **1\. Static Variables**

* A **static variable** belongs to the **class**, not to individual objects.

* It is **shared among all objects** of that class.

* If one object **changes** the static variable’s value, **all other objects** will see the updated value.

* Only **one copy** of a static variable exists for the entire class.

🧩 **Example:**

private static int x;

All objects of the class share the same `x`.

---

### **2\. Non static (Instance) Variables**

* A **non static variable** (also called an **instance variable**) belongs to an **individual object**.

* Each object has its **own separate copy** of that variable.

* Changing the variable in one object does **not affect** other objects.

🧩 **Example:**

private int y;

Each object has its own `y` value.

---

### **3\. Example: The `StaticTest` Class**

public class StaticTest {  
    private static int x;  
    private int y;

    public StaticTest(int val) {  
        x \= val;  // shared among all objects  
        y \= val;  // unique to each object  
    }  
}

**Output explanation:**

StaticTest s1 \= new StaticTest(1);  
s1.print();  // 1 1

StaticTest s2 \= new StaticTest(2);  
s2.print();  // 2 2  
s1.print();  // 2 1

* `x` changes for all objects (because it’s static).

* `y` remains unique for each object.

---

### **4\. Static Methods**

* A **static method** belongs to the **class**, not to any object.

It can be called using the **class name** or an **object name**:

 StaticTest.getX();   // preferred – clearly shows it’s static  
s1.getX();           // allowed but less clear

*   
* Static methods **cannot access nonstatic variables** because they don’t belong to any specific object.

---

### **5\. Nonstatic Methods**

* A **nonstatic method** belongs to an **object**.

* It can access both **static** and **nonstatic** variables of its class.

* Example: The `print()` method in `StaticTest` is **nonstatic** because it uses both `x` and `y`.  
   

### **💡 Key Takeaways**

1. **Static → shared by the class** (one copy for all objects).

2. **Nonstatic → unique per object** (separate copy for each).

3. **Static methods → no object needed to call them**; can’t use instance variables.

4. **Nonstatic methods → belong to objects**; can access both static and instance members.

5. Prefer calling static methods using the **class name** for clarity.

---

### **🏦 Banking Demo (Version 1 Summary)**

* **Class:** `BankProgram`

* **Purpose:** Simple console-based bank management system.

* **Data Storage:**

  1. Uses a `HashMap<Integer, Integer>` to store account numbers and balances (in cents).

  2. Keys → Account numbers, Values → Balances.

* **Main Features / Methods:**

  1. `run()` → Loops to read user commands.

  2. `quit()` → Exits program.

  3. `newAccount()` → Creates new account, initializes balance \= 0\.

  4. `select()` → Selects an existing account and displays its balance.

  5. `deposit()` → Adds money to the current account.

  6. `authorizeLoan()` → Approves loan if balance ≥ half of requested loan.

  7. `showAll()` → Displays all account balances.

  8. `addInterest()` → Increases all balances by fixed interest rate.  
* **Problem:** One single class handles **too many responsibilities** (I/O, data management, control logic).

---

### **⚙️ Single Responsibility Rule (SRR)**

* **Definition:**  
   Each class should have **one clear purpose**, and **all its methods** should relate to that purpose.

* **Why Important:**

  * Reduces dependencies.

  * Easier to update and debug.

  * Different features can change independently.

* **Problem in Version 1:**

  * `BankProgram` handles both **I/O processing** and **bank account logic** — violating SRR.

* **Improved Design (Version 2):**

  * Divides the system into **three separate classes**:

    1. **`Bank`** → Manages account data and logic (no I/O).

    2. **`BankClient`** → Handles user input and output.

    3. **`BankProgram`** → Connects everything together.

  * **Result:** Modular, maintainable, and follows the SRR principle.

---

### **🏦 Banking Demo — Version 2 Summary (BankClient & BankProgram)**

#### **🔹 BankClient Class**

* **Purpose:** Handles **user input/output** (I/O) and interacts with the `Bank` class for actual operations.

* **Key Variables:**

  * `current` → stores current account number.

  * `scanner` → takes user input.

  * `bank` → object of `Bank` class (to perform account actions).

  * `done` → loop control flag.

* **Key Responsibilities:**

  * Acts as the **interface between user and bank logic**.

  * Calls methods from `Bank` (like `newAccount()`, `deposit()`, `authorizeLoan()`, etc.).

  * Displays output messages to the user.

* **Main Change from Version 1:**

  * **All I/O tasks moved here**, leaving `Bank` focused purely on data and logic.

---

#### **🔹 BankProgram Class**

* **Purpose:** Entry point of the application (contains `main()` method).

* **Responsibility:**

  * Creates a `BankClient` object.

  * Starts the program by calling `client.run()`.

* **No logic or I/O here** — it just ties components together.

#### 

#### **🧩 Key Design Improvements (Compared to Version 1\)**

* Clear separation of **responsibilities**:

  * `Bank` → Data & logic.

  * `BankClient` → Input/output handling.

  * `BankProgram` → Program startup/control.

* **Easier to modify or update:**

  * Change `Bank` logic without affecting UI (`BankClient`).

  * Change input/output (console → GUI) without touching `Bank` logic.

* Follows the **Single Responsibility Rule (SRR)** perfectly.

* Example of **modular and maintainable design**.

---

### **🔧 Refactoring**

* **Definition:**  
   Refactoring means **changing the structure or syntax of code** *without changing its behavior*.  
   → Goal: make code cleaner, more modular, and easier to maintain.

* **Examples of refactoring actions:**

  * Renaming a class, method, or variable.

  * Changing a variable’s data type.

  * Splitting one large class into multiple smaller ones (like BankProgram → Bank, BankClient, BankProgram).

* **IDE Support:**  
   Tools like **Eclipse** provide a **Refactor menu** to automatically perform such structural improvements.

* **Key idea:**  
   Refactoring improves **readability, modularity, and maintainability** — *not functionality.*

### **🧪 Unit Testing**

* **Purpose:**  
   To test each **class individually** (independent of the rest of the program).  
   → Confirms that every class’s methods work correctly for all **use cases** (possible ways the method can be used).

* **How it’s done:**  
   Create a **driver program** (test class) for each class.

  * The driver calls methods of the target class with sample data.

  * It checks if the **returned output matches expected results**.

* **Example:**  
   `BankTest` tests the `Bank` class by calling its methods (`deposit()`, `authorizeLoan()`, etc.) and verifying results.

---

### **⚙️ Testing Challenges & Solutions**

* **Problem 1:**  
   A class (like `BankClient`) depends on another class (`Bank`).  
   → Can’t test properly if `Bank` isn’t finished or has bugs.

   **✅ Solution:**  
   Use a **Mock Class** — a fake version of the real class that prints diagnostics and returns dummy values for testing.

* **Problem 2:**  
   A class takes **input from the console**, making it hard to automate tests.

   **✅ Solution:**  
   Redirect input from a **file** instead of typing manually.  
   → Ensures the same test inputs every time (consistent testing).

---

### **💡 Key Takeaways**

* Refactoring improves **code structure** without changing results.

* Unit testing ensures **each module/class works correctly** on its own.

* **Mock classes** simulate dependencies for isolated testing.

* **Input redirection** makes console-based programs easier to test repeatedly.

* `BankProgram` itself can serve as a **driver** for testing `BankClient`.

---

### **🧩 Class Design – Key Points**

* A program following the **Single Responsibility Rule** has **one class per responsibility**.  
   → Each class handles a distinct concern (e.g., banking logic, I/O, etc.).

* **Identifying responsibilities isn’t always complete at first.**

  * Some responsibilities become clearer as **new requirements** appear.

  * What seems like one responsibility may later split into multiple ones.

* **Example (Banking Demo – Version 2 → Version 3):**

  * In version 2, the `Bank` class stored account data in a **map** → keys \= account numbers, values \= balances.

  * When new data was needed (e.g., whether account owner is *foreign or domestic*), this structure became insufficient.

* **Solution:**  
   Introduce a new class — **`BankAccount`** — to represent an individual account with all its details.  
   → Now, the `Bank` map links:  
   `accountNumber → BankAccount object`

* **Result:**

  * Code becomes more **modular, extensible, and realistic**.

  * Each class models a **clear real-world concept** (Bank, BankAccount, Client).

---

### **💡 Takeaway**

* Class design **evolves with new requirements**.

* When a class starts handling multiple kinds of data or logic → **create a new class**.

* Aim for **clarity, separation, and scalability** in class structure.

---

### **⚙️ Version 3 – Enhanced Banking Demo (Class Design Update)**

* Introduced a new class **`BankAccount`** to represent individual bank accounts.  
   → Each account stores:

  * Account number

  * Balance

  * Ownership status (foreign or domestic)

* **`Bank` class** now stores:

  * A map of `BankAccount` objects instead of integer balances.

  * Methods updated to interact through `BankAccount` getters and setters.

  * Added a new method `setForeign()` to modify account ownership.

* **`BankClient` class** updated with:

  * A new command (7) to set account ownership type.

  * Modified `newAccount()` to ask the user whether the account is foreign or domestic.

  * A new helper method `requestForeign()` for user input.

* **Benefits of this update:**

  * Improved **modularity** — each class has a clearer, more focused purpose.

  * Easier to **extend** the system later (e.g., adding account types, interest rules).

  * Demonstrates how new requirements lead to creating **new classes** rather than overloading existing ones.

  * The **API contract** between `Bank` and `BankClient` remained stable — minimal changes needed.

### ➡️ **Encapsulation Rule**:

“A class’s implementation details should be hidden from its clients as much as possible.”

     **Benefit:** Makes code more secure, flexible, and easier to modify without affecting other parts of                the program. 

The **definition** of encapsulation tells *what it is* — wrapping data and methods and restricting access.  
 The **book’s statement** tells *what it results in* — the class’s internal implementation becomes hidden from outside code.

So both are correct ✅ — your book just focuses on the **“hiding” effect** rather than the **“wrapping” mechanism**.

### **Redistributing Responsibility** 

* In **version 3**, most work (like deposits, interest, loans) was done in the **Bank** class, while **BankAccount** only stored data.

* This caused an imbalance and violated the **Single Responsibility Principle** — Bank was handling both account management and account operations.

**Improvement in Version 4:**

* Tasks related to an individual account (depositing money, adding interest, checking collateral) are moved to the **BankAccount** class.

* The **Bank** class now only **delegates** actions to the appropriate BankAccount objects instead of doing them itself.

**Example:**

* Instead of Bank updating balances directly, it calls `ba.deposit(amt)` on the BankAccount object.

##  **Most Qualified Class Rule:**

“Work should be assigned to the class that knows best how to do it.”

**Benefits:**

* Each class handles its own responsibilities.

* Code becomes more modular, logical, and easier to maintain.

* The design now better follows **encapsulation** and **single responsibility** principles.

### **Dependency Injection**

* In earlier versions, the **BankClient** class created its own `Scanner` (using `System.in`) and `Bank` objects inside the class.

* This made it **less flexible**, because it could only read from the console and always used the same bank.

**Problem:**

* BankClient was deciding **how** to create its dependencies — but it wasn’t the “most qualified” class to do so.

**Solution — Dependency Injection:**

* Another class (that knows better) should **create and pass** the required objects (`Scanner`, `Bank`, etc.) to **BankClient**.

* This makes BankClient **independent** of where input comes from or which bank it uses.

**Constructor Injection:**

The most common form of dependency injection, where dependencies are passed through the **constructor**.

Example:

public BankClient(Scanner scanner, Bank bank) {

    this.scanner \= scanner;

    this.bank \= bank;

}

**Benefits:**

* Increases flexibility and reusability.

* Makes testing easier (you can pass mock or test objects).

* Follows the **Most Qualified Class Rule** — let the class that knows best provide dependencies.

## **🌸 2\. The real meaning of Dependency Injection (DI)**

Dependency Injection **does not mean “no dependencies.”**  
 It means:

“A class should *not create* its dependencies by itself — they should be *provided* (injected) by someone else.”

So yes — `BankClient` still *depends* on a `Scanner` — but it no longer *creates* one.

That’s the difference between:

* **depending on an object’s *existence***

* and **depending on its *creation***.

Here’s a **clear explanation and short summary** of this section 👇

---

### **Dependency Injection (Detailed Explanation)**

In **Version 4**, both the `BankClient` and `Bank` classes are updated to use **dependency injection**, making the program more flexible and modular.

---

#### **🏦 1\. BankClient improvements**

* Previously, `BankClient` directly **created** its own `Scanner` and `Bank` objects.

Now, these dependencies are **injected** (passed) into its **constructor**:

 public BankClient(Scanner scanner, Bank bank) {

    this.scanner \= scanner;

    this.bank \= bank;

}

*   
* This means `BankClient` no longer decides *where input comes from* or *which bank it uses*.

* Another class (like `BankProgram`) decides that — following the **Most Qualified Class Rule**.

---

#### **💰 2\. Bank improvements**

* The `Bank` class used to create its own `HashMap` for accounts and start `nextacct = 0`.

* But in real-world cases, accounts might come from a **database or file**, not a new empty map.

So, `Bank` is updated to receive these dependencies through its constructor:

 public Bank(HashMap\<Integer,BankAccount\> accounts, int n) {

    this.accounts \= accounts;

    nextacct \= n;

}

* 

---

#### **⚙️ 3\. Bank Program as Configuration Class**

The **BankProgram** class now becomes the **configuration class** — it creates all the objects and wires them together:

 HashMap\<Integer,BankAccount\> accounts \= new HashMap\<\>();

Bank bank \= new Bank(accounts, 0);

Scanner scanner \= new Scanner(System.in);

BankClient client \= new BankClient(scanner, bank);

client.run();

* It controls **how dependencies are set up**, while other classes just use what’s provided.

---

#### **🔄 4\. Dependency Inversion**

* In version 3, objects were created **from the top down**:  
   BankClient → Bank → Map.

* In version 4, they’re created **from the bottom up**:  
   Map → Bank → Scanner → BankClient.

* This reversal is called **dependency inversion** — each object is created **before** the one that depends on it.

---

#### **🧩 5\. Configuration File Idea**

* Some programs go further: instead of hardcoding the setup in Java, they keep it in a **configuration file**.

* The configuration class reads that file to create objects.

* This way, **end users can change program behavior** (like input source, file names, etc.) **without editing the code**.

---

## **🧠 6\. Summary — All concepts connected**

| Concept | Meaning | Example |
| ----- | ----- | ----- |
| **Dependency Injection** | Pass dependencies into a class instead of creating them inside | Pass `Scanner` and `Bank` into `BankClient` constructor |
| **Dependency Inversion** | Create dependencies first, then inject them into dependent classes | Create `HashMap → Bank → BankClient` |
| **Configuration Class** | A class that creates and wires together all objects | `BankProgram` |
| **Configuration File** | A file that stores setup info so code doesn’t have to change | `.txt` or `.json` with settings |

---

✅ **In simple words:**

In Version 4, we make our program more flexible and realistic by letting one class (`BankProgram`) decide *how things are created* and *who gets what*, instead of letting each class make those decisions itself.

### **Mediation — Summary for Notes**

* **Mediation:** The `Bank` class acts as a **mediator** between `BankClient` and `BankAccount`.  
   → `BankClient` doesn’t directly access `BankAccount`; it interacts only through `Bank`.

* **Purpose:** Improves **modularity** and **control** — `BankAccount` becomes private to `Bank`.  
   → When `BankAccount` changes, only `Bank` needs updating, not other classes.

* **Rule of Low Coupling:**

   “Try to minimize the number of class dependencies”  
   or informally, “Don’t talk to strangers.”  
   → Classes should only interact with familiar or necessary classes to reduce complexity.

* **Extra Benefit:**  
   The mediator (`Bank`) can **monitor or log** interactions — e.g., log deposits for foreign accounts

## 

## 

## 

## **💬 5\. Summary — in short lines**

| Concept | Meaning | Example |
| ----- | ----- | ----- |
| **Mediation** | A class acts as a middleman between two others | `Bank` mediates between `BankClient` and `BankAccount` |
| **Low Coupling Rule** | Minimize how many classes depend on each other | `BankClient` shouldn’t depend on `BankAccount` directly |
| **Benefit** | Easier to modify, extend, and track behavior | Adding new account rules doesn’t affect `BankClient` |

---

✅ **In simplest words:**

**Mediation**: “Let one class handle all communication for you.”  
 **Low Coupling**: “Don’t let classes talk directly to those they don’t need to know.”

### **Design Tradeoffs**

### **:** Sometimes design rules **conflict** (e.g., Low Coupling vs. Single Responsibility). 

**Mediation Conflict:**

* `Bank` mediates between `BankClient` and `BankAccount` → lowers coupling.

* But `Bank` ends up handling extra tasks (deposit, getBalance, setForeign) → violates Single Responsibility.

**Alternative Design:**

* Let `BankClient` directly access `BankAccount` → simpler API, clearer responsibilities, but **higher coupling**.

**Key Point:**

 Design rules are **guidelines**, not strict laws.  
 Every program requires **tradeoffs**, and the best design balances these effectively.

### **Explanation — The Design of Java Maps**

This section explains how **Java’s Map classes (like `HashMap` and `TreeMap`)** demonstrate *design tradeoffs* — between **simplicity, low coupling**, and **efficiency**.

---

#### **🧩 How Maps Work Internally**

A **Map** stores data as **key–value pairs**.  
 Each pair is stored as a small internal object called a **Map.Entry**.

* In `HashMap`, entries are stored in a **hash table**.

* In `TreeMap`, entries are stored in a **search tree**.

Each `Map.Entry` object represents one key–value pair like:

"a" → 1

"b" → 4

However, programmers (clients) usually don’t interact with `Map.Entry` directly — they use **`get()`** and **`put()`** methods provided by the `Map` interface.

---

#### **🧠 How Clients Typically Use Maps**

Example:

HashMap\<String, Integer\> m \= new HashMap\<\>();

m.put("a", 1);

m.put("b", 4);

int x \= m.get("a");

Set\<String\> keys \= m.keySet();

for (String s : keys) {

    int y \= m.get(s);

    System.out.println(s \+ " " \+ y);

}

Here:

* `keySet()` gives all the keys.

* `get(key)` retrieves each value.

This design is **simple and low-coupled** because the client only interacts with `HashMap`, not with `Map.Entry` objects directly.  
 That means `HashMap` acts as a **mediator** between the client and its internal entries.

---

#### **⚡ Problem: Inefficiency**

The loop above is **inefficient** because:

* `keySet()` must **traverse the entire map** to get all keys.

* Then, each call to `get()` **traverses again** to find each value.

So the data structure is **traversed twice**, wasting time.

---

#### 

#### **🚀 Efficient Alternative**

Java provides another method: **`entrySet()`**.

Set\<Map.Entry\<String, Integer\>\> entries \= m.entrySet();

for (Map.Entry\<String, Integer\> e : entries) {

    String key \= e.getKey();

    int value \= e.getValue();

    System.out.println(key \+ " " \+ value);

}

Here:

* Each loop iteration **directly accesses the entry** (key–value pair).

* The map is **traversed only once** → much faster.

---

#### **⚖️ The Tradeoff**

Allowing clients to access `Map.Entry` directly means:

* ✅ **Efficiency increases** — faster traversal.

* ❌ **Coupling increases** — clients now depend on two classes (`HashMap` and `Map.Entry`).

* ❌ **API flexibility decreases** — `Map.Entry`’s design can’t change easily, since client code uses it directly.

---

#### **🎯 Design Decision**

Java’s designers balanced both needs:

* **Beginners / typical use** → can ignore `Map.Entry` and just use `get()` / `put()`.

* **Advanced users / performance needs** → can use `entrySet()` for efficiency.

This approach respects both **simplicity** and **performance** — letting developers choose.

---

* **Map.Entry:** internal key–value object used in Maps.

* **Default Access (via get/put):**

  * Simple and low coupling (client doesn’t see entries).

  * But less efficient (data structure traversed twice).

* **entrySet():**

  * Gives direct access to entries → faster.

  * Increases coupling and complexity.

* **Tradeoff:**

  * Low coupling \+ simplicity **vs.** high efficiency.

* **Java’s Solution:**

  * Provides both approaches — simple API for most users, and entrySet() for performance when needed.

### **Summary**

When writing software, the main goal is to make the program **easy to change later**.  
 A good design means that if something changes, you only need to fix a **small and clear part** of the code — not the whole program.

To achieve this, follow these **important design rules**:

1. **Single Responsibility Rule** –  
    Each class should do **only one main job**, and all its methods should relate to that job.

2. **Encapsulation Rule** –  
    Hide the **inner details** of a class from other classes.  
    Others should only use what’s necessary (like public methods), not how things work inside.

3. **Most Qualified Class Rule** –  
    Give a task to the class that **knows best how to do it**.

4. **Low Coupling Rule** –  
    Try to keep **fewer connections or dependencies** between classes, so changes in one class don’t break others.

🔹 These are **guidelines**, not strict laws.  
 Sometimes you’ll need to balance between them — making smart tradeoffs depending on what your program needs.

# **CHAPTER \-2**

# Polymorphism and Interfaces

In a well-designed Java program, **each class has its own purpose**, but sometimes multiple classes share similar features.  
 For example, **HashMap** and **TreeMap** are different classes, yet both use methods like `get`, `put`, and `keySet`.  
 This shared functionality is handled through a concept called **polymorphism** — which allows different classes to be used in the same way.

---

### **Need for Polymorphism**

In the banking program:

* There are two types of accounts: **SavingsAccount** and **CheckingAccount**.

* They work differently:

  * Savings accounts need **half** the loan amount as balance.

  * Checking accounts need **two-thirds**.

  * Only savings accounts get **interest**.

* If we use `if` statements in a single `BankAccount` class to handle both types, the code becomes **slow**, **hard to modify**, and **error-prone**.

**Better approach:**  
 Create **separate classes** — `SavingsAccount` and `CheckingAccount` — each with its own code for methods like `hasEnoughCollateral()` or `toString()`.

---

### **Using Interfaces for Polymorphism**

To let the `Bank` class handle both account types easily:

* Define a **`BankAccount` interface**.

Excellent — you’ve just read one of the **core sections in Java polymorphism**. Let’s break this down into **clear, simple ideas**, so you deeply understand what’s going on here.

---

## **🧩 1\. Reference Types Recap**

Every variable in Java has a **declared type** — and that type determines **what kind of value or reference** it can hold.

* **Primitive type** → holds a *value* directly  
   (e.g., `int a = 5;`)

* **Reference type** → holds a *reference to an object*  
   (e.g., `BankAccount ba = new SavingsAccount(2);`)

Both **classes** and **interfaces** define **reference types**.

---

## **🧠 2\. Class-Typed vs Interface-Typed Variables**

Let’s compare these two:

### **Example:**

SavingsAccount sa \= new SavingsAccount(1);  
BankAccount ba \= new SavingsAccount(2);

| Variable | Type | What it holds | Legal? | Why |
| ----- | ----- | ----- | ----- | ----- |
| `sa` | `SavingsAccount` (class) | reference to `SavingsAccount` | ✅ | same type |
| `ba` | `BankAccount` (interface) | reference to `SavingsAccount` | ✅ | `SavingsAccount` implements `BankAccount` |

---

## **🧩 3\. Method Access Depends on Reference Type**

When you call methods on a variable, **you can only call methods that exist in its declared type**, not the object’s class.

sa.deposit(100);     // ✅ SavingsAccount has deposit()  
sa.addInterest();    // ✅ SavingsAccount has addInterest()

ba.deposit(100);     // ✅ deposit() is in BankAccount interface  
ba.addInterest();    // ❌ not in BankAccount interface

Even though `ba` *actually refers to* a `SavingsAccount` object,  
 the **compiler only looks at the variable’s type**, not the actual object.

💡 So `ba` is "crippled" — it can’t call `addInterest()` even though the object can do it\!

---

## **🔄 4\. Why Use Interface-Typed Variables?**

Because **interfaces let one variable hold different kinds of objects**:

BankAccount ba \= new SavingsAccount(1);  
ba \= new CheckingAccount(2);

Both are valid since both classes implement `BankAccount`.

This is **polymorphism** in action — one interface type referring to many possible object types.

---

## **🧰 5\. Arrays or Collections of Interface Type**

BankAccount\[\] accts \= new BankAccount\[2\];  
accts\[0\] \= new SavingsAccount(1);  
accts\[1\] \= new CheckingAccount(2);

Now, we can treat them all *generically* as `BankAccount`s:

for (BankAccount ba : accts)  
    ba.deposit(100);

We don’t care *which kind* of account each is — both respond to `deposit()` because that method exists in the interface.

---

## **🏦 6\. The Version 5 `Bank` Class**

### **Key points:**

* It stores all accounts (savings \+ checking) in a single `HashMap<Integer, BankAccount>`.

The `newAccount()` method decides which object to make, based on `type`:

 if (type \== 1\)  
    ba \= new SavingsAccount(acctnum);  
else  
    ba \= new CheckingAccount(acctnum);

*  Then stores it as a `BankAccount` reference → **interface-typed variable**.

The `getBalance()` method doesn’t care which subclass it is:

 BankAccount ba \= accounts.get(acctnum);  
return ba.getBalance();

*  This is **polymorphism** — the right method runs based on the object’s real type.

---

## **⚠️ 7\. The `addInterest()` Method and Type Casting**

for (BankAccount ba : accounts.values())  
    if (ba instanceof SavingsAccount) {  
        SavingsAccount sa \= (SavingsAccount) ba;  
        sa.addInterest();  
    }

Here, only **savings accounts** earn interest.  
 So we check the type using `instanceof`, then safely **cast** it to access `addInterest()`.

---

## **🎯 Summary**

| Concept | Description |
| ----- | ----- |
| **Class-typed variable** | Can call all public methods of that class |
| **Interface-typed variable** | Can only call methods in the interface |
| **Polymorphism** | One interface variable can refer to many object types |
| **Why use it** | To write flexible, reusable code that works with different object types |
| **Casting** | Used when you need to access subclass-specific methods |

---

# **TYPE CASTING:**

| Concept | Description |
| ----- | ----- |
| **Type Casting** | Forcing the compiler to treat an object reference as a specific type. |
| **Upcasting** | From subclass → superclass (safe, automatic). Example: `BankAccount ba = new SavingsAccount();` |
| **Downcasting** | From superclass → subclass (unsafe, needs explicit cast). Example: `SavingsAccount sa = (SavingsAccount) ba;` |
| **instanceof** | Used before downcasting to confirm the object type safely. |
| **Runtime Risk** | Wrong downcasting causes `ClassCastException`. |

Sure 😊 here’s the explanation in a simple and clear **note-style** format:

---

### **Type Casting**

**Definition:**  
 Type casting means **converting one object reference type into another**.  
 It tells the compiler what actual type of object a reference variable is holding.

---

### **Why It’s Needed**

The **Java compiler is strict** — it only looks at the *declared type* of a variable,  
 not the *actual object* it refers to.  
 So, sometimes even if a variable really holds the correct object,  
 Java will not allow certain operations without a cast.

---

### **Example**

BankAccount ba \= new SavingsAccount(1);

SavingsAccount sa \= ba;   // ❌ Error

The compiler gives an error because `ba` is declared as `BankAccount`,  
 and not all `BankAccount`s are `SavingsAccount`s.

---

### **Using Type Casting**

BankAccount ba \= new SavingsAccount(1);

SavingsAccount sa \= (SavingsAccount) ba;   // ✅ Works

Here, `(SavingsAccount)` tells the compiler that `ba` actually refers to a `SavingsAccount`.

---

### **Runtime Risk**

If the object isn’t really a `SavingsAccount`, the program throws a  
 `ClassCastException`.

Example:

BankAccount ba \= new CheckingAccount(2);

SavingsAccount sa \= (SavingsAccount) ba;   // ❌ Runtime Error

---

### **Using `instanceof` for Safety**

Before casting, check the object’s real type using `instanceof`.

if (ba instanceof SavingsAccount) {

    SavingsAccount sa \= (SavingsAccount) ba;

    sa.addInterest();

}

This makes the program **safe** and avoids runtime errors.

---

### **Important Points**

* `instanceof` → checks object type before casting.

* Casting → allows calling subclass-specific methods.

* Missing `instanceof` → risk of runtime crash.

* Missing cast → compile-time error.

---

Type casting allows a superclass or interface reference to access subclass methods.  
 Always use `instanceof` before casting to keep the program safe.

Excellent — this section is a **very important design concept** in Object-Oriented Programming (OOP), and you’ve reached the part where **polymorphism and abstraction meet clean architecture.**  
 Let’s break it down clearly 👇

---

### **🌟 Main Idea — Transparency**

**Transparency** means:

A client (like the `Bank` class) should be able to use an interface (like `BankAccount`) **without knowing** which specific class implements it (`SavingsAccount`, `CheckingAccount`, etc.).

In simple words:

The client shouldn’t care *what* the object is, only *what it can do.*

---

### **🧩 The Problem Before Transparency**

Earlier, `Bank.addInterest()` looked like this:

for (BankAccount ba : accounts.values()) {  
    if (ba instanceof SavingsAccount) {  
        ((SavingsAccount) ba).addInterest();  
    }  
}

❌ **Problem:**

* This code explicitly checks the type (`SavingsAccount`), so if a new type like `MoneyMarketAccount` is added, you must **update this method**.

* This causes **tight coupling** — `Bank` depends on all account types.

* Violates modular design — one change forces changes everywhere.

---

### **💡 The Transparent Solution**

Instead of checking which account type it is,  
 make **`addInterest()`** part of the **`BankAccount` interface**:

public interface BankAccount {  
    void addInterest();  
}

Then, each implementing class defines it differently:

public class SavingsAccount implements BankAccount {  
    public void addInterest() {  
        // logic to add interest  
    }  
}

public class CheckingAccount implements BankAccount {  
    public void addInterest() {  
        // do nothing  
    }  
}

Now, `Bank` can just write:

for (BankAccount ba : accounts.values()) {  
    ba.addInterest(); // works for all account types  
}

✅ No need for `if`  
 ✅ No need for `instanceof`  
 ✅ No dependency on specific subclasses

---

### **🔑 Rule of Transparency**

**A client should be able to use an interface without needing to know the classes that implement that interface.**

**In this example:**

* The `Bank` class (client) calls methods on `BankAccount` (interface).

* It doesn’t know or care *which* subclass (`SavingsAccount`, `CheckingAccount`) it’s dealing with.

---

### **🧠 Why It’s Important**

* **Eliminates `if` statements** that check object type.

* **Improves flexibility:** new account types can be added without modifying existing code.

* **Reduces coupling:** classes depend only on interfaces, not on specific implementations.

* **Supports polymorphism:** the same call (`ba.addInterest()`) behaves differently depending on the object’s real type.

---

### **⚡ Summary Points**

1. Transparency \= using an interface without knowing implementing classes.

2. Avoids `instanceof` and `if` chains.

3. Increases flexibility and reduces dependencies.

4. Enables polymorphism to handle behavior differences automatically.

5. Makes code **easier to maintain, extend, and reuse**.

---

Here’s a simple and clear **note-style summary** for your study notes 👇

---

### **Open-Closed Rule**

**Definition:**

A program should be **open for extension** but **closed for modification**.

---

### **Meaning:**

* **Open for extension** → You can **add new features or classes** without changing old code.

* **Closed for modification** → You should **avoid editing existing working code** because that can cause new bugs.

---

### **Example (Banking System):**

When adding a new account type like **MoneyMarketAccount**:

1. ✅ **Write a new class** `MoneyMarketAccount` that implements `BankAccount` → *extension* (safe).

2. ⚙️ **Slightly modify** `BankClient` and `Bank` methods to recognize this new type → *modification* (less ideal but small).

---

### **Why It Matters:**

* Modifying old code can **introduce bugs**.

* Extending through **new classes** keeps old code **stable and reusable**.

---

### **Goal:**

* Try to design systems where **new functionality** can be added  
   without **changing existing code**.

---

### **In Short:**

**Open-Closed Rule \= Extend, don’t modify.**  
 It helps make programs **flexible, reliable, and easier to maintain**.

Here’s a **clear and easy-to-understand summary** of the whole passage for your notes 👇

---

## **Comparable Interface & Related Concepts – Summary**

### **1\. Comparable Interface**

* Used to **compare objects** (like sorting by balance).

Declared as:

 public interface Comparable\<T\> {  
    int compareTo(T t);  
}

*   
* `x.compareTo(y)` returns:

  * **\> 0** → if x \> y

  * **\< 0** → if x \< y

  * **0** → if x \= y

**Example:**  
 Strings and many other classes in Java implement `Comparable`.  
 For example, `"abc".compareTo("x")` → negative value (because “abc” \< “x”).

---

### **2\. Implementing Comparable in Bank Accounts**

* `SavingsAccount` and `CheckingAccount` implement `Comparable<BankAccount>`.

`compareTo()` compares account balances:

 public int compareTo(BankAccount ba) {  
    if (balance \== ba.balance)  
        return acctNum \- ba.acctNum;  
    else  
        return balance \- ba.balance;  
}

*   
* Used in finding the **maximum balance** either by:

  * A custom method (`findMax`)

  * `Collections.max()` (which uses `compareTo` internally)

---

### **3\. Subtypes and “extends” Keyword**

* Both `SavingsAccount` and `CheckingAccount` implement `Comparable`,  
   but `BankAccount` didn’t → caused compile errors.

Solution:

 public interface BankAccount extends Comparable\<BankAccount\> { ... }

*   
* Now, any class that implements `BankAccount` automatically supports comparison.

---

### **4\. Java Collection Interfaces (Hierarchy Overview)**

Different collection types are connected through **subtype relationships** (using `extends`).

| Interface | Description |
| ----- | ----- |
| **Iterable** | Allows looping through elements using an iterator. |
| **Collection** | Extends Iterable; allows adding/removing/searching elements. |
| **List** | Ordered collection (like an array). |
| **Queue** | Ordered by arrival (FIFO – add at rear, remove from front). |
| **Set** | No duplicate elements. |
| **SortedSet** | Set with elements stored in sorted order. |

**Common Implementations:**

* `ArrayList` → implements `List` (uses array).

* `LinkedList` → implements `List` & `Queue`.

* `HashSet` → implements `Set` (uses hash table).

* `TreeSet` → implements `SortedSet` (uses tree).

---

### 

### **5\. Liskov Substitution Principle (LSP)**

If type X extends type Y, then **X can replace Y** anywhere in the program.

**Example:**

* `List extends Collection` → So a List **can be used** where a Collection is expected.

* **IS-A relationship:**

  * `Set IS-A Collection`

  * `SortedSet IS-A Set`

* LSP helps maintain **logical, consistent hierarchies**.

---

### **6\. Rule of Abstraction**

A class’s dependencies should be **as abstract as possible**.

**Example:**

Bad design:

 private ArrayList\<Double\> data;

* 

Better design:

 private List\<Double\> data;

* 

Best design:

 private Collection\<Double\> data;

* 

✅ Use **interfaces (List, Collection)** instead of **specific classes (ArrayList, HashMap)** → makes the program more **flexible and reusable**.

---

### **7\. Adding Code to Interfaces (Java 8+)**

* Interfaces can now include:

  * **Static methods**

  * **Default methods**

**Example:**

public interface BankAccount extends Comparable\<BankAccount\> {  
    static BankAccount createSavingsWithDeposit(int acct, int amount) { ... }  
    default boolean isEmpty() { return getBalance() \== 0; }  
}

* **Static method:** Utility function (cannot be overridden).

* **Default method:** Has a base implementation but can be **overridden** in child classes.

---

### **8\. Default Methods Example – `sort()`**

Before Java 8:

 Collections.sort(list, null);

* 

After Java 8 (simpler and faster):

 list.sort(null);

*   
* The `List` interface provides a **default implementation** of `sort()`,  
   but specific list types (like `ArrayList`) can override it for **better performance**.

---

### **🧠 Key Takeaways**

* **Comparable** lets objects be compared naturally.

* Use **interfaces** to keep code flexible and extensible.

* **Subtypes (extends)** ensure consistent hierarchy and safe type usage.

* **Liskov Principle** keeps inheritance logical.

* **Abstraction Rule**: depend on interfaces, not concrete classes.

* **Java 8** made interfaces stronger with **static** and **default methods**.

---

