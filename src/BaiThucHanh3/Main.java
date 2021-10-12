package BaiThucHanh3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Receipt>receiptArrayList = new ArrayList<>();
        int choice = 0 ;
        Scanner scanner = new Scanner(System.in);

        while(choice!=4){
            showMenu();
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    int n;
                    System.out.println("nhap so ho su dung dien:");
                    n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        Receipt receipt = new Receipt();
                        receipt.inputInfo();
                        receiptArrayList.add(receipt);
                    }
                    break;
                case 2:
                    for (Receipt a: receiptArrayList) {
                        a.showInfo();
                    }
                    break;
                case 3:
                    for (Receipt b: receiptArrayList) {
                        System.out.println(b.getMoney());
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.err.println("Nhap lai");
                    break;

            }
        }



    }
    public static void showMenu(){
            System.out.println("Quan ly bien lai tien dien");
            System.out.println("1. Nhap thong tin cho n ho su dung dien");
            System.out.println("2. Hien thi thong tin bien lai");
            System.out.println("3. Tinh tien dien cua moi ho dan");
            System.out.println("4. Exit!");
            System.out.println("Nhap lua chon cua ban");

    }
}
