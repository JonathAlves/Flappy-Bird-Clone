package com.gcstudios.main;

import com.gcstudios.entities.GameState;
import com.gcstudios.world.World;

import java.awt.*;

public class EndGame {
    public boolean enter = false;

    public void tick(){
        if(enter){
            enter = false;
            Game.gamestate = GameState.NORMAL;
            World.restartGame();
            Sound.musicBackground.loop();
        }
    }

    public void render(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0, 0, 0, 200));
        g2.fillRect(0, 0, Game.WIDTH*Game.SCALE, Game.HEIGHT*Game.SCALE);
        g.setColor(Color.YELLOW);
        g.setFont(new Font("arial", Font.BOLD, 15));
        g.drawString("FIM DE JOGO!", (Game.WIDTH*Game.SCALE)/2 - 290, (Game.HEIGHT*Game.SCALE)/2 - 180);
        g.setFont(new Font("arial", Font.BOLD, 15));
        g.drawString("Pontos: " + (int)Game.score, (Game.WIDTH*Game.SCALE)/2 - 275, (Game.HEIGHT*Game.SCALE)/2 - 140);
        g.setFont(new Font("arial", Font.BOLD, 10));
        g.drawString("Pressione ENTER para reiniciar", (Game.WIDTH*Game.SCALE)/2 - 315, (Game.HEIGHT*Game.SCALE)/2 - 100);
    }
}
