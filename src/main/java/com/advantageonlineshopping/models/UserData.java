package com.advantageonlineshopping.models;

public class UserData {

    String user;
    String email;
    String password;
    String confPassword;
    String firtName;
    String lastName;
    String phoneNumber;
    String city;
    String address;
    String state;
    String postalCode;

    public UserData(String user, String email, String password, String confPassword, String firtName, String lastName, String phoneNumber, String city, String address, String state, String postalCode) {
        this.user = user;
        this.email = email;
        this.password = password;
        this.confPassword = confPassword;
        this.firtName = firtName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.address = address;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getUser() {
        return user;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfPassword() {
        return confPassword;
    }

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
