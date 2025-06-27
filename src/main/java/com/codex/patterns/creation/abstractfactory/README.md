# Abstract Factory Pattern

**Intent:** Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

**How it works:**
- Defines an interface for creating related objects (e.g., `Chair`, `Table`).
- Concrete factories (e.g., `ModernFurnitureFactory`, `VictorianFurnitureFactory`) implement this interface to create specific variants.
- Client uses the factory interface, not the concrete classes.

**Layman Example:** Furniture factory producing modern or victorian chairs and tables.

**Key Classes:**
- `FurnitureFactory`, `ModernFurnitureFactory`, `VictorianFurnitureFactory`
- `Chair`, `Table`, `ModernChair`, `VictorianChair`, etc.

**Demo:** See `AbstractFactoryDemo.java` for usage.
