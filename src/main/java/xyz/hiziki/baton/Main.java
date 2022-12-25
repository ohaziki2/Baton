package xyz.hiziki.baton;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.hiziki.baton.command.BatonCommandExecutor;
import xyz.hiziki.baton.event.EntityDamage;

public final class Main extends JavaPlugin
{
    public static JavaPlugin plugin;

    @Override
    public void onEnable()
    {
        super.onEnable();

        plugin = this;

        getCommand("baton").setExecutor(new BatonCommandExecutor());

        Bukkit.getPluginManager().registerEvents(new EntityDamage(), this);

        getLogger().info("ヤッタゾ！、プラグインがうごいたゾ！");
    }

    @Override
    public void onDisable()
    {
        super.onDisable();

        getLogger().info("プラグインが停止したゾ");
    }
}
