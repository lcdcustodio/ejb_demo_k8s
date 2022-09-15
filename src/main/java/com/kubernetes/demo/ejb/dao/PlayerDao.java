package com.kubernetes.demo.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;

import com.kubernetes.demo.ejb.modelo.Player;

@Stateless
public class PlayerDao {

	private Banco banco = new Banco();

	public void salva(Player player) {
		banco.save(player);
	}
	
	public List<Player> todosPlayeres() {
		return banco.listaPlayeres();
	}

	public Player buscaPelaId(Integer playerId) {
		Player player = this.banco.buscaPelaId(playerId);
		return player;
	}
	
}
