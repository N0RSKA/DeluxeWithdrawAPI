package dev.norska.dw.api;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeluxeWithdrawWithdrawEvent extends Event implements Cancellable{

    private final Player player;
    private final NoteType type;
    private final String tier;
    private final Double value;
    private final UUID creator;
    private final String creationDate;
    private boolean isCancelled;

    public DeluxeWithdrawWithdrawEvent(Player player, NoteType type, String tier, Double value, UUID creator, String creationDate) {
        this.player = player;
        this.type = type;
        this.tier = tier;
        this.value = value;
        this.creator = creator;
        this.creationDate = creationDate;
    }

    public boolean isCancelled() {
        return this.isCancelled;
    }

    public void setCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return this.player;
    }
    
    public String getTier() {
        return this.tier;
    }
    
    public UUID getCreator() {
    	return this.creator;
    }
    
    public String getCreationDate() {
    	return this.creationDate;
    }
    
    public Double getValue() {
    	return this.value;
    }

    public NoteType getType() {
    	return this.type;
    }

}
