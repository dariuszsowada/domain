package main.java.hotel;

import java.util.Set;
import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import main.java.apartment.Apartment;

@Entity
@Data
public class Hotel {

	@Id
	UUID hotelId;
	
	String name;
	
	@Embedded
	Adres adres;
	
	@OneToMany
	Set<Apartment> apartments;
}
