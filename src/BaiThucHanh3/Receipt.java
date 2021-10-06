package BaiThucHanh3;

public class Receipt {
    private int firstNum;
    private int lastNum;
    private User user;

    public Receipt() {
    }

    public Receipt(int firstNum, int lastNum, User user) {
        this.firstNum = firstNum;
        this.lastNum = lastNum;
        this.user = user;
    }

    public Receipt(int firstNum, int lastNum) {
        this.firstNum = firstNum;
        this.lastNum = lastNum;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public double getBill(){
        double result = 0;
        result = (lastNum-firstNum)*750;
        return result;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "firstNum=" + firstNum +
                ", lastNum=" + lastNum +
                ", user=" + user +
                '}';
    }
}
