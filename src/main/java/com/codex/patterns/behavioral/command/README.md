# Command Pattern

**Intent:** Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

**How it works:**
- Command interface with an execute method.
- Concrete commands implement the interface and call receiver methods.

**Layman Example:** Remote control for lights (on/off).

**Key Classes:**
- `Command`, `LightOnCommand`, `LightOffCommand`, `RemoteControl`, `Light`

**Demo:** See `CommandDemo.java` for usage.
