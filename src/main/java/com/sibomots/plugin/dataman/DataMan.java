package com.sibomots.plugin.dataman;

import com.google.inject.Inject;
import com.sibomots.plugin.dataman.init.Resource;
import org.slf4j.Logger;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;


@Plugin(id = Resource.ID,
        name = Resource.NAME,
        description = Resource.DESCRIPTION,
        version = Resource.VERSION)
public class DataMan {
    private static DataMan instance;
    private static PluginContainer plugin;

    @Inject
    private Logger logger;
    public static DataMan instance()
    {
        return instance;
    }

    @Listener
    public void onPreInitializationEvent(GamePreInitializationEvent event) {
        plugin = Sponge.getPluginManager().getPlugin(Resource.ID).get();
        instance = this;

    }

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }

    @Listener
    public void onInitializationEvent(GameInitializationEvent event) {
    }
}

