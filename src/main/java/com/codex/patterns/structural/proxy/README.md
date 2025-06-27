# Proxy Pattern

**Intent:** Provide a surrogate or placeholder for another object to control access to it.

**How it works:**
- Proxy implements the same interface as the real object.
- Proxy controls access, adds security, caching, etc.

**Layman Example:** Internet proxy restricting access to certain sites.

**Key Classes:**
- `Internet`, `RealInternet`, `ProxyInternet`

**Demo:** See `ProxyDemo.java` for usage.
