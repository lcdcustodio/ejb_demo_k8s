package com.kubernetes.demo.ejb.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Team {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String team;
	
	@ManyToOne
	private Player player;
	
	public Team() {
	}

	public Team(String team, Player player) {
		this.team = team;
		this.player = player;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getteam() {
		return team;
	}

	public void setteam(String team) {
		this.team = team;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
