package ru.konungstvo.kmrp_items.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import static ru.konungstvo.kmrp_items.common.CommonProxy.KMRPWeaponTab;


public class ItemWeapon extends ItemSimple {
    public ItemWeapon(String name, String texture) {
        super(name, texture);
        setCreativeTab(KMRPWeaponTab);
        setFull3D();
    }
}
