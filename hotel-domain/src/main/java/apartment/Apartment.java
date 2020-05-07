package main.java.apartment;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Data;
import main.java.convenience.Convenience;
import main.java.hotel.Hotel;

@Data
@Entity
public class Apartment {
  
	@Id
	UUID apartmentId;
	
	int apartmentNumber;
	int numberOfRooms;
	int numberOfBeds;
	boolean hasBathroom;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="hotel_id", nullable=false)
	Hotel hotel;
	
	@ManyToMany
	List<Convenience> convenience;
}
