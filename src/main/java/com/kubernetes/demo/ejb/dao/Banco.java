package com.kubernetes.demo.ejb.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.kubernetes.demo.ejb.modelo.Player;
import com.kubernetes.demo.ejb.modelo.Team;

@Stateless
public class Banco {
	
	public static List<Team> teams = new ArrayList<Team>();
	public static List<Player> playeres = new ArrayList<Player>();
	
	private static int chave = 1;
	
	static {
		inicializaBanco();
	}

	public void save(Team team) {
		team.setId(chave++);
		teams.add(team);
	}
	
	public List<Team> listaTeams() {
		return teams;
	}
	
	public void save(Player player) {
		player.setId(chave++);
		playeres.add(player);
	}
	
	public List<Player> listaPlayeres() {
		return playeres;
	}

	public Player buscaPelaId(Integer playerId) {

		for (Player player : playeres) {
			if(player.getId().equals(playerId)) {
				return player;
			}
		}
		return null;
	}
	
	
	private static void inicializaBanco() {
		Player messi = new Player(chave++, "Lionel Messi");
		Player ronaldo = new Player(chave++, "Cristiano Ronaldo");
		Player neymar = new Player(chave++, "Neymar Jr");
		
		playeres.add(messi);
		playeres.add(ronaldo);
		playeres.add(neymar);
		
		teams.add(new Team("Barcelona",messi));
		teams.add(new Team("PSG",messi));

		teams.add(new Team("Real Madrid",ronaldo));
		teams.add(new Team("Juventus",ronaldo));

		teams.add(new Team("Santos",neymar));
		teams.add(new Team("PSG",neymar));
		
	}

}
