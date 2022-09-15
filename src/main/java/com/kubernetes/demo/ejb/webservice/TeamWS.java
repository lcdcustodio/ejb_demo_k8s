package com.kubernetes.demo.ejb.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import com.kubernetes.demo.ejb.dao.TeamDao;
import com.kubernetes.demo.ejb.modelo.Team;

@WebService
@Stateless
public class TeamWS {
	
	@Inject
	TeamDao dao;


	public List<Team> getTeam() {
		
		System.out.println("TeamWS");
		return dao.todosTeams();
	}
	
}
