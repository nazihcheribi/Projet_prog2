package com.mycompany.projet_prog2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MainMap extends JFrame {
	
	public MainMap() {
		// Ici c'est les parametres d'affichage de la fenetre, nom, taille te positionnement.
		setTitle("Map du projet de session");
		setSize(1350, 960);
		setLocation(50, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
		}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// Ici j'ai choisi la taille et la police de l'ecriture.
		Font font = new Font("Arial", Font.PLAIN, 18);
		g.setFont(font);
		// Ici c'est les commandes pour pour ecrire sur la fenetre
		        g.drawString("P1", 255, 150);
		        g.drawString("P2", 740, 150);
		        g.drawString("P3", 740, 750);
		        g.drawString("P4", 260, 770);
		        g.drawString("Vitesse limitee a 90km/h", 980, 60);
		        g.drawString("Vitesse limitee a 40km/h", 980, 110);
		        g.drawString("Poistion voiture", 980, 160);
		        g.drawString("Capacite de P1: 05 places disponibles", 980, 200);
		        g.drawString("Capacite de P2: 05 places disponibles", 980, 240);
		        g.drawString("Capacite de P3: 05 places disponibles", 980, 280);
		        g.drawString("Capacite de P4: 05 places disponibles", 980, 320);

		        // Ici c'est les rectangles jaunes dans toute la fenetre
				g.setColor(Color.yellow);
				g.fillRect(640, 40, 20, 750);
				g.fillRect(10, 400, 930, 20);
				g.fillRect(1200, 45, 60, 20);
				g.setColor(Color.gray);
				g.fillRect(1200, 95, 60, 20);
				g.fillRect(10, 160, 770, 20);
				g.fillRect(10, 660, 770, 20);
				g.fillRect(100, 530, 390, 20);
				g.fillRect(640, 240, 180, 20);
				g.fillRect(800, 580, 140, 20);
				g.fillRect(250, 90, 70, 20);
				g.fillRect(250, 720, 240, 20);
				g.fillRect(300, 40, 20, 380);
				g.fillRect(100, 180, 20, 370);
				g.fillRect(470, 160, 20, 630);
				g.fillRect(800, 240, 20, 340);


				// Ici c'est points rouges
				g.setColor(Color.red);
				g.fillRect(10, 400, 20, 20);
				g.fillRect(470, 770, 20, 20);
				g.fillRect(1200, 145, 20, 20);




				// Ici c'est le dessin de toutes les routes et les parkings
				g.setColor(Color.black);
				

				g.drawRect(10, 40, 930, 750);
				g.drawRect(780, 100, 120, 120);
				g.drawRect(780, 640, 120, 120);
				g.drawRect(20, 50, 230, 100);
				g.drawRect(20, 690, 230, 80);
				g.drawLine(10, 160, 780, 160);
				g.drawLine(10, 180, 780, 180);
				g.drawLine(640, 40, 640, 790);
				g.drawLine(660, 40, 660, 790);
				g.drawLine(300, 40, 300, 420);
				g.drawLine(320, 40, 320, 420);
				g.drawLine(10, 400, 940, 400);
				g.drawLine(10, 420, 940, 420);
				g.drawLine(470, 160, 470, 790);
				g.drawLine(490, 160, 490, 790);
				g.drawLine(10, 680, 780, 680);
				g.drawLine(10, 660, 780, 660);
				g.drawLine(640, 240, 820, 240);
				g.drawLine(640, 260, 820, 260);
				g.drawLine(800, 240, 800, 600);
				g.drawLine(820, 240, 820, 600);
				g.drawLine(800, 580, 940, 580);
				g.drawLine(800, 600, 940, 600);
				g.drawLine(320, 90, 250, 90);
				g.drawLine(320, 110, 250, 110);
				g.drawLine(490, 720, 250, 720);
				g.drawLine(490, 740, 250, 740);
				g.drawLine(100, 160, 100, 550);
				g.drawLine(120, 160, 120, 550);
				g.drawLine(100, 550, 490, 550);
				g.drawLine(100, 530, 490, 530);
				
			


	}

	
	// La fonction main exectue seulement l'ouverture de la fenetre.
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainMap map = new MainMap();
				map.setVisible(true);
			}
		});
		
	}

}

