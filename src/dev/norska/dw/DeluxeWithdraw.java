package dev.norska.dw;

import org.bukkit.plugin.java.JavaPlugin;

public class DeluxeWithdraw extends JavaPlugin {
	
	private static DeluxeWithdraw instance;
	public DeluxeWithdraw() { instance = this; }
	public static DeluxeWithdraw getInstance() { return instance; }
	
}