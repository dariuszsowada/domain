package hotel;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import apartment.Apartment;

public class Hotel {

	@Id
	UUID hotelId;
	
	@OneToMany
	Set<Apartment> apartments;
}
