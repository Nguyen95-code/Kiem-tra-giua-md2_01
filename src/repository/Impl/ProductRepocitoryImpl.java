package repository.Impl;

import model.Product;
import repository.ProductRepository;

import java.util.*;

public class ProductRepocitoryImpl implements ProductRepository {


    ArrayList<Product> list = new ArrayList<Product>();

    @Override
    public void add(int index, Product product) {
        list.add(product);
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void set(int index, Product product) {
        if (index > list.size()) {
            System.out.println("Index>Size");
        } else {
            list.get(index).setId(product.getId());
            list.get(index).setName(product.getName());
            list.get(index).setPrice(product.getPrice());
            list.get(index).setStatus(product.isStatus());
            list.get(index).setDescription(product.getDescription());
        }
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < list.size(); i++) {
            String productName = list.get(i).getName();
            if (productName.equals(i)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void remote(int index) {
        if (index > list.size()) {
            System.out.println("Index > Size");
        } else {
            list.remove(index);
        }
    }

    @Override
    public String display() {
        if (list.size() != 0) {
            String result = " ";
            for (int i = 0; i < list.size(); i++) {
                Product product = list.get(i);
                String status = product.isStatus() ? "Stocking" : "out of stock";
                System.out.println("ID : " + product.getId() + " Name : "
                        + product.getName() + " Price : " + product.getPrice() + " Status : "
                        + status + " Description : " + product.getDescription());
            }
            return result;
        } else {
            return "List product is emply";
        }
    }

    @Override
    public void sortUpPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

    }

    @Override
    public void sortDownPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.getPrice(), o1.getPrice());
            }
        });
    }
}
