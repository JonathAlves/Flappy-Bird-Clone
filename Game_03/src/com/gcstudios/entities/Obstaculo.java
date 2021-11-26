package com.gcstudios.entities;

import com.gcstudios.main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Obstaculo extends Entity{

    public Obstaculo(double x, double y, int width, int height, double speed, BufferedImage sprite) {
        super(x, y, width, height, speed, sprite);
    }

    public void tick(){
        x--;
        if(x+width <= 0){
            Game.score+=0.5;
            Game.entities.remove(this);
            return;
        }
    }

    public void render(Graphics g){

        if(sprite != null){
            g.drawImage(sprite, this.getX(), this.getY(), width, height, null);

        }else{
            g.setColor(Color.green);
            g.fillRect((int)x, (int)y, width, height);
        }

    }
}
