package repository;

import model.Product;

public interface ProductRepository extends GenneralRepository<Product> {
    @Override
    void add(int index, Product product);

    @Override
    void add(Product product);

    @Override
    void set(int index, Product product);

    @Override
    int find(String name);

    @Override
    void remote(int index);

    @Override
    String display();

    void sortUpPrice();

    void sortDownPrice();
}
