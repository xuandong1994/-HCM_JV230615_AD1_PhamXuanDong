package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.*;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        List<Catalog> listCatalog = new ArrayList<>();
        int choice;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục \n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "5. Thoát ");
            System.out.println("Mời nhập chức năng từ 1 -5:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Mời nhập số danh mục sản phẩm : ");
                    int quantity = scanner.nextInt();
                    for (int i = 0; i < quantity; i++) {
                        System.out.println("Danh mục " + (i + 1) + "là :");
                        Catalog catalog = new Catalog();
                        catalog.inputData();
                        listCatalog.add(catalog);
                    }
                    System.out.println("\nThông tin các danh mục sản phẩm:");
                    for (Catalog catalog : listCatalog) {
                        catalog.displayData();
                        System.out.println();
                    }

                    break;
                case 2:
                    System.out.println("Mời nhập số lượng sản phẩm : ");
                    int quantityProduct = scanner.nextInt();
                    for (int i = 0; i < quantityProduct; i++) {
                        System.out.println("Sản phẩm thứ " + (i + 1) + "là : ");
                        Product product = new Product();
                        product.inputData();
                        listCatalog.forEach(Catalog::displayData);
                        System.out.println("chọn 1 danh mục");
                        int number = scanner.nextInt();
                        Optional<Catalog> optional = listCatalog.stream().filter(a -> a.getCatalogId() == number).findFirst();
                        Catalog catalog = optional.get();
                        product.setCatalog(catalog);
                        listProduct.add(product);
                    }
                    System.out.println("\nThông tin các danh mục sản phẩm:");
                    for (Product product : listProduct) {
                        product.displayData();
                        System.out.println();
                    }


                    break;
                case 3:
                    System.out.println("Sắp xếp sản phẩm theo giá sản phẩm tăng dần");
                    listProduct.sort(Comparator.comparing(Product::getImportPrice));
                    break;
                case 4:
                    System.out.println("Mời nhập tên danh mục tìm kiếm :");
                    String nameCatalog = scanner.nextLine();
                    listCatalog.stream().filter(a -> a.getCatalogName().equals(nameCatalog)).forEach(System.out::println);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không đúng,Vui lòng nhập lại từ 1-5");
            }

        } while (choice != 5);
    }
}
