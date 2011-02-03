package com.bukkit.nicatronTg.template;

import org.bukkit.event.player.PlayerListener;

/**
 * Handle events for all Player related events
 * @author nicatronTg
 */
public class TemplatePlayerListener extends PlayerListener{
    private final Template plugin;
    public TemplatePlayerListener(Template instance) {
        plugin = instance;
    }
}
