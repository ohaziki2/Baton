package xyz.hiziki.baton.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MetaSetting
{
    public MetaSetting(Material item, Player p, String itemName, String lore1, String lore2)
    {
        ItemStack stack = new ItemStack(item);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(itemName);
        meta.setLore(Arrays.asList(lore1, lore2));
        meta.addEnchant(Enchantment.ARROW_INFINITE, 15, true);
        stack.setItemMeta(meta);
        p.getInventory().addItem(stack);
    }
}
