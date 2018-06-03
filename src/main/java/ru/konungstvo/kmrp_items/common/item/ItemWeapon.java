package ru.konungstvo.kmrp_items.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import static ru.konungstvo.kmrp_items.common.CommonProxy.KMRPWeaponTab;


public class ItemWeapon extends ItemSword {
    private String name;

    private static ToolMaterial NO_MATERIAL = EnumHelper.addToolMaterial(
            "NO_MATERIAL", 0, 1000,
            0.0F, 0.0F, 30
    );

    public ItemWeapon(String name, String texture) {
        super(NO_MATERIAL);
        setUnlocalizedName(name);
        setCreativeTab(KMRPWeaponTab);
        setTextureName(texture);

        this.name = name;
    }

    public Item register() {
        GameRegistry.registerItem(this, this.name);
        return this;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        return p_77659_1_;
    }
}
