package fightClub;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import java.awt.*;
import java.util.ArrayList;
public class MainGame
	{
static Scanner scan= new Scanner(System.in);
static Character player = new Character();
static boolean braziersLit=false;
static Room r1=new Room(false,true,false,false,0,0,"");
//
static Room r2=new Room(false, false, true, false, 0, 0, "sword");
//
static Room r3=new Room(true, false, true, true, 0, 0, "");
//
static Room r4=new Room(false, true, false, true, 0, 0, "");
//
static Room r5=new Room(true, true, false, false, 0, 1, "");
//
static Room r6=new Room(true, false, false, false, 1, 0, "");
//
static Room r7=new Room(false, false, true, false, 2, 0, "torch");
//
static Room r8=new Room(true, false, false, true, 0, 3, "");
//
static Room r9=new Room(true, true, false, false, 0, 0, "");
//remember the fires
//
static Room r10=new Room(false, true, false, true, 0, 1, "");
// 
static Room r11=new Room(false, false, true, true, 0, 3, "");
// 
static Room r12=new Room(false, true, true, false, 0, 3, "");
//
static Room r13=new Room(true, false, false, true, 0, 1, "");
//
static Room r14=new Room(false, true, true, false, 1, 3, "");
//
static Room r15=new Room(true, false, false, false, 0, 0, "fire staff");
//
static Room r16=new Room(false, false, true, false, 2, 0, "");
// 
static Room r17=new Room(false, true, false, true, 0, 1, "");
//
static Room r18=new Room(true, false, true, false, 0, 2, "");
// 
static Room r19=new Room(false, false, false, true, 0, 0, "treasure");
static	    DrawPanel panel = new DrawPanel();                            
static JFrame application = new JFrame(); 
	public static void main(String[] args){
                  
	    application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                                                  
	    application.add(panel);    
	    application.setSize(1000, 800);
	    application.setVisible(true); 
	    
player.setObject("");
player.setLocation(1);
 System.out.println("What would you like to be called?");
 player.setName(scan.nextLine());
 System.out.println("Hello "+player.getName()+". you are an adventurer looking for treasure.\nYou have found the entrance to a secret dungeon, type '1' if you already know the controls and would like to enter. \nType anythig else if you would like to learn the controls");
	if (scan.nextLine().equals("1")){
		Tutorial.UI();
	}
	else {
		Tutorial.dot();
		Tutorial.UI();
	}
	}

	}
