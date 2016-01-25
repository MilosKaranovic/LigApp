package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MatchResult
 *
 */
@Entity

public class MatchResult implements Serializable {

	   
	@Id
	private String id;
	private int defendersScore;
	private int challengersScore;
	private static final long serialVersionUID = 1L;

	public MatchResult() {
		super();
	}   
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}   
	public int getDefendersScore() {
		return this.defendersScore;
	}

	public void setDefendersScore(int defendersScore) {
		this.defendersScore = defendersScore;
	}   
	public int getChallengersScore() {
		return this.challengersScore;
	}

	public void setChallengersScore(int challengersScore) {
		this.challengersScore = challengersScore;
	}
   
}
