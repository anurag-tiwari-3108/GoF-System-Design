# Bridge Pattern

**Intent:** Decouple an abstraction from its implementation so that the two can vary independently.

**How it works:**
- Abstraction contains a reference to the implementor interface.
- Concrete abstractions and implementors can be extended independently.

**Layman Example:** Remote controls for different devices (TV, Radio).

**Key Classes:**
- `RemoteControl`, `TVRemote`, `RadioRemote`, `TV`, `Radio`

**Demo:** See `BridgeDemo.java` for usage.
