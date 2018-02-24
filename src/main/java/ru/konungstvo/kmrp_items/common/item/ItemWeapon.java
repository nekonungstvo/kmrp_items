package ru.konungstvo.kmrp_items.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import static ru.konungstvo.kmrp_items.common.CommonProxy.KMRPWeaponTab;


public class ItemWeapon extends ItemSword {
    private static ToolMaterial NO_MATERIAL = EnumHelper.addToolMaterial(
            "NO_MATERIAL", 0, 1000,
            0.0F, 0.0F, 30
    );

    private ItemWeapon(String name, String texture) {
        super(NO_MATERIAL);
        setUnlocalizedName(name);
        setCreativeTab(KMRPWeaponTab);
        setTextureName(texture);
    }

    public static Item register(String name, String texture) {
        Item item = new ItemWeapon(name, texture);
        GameRegistry.registerItem(item, name);
        return item;
    }


}
