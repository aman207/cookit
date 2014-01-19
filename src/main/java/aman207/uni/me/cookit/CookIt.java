package aman207.uni.me.cookit;

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
		Bukkit.getPluginManager().registerEvents(new CommandListener(this), this);
		this.getCommand("cook").setExecutor(new CommandListener(this));
	}
	
	public void onDisable()
	{
		
	}
	
	/**@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e)
	{		
		if(this.getConfig().getBoolean("update-check")||this.getConfig().getString("update-check").equals("true"))
		{
			if(e.getPlayer().hasPermission("donexpress.admin.update"))
			{
				String thisVersion=getDescription().getVersion();
				Updater updater = new Updater(this, 59496, this.getFile(), Updater.UpdateType.NO_DOWNLOAD, false); // Start Updater but just do a version check
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
	}**/

}
