package com.gcstudios.entities;

import com.gcstudios.main.Game;
import com.gcstudios.world.World;

import java.awt.image.BufferedImage;

public class Player extends Entity{

	public boolean isPressed = false;


	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
		if(isPressed){
			y-=2;
		}else{
			y+=2;
		}

		if(y > Game.HEIGHT){
			Game.gamestate = GameState.ENDGAME;
			return;
		}
		for(int i = 0;i < Game.entities.size();i++) {
			Entity e = Game.entities.get(i);
			if (e != this) {
				if(Entity.isColidding(this, e)){
					Game.gamestate = GameState.ENDGAME;
					return;
				}
			}
		}
	}
}
