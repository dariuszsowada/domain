package apartment;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Apartment {
  
	int apartmentNumber;
	int numberOfRooms;
	int numberOfBeds;
}
