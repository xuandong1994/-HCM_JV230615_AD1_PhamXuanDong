package Exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        while (true){
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                    "2. Phụ huynh tiếp theo\n" +
                    "3. Thoát");
            System.out.println("Mời chọn chức năng từ 1-3");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Mời nhập tên phụ huynh : ");
                    String string = scanner.nextLine();
                    queue.offer(string);
                    break;
                case 2:
                    System.out.println("Phụ huynh tiếp theo " + queue.poll());
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Chọn không đúng vui lòng chọn từ 1-3");
            }
        }


    }
}
