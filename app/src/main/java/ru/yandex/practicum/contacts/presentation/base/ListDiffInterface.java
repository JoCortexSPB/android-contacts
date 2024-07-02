package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public <T> boolean theSameAs(T cType);
    boolean equals(Object obj);
}
