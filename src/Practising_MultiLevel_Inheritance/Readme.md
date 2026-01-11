<h1>Lets Learn MultiLevel Inheritance</h1>
<h3> What is Multilevel Inheritance?</h3>
<p>Multilevel inheritance means a class inherits from a class, which itself inherits from another class. Like a chain.</p>
<h3>🧩 What This Code Demonstrates:</h3>
<p>This Java program demonstrates multilevel inheritance, using the example of animals. It models the inheritance structure as: <br>
Animal → Mammal → Dog / Cat <br>
Each level of the hierarchy inherits behavior from the previous one and adds or overrides its own.<br>
🔹 Animal is abstract – it provides shared structure (name, noise) and common behavior (eat()), but it forces subclasses to implement walk() and makeNoise() methods.<br>
🔹 The constructor Animal(String name) sets the name of the animal.<br><br>
🐾 2. Intermediate Class – Mammal<br>
🔹 Mammal extends Animal.<br>
🔹 It implements the abstract methods walk() and makeNoise() from Animal.<br>
🔹 super(name) in Mammal calls the constructor of Animal to set the name.<br><br>
🐶 3. Subclass – Dog<br>
🔹 Dog extends Mammal, forming the third level in the inheritance chain.<br>
🔹 The constructor chain is:<br>
Dog(name) → Mammal(name) → Animal(name)<br>
🔹 The makeNoise() method is overridden to say "Wof WOf".<br><br>
🐱 4. Subclass – Cat<br>
🔹 Cat is just like Dog, but overrides makeNoise() differently and renames this.name manually.<br><br>
🚀 5. Program Runner – Run<br>
- This class creates and runs both a `Dog` and a `Cat`.<br>
- Calls their methods to demonstrate:<br>
- Inherited behaviors (`walk`, `eat`)<br>
- Overridden methods (`makeNoise`)<br><br>
🏁 6. Main Class – Main<br>
🔹 The entry point of the program. It simply creates an object of Run and runs it.
</p>
