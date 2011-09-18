package com.shankshock.nicatronTg.gmswap;

import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerListener;

public class GmSwapPlayerListener extends PlayerListener {
	public final GmSwap plugin;
	
	public GmSwapPlayerListener(GmSwap Instance)
	{
		plugin = Instance;
	}
	
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
