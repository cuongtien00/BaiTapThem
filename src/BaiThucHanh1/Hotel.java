package BaiThucHanh1;

import java.util.ArrayList;

public class Hotel {
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Order> orders = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Hotel(ArrayList<User> users, ArrayList<Room> rooms) {
        this.users = users;
        this.rooms = rooms;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    public void addNewRoom(Room room){
         rooms.add(room);
    }
    public long getAllTotalPrice(){
        long total = 0;
        for (Order order: orders) {
            total += order.getTotalPrice();
        }
        return total;
    }
    public void showInfoOfClient() {
        System.out.println(toString());
    }
    public long checkOut(Order order){
        return  order.getTotalPrice();
    }
    @Override
    public String toString() {
        return "Hotel{" +
                 orders +
                '}';
    }
}
