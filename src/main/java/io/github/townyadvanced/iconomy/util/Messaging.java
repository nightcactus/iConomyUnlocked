package io.github.townyadvanced.iconomy.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import io.github.townyadvanced.iconomy.settings.LangStrings;

public class Messaging {

	public static void send(CommandSender sender, String message) {
		sender.sendMessage(colorize(message));
	}

	public static void sendErrorMessage(CommandSender sender, String message) {
		send(sender, ChatColor.RED + message);
	}

	public static void sendMoneyPrefixedMsg(CommandSender sender, String message) {
		send(sender, LangStrings.moneyPrefix() + message);
	}

	/**
	 * Converts color codes into the simoleon code. Sort of a HTML format color code
	 * tag and `[code]
	 * <p>
	 * Color codes allowed: black, navy, green, teal, red, purple, gold, silver,
	 * gray, blue, lime, aqua, rose, pink, yellow, white.
	 * </p>
	 * Example: <blockquote
	 * 
	 * <pre>
	 * Messaging.colorize("Hello &lt;green>world!"); // returns: Hello $world!
	 * </pre>
	 * 
	 * </blockquote>
	 *
	 * @param original Original string to be parsed against group of color names.
	 *
	 * @return <code>String</code> - The parsed string after conversion.
	 */
	private static String colorize(String original) {
		original = original.replace("`r", ChatColor.RED.toString());
		original = original.replace("<rose>", ChatColor.RED.toString());
		original = original.replace("`R", ChatColor.DARK_RED.toString());
		original = original.replace("<red>", ChatColor.DARK_RED.toString());
		original = original.replace("`y", ChatColor.YELLOW.toString());
		original = original.replace("<yellow>", ChatColor.YELLOW.toString());
		original = original.replace("`Y", ChatColor.GOLD.toString());
		original = original.replace("<gold>", ChatColor.GOLD.toString());
		original = original.replace("`g", ChatColor.GREEN.toString());
		original = original.replace("<lime>", ChatColor.GREEN.toString());
		original = original.replace("<green>", ChatColor.GREEN.toString());
		original = original.replace("`G", ChatColor.DARK_GREEN.toString());
		original = original.replace("`a", ChatColor.AQUA.toString());
		original = original.replace("<aqua>", ChatColor.AQUA.toString());
		original = original.replace("`A", ChatColor.DARK_AQUA.toString());
		original = original.replace("<teal>", ChatColor.DARK_AQUA.toString());
		original = original.replace("`b", ChatColor.BLUE.toString());
		original = original.replace("<blue>", ChatColor.BLUE.toString());
		original = original.replace("`B", ChatColor.DARK_BLUE.toString());
		original = original.replace("<navy>", ChatColor.DARK_BLUE.toString());
		original = original.replace("`p", ChatColor.LIGHT_PURPLE.toString());
		original = original.replace("<pink>", ChatColor.LIGHT_PURPLE.toString());
		original = original.replace("`P", ChatColor.DARK_PURPLE.toString());
		original = original.replace("<purple>", ChatColor.DARK_PURPLE.toString());
		original = original.replace("`k", ChatColor.BLACK.toString());
		original = original.replace("<black>", ChatColor.BLACK.toString());
		original = original.replace("`s", ChatColor.GRAY.toString());
		original = original.replace("<silver>", ChatColor.GRAY.toString());
		original = original.replace("`S", ChatColor.DARK_GRAY.toString());
		original = original.replace("<gray>", ChatColor.DARK_GRAY.toString());
		original = original.replace("`w", ChatColor.WHITE.toString());
		original = original.replace("<white>", ChatColor.WHITE.toString());
		return original;
	}

}
