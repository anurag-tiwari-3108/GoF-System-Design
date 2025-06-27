# Memento Pattern

**Intent:** Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.

**How it works:**
- Originator creates a memento containing a snapshot of its state.
- Caretaker holds the memento.

**Layman Example:** Text editor undo feature.

**Key Classes:**
- `TextEditor`, `Caretaker`, `Memento`

**Demo:** See `MementoDemo.java` for usage.
