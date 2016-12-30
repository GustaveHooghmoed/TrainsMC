package org.bloxy.tmc.grouper;

import java.util.List;

import org.bloxy.tmc.main.main;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.event.Listener;

public class GroupHandler implements Listener {

	public boolean enabled = true;
	private FileConfiguration TrainDB = main.getInstance().getConfig();
	private int TrainCounter= 0;

	public GroupHandler() {
		if(enabled == true){
			 for(String msg : TrainDB.getStringList("Locations")) {
			       Location loc = LocationHelper.extractLoc(msg);
			       World w = loc.getWorld();
			       Entity ent = w.spawn(loc, Minecart.class);
			       TrainCounter++;
			       TrainDB.set("Train." + TrainCounter + "", ent);
			    }
		}
	}
}
