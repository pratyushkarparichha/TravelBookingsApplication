package com.nit.response;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class RoomResponse {
	
    private Long id;
	private String roomType;
	private BigDecimal roomPrice;
	private Boolean isBooked;
	private String photo;
	private List<BookingResponse> bookings;
	

//3 param constructor	
	public RoomResponse(Long id, String roomType, BigDecimal roomPrice) {
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}
//all param constructor
	public RoomResponse(Long id, String roomType, BigDecimal roomPrice, Boolean isBooked, byte[] photoBytes,
			List<BookingResponse> bookings) {
		
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = photoBytes != null ? org.apache.tomcat.util.codec.binary.Base64.encodeBase64String(photoBytes) : null;
		this.bookings = bookings;
	}
	
	
}
