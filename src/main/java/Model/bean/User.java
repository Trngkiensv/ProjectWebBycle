package Model.bean;

import java.sql.Timestamp;

public class User {

    private int id;
    private String userName;
    private String fullName;
    private String email;
    private String tel;
    private String password;
    private String status;
    private Timestamp createDate ;


    public User(int id, String userName, String fullName, String email, String tel, String password, String status, Timestamp createDate) {
        this.id = id;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.tel = tel;
        this.password = password;
        this.status = status;
        this.createDate = createDate;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
