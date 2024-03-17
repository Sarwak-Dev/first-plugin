package net.zipph.firstplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.AQUA + player.getDisplayName() +  ChatColor.RED + " se ha Desconectado");

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.AQUA + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + " se ha Conectado");

    }

}
