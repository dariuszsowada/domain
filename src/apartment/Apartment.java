package apartment;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import hotel.Hotel;
import lombok.Data;

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
}
