package dev.norska.dw.api;

import java.util.List;

import org.bukkit.entity.Player;

public interface DWAddonInterface {

	void take(Player p, Double amount);
	
	void add(Player p, Double amount);
	
	void set(Player p, Double amount);
	
	Boolean has(Player p, Double amount);
	
	void take(Player p, Integer amount);
	
	void add(Player p, Integer amount);
	
	void set(Player p, Integer amount);
	
	Boolean has(Player p, Integer amount);	
	
	Double getCurrent(Player p);

	String currencyString();
	
	int currencyFormat();
	
	List<String> withdrawCommands();
	
	Double minWithdraw();
	Double maxWithdraw();
	
	String layout();
	
	String adminCreator();
	
	void reloadConfiguration();
	
}
