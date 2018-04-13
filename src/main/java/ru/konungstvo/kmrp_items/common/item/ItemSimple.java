package ru.konungstvo.kmrp_items.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

import java.awt.*;

import static ru.konungstvo.kmrp_items.common.CommonProxy.KMRPSimpleTab;

public class ItemSimple extends Item {
    private static int DEFAULT_COLOR = Color.GRAY.getRGB();

    private String name;
    private String texture;
    private String textureOverlay;

    private IIcon overlay = null;


    public ItemSimple(String name, String texture) {
        this(name, texture, null);
    }

    public ItemSimple(String name, String texture, String textureOverlay) {
        super();
        setUnlocalizedName(name);
        setCreativeTab(KMRPSimpleTab);
        setTextureName(texture);

        this.name = name;
        this.texture = texture;
        this.textureOverlay = textureOverlay;
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
        return this.textureOverlay != null;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int damageValue, int renderPass) {
        return renderPass > 0
                ? overlay
                : super.getIconFromDamageForRenderPass(damageValue, renderPass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack itemStack, int renderPass) {
        return renderPass > 0
                ? this.getColorFromNBT(itemStack) :
                super.getColorFromItemStack(itemStack, renderPass);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        super.registerIcons(iconRegister);
        if (this.textureOverlay != null) overlay = iconRegister.registerIcon(this.textureOverlay);
    }

    public Item register() {
        GameRegistry.registerItem(this, this.name);
        return this;
    }
}
