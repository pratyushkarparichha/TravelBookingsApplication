package com.nit.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.nit.model.Room;

public interface IRoomService {
	
	//for adding new room
	Room addNewRoom(MultipartFile photo, 
										 String roomType, 
										 BigDecimal roomPrice) throws SQLException, IOException;
	
	//for showing all room types while adding
	List<String> getAllRoomTypes();
	
	//for getting all rooms
	List<Room> getAllRooms();

	//for getting room photo
    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;
    
    //for delete room by id
    void deleteRoom(Long roomId);
    
    //for update room 
    Room updateRoom(Long roomId, String roomType, BigDecimal roomPrice, byte[] photoBytes);
    
    //for getting room by id
    Optional<Room> getRoomById(Long roomId);
    
    //for getting all available room by date and type
    List<Room> getAvailableRooms(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

}
