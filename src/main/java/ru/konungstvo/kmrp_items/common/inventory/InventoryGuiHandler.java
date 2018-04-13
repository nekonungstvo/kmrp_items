package ru.konungstvo.kmrp_items.common.inventory;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import ru.konungstvo.kmrp_items.client.gui.GuiInventoryItem;

public class InventoryGuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int i, EntityPlayer entityPlayer, World world, int i1, int i2, int i3) {
        return new ContainerItem(
                entityPlayer.inventory.currentItem,
                entityPlayer.inventory
        );
    }

    @Override
    public Object getClientGuiElement(int i, EntityPlayer entityPlayer, World world, int i1, int i2, int i3) {
        return new GuiInventoryItem(
                entityPlayer.inventory.currentItem,
                entityPlayer.inventory
        );
    }
}