package BaiThucHanh4;

public class User {
    private String name;
    private String code;
    private String dateOfBirth;
    private String className;

    public User() {
    }

    public User(String name, String code, String dateOfBirth, String className) {
        this.name = name;
        this.code = code;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
