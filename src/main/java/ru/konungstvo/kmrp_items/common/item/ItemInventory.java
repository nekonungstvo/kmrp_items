package ru.konungstvo.kmrp_items.common.item;

import cpw.mods.fml.common.Mod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ru.konungstvo.kmrp_items.kmrpCore;

public class ItemInventory extends ItemSimple {
    @Mod.Instance(kmrpCore.MODID)
    private static kmrpCore instance;

    public ItemInventory(String name, String texture) {
        this(name, texture, null);
    }

    public ItemInventory(String name, String texture, String textureOverlay) {
        super(name, texture, textureOverlay);
        this.setMaxStackSize(1);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer player) {
        player.openGui(
                instance,
                0,
                player.getEntityWorld(),
                (int) player.posX,
                (int) player.posY,
                (int) player.posZ
        );
        return super.onItemRightClick(p_77659_1_, p_77659_2_, player);
    }
}
