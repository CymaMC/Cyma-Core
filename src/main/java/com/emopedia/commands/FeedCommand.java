package com.emopedia.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FeedCommand implements CommandExecutor {

    public FeedCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setFoodLevel(20);
            player.sendMessage("§e§lCORE §8| §7You have been successfully fed.");

        }
        return false;
    }
}
