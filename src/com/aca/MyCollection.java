package com.aca;

import java.util.*;

public class MyCollection<T> implements Iterable<T> {

    private List<T> list;
    private Set<T> set;

    public MyCollection() {
        list = new ArrayList<>();
        set = new HashSet<>();
    }

    public MyCollection(List<T> values) {
        this.list = values;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    public void add(T value) {
        if (!list.contains(value))
            list.add(value);
    }

    public void add(Integer index, T value) {
        if (!list.contains(value))
            list.add(index, value);
    }

    public T get(Integer index) {
        return list.get(index);
    }

    public boolean contains(T value) {
        return list.contains(value);
    }

    public void remove(T value) {
        list.remove(value);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public Integer size() {
        return list.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : list) {
            sb.append(element);
            sb.append(", ");
        }

        sb.delete(sb.lastIndexOf(","), sb.lastIndexOf(",") + 2);
        return sb.toString();
    }
}
