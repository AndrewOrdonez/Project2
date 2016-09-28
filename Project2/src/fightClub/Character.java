package fightClub;
 
public class Character
	{
private String name;
private int weapon;
public String weaponName(){
	switch(weapon){
		case 0: return "fists";
		case 1:return "knife";
		case 2:return "sword";
		case 3:return "pistol";
		case 4:return "rifle";
		case 5:return "nuke"; 
		default: return "";
	}
}
public String getName()
	{
		return name;
	}
public void setName(String name)
	{
		this.name = name;
	}
public int getWeapon()
	{
		return weapon;
	}
public void setWeapon(int weapon)
	{
		this.weapon = weapon;
	}




	}