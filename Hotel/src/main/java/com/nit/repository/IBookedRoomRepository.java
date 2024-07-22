package com.nit.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.model.BookedRoom;

public interface IBookedRoomRepository extends JpaRepository<BookedRoom, Long> {
	
	List<BookedRoom> findByRoomId(Long roomId);
	
	Optional<BookedRoom> findByBookingConfirmationCode(String confirmationCode);
	
	List<BookedRoom> findByGuestEmail(String email);

}
