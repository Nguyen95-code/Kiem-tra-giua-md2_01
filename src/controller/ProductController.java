package controller;

import model.Product;
import service.Impl.ProductServiceImpl;

public class ProductController extends ProductServiceImpl {
    ProductServiceImpl productService = new ProductServiceImpl();

    public void add(int index, Product product) {
        productService.add(product);
    }

    public void add(Product product) {
        productService.add(product);
    }

    public void remote(int index) {
        productService.remote(index);
    }

    public int find(String product) {
        return productService.find(product);
    }
    public String display(){
        return productService.display();
    }
    public void sortUpPrice(){
        productService.sortUpPrice();
    }
    public void sortDowmPrice(){
        productService.sortDownPrice();
    }

}
