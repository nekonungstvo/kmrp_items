package ru.konungstvo.kmrp_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

import java.awt.*;
import java.util.List;

public class Spool extends Item {
    private static int[] colors = {
            Color.RED.getRGB(), Color.CYAN.getRGB(),
            Color.GRAY.getRGB(), Color.YELLOW.getRGB(),
    };
    private IIcon threadsLayer = null;

    public Spool() {
        super();
        setHasSubtypes(true);
    }

    private int getColorFromNBT(ItemStack itemStack) {
        NBTTagCompound nbttagcompound = itemStack.getTagCompound();

        if (nbttagcompound == null) {
            return colors[0];
        }

        NBTTagCompound displayTag = nbttagcompound.getCompoundTag("display");

        if (displayTag == null || !displayTag.hasKey("color")) {
            return colors[0];
        }

        return displayTag.getInteger("color");
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List subtypes) {
        int i = 0;

        for (int color : colors) {
            NBTTagCompound rootTag = new NBTTagCompound();
            NBTTagCompound displayTag = new NBTTagCompound();
            rootTag.setTag("display", displayTag);
            displayTag.setInteger("color", color);

            ItemStack itemStack = new ItemStack(item, 1, i);
            itemStack.setTagCompound(rootTag);
            subtypes.add(itemStack);

            i++;
        }
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

