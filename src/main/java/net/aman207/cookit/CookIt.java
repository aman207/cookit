package net.aman207.cookit;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CookIt extends JavaPlugin implements Listener {
	public static boolean update = false;
	public static String name = "";
	
	public void onEnable()
	{
		File config=new File(getDataFolder()+File.separator+"config.yml");

		if(!config.exists())
		{
			this.saveDefaultConfig();
			Logger.getLogger("").log(Level.INFO, "Configuration not found. Generating....");
		}
		Bukkit.getPluginManager().registerEvents(new CommandListener(this), this);
		this.getCommand("cook").setExecutor(new CommandListener(this));
		
		if(this.getConfig().getString("metrics").equals("true"))
		{
			try {
				Metrics metrics = new Metrics(this);
				metrics.start();
				Logger.getLogger("").log(Level.INFO, "Metrics Enabled for CookIt");
		} catch (IOException e) {
		    // Failed to submit the stats :-(
		}
			
		}
	}
	
	public void onDisable()
	{
		
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{		
		if(this.getConfig().getBoolean("update-notification")||this.getConfig().getString("update-notification").equals("true"))
		{
			if(e.getPlayer().hasPermission("cookit.admin"))
			{
				String thisVersion=getDescription().getVersion();
				Updater updater = new Updater(this, 72052, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false); // Start Updater but just do a version check
				update = updater.getResult() == Updater.UpdateResult.UPDATE_AVAILABLE; // Determine if there is an update ready for us
				name = updater.getLatestName(); // Get the latest version
				if(update)
				{
					e.getPlayer().sendMessage(ChatColor.YELLOW+"An update for CookIt is available");
					e.getPlayer().sendMessage(ChatColor.YELLOW+"New version: "+name);
					e.getPlayer().sendMessage(ChatColor.YELLOW+"Your version: "+thisVersion);
					e.getPlayer().sendMessage(ChatColor.YELLOW+"Download it here: http://dev.bukkit.org/bukkit-plugins/cookit");
				}
			}
		}
	}

}

