package com.moon.coder.mockito.testBuilder;

import com.moon.coder.mockito.builder.Customer;
import com.moon.coder.mockito.builder.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by Moon on 15/09/2021
 */
@ExtendWith(MockitoExtension.class)
public class MockitoTestBuilder {
    private CustomerService customerService= new CustomerService();

    @Test
    public void testVerify_ageBigger40() {

        //geven
        Customer customer = CustomerTestBuilder.aCustomer("Moon","Koc").withAddress("Test Address").withAge(50).build();


        //then
        assertEquals(customerService.getCustomerFullName(customer),"Moon Koc");
        assertEquals(customerService.getCustomerAddress(customer),"Test Address");
        assertTrue(customerService.getCustomerIsAccessible(customer));

    }

}
