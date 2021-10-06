package BaiThucHanh3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User cuong = new User("Cuong","TN","!123");
        User huyen = new User("Huyen","Hn","888");
        ArrayList<User> users = new ArrayList<>();
        users.add(cuong);
        users.add(huyen);

        Receipt bienLaiCuaCuong = new Receipt();
        bienLaiCuaCuong.setUser(cuong);
        bienLaiCuaCuong.setFirstNum(150);
        bienLaiCuaCuong.setLastNum(300);
        Receipt bienLaiCuaHuyen= new Receipt();
        bienLaiCuaHuyen.setUser(huyen);
        bienLaiCuaHuyen.setFirstNum(500);
        bienLaiCuaHuyen.setLastNum(800);

        ArrayList<Receipt> receipts = new ArrayList<>();
        receipts.add(bienLaiCuaCuong);
        receipts.add(bienLaiCuaHuyen);


        Manager manager = new Manager(users,receipts);
        System.out.println(manager.totalAllOfMoney());
        System.out.println(manager);



    }
}
