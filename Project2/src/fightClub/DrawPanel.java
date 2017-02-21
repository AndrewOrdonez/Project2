package fightClub;
import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{
public DrawPanel(){
	super();
	setBackground(Color.BLACK);
}
public void paintComponent(Graphics g){
    int width = getWidth();          
    int height = getHeight();     
    super.paintComponent(g); 
    Room r=TheFunStuff.findRoom();
    g.setColor(Color.CYAN);
    g.drawRect(150, 150, 700, 500);
    g.setColor(Color.LIGHT_GRAY);
    g.drawString("Current Item: "+MainGame.player.getObject(), 200, 120);
    g.drawString("W         E", 750, 120);
    g.drawString("S", 771, 138);
    g.drawLine(775, 123, 775, 115);
    g.drawLine(783, 115, 767, 115);
    g.drawString("N", 771, 102);
    g.setColor(Color.RED);
    g.drawLine(775, 114, 775, 107);
 
    if (r==MainGame.r1){
    	g.setColor(Color.YELLOW);
    	g.drawLine(150, 450, 850, 450);
    	g.setColor(Color.MAGENTA);
    	g.drawLine(150, 400, 300, 200);
    	g.drawLine(300, 200, 500, 450);
    	g.drawLine(400, 325, 570, 165);
    	g.drawLine(600, 450, 775, 225);
    	g.drawLine(570, 165, 736, 275);
    	g.drawLine(775, 225, 850, 345);
    	g.drawLine(150,270, 210,320 );
    	g.setColor(Color.LIGHT_GRAY);
    	g.drawLine(255, 260, 348, 260);
    	g.drawLine(512, 220, 652, 220);
    	g.drawLine(717, 300, 821, 300);
    	
    }
    if(r==MainGame.r9){
    	g.setColor(new Color(205, 127, 50));
    	g.fillRect(700, 300, 30, 25);
    	g.drawLine(700, 285, 715, 300);
    	g.drawLine(730, 285, 715, 300);
    	if(MainGame.braziersLit){
    		g.setColor(Color.ORANGE);
    		g.drawLine(700, 285, 707, 265);
    		g.drawLine(707, 265, 715, 300);
    		g.drawLine(715, 300, 723, 265);
    		g.drawLine(723, 265, 730, 285);
    		g.setColor(Color.RED);
    		g.drawLine(720, 280, 715, 260);
    		g.drawLine(710, 280, 715, 260);
    	}
    }
    g.setColor(Color.ORANGE);
    if (r.iseDoor()){
    	g.fillRect(845, 390, 10, 20);
    }
    if (r.isnDoor()){
    	g.fillRect(490, 145, 20, 10);
    }
    if (r.issDoor()){
    	g.fillRect(490, 645, 20, 10);
    }
    if (r.iswDoor()){
    	g.fillRect(145, 390, 10, 20);
    }
    for (int i=0;i<r.getObjectAmount();i++){
    if (r.getObjects(i).equals("sword")){
    	g.setColor(Color.GRAY);
    	g.drawLine(425, 425, 425, 375);
    	g.drawLine(415, 412, 435, 418);
    	g.drawLine(415, 418, 435, 412);
    	g.setColor(Color.WHITE);
    	g.drawString("SWORD [1]", 410, 440);
    }
    else if(r.getObjects(i).equals("torch")){
    	g.setColor(new Color(142, 65, 9));
    	g.drawLine(375,425, 375, 370);
    	g.setColor(Color.YELLOW);
    	g.fillRect(372, 373, 6, 7);
    	g.setColor(Color.RED);
    	g.drawLine(372, 373, 378, 373);
    	g.setColor(Color.ORANGE);
    	g.drawLine(372, 374, 378, 374);
    	g.setColor(Color.WHITE);
    	g.drawString("TORCH [2]", 360, 440);
    }
    else if(r.getObjects(i).equals("fire staff")){
    	g.setColor(Color.YELLOW);
    	g.drawLine(400, 430, 400, 370);
    	g.setColor(Color.GREEN);
    	g.drawLine(403, 365, 400, 370);
    	g.drawLine(397, 365, 400, 370);
    	g.setColor(Color.RED);
    	g.drawLine(400, 364, 400, 369);
    	g.setColor(Color.WHITE);
    	g.drawString("FIRE STAFF", 385, 450);
    }
    else if(r.getObjects(i).equals("treasure")){
    	g.setColor(Color.YELLOW);
    	g.fillRoundRect(500, 350, 100, 100, 100, 100);
    	g.setColor(new Color(142, 65, 9));
    	g.drawLine(550, 360, 550, 440);
    	g.drawLine(560, 370, 540, 390);
    	g.drawLine(540, 390, 560, 410);
    	g.drawLine(560, 410, 540, 430);
    	g.setColor(Color.WHITE);
    	g.drawString("TREASURE", 620, 400);
    	
    }
    
    }
    if (r.getStrairs()==1){
    	g.setColor(Color.GREEN);
    	g.drawLine(240, 250, 250, 250);
    	g.drawLine(250, 250, 250, 260);
    	g.drawLine(250, 260, 260, 260);
    	g.drawLine(260, 260, 260, 270);
    	g.drawLine(260, 270, 270, 270);
    	g.drawLine(270, 270, 270, 280);
    	g.drawLine(290, 250, 290, 280);
    	g.drawLine(287, 275, 290, 280);
    	g.drawLine(293, 275, 290, 280);
    }
    else if(r.getStrairs()==2){
    	g.setColor(Color.GREEN);
    	g.drawLine(240, 250, 250, 250);
    	g.drawLine(250, 250, 250, 260);
    	g.drawLine(250, 260, 260, 260);
    	g.drawLine(260, 260, 260, 270);
    	g.drawLine(260, 270, 270, 270);
    	g.drawLine(270, 270, 270, 280);
    	g.drawLine(290, 250, 290, 280);
    	g.drawLine(287, 250, 290, 245);
    	g.drawLine(293, 250, 290, 245);
    }
}
public static void main(String[] args)
{
    DrawPanel panel = new DrawPanel();                            
    JFrame application = new JFrame();                   
    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                  
    application.add(panel);           
    application.setSize(1000, 400);     
    application.setVisible(true);          
}
}























