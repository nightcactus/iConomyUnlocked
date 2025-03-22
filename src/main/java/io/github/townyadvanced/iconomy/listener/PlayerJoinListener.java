package io.github.townyadvanced.iconomy.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import io.github.townyadvanced.iconomy.iConomyUnlocked;

public class PlayerJoinListener implements Listener {

	/**
	 * Listens to the PlayerJoinEvent in order to create new Accounts for players
	 * who have not logged in.
	 *
	 * @param event PlayerJoinEvent we listen to.
	 */
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();

		if (iConomyUnlocked.getAccounts().get(player.getUniqueId(), player.getName(), true) == null)
			iConomyUnlocked.getPlugin().getLogger().warning("Error creating / grabbing account for: " + player.getName());
	}
}
