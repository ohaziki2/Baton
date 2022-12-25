package xyz.hiziki.baton.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import xyz.hiziki.baton.util.MetaSetting;

public class BatonCommandExecutor implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("コマンドはプレイヤーしかつかえないぞ");
        }
        else
        {
            if (sender.isOp())
            {
                Player player = (Player) sender;
                ItemStack baton = new MetaSetting().itemStack();

                player.getInventory().addItem(baton);
            }
            return true;
        }
        return false;
    }
}
