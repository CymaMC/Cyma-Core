package com.emopedia.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class RulesCommand implements CommandExecutor {

    public RulesCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player =  (Player) sender;
            player.sendMessage("§e§lMute Punishments");
            player.sendMessage("§cNo §7Spamming");
            player.sendMessage("§cNo §7Swearing");
            player.sendMessage("§cNo §7Disrespecting");
            player.sendMessage("§cNo §7Harassing");
            player.sendMessage("§cNo §7Custom fonts");
            player.sendMessage("§cNo §7Advertising");
            player.sendMessage("§7Listen to §cStaff Members");
            player.sendMessage("");
            player.sendMessage("§4§lBan Punishments");
            player.sendMessage("§cNo §7Hacking or faking hacks");
            player.sendMessage("§cNo §7Using bugs or disallowed mods/macros");
            player.sendMessage("§cNo §7Inappropriate item names, skins, usernames, or builds");
            player.sendMessage("§cNo §7Trading webstore items for in-game currency or items with other players");
            player.sendMessage("§cAvoiding punishments §7results in a doubled punishment time");
            player.sendMessage("§7There is a maximum of §c2 accounts §7per IP");
            player.sendMessage("§cAlt abusing §7results in an §cip-ban");
            player.sendMessage("§eObey the above rules unless told otherwise by a §cStaff member");
            player.sendMessage("");
            player.sendMessage("§eA more detailed list of our Rules can be found here: §ehttps://cymamc.com/rules/");
        }
        return false;
    }
}