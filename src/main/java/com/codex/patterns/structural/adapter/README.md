# Adapter Pattern

**Intent:** Allow objects with incompatible interfaces to work together.

**How it works:**
- Adapter wraps an existing class and provides a new interface.
- Client uses the adapter instead of the original class.

**Layman Example:** Power adapter converting European socket to USA device.

**Key Classes:**
- `EuropeanSocket`, `USASocketAdapter`, `USASocketAdapterImpl`, etc.

**Demo:** See `AdapterDemo.java` for usage.
