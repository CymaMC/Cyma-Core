package com.emopedia.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class DiscordCommand implements CommandExecutor {

    public DiscordCommand(Plugin cyma) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;
        TextComponent tc = new TextComponent("§e§lCORE §8| §7Click here to join our Discord!");
        tc.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("§e§lCLICK TO JOIN")));
        tc.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.cymamc.com"));
        ((Player) sender).spigot().sendMessage(tc);
        return true;
    }
}
