package fightClub;
import java.util.ArrayList;
public class Room
	{
private boolean nDoor=false;
private boolean sDoor=false;
private boolean eDoor=false;
private boolean wDoor=false;
private ArrayList<String> objects=new ArrayList<String>(0);
private int enemies;
private boolean stairs=false;
public boolean isnDoor()
	{
		return nDoor;
	}
public void setnDoor(boolean nDoor)
	{
		this.nDoor = nDoor;
	}
public boolean issDoor()
	{
		return sDoor;
	}
public void setsDoor(boolean sDoor)
	{
		this.sDoor = sDoor;
	}
public boolean iseDoor()
	{
		return eDoor;
	}
public void seteDoor(boolean eDoor)
	{
		this.eDoor = eDoor;
	}
public boolean iswDoor()
	{
		return wDoor;
	}
public void setwDoor(boolean wDoor)
	{
		this.wDoor = wDoor;
	}
public String getObjects(int i)
	{
		return objects.get(i);
	}
public void setObjects(String objects)
	{
		this.objects.add(objects);
	}
public int getEnemies()
	{
		return enemies;
	}
public void setEnemies(int traps)
	{
		this.enemies=traps;
	}
public void setStairs(boolean s){
	this.stairs=s;
}
public boolean getStrairs(){
	return stairs;
}
	}
