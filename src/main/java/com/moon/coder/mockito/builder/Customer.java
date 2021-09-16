package com.moon.coder.mockito.builder;

/**
 * Created by Moon on 15/09/2021
 */
public class Customer {
    private  String firstName; // required
    private  String lastName; // required
    private  int age; // optional
    private  String phone; // optional
    private  String address; // optional
    private boolean isAccessible;





    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public boolean isAccessible() {
        return getAddress() != null || getPhone() != null;
    }

    public void setAccessible(boolean accessible) {
        isAccessible = accessible;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
