package abkucuk.springbootmicroservices.springbootmicroservices.services;

import abkucuk.springbootmicroservices.springbootmicroservices.web.model.Customer;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder()
                .ID(UUID.randomUUID())
                .name("ahmet burak")
                .build();
    }
}
