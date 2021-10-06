package BaiThucHanh1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User huyen = new User("Huyen", "2002", "123");
        User cuong = new User("Cuong", "2000", "456");
        ArrayList<User> user = new ArrayList<>();
        user.add(huyen);
        user.add(cuong);

        Room r1 = new Room("r1", "VIP", 100);
        Room r2 = new Room("r2", "MEDIUM", 70);
        Room r3 = new Room("r3", "FAKE", 50);
        ArrayList<Room> room = new ArrayList<>();
        room.add(r1);
        room.add(r2);
        room.add(r3);

        Hotel ongTan = new Hotel(user, room);

        Order orderOfHuyen = new Order();
        orderOfHuyen.setUser(huyen);
        orderOfHuyen.setRoom(r1);
        orderOfHuyen.setCheckIn(LocalDate.of(2021, 10, 1));
        orderOfHuyen.setCheckOut(LocalDate.of(2021, 10, 5));

        Order orderOfCuong = new Order();
        orderOfCuong.setUser(cuong);
        orderOfCuong.setRoom(r3);
        orderOfCuong.setCheckIn(LocalDate.of(2021, 9, 3));
        orderOfCuong.setCheckOut(LocalDate.of(2021, 9, 10));

        Order order2OfCuong = new Order();
        order2OfCuong.setUser(cuong);
        order2OfCuong.setRoom(r1);
        order2OfCuong.setCheckIn(LocalDate.of(2021, 9, 3));
        order2OfCuong.setCheckOut(LocalDate.of(2021, 9, 10));

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(orderOfCuong);
        orders.add(order2OfCuong);
        orders.add(orderOfHuyen);


        ongTan.setOrders(orders);
        System.out.println(ongTan.getAllTotalPrice());

        System.out.println("Client information :");
        ongTan.showInfoOfClient();


//        tinhSoPhongCuaMotKhachDangThue(orders);

        tinhTienPhongTuCMND(orders);


    }

    private static void tinhTongTienCuaMotPhong(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten phong can check: ");
        String roomName = scanner.nextLine();
        int total = 0;
        for (Order a : orders) {
            if (a.getRoom().getName().equalsIgnoreCase(roomName)) {

                total += a.getTotalPrice();
            }
        }
        if (total == 0) {
            System.out.println("Phong khong ton tai");
            return;
        }
        System.out.println("Tổng tiền thu được ở phòng " + roomName + " là: " + total);
    }

    private static void tinhLuotThueCuaMotPhong(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten phong can check: ");
        String roomName = scanner.nextLine();
        int count = 0;
        for (Order a : orders) {
            if (a.getRoom().getName().equalsIgnoreCase(roomName)) {
                count++;
            }
        }
        System.out.println("Phòng " + roomName + " có " + count + " lượt thuê ");
    }

    private static void tinhSoPhongCuaMotKhachDangThue(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten khach hang can check: ");
        String name = scanner.nextLine();
        int count = 0;
        for (Order a: orders) {
            if(a.getUser().getName().equalsIgnoreCase(name)){
                count++;
            }
        }
        if(count ==0){
            System.out.println("Khong tim thay khach hang");
            return;
        }
        else {
            System.out.println("So phong hien dang thue cua Ong/Ba " + name + " la " + count);
        }
}


    private static void tinhTienPhongTuCMND(ArrayList<Order> orders) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so cmnd khach hang muon thanh toan: ");
        String soCMND = scanner.nextLine();
        int total = 0;
        for (Order a: orders) {
            if(a.getUser().getNumberOfCMND().equalsIgnoreCase(soCMND)){
                total += a.getTotalPrice();
            }
        }
        if (total == 0){
            System.out.println("Khong tim thay khach hang");
            return;
        }
        System.out.println("So tien phong: " + total);
    }

}
