package com.kubernetes.demo.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.kubernetes.demo.ejb.modelo.Team;

@Stateless
public class TeamDao {

	private Banco banco = new Banco();
	
	public void salva(Team team) {
		banco.save(team);
	}
	
	public List<Team> todosTeams() {
		return banco.listaTeams();
	}
	
}
