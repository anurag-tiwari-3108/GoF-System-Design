# Visitor Pattern

**Intent:** Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

**How it works:**
- Visitor interface with visit methods for each element type.
- Elements accept a visitor.

**Layman Example:** Shopping cart visitor for books and fruits.

**Key Classes:**
- `ItemElement`, `Book`, `Fruit`, `ShoppingCartVisitor`, `ShoppingCartVisitorImpl`

**Demo:** See `VisitorDemo.java` for usage.
