# Observer Pattern

**Intent:** Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**How it works:**
- Subject maintains a list of observers.
- Observers are notified of state changes.

**Layman Example:** Cricket score updates to multiple TV channels.

**Key Classes:**
- `CricketScore`, `CricketObserver`, `ObserverChannelStar`, etc.

**Demo:** See `CricketObserverDemo.java` for usage.
