/**
 * 
 */
package com.devglan.service;

import java.util.List;

import com.devglan.model.Booking;

public interface BookingService {

	List<Booking> findUserBookings(String emailId);
}
