package repository;

import java.util.List;

public interface GenneralRepository<T> {
    void add(int index,T t);
    void add(T t);
    void set(int index,T t);
    void remote(int index);
    int find(String name);
    String display();
}
