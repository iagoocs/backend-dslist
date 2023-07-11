package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepositories gameRepositories;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepositories.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
