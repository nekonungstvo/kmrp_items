package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class BowRenderer extends UniversalRenderer {
    public BowRenderer(double scale, double handle_shift) {
        super(
                Vec3.createVectorHelper(30, 0, 0),
                Vec3.createVectorHelper(0.2, 0.25, handle_shift),
                scale
        );
    }
}
