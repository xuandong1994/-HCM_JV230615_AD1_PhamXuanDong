package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Catalog implements IShop {
    public static Scanner scanner =new Scanner(System.in);
    @Override
    public void inputData() {
        System.out.println("Mời nhập mã danh mục : ");
        this.catalogId =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập tên danh mục sản phẩm : ");
        this.catalogName =scanner.nextLine();
        System.out.println("Mời nhập độ ưu tiên: ");
        this.priority = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập mô tả danh mục : ");
        this.descriptions = scanner.nextLine();
        System.out.println("Mời nhập trạng thái danh mục : ");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", priority=" + priority +
                ", descriptions='" + descriptions + '\'' +
                ", catalogStatus=" + (catalogStatus? "Hoạt Động":"Không hoạt động") +
                '}');
    }
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private Boolean catalogStatus;

    public Catalog() {
    }

    public Catalog(int catalogId, String catalogName, int priority, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.priority = priority;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
}
