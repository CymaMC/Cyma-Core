package com.emopedia.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class FlyCommand implements CommandExecutor {

    public FlyCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("core.fly")) {
                if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.sendMessage("§e§lCORE §8| §7Successfully disabled flight.");
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage("§e§lCORE §8| §7Successfully enabled flight.");
                }
                return true;
            } else {
                player.sendMessage("§e§lCORE §8| §7You do not have permission to execute this command.");
            }

        } else {
            sender.sendMessage("§e§lCORE §8| §7Console cannot execute this command");
            return true;
        }
        return false;
    }
}