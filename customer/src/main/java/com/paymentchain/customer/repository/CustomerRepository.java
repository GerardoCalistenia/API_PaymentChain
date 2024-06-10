package com.paymentchain.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paymentchain.customer.entities.Customer;

/*
 * Created on Fri Jun 07 2024
 * Author: Gerardo Castellanos (@GerardoCalistenia)
 *
 * Todos los derechos reservados.
 */


public interface CustomerRepository extends JpaRepository <Customer, Long> {
    Customer cliente = new Customer();    
    
}
