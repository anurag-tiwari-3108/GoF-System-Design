# Chain of Responsibility Pattern

**Intent:** Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.

**How it works:**
- Handlers are linked in a chain.
- Each handler decides either to process the request or pass it to the next handler.

**Layman Example:** Help desk support chain (Level 1, 2, 3).

**Key Classes:**
- `SupportHandler`, `Level1Support`, `Level2Support`, `Level3Support`

**Demo:** See `ChainOfResponsibilityDemo.java` for usage.
