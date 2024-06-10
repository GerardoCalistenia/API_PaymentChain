package com.paymentchain.customer.entities;
/*
 * Created on Fri Jun 07 2024
 * Author: Gerardo Castellanos (@GerardoCalistenia)
 *
 * Todos los derechos reservados.
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Id
    private long id;
    private String name;
    private String phone;

}

