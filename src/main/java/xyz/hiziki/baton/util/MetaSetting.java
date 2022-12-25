package xyz.hiziki.baton.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class MetaSetting
{
    public ItemStack itemStack()
    {
        ItemStack stack = new ItemStack(Material.BLAZE_ROD);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName("警棒");
        meta.setLore(Arrays.asList("殴ったらKICKできる権力の棒", "Made IN Hiziki"));
        meta.addEnchant(Enchantment.ARROW_INFINITE, 15, true);
        stack.setItemMeta(meta);

        return stack;
    }
}