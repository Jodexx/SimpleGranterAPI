package com.jodexindustries.simplegranter.api;

import org.bukkit.entity.Player;

public class GranterAPI {
    /**
     * Check if the player can give groups.
     * @param player A player who gives
     * @return Boolean
     */
    public boolean isPlayerCanGrantGroups(Player player) {
        return isPlayerCanGrantGroups(player);
    }

    /**
     * Check if the group exists
     * @param group Group name
     * @return Boolean
     */
    public boolean isGroupExist(String group) {
        return isGroupExist(group);
    }

    /**
     * Get group level
     * @param group Group name
     * @return Group level
     */
    public int getGroupLevel(String group) {
        return getGroupLevel(group);
    }

    /**
     * Get the number of groups a group can give.
     * @param senderGroup The group of the giving player
     * @param group The group the player wants to give
     * @return Number of groups
     */
    public int getGroupInConfig(String senderGroup, String group) {
        return getGroupInConfig(senderGroup,group);
    }

    /**
     * Get the number of groups that the player can still give.
     * @param player A player who gives
     * @param group The group the player wants to give
     * @return Number of group usage
     */
    public int getGroupInData(Player player, String group) {
        return getGroupInData(player,group);
    }

    /**
     * Set group usages for player
     * @param player Player, who used grant
     * @param group The group the player wants to give
     * @param count Number of group usage
     */
    public void setGroupUsages(Player player, String group, int count) {}
}
