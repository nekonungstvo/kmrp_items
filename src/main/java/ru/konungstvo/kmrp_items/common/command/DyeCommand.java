package ru.konungstvo.kmrp_items.common.command;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import tv.twitch.chat.Chat;

import java.awt.*;
import java.util.List;

public class DyeCommand implements ICommand {
    @Override
    public String getCommandName() {
        return "dye";
    }

    @Override
    public String getCommandUsage(ICommandSender iCommandSender) {
        return "" +
                "/dye <RED> <GREEN> <BLUE>\n" +
                "/dye <#RRGGBB>\n" +
                "/dye <number>\n";
    }

    private void setColor(ItemStack itemStack, int color) {
        NBTTagCompound root;
        if (itemStack.hasTagCompound()) {
            root = itemStack.getTagCompound();
        } else {
            root = new NBTTagCompound();
            itemStack.setTagCompound(root);
        }

        NBTTagCompound display;
        if (root.hasKey("display")) {
            display = root.getCompoundTag("display");
        } else {
            display = new NBTTagCompound();
            root.setTag("display", display);
        }

        display.setInteger("color", color);
    }

    private int colorFromNumbers(String[] strings) {
        return new Color(
                Integer.valueOf(strings[0]),
                Integer.valueOf(strings[1]),
                Integer.valueOf(strings[2])
        ).getRGB();
    }

    private int colorFromRGBString(String rgb) {
        return Color.decode(rgb).getRGB();
    }

    private int colorFromMinecraftString(String colorString) {
        return Integer.valueOf(colorString);
    }

    private void processCommandThrowing(ICommandSender sender, String[] strings) {
        int color;

        if (strings.length == 1) {
            if (strings[0].startsWith("#")) {
                color = this.colorFromRGBString(strings[0]);
            } else {
                color = this.colorFromMinecraftString(strings[0]);
            }
        } else if (strings.length == 3) {
            color = this.colorFromNumbers(strings);
        } else {
            throw new IllegalArgumentException(
                    "Wrong usage: \n" + this.getCommandUsage(sender)
            );
        }

        EntityPlayerMP player = (EntityPlayerMP) sender;
        ItemStack itemStack = player.getHeldItem();
        if (itemStack == null) {
            throw new IllegalArgumentException("Your hand is empty!");
        }

        this.setColor(itemStack, color);
    }

    @Override
    public void processCommand(ICommandSender sender, String[] strings) {
        try {
            this.processCommandThrowing(sender, strings);
            sender.addChatMessage(new ChatComponentText(
                    "Success!"
            ));
        } catch (IllegalArgumentException exception) {
            String message = "Error: " + exception.getMessage();

            for (String line : message.split("\n")) {
                sender.addChatMessage(new ChatComponentText(line));
            }
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender iCommandSender) {
        EntityPlayerMP player = (EntityPlayerMP) iCommandSender;
        return MinecraftServer.getServer().getConfigurationManager().func_152596_g(player.getGameProfile());
    }

    @Override
    public List addTabCompletionOptions(ICommandSender iCommandSender, String[] strings) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] strings, int i) {
        return false;
    }

    @Override
    public List getCommandAliases() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
