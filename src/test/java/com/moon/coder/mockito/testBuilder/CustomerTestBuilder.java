package com.moon.coder.mockito.testBuilder;

import com.moon.coder.mockito.builder.Customer;

/**
 * Created by Moon on 15/09/2021
 */
public class CustomerTestBuilder {

    private final String firstName; // required
    private final String lastName; // required
    private  int age=41; // optional
    private  String phone; // optional
    private  String address; // optional
    private boolean isAccessible;

    private CustomerTestBuilder(String firstName,String lastName){
        this.firstName= firstName;
        this.lastName=lastName;
    }

    public static CustomerTestBuilder aCustomer(String firstName,String lastName){ return new CustomerTestBuilder(firstName,lastName); }


    public CustomerTestBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerTestBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public CustomerTestBuilder withAddress(String address) {
        this.address = address;
        return this;
    }
    public boolean isAccessible() {
        return address != null || phone != null;
    }

    protected Customer build(){
        Customer customer =  new Customer(firstName,lastName);
        customer.setAge(age);
        customer.setAddress(address);
        customer.setPhone(phone);
        customer.setAccessible(isAccessible());
        return customer;

    }
}
