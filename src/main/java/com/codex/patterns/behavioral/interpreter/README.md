# Interpreter Pattern

**Intent:** Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

**How it works:**
- Expression interface for grammar rules.
- Concrete classes implement interpretation logic.

**Layman Example:** Simple math expression interpreter (1 + 2).

**Key Classes:**
- `Expression`, `NumberExpression`, `AddExpression`

**Demo:** See `InterpreterDemo.java` for usage.
