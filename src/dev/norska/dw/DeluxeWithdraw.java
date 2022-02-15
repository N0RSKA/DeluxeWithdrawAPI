package dev.norska.dw;

import org.bukkit.plugin.java.JavaPlugin;

import dev.norska.dw.api.DWAddonInterfaceManager;
import lombok.Getter;

public class DeluxeWithdraw extends JavaPlugin {
	
	private static DeluxeWithdraw instance;
	public DeluxeWithdraw() { instance = this; }
	public static DeluxeWithdraw getInstance() { return instance; }
	
	@Getter private DWAddonInterfaceManager addonProvider = new DWAddonInterfaceManager();
	
}