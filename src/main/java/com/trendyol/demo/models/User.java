package com.trendyol.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class User {

    @Id
    private int id;
    private String name;
    private String surname;
    private String userName;
    private String password;
    private Date birthdate;
    private String address;

    public User(int id, String name, String surname, String userName, String password, Date birthdate, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
        this.birthdate = birthdate;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                '}';
    }


}
