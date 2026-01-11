<h1>🔁 CLONING</h1>
<br>
📦 Package Structure
vehical → Contains the parent class Vehical

vehical.Bike → Contains the child class Bike

Default package → Contains the Cloning class (entry point)

🔷 Vehical Class (Parent)
A base class representing general vehicle details.

Contains four public fields:
name, color, model, company

🔷 Bike Class (Child)
Key Features:

Inherits all fields and methods from Vehical.

➕ Constructors:
Regular constructor:
Used to initialize a new Bike with values.

java
Copy
Edit
Bike(String name, String model, String company, String color)
Copy constructor (manual cloning):
Creates a new, independent copy of another Bike object.

java
Copy
Edit
Bike(Bike other)
📤 Method:
print() method:

Prints current values of name, color, model, and company.

🔷 Cloning Class (Main)
✅ What It Does:
Creates an original_bike using the constructor.

Clones it using the copy constructor into modified_bike.

Prints both original and clone to verify they’re identical initially.

Modifies the modified_bike fields (name, company).

Prints both again to show:

The original is unchanged.

The clone is modified independently.

🔄 Cloning vs Copying (Important Concept)
✅ Cloning (Manual Copy Constructor):
Creates a new object with the same data, but separate memory.

Any changes to the clone do NOT affect the original.

⚠️ Copying (Just Assigning References):
java
Copy
Edit
Bike b1 = new Bike(...);
Bike b2 = b1;  // ❌ This is reference copying
b2 and b1 now point to the same object.

Changes to one will affect the other — they share memory.

🔥 IMPORTANT NOTEEE:
In copying, you're just pointing two variables to the same memory. So changing one affects the other.
But in cloning, a new object is created, so both objects are completely independent. Modifying the clone will not change the original.
