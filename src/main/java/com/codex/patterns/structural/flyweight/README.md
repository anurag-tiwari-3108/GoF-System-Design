# Flyweight Pattern

**Intent:** Use sharing to support large numbers of fine-grained objects efficiently.

**How it works:**
- Flyweight objects share common state; unique state is stored externally.
- Factory manages flyweight instances.

**Layman Example:** Trees in a forest (many trees, but only a few types).

**Key Classes:**
- `Tree`, `OakTree`, `PineTree`, `TreeFactory`

**Demo:** See `FlyweightDemo.java` for usage.
