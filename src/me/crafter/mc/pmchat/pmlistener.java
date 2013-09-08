package me.crafter.mc.pmchat;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class pmlistener implements Listener {
	
	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event){
		if (event.getMessage().startsWith("/tell ")){
			event.getPlayer().sendMessage(ChatColor.GRAY+"@"+event.getMessage().substring(6));
		}
		else if (event.getMessage().startsWith("/t ")){
			event.getPlayer().sendMessage(ChatColor.GRAY+"@"+event.getMessage().substring(3));
		}
	}
	

}
