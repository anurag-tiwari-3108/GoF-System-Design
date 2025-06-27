# Builder Pattern

**Intent:** Separate the construction of a complex object from its representation so that the same construction process can create different representations.

**How it works:**
- Builder class constructs the object step by step.
- Director (optional) controls the construction process.
- Useful for objects with many optional parameters.

**Layman Example:** Building a computer with optional features (graphics card, Bluetooth).

**Key Classes:**
- `Computer`, `ComputerBuilder`

**Demo:** See `ComputerBuilder.java` for usage.
