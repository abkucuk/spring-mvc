package abkucuk.springbootmicroservices.springbootmicroservices.services;

import abkucuk.springbootmicroservices.springbootmicroservices.web.model.Customer;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public interface CustomerService {

    Customer getCustomerById(UUID customerId);
}