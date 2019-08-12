package service;

import model.Product;
import repository.GenneralRepository;

public interface ProductService extends GenneralRepository<Product> {

    @Override
    void add(int index, Product product);

    @Override
    void add(Product product);

    @Override
    void remote(int index);

    @Override
    void set(int index, Product product);

    @Override
    int find(String name);

    @Override
    String display();

    void sortUpPrice();

    void sortDownPrice();
}
