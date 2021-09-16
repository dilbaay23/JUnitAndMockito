package com.moon.coder.mockito.testBuilder;

import static org.junit.jupiter.api.Assertions.*;
import com.moon.coder.mockito.builder.Customer;
import com.moon.coder.mockito.builder.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

/**
 * Created by Moon on 15/09/2021
 */
@ExtendWith(MockitoExtension.class)
public class MockitoWithoutTestBuilder {
    @Mock Customer customer;
    @InjectMocks CustomerService customerService;

    @Test
    public void testVerify() {
        //when
        when(customer.getFirstName()).thenReturn("Moon");
        when(customer.getLastName()).thenReturn("Koc");
        when(customer.getAddress()).thenReturn("Address");
        when(customer.isAccessible()).thenReturn(true);


        //then
        assertEquals(customerService.getCustomerFullName(customer),"Moon Koc");
        assertEquals(customerService.getCustomerAddress(customer),"Address");
        assertTrue(customerService.getCustomerIsAccessible(customer));

    }
}
