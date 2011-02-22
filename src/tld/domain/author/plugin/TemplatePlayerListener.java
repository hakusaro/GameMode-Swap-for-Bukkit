package tld.domain.author.plugin;

import org.bukkit.event.player.PlayerListener;

/**
 * Handle events for all Player related events
 * @author
 */
public class TemplatePlayerListener extends PlayerListener{
    private final Template plugin;
    public TemplatePlayerListener(Template instance) {
        plugin = instance;
    }
}
