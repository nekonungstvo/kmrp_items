package ru.konungstvo.kmrp_items.common;

import net.minecraft.entity.player.EntityPlayerMP;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Permissions {

    private Class<?> bukkit;
    private Method getPlayer;
    private Method hasPermission;

    private static Permissions Instance;

    public static Permissions getInstance() {
        return Instance;
    }

    Permissions() {
        Instance = this;

        try {
            bukkit = Class.forName("org.bukkit.Bukkit");
            getPlayer = bukkit.getMethod("getPlayer", String.class);
            hasPermission = Class.forName("org.bukkit.entity.Player").getMethod("hasPermission", String.class);
        } catch (final ClassNotFoundException e) {
            System.out.println("No bukkit");
        } catch (final NoSuchMethodException e) {
            e.printStackTrace();
        } catch (final SecurityException e) {
            e.printStackTrace();
        }
    }

    private boolean checkBukkitPermission(final String username, final String permission) {
        try {
            final Object player = getPlayer.invoke(null, username);
            return (Boolean) hasPermission.invoke(player, permission);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean has(final EntityPlayerMP player, final String permission) {
        if (Instance.bukkit != null)
            return Instance.checkBukkitPermission(player.getCommandSenderName(), permission);
        return true;
    }

}
