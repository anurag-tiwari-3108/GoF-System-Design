# State Pattern

**Intent:** Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

**How it works:**
- State interface for encapsulating behavior associated with a state.
- Context delegates state-specific behavior to the current state object.

**Layman Example:** Traffic light changing colors.

**Key Classes:**
- `State`, `RedState`, `GreenState`, `YellowState`, `TrafficLight`

**Demo:** See `StateDemo.java` for usage.
