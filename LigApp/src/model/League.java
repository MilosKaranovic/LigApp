package model;

import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: League
 *
 */
@Entity

public class League implements Serializable {

	   
	@Id
	private int id;
	private String name;
	private ArrayList matches;
	private ArrayList competitors;
	private static final long serialVersionUID = 1L;

	public League() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public ArrayList getMatches() {
		return this.matches;
	}

	public void setMatches(ArrayList matches) {
		this.matches = matches;
	}   
	public ArrayList getCompetitors() {
		return this.competitors;
	}

	public void setCompetitors(ArrayList competitors) {
		this.competitors = competitors;
	}
   
}
