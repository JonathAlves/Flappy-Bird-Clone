package com.gcstudios.entities;

import com.gcstudios.main.Game;
import com.gcstudios.world.Camera;
import com.gcstudios.world.World;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player extends Entity{

	public boolean isPressed = false;
	public BufferedImage spriteJump;
	public int lastDir = 1;


	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
		spriteJump = Game.spritesheet.getSprite(17, 0, 16, 16);
	}
	
	public void tick(){
		if(isPressed){
			if(y > 0) {
				lastDir = -1;
				y -= 2;
			}
		}else{
				lastDir = 1;
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

	public void render(Graphics g){
		if(lastDir == 1){
			super.render(g);
		}else{
			g.drawImage(spriteJump,this.getX() - Camera.x,this.getY() - Camera.y,null);
		}
	}
}
