package ru.konungstvo.kmrp_items.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerItem extends Container {
    private IInventory itemInventory;
    private int numRows;

    public ContainerItem(int slot, InventoryPlayer inventoryPlayer) {
        InventoryItem itemInventory = new InventoryItem(slot, inventoryPlayer, 9);

        this.itemInventory = itemInventory;
        this.numRows = itemInventory.getSizeInventory() / 9;
        itemInventory.openInventory();

        int a = (this.numRows - 4) * 18;

        for (int i = 0; i < this.numRows; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(itemInventory, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }

        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9, 8 + j * 18, 103 + i * 18 + a));
            }
        }

        for (int i = 0; i < 9; ++i) {
            if (i == slot) {
                this.addSlotToContainer(new SlotDisabled(inventoryPlayer, i, 8 + i * 18, 161 + a));
            } else {
                this.addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 161 + a));
            }
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotNumber) {
        ItemStack itemstack = null;
        Slot slot = (Slot) this.inventorySlots.get(slotNumber);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (slotNumber < this.numRows * 9) {
                if (!this.mergeItemStack(itemstack1, this.numRows * 9, this.inventorySlots.size(), true)) {
                    return null;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, this.numRows * 9, false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack) null);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return this.itemInventory.isUseableByPlayer(p_75145_1_);
    }

    @Override
    public void onContainerClosed(EntityPlayer p_75134_1_) {
        super.onContainerClosed(p_75134_1_);
        this.itemInventory.closeInventory();
    }

    public IInventory getItemInventory() {
        return itemInventory;
    }

}
