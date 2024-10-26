package io.github.townyadvanced.iconomy.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import io.github.townyadvanced.iconomy.iConomyUnlocked;
import io.github.townyadvanced.iconomy.system.Holdings;

import java.util.logging.Logger;

public class AccountResetEvent extends Event {

	private final Holdings account;
	private boolean cancelled = false;
	private static final HandlerList handlers = new HandlerList();

	Logger log = iConomyUnlocked.getPlugin().getLogger();

	public AccountResetEvent(Holdings account) {
		super(!Bukkit.isPrimaryThread());
		this.account = account;
	}

	public String getAccountName() {
		return this.account.getName();
	}

	public Holdings getAccount() {
		return account;
	}

	public boolean isCancelled() {
		return this.cancelled;
	}

	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}
}
