package main.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;

public class User {
    private BigInteger id;
    private String username;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Timestamp gmtCreate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public User() {
    }

    public User(BigInteger id, String username, String password, Timestamp gmtCreate, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gmtCreate = gmtCreate;
        this.birthday = birthday;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", birthday=" + birthday +
                '}';
    }
}
