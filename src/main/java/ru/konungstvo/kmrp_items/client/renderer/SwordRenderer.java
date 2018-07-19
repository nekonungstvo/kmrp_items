package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class SwordRenderer extends UniversalRenderer {
    public SwordRenderer(double scale) {
        super(
                Vec3.createVectorHelper(0, 0, 0),
                Vec3.createVectorHelper(0, -0.2,0),
                scale
        );
    }
}
