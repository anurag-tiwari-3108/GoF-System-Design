# Strategy Pattern

**Intent:** Define a family of algorithms, encapsulate each one, and make them interchangeable.

**How it works:**
- Strategy interface for algorithms.
- Context uses a strategy to perform its behavior.

**Layman Example:** Payment strategy (Credit Card, PayPal).

**Key Classes:**
- `PaymentStrategy`, `CreditCardPayment`, `PayPalPayment`, `PaymentContext`

**Demo:** See `StrategyDemo.java` for usage.
