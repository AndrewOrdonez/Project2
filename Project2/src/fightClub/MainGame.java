package fightClub;
import java.util.Scanner;
public class MainGame
	{
static Scanner scan= new Scanner(System.in);
static Character player = new Character();
	public static void main(String[] args){

 System.out.println("What would you like to be called?");
 player.setName(scan.next());
 System.out.println("Hello "+player.getName()+". you are an adventurer looking for treasure. You have found the entrance to a secret dungeon, type '1' if you already know the controls and would like to enter. Type anythig else if you would like to learn the controls;");
	if (scan.nextInt()==1){
		
	}
	else {
		Tutorial.print();
	}
	}

	}
