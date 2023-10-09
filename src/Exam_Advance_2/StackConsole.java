package Exam_Advance_2;

import java.util.Scanner;
import java.util.Stack;

public class StackConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
       while (true){
           System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                   "1. Nhập câu\n" +
                   "2. Đảo ngược câu\n" +
                   "3. Thoát");
           System.out.println("Mời nhập chức năng từ 1-3:");
           int choice = scanner.nextInt();
           scanner.nextLine();
           switch (choice){
               case 1:
                   System.out.println("Mời nhập câu ");
                   String string = scanner.nextLine();
                   String[] words = string.split("\\s+");
                   for (String s : words) {
                       stack.push(s);
                   }
                   break;
               case 2:
                   System.out.println("Câu đảo ngược là : ");
                   while (!stack.isEmpty()) {
                       System.out.print(stack.pop()+ " ");
                   }
                   System.out.println();
                   break;
               case 3:
                   return;
               default:
                   System.err.println("Nhập không đúng, Vui lòng nhập lại từ 1-3");
           }

       }

    }

}
