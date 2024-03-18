package org.example.customersupport.service;

import org.example.customersupport.bean.Booking;
import org.example.customersupport.bean.Customer;
import org.example.customersupport.exception.BookingCannotBeCancelledException;
import org.example.customersupport.exception.BookingNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookingService {

    public Booking getBookingDetails(String bookingNumber, String customerName, String customerSurname) {
        ensureExists(bookingNumber, customerName, customerSurname);

        // Imitating retrieval from DB
        LocalDate bookingFrom = LocalDate.now().plusDays(1);
        LocalDate bookingTo = LocalDate.now().plusDays(3);
        Customer customer = new Customer(customerName, customerSurname);
        return new Booking(bookingNumber, bookingFrom, bookingTo, customer);
    }

    public void cancelBooking(String bookingNumber, String customerName, String customerSurname) {
        ensureExists(bookingNumber, customerName, customerSurname);

        // Imitating cancellation
        throw new BookingCannotBeCancelledException(bookingNumber);
    }

    private void ensureExists(String bookingNumber, String customerName, String customerSurname) {
        // Imitating check
        if (!(bookingNumber.equals("123-456")
                && customerName.equals("Klaus")
                && customerSurname.equals("Heisler"))) {
            throw new BookingNotFoundException(bookingNumber);
        }
    }
}
