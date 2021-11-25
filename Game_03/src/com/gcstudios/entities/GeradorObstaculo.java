package com.gcstudios.entities;

import com.gcstudios.main.Game;

public class GeradorObstaculo {
    public int time = 0;
    public int targetTime = 60;
    public void tick(){
        time++;
        if(time == targetTime){
            int altura1 = Entity.rand.nextInt(60 - 30) + 30;
            Obstaculo obst1 = new Obstaculo(Game.WIDTH, 0, 20, altura1, 1, null);
            Game.entities.add(obst1);

            int altura2 = Entity.rand.nextInt(60 - 30) + 30;
            Obstaculo obst2 = new Obstaculo(Game.WIDTH, Game.HEIGHT - altura2, 20, altura2, 1, null);
            Game.entities.add(obst2);
            time = 0;
        }

    }
}
