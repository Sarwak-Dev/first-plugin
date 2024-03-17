package net.zipph.firstplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("\u001B[33m[FirstPlugin] \u001B[32mPlugin has Started\u001B[0m");
        System.out.println("\u001B[33m[FirstPlugin] \u001B[32mDevelopment by Sarwak\u001B[0m");
        //getLogger().info("\u001B[33m[FirstPlugin] \u001B[32mPlugin enabled by YourName\u001B[0m");
        //getLogger().info("\u001B[33m[FirstPlugin] \u001B[32mHello World!\u001B[0m");

        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
    }
}
