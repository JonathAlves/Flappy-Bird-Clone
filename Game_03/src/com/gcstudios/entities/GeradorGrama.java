package com.gcstudios.entities;

import com.gcstudios.main.Game;

public class GeradorGrama {

    public int time = 0;
    public int targetTime = 16;

    public void tick(){
        time++;
        if(time == targetTime){
            Grama grama = new Grama(Game.WIDTH, 0, 20, 145, 0, Game.spritesheet.getSprite(48, 16, 16, 16));
            Game.entities.add(grama);
            time = 0;
        }
    }
}
