package BaiThucHanh1;

public class User {
    private String name;
    private String dateOfBirth;
    private String numberOfCMND;

    public User() {
    }

    public User(String name, String dateOfBirth, String numberOfCMND) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.numberOfCMND = numberOfCMND;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNumberOfCMND() {
        return numberOfCMND;
    }

    public void setNumberOfCMND(String numberOfCMND) {
        this.numberOfCMND = numberOfCMND;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age='" + dateOfBirth + '\'' +
                ", numberOfCMND=" + numberOfCMND +
                '}';
    }
}
