package com.codex.patterns.behavioral.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
