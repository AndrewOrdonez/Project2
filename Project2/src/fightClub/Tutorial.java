package fightClub;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;
//port in your jframes
//use the website from earlier
public class Tutorial
	{
	
	
	
	
	
	
public static void dot(){
	System.out.println("to enter a door, type 'enter ' and then the number of the door. \nTo pick up an item in a room, type 'get ' followed by the name of the item. \nYou may only hold one item at a time, and you can only see other items when you have none,\nYour goal is to get to the bottom of the dungeon, and the escape with the treasure. \nAll options will be listed when they are available.\n\n\n");
}





public static void reject(){
	System.out.println("Please type a valid command");
}









static boolean dirE=false;
static boolean dirW=false;
static boolean dirN=false;
static boolean dirS=false;
static boolean dirU=false;
static boolean dirD=false;
static void possible(){
	
	System.out.println("Posibilities:");
	Room current = new Room(false,false,false,false,0,0,null);
	current =TheFunStuff.findRoom();
	DrawPanel pos=new DrawPanel();
	
	
	MainGame.application.add(pos,0);
	MainGame.application.getComponent(0).setVisible(true);
	MainGame.application.hide();
	MainGame.application.show();
	 dirE=false;
	 dirW=false;
	 dirN=false;
	 dirS=false;
	 if (current.equals(MainGame.r9)&&MainGame.player.getObject().equals("torch")){
		 System.out.println("light braziers");
	 }
	if (current.iseDoor()){
		System.out.println("enter east door");
		dirE=true;
	}
	if (current.iswDoor()){
		System.out.println("enter west door");
		dirW=true;
	}
	if (current.isnDoor()){
		System.out.println("enter north door");
		dirN=true;
	}
	if (current.issDoor()){
		System.out.println("enter south door");
		dirS=true;
	}
	if(!MainGame.player.getObject().equals("")){
		System.out.println("drop "+MainGame.player.getObject());
	}
	if(current.getStrairs()==1){
		System.out.println("descend stairs");
		dirD=true;
	}
	if(current.getStrairs()==2){
		System.out.println("ascend stairs");
		dirU=true;
	}
	for (int q=0;q<current.getObjectAmount();q++){
	if (current.getObjects(q).equals("")){}
	else{
		if (MainGame.player.getObject().equals("")){
		System.out.println("get "+current.getObjects(q));
		}
	}}
}












static void check(String str){
if (str.equals("enter east door")&&dirE){
	switch(MainGame.player.getLocation()){
	case 2:MainGame.player.setLocation(3);
	break;
	case 3:MainGame.player.setLocation(4);break;
	case 7:if (MainGame.player.getObject().equals("torch")||MainGame.braziersLit){
		MainGame.player.setLocation(8);break;
		}
		else{
			System.out.println("it's too dark to enter that room");
		}break;
	case 11:MainGame.player.setLocation(10);break;
	case 12:MainGame.player.setLocation(11);break;
	case 14:MainGame.player.setLocation(13);break;
	case 16:if(MainGame.player.getObject().equals("sword")||MainGame.player.getObject().equals("fire staff")){
		System.out.println("you kill the skeletons in the room");
		MainGame.player.setLocation(17);
		break;
		}
		else {
			System.out.println("There are skeletons in that room, you need a weapon to kill them");break;
		}
	case 18:MainGame.player.setLocation(19);break;
	default: reject();break;
}
}
else if (str.equals("enter west door")&&dirW){
	switch(MainGame.player.getLocation()){
	case 3:MainGame.player.setLocation(2);break;
	case 4:MainGame.player.setLocation(3);break;
	case 8:MainGame.player.setLocation(7);break;
	case 10:if (MainGame.player.getObject().equals("torch")||MainGame.braziersLit){
		MainGame.player.setLocation(11);break;
		}
		else{
			System.out.println("it's too dark to enter that room");break;
		}
	case 11:MainGame.player.setLocation(12);break;
	case 13:MainGame.player.setLocation(14);break;
	case 17:MainGame.player.setLocation(16);break;
	case 19:MainGame.player.setLocation(18);break;
}
}
else if (str.equals("enter north door")&&dirN){
	switch(MainGame.player.getLocation()){
	case 3:MainGame.player.setLocation(1);break;
	case 5:MainGame.player.setLocation(4);break;
	case 6:MainGame.player.setLocation(5);break;
	case 8:if (MainGame.player.getObject().equals("torch")||MainGame.braziersLit){
		MainGame.player.setLocation(9);break;
		}
		else{
			System.out.println("it's too dark to enter that room");break;
		}
	case 9:if(MainGame.player.getObject().equals("sword")||MainGame.player.getObject().equals("fire staff")){
		System.out.println("you kill the skeletons in the room");
		TheFunStuff.findRoom().setEnemies(0);
		MainGame.player.setLocation(10);
		break;
		}
		else {
			System.out.println("There are skeletons in that room, you need a weapon to kill them");break;
		}
	case 13:MainGame.player.setLocation(12);break;
	case 15:MainGame.player.setLocation(14);break;
	case 18:MainGame.player.setLocation(17);break;
}
}
	else if (str.equals("enter south door")&&dirS){
		switch(MainGame.player.getLocation()){
		case 4:if(MainGame.player.getObject().equals("sword")||MainGame.player.getObject().equals("fire staff")){
			System.out.println("you kill the skeletons in the room");
			MainGame.player.setLocation(5);
			TheFunStuff.findRoom().setEnemies(0);
			break;
			}
			else {
				System.out.println("There are skeletons in that room, you need a weapon to kill them");break;
			}
		case 5:MainGame.player.setLocation(6);break;
		case 9:if (MainGame.player.getObject().equals("torch")||MainGame.braziersLit){
			MainGame.player.setLocation(8);break;
			}
			else{
				System.out.println("it's too dark to enter that room");break;
			}
		case 10:MainGame.player.setLocation(9);break;
		case 12:if(MainGame.player.getObject().equals("sword")||MainGame.player.getObject().equals("fire staff")){
			System.out.println("you kill the skeletons in the room");
			MainGame.player.setLocation(13);
			TheFunStuff.findRoom().setEnemies(0);
			break;
			}
			else {
				System.out.println("There are skeletons in that room, you need a weapon to kill them");break;
			}
		case 14:MainGame.player.setLocation(15);break;
		case 17:if (MainGame.player.getObject().equals("fire staff")){
		System.out.println("using your magical staff of flame, you destroy the lich king in a dazzling inferno");
		MainGame.player.setLocation(18);
		TheFunStuff.findRoom().setEnemies(0);break;
		}
		else{System.out.println("the lich king resides in this room, only the heat of a magical flame can destroy him");break;
		}
}
}
	else if (str.equals("drop "+MainGame.player.getObject())&&(!MainGame.player.getObject().equals(""))){
		TheFunStuff.findRoom().setObjects(MainGame.player.getObject());
		MainGame.player.setObject("");
	}
	else if (MainGame.player.getObject().equals("")){
	for (int j=0;j<TheFunStuff.findRoom().getObjectAmount();j++){
		 if(str.equals("get "+TheFunStuff.findRoom().getObjects(j))){
			 MainGame.player.setObject(TheFunStuff.findRoom().getObjects(j));
			 System.out.println("picked up the "+TheFunStuff.findRoom().getObjects(j));
			 TheFunStuff.findRoom().delObjects(j);
			 
		 }
}
}
	else if (MainGame.player.getLocation()==9&&MainGame.player.getObject().equals("torch")){
		if (str.equals("light braziers")){
			MainGame.braziersLit=true;
			System.out.println("the whole dungeon is illuminated by the fire's light");
		}
	}
	else if (dirD&&str.equals("descend stairs")){
		switch(MainGame.player.getLocation()){
		case 6:MainGame.player.setLocation(7);break;
		case 14:MainGame.player.setLocation(16);break;
		}
	}
	else if (dirU&&str.equals("ascend stairs")){
		switch(MainGame.player.getLocation()){
		case 7:MainGame.player.setLocation(6);break;
		case 16:MainGame.player.setLocation(14);break;
	}
	}
	else if (str.equals("up up down down left right left right b a start")){
		MainGame.player.setObject("treasure");
	}
	else{reject();}



}  




 




public static void UI(){
	switch(MainGame.player.getLocation()){
case 1:
	
 if (MainGame.player.getObject().equals("treasure")){
		System.out.println("YOU ESCAPED WITH THE TREASURE! YOU WIN!");
		System.exit(0);
		break;
	}
	else {System.out.println("you are outside the dungeon \nposibilities: \nenter south door");
	MainGame.application.add(MainGame.panel);
	if( MainGame.scan.nextLine().equals("enter south door")){
		MainGame.player.setLocation(3);
		UI();
	}
	else{
reject();	
UI();}
	}

default:possible();
String move=MainGame.scan.nextLine();
check(move);
UI();
}
	}
	}
