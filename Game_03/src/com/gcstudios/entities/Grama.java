package com.gcstudios.entities;

import com.gcstudios.main.Game;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Grama extends Entity{

    public BufferedImage spriteGrama = Game.spritesheet.getSprite(48, 16, 16, 16);

    public Grama(double x, double y, int width, int height, double speed, BufferedImage sprite) {
        super(x, y, width, height, speed, sprite);
    }

    public void render(Graphics g){

        g.drawImage(spriteGrama, 0, 145,  null);
        g.drawImage(spriteGrama, 16, 145,  null);
        g.drawImage(spriteGrama, 32, 145,  null);
        g.drawImage(spriteGrama, 48, 145,  null);
        g.drawImage(spriteGrama, 64, 145,  null);
        g.drawImage(spriteGrama, 80, 145,  null);
        g.drawImage(spriteGrama, 96, 145,  null);
        g.drawImage(spriteGrama, 112, 145,  null);
        g.drawImage(spriteGrama, 128, 145,  null);
        g.drawImage(spriteGrama, 144, 145,  null);
        g.drawImage(spriteGrama, 160, 145,  null);
        g.drawImage(spriteGrama, 176, 145,  null);
        g.drawImage(spriteGrama, 192, 145,  null);
        g.drawImage(spriteGrama, 208, 145,  null);
        g.drawImage(spriteGrama, 224   , 145,  null);
    }
}
