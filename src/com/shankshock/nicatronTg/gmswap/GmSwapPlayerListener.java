package com.shankshock.nicatronTg.gmswap;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class GmSwapPlayerListener implements Listener {
	public final GmSwap plugin;
	
	public GmSwapPlayerListener(GmSwap Instance)
	{
		plugin = Instance;
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
    	if (event.getMessage().toLowerCase().startsWith("/gamemode"))
    	{
    		if (!event.getPlayer().isPermissionSet("shankshock.rawgamemodes"))
    		{
    			event.getPlayer().sendMessage(ChatColor.AQUA + "The requested command was overridden. Use /gmswap instead.");
    		}
    		event.setCancelled(!event.getPlayer().isPermissionSet("shankshock.rawgamemode"));
    	}
    }
}
