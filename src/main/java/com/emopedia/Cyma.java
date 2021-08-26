package com.emopedia;

import com.emopedia.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Cyma extends JavaPlugin {

    private Cyma plugin;

    @Override
    public void onEnable() {

        System.out.println("The core plugin for Cyma is now active.");

        Objects.requireNonNull(this.getCommand("start")).setExecutor(new StartCommand(this));
        Objects.requireNonNull(this.getCommand("rules")).setExecutor(new RulesCommand(this));
        Objects.requireNonNull(this.getCommand("discord")).setExecutor(new DiscordCommand(this));
        Objects.requireNonNull(this.getCommand("fly")).setExecutor(new FlyCommand(this));
        Objects.requireNonNull(this.getCommand("cyma")).setExecutor(new ReloadCommand(this));

        getConfig().options().copyDefaults();
        saveDefaultConfig();


    }
}

