package net.pentazy.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public static JavaPlugin plugin;
	
	public void onEnable() {
		plugin = this;
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler 
	
	public void onChat(AsyncPlayerChatEvent e){
		
		Player p = e.getPlayer();
		
		if(e.getMessage().equalsIgnoreCase("dinheiro")) {
			
			p.sendMessage("§aVai trabalhar!");
			
		}
		
		
	}

}
