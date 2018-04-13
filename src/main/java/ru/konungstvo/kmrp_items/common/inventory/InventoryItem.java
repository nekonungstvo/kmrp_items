package ru.konungstvo.kmrp_items.common.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraftforge.common.util.Constants;

import java.util.UUID;

public class InventoryItem extends InventoryBasic {
    static private final String NBT_INV_LABEL = "ItemInventory";
    static private final String NBT_UUID_LABEL = "ItemInventoryUUID";

    private final int openedSlot;
    private final String uid;

    private final InventoryPlayer inventory;

    InventoryItem(int openedSlot, InventoryPlayer inventory, int inventorySize) {
        super(inventory.getStackInSlot(openedSlot).getDisplayName(), true, inventorySize);
        this.inventory = inventory;
        this.openedSlot = openedSlot;

        ItemStack item = inventory.getStackInSlot(openedSlot);

        if (!item.hasTagCompound()) {
            item.setTagCompound(new NBTTagCompound());
        }

        NBTTagCompound tag = item.getTagCompound();

        if (!tag.hasKey(NBT_UUID_LABEL)) {
            this.uid = UUID.randomUUID().toString();
            tag.setString(NBT_UUID_LABEL, this.uid);
        } else {
            this.uid = tag.getString(NBT_UUID_LABEL);
        }

        if (!tag.hasKey(NBT_INV_LABEL)) {
            tag.setTag(NBT_INV_LABEL, new NBTTagList());
        }

        item.setTagCompound(tag);

        loadInventoryFromNBT(tag.getTagList(NBT_INV_LABEL, Constants.NBT.TAG_COMPOUND));
    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        ItemStack item = player.inventory.getStackInSlot(this.openedSlot);
        if (item == null || !item.hasTagCompound()) return false;
        return item.getTagCompound().getString(NBT_UUID_LABEL).equals(this.uid);
    }

    @Override
    public void markDirty() {
        super.markDirty();
        this.updateItem();
    }

    private void updateItem() {
        ItemStack item = this.inventory.getStackInSlot(openedSlot);
        item.getTagCompound().setTag(NBT_INV_LABEL, saveInventoryToNBT());
    }

    private void loadInventoryFromNBT(NBTTagList p_70486_1_) {
        int i;

        for (i = 0; i < this.getSizeInventory(); ++i) {
            this.setInventorySlotContents(i, (ItemStack) null);
        }

        for (i = 0; i < p_70486_1_.tagCount(); ++i) {
            NBTTagCompound nbttagcompound = p_70486_1_.getCompoundTagAt(i);
            int j = nbttagcompound.getByte("Slot") & 255;

            if (j < this.getSizeInventory()) {
                this.setInventorySlotContents(j, ItemStack.loadItemStackFromNBT(nbttagcompound));
            }
        }
    }

    private NBTTagList saveInventoryToNBT() {
        NBTTagList nbttaglist = new NBTTagList();

        for (int i = 0; i < this.getSizeInventory(); ++i) {
            ItemStack itemstack = this.getStackInSlot(i);

            if (itemstack != null) {
                NBTTagCompound nbttagcompound = new NBTTagCompound();
                nbttagcompound.setByte("Slot", (byte) i);
                itemstack.writeToNBT(nbttagcompound);
                nbttaglist.appendTag(nbttagcompound);
            }
        }

        return nbttaglist;
    }

}
