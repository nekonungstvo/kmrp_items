package ru.konungstvo.kmrp_items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

public class Spool extends Item {
    private IIcon threadsLayer = null;

    public int getColorFromNBT(ItemStack itemStack) {
        NBTTagCompound nbttagcompound = itemStack.getTagCompound();

        if (nbttagcompound == null) {
            return -1;
        }

        NBTTagCompound display_tag = nbttagcompound.getCompoundTag("display");

        if (display_tag == null || !display_tag.hasKey("color")) {
            return -1;
        }

        return display_tag.getInteger("color");
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

