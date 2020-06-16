package com.example.snakeLadder.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
	private int size;
	private List<Ladder> ladders;
	private List<Snake> snakes;
	private List<Player> players;

}
