package com.moon.coder.mockito.builder;

/**
 * Created by Moon on 15/09/2021
 */
public class CustomerService {

    public boolean getCustomerIsAccessible(Customer customer){
        return  customer.isAccessible();
    }

    public String getCustomerFullName(Customer customer){
        return customer.getFirstName() +" " +customer.getLastName();
    }

    public String getCustomerAddress(Customer customer){
        return customer.getAddress();
    }
}
