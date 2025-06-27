# Singleton Pattern

**Intent:** Ensure a class has only one instance and provide a global point of access to it.

**How it works:**
- Private constructor prevents instantiation from outside.
- Static method returns the single instance.
- Variants: Eager, Lazy, Bill Pugh, Enum, etc.

**Layman Example:** Logger, configuration manager, or database connection pool.

**Key Classes:**
- `EagerInitializedSingleton`, `BillPughSingleton`, `EnumSingletone`, etc.

**Demo:** See `SingletonDemo.java` for usage.
