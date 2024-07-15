package com.paymentchain.billing.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Schema(name="invoice", description = "Model that represent a invoice in database")
public class Invoice {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long id;

   @Schema(name="customerId", required = true, example = "2", defaultValue = "1", description = "Unique Id of customer thaht represent the owner of invoice.")
   private long customerId;
   @Schema(name="number", required = true, example = "3", defaultValue = "8", description = "Number given on fiscal invoice")
   private String number;
   private String detail;
   private double amount;
}
