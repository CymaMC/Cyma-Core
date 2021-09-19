package com.emopedia.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.Arrays;

public class BroadcastCommand implements CommandExecutor {

    public BroadcastCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("§e§lCORE §8| §7You cannot broadcast nothing.");
            }else {
                Bukkit.broadcastMessage("§e§lCORE §8| §7" + args);
            }
        }
        return false;
    }
}
