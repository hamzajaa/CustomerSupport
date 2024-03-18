package org.example.customersupport.exception;

public class BookingNotFoundException extends RuntimeException{
    public BookingNotFoundException(String bookingNumber) {
        super("Booking " + bookingNumber + " not found");
    }
}
