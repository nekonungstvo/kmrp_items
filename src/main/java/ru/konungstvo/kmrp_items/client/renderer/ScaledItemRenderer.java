package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class ScaledItemRenderer extends UniversalRenderer {
    public ScaledItemRenderer(double scale, boolean is_staff) {
        super(
                Vec3.createVectorHelper(0, 0, 0),
                is_staff ? 0.1 : 0,
                scale
        );
    }
}
