package org.bloxy.tmc.grouper;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationHelper {

	public static Location extractLoc(String msg) {
		String[] test = msg.split(",");
		Location loc = new Location(Bukkit.getWorld(test[0]),Integer.valueOf(test[1]), Integer.valueOf(test[2]), Integer.valueOf(test[3]));
		return loc;
	}

}
