package com.emopedia.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;
import java.util.UUID;

public class StartCommand implements CommandExecutor {

    HashMap<UUID, PermissionAttachment> perms = new HashMap<UUID, PermissionAttachment>();
    private final Plugin Cyma;

    public StartCommand(Plugin cyma) {
        Cyma = cyma;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack iron_sword = new ItemStack(Material.IRON_SWORD);
            ItemStack iron_pickaxe = new ItemStack(Material.IRON_PICKAXE);
            ItemStack steak = new ItemStack(Material.COOKED_BEEF, 20);
            ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET);
            ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);
            ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS);
            ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS);

            player.getInventory().addItem(iron_sword, iron_pickaxe, steak, iron_helmet, iron_chestplate, iron_leggings, iron_boots);

            player.sendMessage("§e§lCORE §8| §7Successfully gained your starter kit.");

            PermissionAttachment attachment = player.addAttachment(Cyma);
            perms.put(player.getUniqueId(), attachment);

            perms.get(player.getUniqueId()).unsetPermission("core.start");



        }
        return false;
    }
}
