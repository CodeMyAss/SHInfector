package com.macguy8.SHInfector;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by macguy8 on 6/1/2014.
 */
public class SHInfector extends JavaPlugin {

    //*************************//

    public void onEnable() {
        saveDefaultConfig();

        InfectMode.valueOf(getConfig().getString("Mode", InfectMode.values()[0].name())).activate();
    }

    //*************************//

}