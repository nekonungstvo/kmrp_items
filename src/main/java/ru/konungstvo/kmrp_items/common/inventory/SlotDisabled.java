package ru.konungstvo.kmrp_items.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotDisabled extends Slot {
    public SlotDisabled(final IInventory par1iInventory, final int par2, final int par3, final int par4) {
        super(par1iInventory, par2, par3, par4);
    }

    public boolean isItemValid(final ItemStack par1ItemStack) {
        return false;
    }

    public boolean canTakeStack(final EntityPlayer par1EntityPlayer) {
        return false;
    }
}


