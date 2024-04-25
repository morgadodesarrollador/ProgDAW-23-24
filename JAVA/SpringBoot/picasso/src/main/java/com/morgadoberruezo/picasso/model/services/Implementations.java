package com.morgadoberruezo.picasso.model.services;

import java.util.List;

public interface Implementations<T> {
    public void create(T obj);
    public void delete(Long id);
    public T getId(Long id);
    public List<T> getAll();
}
