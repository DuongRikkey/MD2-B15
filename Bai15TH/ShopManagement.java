package Bai15TH;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopManagement {
    private static ArrayList<Categories> categoriesList = new ArrayList<>();
    private static ArrayList<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------------------SHOP MENU---------------------------");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageCategories();
                    break;
                case 2:
                    manageProducts();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private static void manageCategories() {
        while (true) {
            System.out.println("-------------------CATEGORIES MENU----------------------");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Implement input for multiple categories
                    break;
                case 2:
                    // Implement display for all categories
                    break;
                case 3:
                    // Implement update category information
                    break;
                case 4:
                    // Implement delete category
                    break;
                case 5:
                    // Implement update category status
                    break;
                case 6:
                    return; // Exit to SHOP MANAGEMENT MENU
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }

    private static void manageProducts() {
        while (true) {
            System.out.println("-----------------PRODUCT MANAGEMENT------------------");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm theo mã sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã sản phẩm");
            System.out.println("6. Tìm kiếm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Tìm kiếm sản phẩm trong khoảng giá a – b");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Implement input for multiple products
                    break;
                case 2:
                    // Implement display for all products
                    break;
                case 3:
                    // Implement sorting products by price
                    break;
                case 4:
                    // Implement update product information by product ID
                    break;
                case 5:
                    // Implement delete product by product ID
                    break;
                case 6:
                    // Implement search for products by name
                    break;
                case 7:
                    // Implement search for products in a price range
                    break;
                case 8:
                    return; // Exit to SHOP MANAGEMENT MENU
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    }
}

