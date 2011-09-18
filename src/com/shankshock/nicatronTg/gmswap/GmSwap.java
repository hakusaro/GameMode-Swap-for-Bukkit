package com.shankshock.nicatronTg.gmswap;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Template for Bukkit
 *
 * @author
 */
public class GmSwap extends JavaPlugin {
    private final HashMap<Player, Boolean> debugees = new HashMap<Player, Boolean>();
    private final GmSwapPlayerListener playerListener = new GmSwapPlayerListener(this);

    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.PLAYER_COMMAND_PREPROCESS, playerListener, Priority.High, this);
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is now running." );
    }
    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        String commandName = command.getName().toLowerCase();
        Player ply = (Player)sender;
        if (commandName.equals("gmswap"))
        {
        	if (ply.hasPermission("shankshock.gmswap"))
        	{
        		if (ply.getGameMode() == GameMode.CREATIVE)
        		{
        			ply.setGameMode(GameMode.SURVIVAL);
        		} else {
        			ply.setGameMode(GameMode.CREATIVE);
        		}
        		Logger log = getServer().getLogger();
        		log.setLevel(Level.INFO);
        		log.log(log.getLevel(), ply.getName() + " (" + ply.getDisplayName() + ") toggled their gamemode.");
        		ply.sendMessage(ChatColor.AQUA + "[SS] " + "Toggled gamemode.");
        	}
        }
        return true;
    }
    
    public void onDisable() {
    }
    
    
}

