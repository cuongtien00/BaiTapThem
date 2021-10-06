package BaiThucHanh1;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Order {
    private LocalDate CheckIn;
    private LocalDate CheckOut;
    private User user;
    private Room room;
    int count = 0;

    public Order() {
    }

    public Order(LocalDate checkIn, LocalDate checkOut, User user, Room room) {
        CheckIn = checkIn;
        CheckOut = checkOut;
        this.user = user;
        this.room = room;
        int count = 0;
    }

    public LocalDate getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        CheckIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        CheckOut = checkOut;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Order{" + room +
                ", user=" + user +
                "CheckIn=" + CheckIn +
                ", CheckOut=" + CheckOut +
                '}';
    }

    public long getTotalPrice(){
        long result = 0;

        long numDay = DAYS.between(CheckIn,CheckOut);

         int price = room.getPrice();

         result = numDay*price;

         return result;

    }
}
