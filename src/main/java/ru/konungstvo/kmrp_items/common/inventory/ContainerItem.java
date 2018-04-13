package ru.konungstvo.kmrp_items.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.item.ItemStack;

public class ContainerItem extends ContainerChest {
    private final int openedSlot;

    public ContainerItem(int slot, InventoryPlayer inventory) {
        super(inventory, new InventoryItem(slot, inventory, 9));
        this.openedSlot = slot;
    }

    @Override
    public ItemStack slotClick(int slotClicked, int par2, int par3, EntityPlayer player) {
        int slotFilter = this.inventorySlots.size() - 9 + this.openedSlot;

        if (slotClicked == slotFilter) return null;

        return super.slotClick(slotClicked, par2, par3, player);
    }
}
