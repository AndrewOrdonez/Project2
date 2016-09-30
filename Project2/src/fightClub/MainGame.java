package fightClub;
import java.util.Scanner;
import java.util.ArrayList;
public class MainGame
	{
static Scanner scan= new Scanner(System.in);
static Character player = new Character();
static boolean braziersLit=false;
static Room r1=new Room(false,true,false,false,0,0,null);
//
static Room r2=new Room(false, false, true, false, 0, 0, "sword");
//
static Room r3=new Room(true, false, true, true, 0, 0, null);
//
static Room r4=new Room(false, true, false, true, 0, 0, null);
//
static Room r5=new Room(true, true, false, false, 0, 1, null);
//
static Room r6=new Room(true, false, false, false, 1, 0, null);
//
static Room r7=new Room(false, false, true, false, 2, 0, "torch");
//
static Room r8=new Room(true, false, false, true, 0, 3, null);
//
static Room r9=new Room(false, false, false, false, 0, 0, null);
//remember the fires
//
static Room r10=new Room(false, true, false, true, 0, 1, null);
// 
static Room r11=new Room(false, false, true, true, 0, 3, null);
// 
static Room r12=new Room(false, true, true, false, 0, 3, null);
//
static Room r13=new Room(true, false, false, true, 0, 1, null);
//
static Room r14=new Room(false, true, true, false, 1, 3, null);
//
static Room r15=new Room(true, false, false, false, 0, 0, "fire staff");
//
static Room r16=new Room(false, false, true, false, 2, 0, null);
// 
static Room r17=r10;
//
static Room r18=new Room(true, false, true, false, 0, 2, null);
// 
static Room r19=new Room(false, false, false, true, 0, 0, "treasure");

	public static void main(String[] args){
		
player.setObject("");
player.setLocation(1);
 System.out.println("What would you like to be called?");
 player.setName(scan.next());
 System.out.println("Hello "+player.getName()+". you are an adventurer looking for treasure.\nYou have found the entrance to a secret dungeon, type '1' if you already know the controls and would like to enter. \nType anythig else if you would like to learn the controls");
	if (scan.nextLine().equals("1")){
		Tutorial.UI();
	}
	else {
		Tutorial.dot();
	}
	}

	}
