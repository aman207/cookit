package aman207.uni.me.cookit;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CookIt extends JavaPlugin implements Listener {
	
	public void onEnable()
	{
		Bukkit.getPluginManager().registerEvents(new CommandListener(this), this);
		this.getCommand("cook").setExecutor(new CommandListener(this));
	}
	
	public void onDisable()
	{
		
	}

}
