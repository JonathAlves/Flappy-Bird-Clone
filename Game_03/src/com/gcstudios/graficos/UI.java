package com.gcstudios.graficos;


import com.gcstudios.main.Game;

import java.awt.*;

public class UI {

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial", Font.BOLD, 16));
		g.drawString("Pontos: " + (int)Game.score, 20, 20);
	}
	
}
