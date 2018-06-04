package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class UniversalRenderer implements IItemRenderer {
    private final Vec3 rotation;
    private final double shift;
    private final double scale;

    public UniversalRenderer(Vec3 rotation, double shift, double scale) {
        this.rotation = rotation;
        this.shift = shift;
        this.scale = scale;
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
                double scale_shift = 1 - scale;

                GL11.glTranslated(0.5, 0.3, 0);
                GL11.glRotated(this.rotation.xCoord, 1, 1, 0);
                GL11.glRotated(this.rotation.yCoord, 0, 0, 1);
                GL11.glRotated(this.rotation.zCoord, 1, -1, 0);
                GL11.glTranslated(-0.5, -0.4, 0);

                GL11.glTranslated(
                        scale_shift + this.scale * this.shift,
                        -this.scale * this.shift,
                        0
                );

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
