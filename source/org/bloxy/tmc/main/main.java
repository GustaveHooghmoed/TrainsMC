package org.bloxy.tmc.main;

import org.bloxy.tmc.grouper.GroupHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	static Plugin instance = null;
	private GroupHandler GroupHandler = new GroupHandler();
			
    public void onEnable()
	{
	    instance = this;
	    GroupHandler.enabled = true;
	    registerHander();
	}
	
	private void registerHander() {
		PluginManager plm = Bukkit.getServer().getPluginManager();
		plm.registerEvents(new GroupHandler(),this);
	}

	public void onDisable()
	{
		instance = null;
		GroupHandler.enabled = true;
	}
	
	public static Plugin getInstance(){
		return instance;
	}
}
