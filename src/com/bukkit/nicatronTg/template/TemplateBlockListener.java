package com.bukkit.nicatronTg.template;

import org.bukkit.event.block.BlockListener;

/**
 * Basic block listener
 * @author nicatronTg
 */
public class TemplateBlockListener extends BlockListener {
    private final Template plugin;

    public TemplateBlockListener(final Template plugin) {
        this.plugin = plugin;
    }
}
