package ru.konungstvo.kmrp_items.common;

import net.minecraft.item.Item;

public class CreativeTabs extends net.minecraft.creativetab.CreativeTabs {
    private Item item = null;

    public CreativeTabs(String lable) {
        super(lable);
    }

    @Override
    public Item getTabIconItem() {
        return this.item;
    }

    public void setTabIconItem(Item item) {
        this.item = item;
    }
}
