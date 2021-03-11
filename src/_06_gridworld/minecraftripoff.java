package _06_gridworld;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class minecraftripoff {
	public static void main (String[]args) {
		World world=new World();
		Bug bug=new Bug();
		world.add(new Location(0,0),bug);
		Bug bug2=new Bug();
		world.add(new Location(9,9), bug2);
		world.show();
		
		
		
	}

}
