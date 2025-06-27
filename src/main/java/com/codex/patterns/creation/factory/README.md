# Factory Method Pattern

**Intent:** Define an interface for creating an object, but let subclasses decide which class to instantiate.

**How it works:**
- Factory class has a method that returns objects of a common interface.
- Subclasses or logic decide which concrete class to return.

**Layman Example:** Shape factory creating circles or rectangles based on input.

**Key Classes:**
- `ShapeFactory`, `Shape`, `CircleShape`, `RectangleShape`

**Demo:** See `FactoryDemo.java` for usage.
