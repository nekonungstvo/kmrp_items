package ru.konungstvo.kmrp_items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import static ru.konungstvo.kmrp_items.kmrpCore.KMRPSimpleTab;

public class ItemSimple extends Item {
    ItemSimple(String name, String texture) {
        super();
        setUnlocalizedName(name);
        setCreativeTab(KMRPSimpleTab);
        setTextureName(texture);
    }

    static Item register(String name, String texture) {
        Item item = new ItemSimple(name, texture);
        GameRegistry.registerItem(item, name);
        return item;
    }

}
