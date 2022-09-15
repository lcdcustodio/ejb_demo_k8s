package com.kubernetes.demo.ejb.bean;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import com.kubernetes.demo.ejb.dao.PlayerDao;
import com.kubernetes.demo.ejb.dao.TeamDao;
import com.kubernetes.demo.ejb.modelo.Player;
import com.kubernetes.demo.ejb.modelo.Team;

@Model
public class TeamBean {
	
	private Team team = new Team();
	private Integer playerId;
	@Inject
	private TeamDao teamDao;

	@Inject
	private PlayerDao playerDao;


	public List<Player> getPlayeres() {
		return playerDao.todosPlayeres();
	}
	
	public Team getTeam() {
		return team;
	}
	
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	
	public Integer getPlayerId() {
		return playerId;
	}
	
	public List<Team> getTeams() {
		return this.teamDao.todosTeams();
	}
}
