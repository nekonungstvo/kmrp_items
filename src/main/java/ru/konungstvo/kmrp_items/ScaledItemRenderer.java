package ru.konungstvo.kmrp_items;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ScaledItemRenderer implements IItemRenderer {
    private double scale;
    private boolean is_staff;

    public ScaledItemRenderer(double scale, boolean is_staff) {
        this.scale = scale;
        this.is_staff = is_staff;
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack itemStack, Object... data) {
        Item item = itemStack.getItem();

        GL11.glPushMatrix();

        if (type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            IIcon icon = item.getIconIndex(itemStack);

            if (type == ItemRenderType.EQUIPPED) {
                double shift = 0.5 * (scale - 1);
                double x = is_staff ? -shift : -2 * shift;
                double y = is_staff ? -shift : 0;

                GL11.glTranslated(x, y, 0);
                GL11.glScaled(scale, scale, 1);
            }

            Tessellator tessellator = Tessellator.instance;
            ItemRenderer.renderItemIn2D(tessellator,
                    icon.getMaxU(),
                    icon.getMinV(),
                    icon.getMinU(),
                    icon.getMaxV(),
                    icon.getIconWidth(),
                    icon.getIconHeight(), 1F / 16F);
        }

        GL11.glPopMatrix();
    }
}
