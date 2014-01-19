package aman207.uni.me.cookit;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class CommandListener implements Listener, CommandExecutor {
	
	static CookIt plugin;
	
	public CommandListener(CookIt config)
	{
		plugin = config;
	}
	
	public void noPermission(CommandSender sender, String c)
	{
		sender.sendMessage(ChatColor.RED+"Error. You do not have permission to cook this "+c);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("cook"))
		{
			if(sender instanceof Player)
			{
				Player player = (Player)sender;
			        Material item = player.getItemInHand().getType();
			        int second = player.getItemInHand().getAmount();

			        if (item.name().equals("PORK")) 
			        {
			        	if(sender.hasPermission("cookit.food.pork"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.GRILLED_PORK, second));
					        player.sendMessage(ChatColor.GREEN + "Successfully cooked Raw Pork!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "pork");
			        	}
			        }
			        
			        else if (item.name().equals("RAW_FISH")) 
			        {
			        	if(sender.hasPermission("cookit.food.fish"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.COOKED_FISH, second));
					        player.sendMessage(ChatColor.GREEN + "Successfully cooked Raw Fish!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "fish");
			        	}
			        }
			        
			        else if (item.name().equals("RAW_BEEF")) 
			        {
			        	if(sender.hasPermission("cookit.food.beef"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.COOKED_BEEF, second));
					        player.sendMessage(ChatColor.GREEN + "Successfully cooked Raw Beef!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "beef");
			        	}
			        }
			        else if (item.name().equals("RAW_CHICKEN")) 
			        {
			        	if(sender.hasPermission("cookit.food.chicken"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.COOKED_CHICKEN, second));
					        player.sendMessage(ChatColor.GREEN + "Successfully cooked Raw Chicken!");
			        	}		
			        	else
			        	{
			        		noPermission(sender, "chicken");
			        	}
			        }
			        else if (item.name().equals("POTATO")) 
			        {
			        	if(sender.hasPermission("cookit.food.potato"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.BAKED_POTATO, second));
					        player.sendMessage(ChatColor.GREEN + "Successfully cooked your Potato(s)!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "potato");
			        	}
			        }
			        else if(item.name().equals("DIAMOND_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.diamond"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.DIAMOND, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your diamond ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "diamond ore");
			        	}
			        }
			        else if(item.name().equals("GOLD_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.gold"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.GOLD_INGOT, second));
			        		player.sendMessage(ChatColor.GREEN+"Successfully cooked your gold ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "gold ore");
			        	}
			        }
			        else if(item.name().equals("COAL_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.coal"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.COAL, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your coal ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "coal ore");
			        	}
			        }
			        else if(item.name().equals("IRON_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.iron"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.IRON_INGOT, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your iron ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "iron ore");
			        	}
			        }
			        else if(item.name().equals("EMERALD_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.emerald"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.EMERALD, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your emerald ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "emerald ore");
			        	}
			        }
			        else if(item.name().equals("QUARTZ_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.quartz"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.QUARTZ, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your quartz ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "quartz ore");
			        	}
			        }
			        /**
			        else if(item.name().equals("LAPIS_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.lapis"))
			        	{
			        		player.setItemInHand(new ItemStack(Material., second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your diamond ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "diamond");
			        	}
			        }
			        */
			        else if(item.name().equals("REDSTONE_ORE"))
			        {
			        	if(sender.hasPermission("cookit.ore.redstone"))
			        	{
			        		player.setItemInHand(new ItemStack(Material.REDSTONE, second));
			        		player.sendMessage(ChatColor.GREEN + "Successfully cooked your redstone ore!");
			        	}
			        	else
			        	{
			        		noPermission(sender, "redstone ore");
			        	}
			        }
			        else
			        {
			        	player.sendMessage(ChatColor.YELLOW+"Error. I could not find an item in your hand to cook");
			        }
			}
			else
			{
				sender.sendMessage("Error. You need to be a player to do this");
				return false;
			}
			
		}
		return false;
	}

}
