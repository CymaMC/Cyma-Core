package com.emopedia.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class InvseeCommand implements CommandExecutor {

    public InvseeCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 1) {
                Player toInvsee = Bukkit.getPlayer(args[0]);
                if (toInvsee != null) {
                    player.openInventory(toInvsee.getInventory());
                } else {
                    sender.sendMessage("§e§lCORE §8| §7That player is not online or does not exist.");
                }
            } else {
                sender.sendMessage("§e§lCORE §8| §7Please specify a player.");
            }
        }
        return false;
    }
}
