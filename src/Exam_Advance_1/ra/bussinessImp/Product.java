package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Product implements IShop,Comparable<Product> {
    public static Scanner scanner = new Scanner(System.in);

    @Override
    public void inputData() {
        System.out.println("Mời nhập mã sản phẩm : ");
        this.productId =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập tên sản phẩm sản phẩm : ");
        this.productName =scanner.nextLine();
        System.out.println("Mời nhập tiêu đề: ");
        this.title = scanner.nextLine();
        System.out.println("Mời nhập mô tả sản phẩm : ");
        this.descriptions = scanner.nextLine();
        System.out.println("Mời nhập giá nhập sản phẩm : ");
        this.importPrice = scanner.nextFloat();
        scanner.nextLine();
        this.exportPrice =importPrice*RATE;
        System.out.println("Giá xuất: " + getExportPrice());
        System.out.println("Mời nhập trạng thái sản phẩm : ");
        this.productStatus = scanner.nextBoolean();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId = " + productId +
                ", productName = '" + productName + '\'' +
                ", title = '" + title + '\'' +
                ", descriptions = '" + descriptions + '\'' +
                ", catalog = " + catalog +
                ", exportPrice = " + exportPrice +
                ", productStatus = " + (productStatus?"còn hàng":"hết hàng" )+
                '}';
    }

    @Override
    public void displayData() {
        System.out.println(this);
    }
    private int productId;
    private String productName;
    private String title;
    private String  descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public Product(int productId, String productName, String title, String descriptions, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = productId;
        this.productName = productName;
        this.title = title;
        this.descriptions = descriptions;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public int compareTo(Product o) {
        return (int)(this.importPrice - o.importPrice);
    }
}
