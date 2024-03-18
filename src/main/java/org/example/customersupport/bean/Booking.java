package org.example.customersupport.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Booking {

    private String bookingNumber;
    private LocalDate bookingFrom;
    private LocalDate bookingTo;
    private Customer customer;
}
