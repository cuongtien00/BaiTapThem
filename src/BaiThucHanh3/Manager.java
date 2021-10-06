package BaiThucHanh3;

import java.util.ArrayList;

public class Manager {
    ArrayList<User> users ;
    ArrayList<Receipt> receipts;

    public Manager() {
    }

    public Manager(ArrayList<User> users, ArrayList<Receipt> receipts) {
        this.users = users;
        this.receipts = receipts;
    }
    public void addNewUser(User user){
        users.add(user);
    }
    public double totalAllOfMoney(){
        double result = 0;
        for (Receipt a: receipts) {
            result += a.getBill();
        }
        return result;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "receipts=" + receipts +
                '}';
    }
}
