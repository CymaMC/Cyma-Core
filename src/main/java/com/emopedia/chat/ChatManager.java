package com.emopedia.chat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ChatManager implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage("");
        if(event.getPlayer().hasPermission("donator")) {
            Bukkit.broadcastMessage("§e§lDONATOR JOIN §8| §7" + event.getPlayer().getDisplayName() + "§7has joined the server.");
        }
        if(event.getPlayer().hasPlayedBefore()) {
            event.setJoinMessage("§e§lJOIN §8| §7" + event.getPlayer().getDisplayName() + "§7has joined the server.");
        }else {
            event.setJoinMessage("§e§lJOIN §8| §7" + event.getPlayer().getDisplayName() + "§7has joined the server for the first time.");
        }
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage("");
        if(event.getPlayer().hasPermission("donator")) {
            event.setQuitMessage("§e§lDONATOR LEAVE §8| §7" + event.getPlayer().getDisplayName() + "§7has left the server.");
        }else {
            event.setQuitMessage("§e§lLEAVE §8| §7" + event.getPlayer().getDisplayName() + "§7has left the server.");
        }
    }
}
