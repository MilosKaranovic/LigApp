package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competitor
 *
 */
@Entity

public class Competitor implements Serializable {

	   
	@Id
	private String id;
	private String name;
	private static final long serialVersionUID = 1L;

	public Competitor() {
		super();
	}   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
