package com.earth2me.essentials;

import org.bukkit.entity.Player;


public interface IPermissionsHandler
{

	String getGroup(Player base);

	boolean canBuild(Player base, String group);

	boolean inGroup(Player base, String group);

	boolean hasPermission(Player base, String node);

	String getPrefix(Player base);

	String getSuffix(Player base);
	
}
