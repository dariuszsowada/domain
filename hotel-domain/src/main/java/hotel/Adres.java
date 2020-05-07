package main.java.hotel;

import java.util.UUID;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@Embeddable
public class Adres {
	
	UUID country;
	UUID city;
	String street;

}
