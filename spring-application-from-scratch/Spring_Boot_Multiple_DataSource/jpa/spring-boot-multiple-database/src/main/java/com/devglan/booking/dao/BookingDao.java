package com.devglan.booking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.devglan.model.Booking;

public interface BookingDao extends CrudRepository<Booking, Long> {
	
	List<Booking> findByCreatedBy(Long userId);

}
