package BaiThucHanh3;

import java.util.Scanner;

public class Receipt extends User {
    private int firstNum;
    private int lastNum;
    private float money;


    public Receipt() {
    }

    @Override
    public void inputInfo() {
        super.inputInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien cu ");
        firstNum = scanner.nextInt();

        System.out.println("Nhap so dien moi ");
        lastNum = scanner.nextInt();
    }

   public float getMoney(){
       this.money = (lastNum-firstNum)*750;
       return money;
   }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getLastNum() {
        return lastNum;
    }

    public void setLastNum(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("; firstNum: " + firstNum + "; lastNum: " + lastNum + "}");
    }
}
