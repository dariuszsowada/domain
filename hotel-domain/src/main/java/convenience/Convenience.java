package main.java.convenience;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Convenience {

	@Id
	UUID convenience_id;
	
	String name;
	boolean payable;
	
}
