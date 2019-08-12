package views;

import controller.ProductController;
import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        int choice;
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    String str = productController.display();
                    System.out.println(str);
                    break;
                case 2:
                    System.out.println("Nhập vị trí cần thêm sản phẩm : ");
                    productController.add(inputIndex(), createProduct());
                    break;
                case 3:
                    productController.add(createProduct());
                    break;
                case 4:
                    System.out.println("Nhập vị trí cần sửa: ");
                    productController.set(inputIndex(), createProduct());
                    break;
                case 5:
                    System.out.println("nhạp vị trí cần xóa: ");
                    productController.remote(inputIndex());
                    break;
                case 6:
                    System.out.println("Nhập tên sản phẩm: ");
                    productController.find(inputString());
                    break;
                case 7:
                    productController.sortUpPrice();
                    break;
                case 8:
                    productController.sortDowmPrice();
                    break;
                case 0:
                    System.out.println("Exit. ");
                    break;
                default:
                    System.out.println("Nhập từ 0-8 để thực hiện : ");
            }

        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("----- Chọn Số Từ 0-8 -----");
        System.out.println("0. Thoát Chương Trình");
        System.out.println("1. Hiển Thị");
        System.out.println("2. Thêm");
        System.out.println("3. Thêm Vào Cuối Danh Sách");
        System.out.println("4. Sửa");
        System.out.println("5. Xóa");
        System.out.println("6. Tìm Sản Phẩm Theo Tên");
        System.out.println("7. Sắp Xếp Tăng Dần Theo Giá");
        System.out.println("8. Sắp Xếp Giảm Dần Theo Giá");
    }

    public static int inputIndex() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.nextLine();
        return index;
    }

    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Product createProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm sản phẩm mới.");


        System.out.println("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();


        System.out.println("Nhập price: ");
        int price = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Nhập status: ");
        boolean status = scanner.nextBoolean();
        scanner.nextLine();


        System.out.println("Nhập Description: ");
        String description = scanner.nextLine();


        return new Product(id, name, price, status, description);
    }
}
