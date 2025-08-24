package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public GameListDTO findById(Long id) {
		GameList game = gameListRepository.findById(id).get();
		GameListDTO dto = new GameListDTO(game);
		return dto;
	}
	
	public List<GameListDTO> findAll(){
		return gameListRepository.findAll().stream().map(x -> new GameListDTO(x)).toList();
	}
	
}
