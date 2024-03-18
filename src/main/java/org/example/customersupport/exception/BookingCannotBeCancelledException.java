package org.example.customersupport.exception;

public class BookingCannotBeCancelledException extends RuntimeException{
    public BookingCannotBeCancelledException(String bookingNumber) {
        super("Booking " + bookingNumber + " cannot be canceled");
    }
}
