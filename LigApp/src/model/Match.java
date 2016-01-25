package model;

import java.io.Serializable;
import javax.persistence.*;
import model.Competitor;
import model.MatchResult;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity

public class Match implements Serializable {

	   
	@Id
	private int id;
	private Competitor defender;
	private Competitor challenger;
	private MatchResult finalScore;
	private static final long serialVersionUID = 1L;

	public Match() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public Competitor getDefender() {
		return this.defender;
	}

	public void setDefender(Competitor defender) {
		this.defender = defender;
	}   
	public Competitor getChallenger() {
		return this.challenger;
	}

	public void setChallenger(Competitor challenger) {
		this.challenger = challenger;
	}   
	public MatchResult getFinalScore() {
		return this.finalScore;
	}

	public void setFinalScore(MatchResult finalScore) {
		this.finalScore = finalScore;
	}
   
}
