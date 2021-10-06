package BaiThucHanh1;

public class Room {
    private  String name;
   private String type;
   private int price;
   public Boolean status;
   int count = 0;

    public Room() {
    }

    public Room(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Room(String name, String type, int price, Boolean status) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.status = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
