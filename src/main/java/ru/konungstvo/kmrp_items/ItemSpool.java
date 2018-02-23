package ru.konungstvo.kmrp_items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

import java.awt.*;

public class ItemSpool extends ItemSimple {
    private IIcon threadsLayer = null;
    private static int DEFAULT_COLOR = Color.RED.getRGB();

    static Item register(String name, String texture) {
        Item item = new ItemSpool(name, texture);
        GameRegistry.registerItem(item, name);
        return item;
    }

    private ItemSpool(String name, String texture) {
        super(name, texture);
    }

    private int getColorFromNBT(ItemStack itemStack) {
        NBTTagCompound nbttagcompound = itemStack.getTagCompound();

        if (nbttagcompound == null) {
            return DEFAULT_COLOR;
        }

        NBTTagCompound displayTag = nbttagcompound.getCompoundTag("display");

        if (displayTag == null || !displayTag.hasKey("color")) {
            return DEFAULT_COLOR;
        }

        return displayTag.getInteger("color");
    }

    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int damageValue, int renderPass) {
        return renderPass > 0
                ? threadsLayer :
                super.getIconFromDamageForRenderPass(damageValue, renderPass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack itemStack, int renderPass) {
        return (renderPass == 0)
                ? super.getColorFromItemStack(itemStack, renderPass)
                : this.getColorFromNBT(itemStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        super.registerIcons(iconRegister);
        threadsLayer = iconRegister.registerIcon(getIconString() + "_overlay");
    }

}

