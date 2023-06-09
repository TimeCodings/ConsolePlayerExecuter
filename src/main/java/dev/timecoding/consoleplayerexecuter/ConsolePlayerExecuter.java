package dev.timecoding.consoleplayerexecuter;

import dev.timecoding.consoleplayerexecuter.command.ConsolePlayerExecuterCommand;
import dev.timecoding.consoleplayerexecuter.command.completer.ConsolePlayerExecuterCompleter;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class ConsolePlayerExecuter extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aThe plugin §e"+this.getDescription().getName()+" §aby §eTimeCode §agot enabled!");
        PluginCommand mainCommand = this.getCommand("executeasplayer");
        mainCommand.setExecutor(new ConsolePlayerExecuterCommand());
        mainCommand.setTabCompleter(new ConsolePlayerExecuterCompleter());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§aThe plugin §e"+this.getDescription().getName()+" §aby §eTimeCode §cgot disabled!");
    }
}
