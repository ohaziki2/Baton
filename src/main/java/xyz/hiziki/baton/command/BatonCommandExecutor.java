package xyz.hiziki.baton.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.hiziki.baton.Main;
import xyz.hiziki.baton.util.MetaSetting;

public class BatonCommandExecutor implements CommandExecutor
{
    private final JavaPlugin plugin = Main.plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            if (sender instanceof ConsoleCommandSender)
            {
                plugin.getLogger().info("コマンドはプレイヤーしかつかえないぞ");
            }
            else
            {
                sender.sendMessage("コマンドはプレイヤーしかつかえないぞ");
            }
        }
        else
        {
            if (sender.isOp())
            {
                Player player = (Player) sender;
                new MetaSetting(Material.BLAZE_ROD, player, "警棒", "殴ったらKICKできる権力の棒", "Made IN Hiziki");
            }
            return true;
        }
        return false;
    }
}
