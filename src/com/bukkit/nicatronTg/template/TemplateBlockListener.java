package com.bukkit.nicatronTg.template;

import org.bukkit.event.block.BlockListener;

/**
 * Template block listener
 * @author 
 */
public class TemplateBlockListener extends BlockListener {
    private final Template plugin;

    public TemplateBlockListener(final Template plugin) {
        this.plugin = plugin;
    }
}
