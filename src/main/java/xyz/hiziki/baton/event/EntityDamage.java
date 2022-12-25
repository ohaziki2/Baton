package xyz.hiziki.baton.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamage implements Listener
{
    @EventHandler
    private void onEntityDamage(EntityDamageByEntityEvent e)
    {
        Entity attacker = e.getDamager();

        if (attacker instanceof Player && attacker.isOp())
        {
            Player player = (Player) attacker;

            if (player.getItemInHand().getType() == Material.BLAZE_ROD)
            {
                if (!player.isOp())
                {
                    Player victim = (Player) e.getEntity();
                    victim.kickPlayer("乙～");
                    Bukkit.broadcastMessage(ChatColor.DARK_RED + victim.getName() + "がKICKされました");
                }
            }
        }
    }
}
