package BaiThucHanh3;

import java.util.Scanner;

public class User {
    private String name;
    private String address;
    private String code;

    public User() {
    }

    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = input.nextLine();

        System.out.println("Nhap dia chi");
        address = input.nextLine();

        System.out.println("Nhap code");
        code = input.nextLine();

    }

    public User(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public void showInfo() {
        System.out.println("Khách hàng{" +
                "tên='" + name + '\'' +
                ", địa chỉ='" + address + '\'' +
                ", mã code='" + code + '\''
                );
    }
}
