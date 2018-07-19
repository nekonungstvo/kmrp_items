package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class StaffRenderer extends UniversalRenderer {
    public StaffRenderer(double scale) {
        super(
                Vec3.createVectorHelper(0, 0, 0),
                Vec3.createVectorHelper(0, 0.1, 0),
                scale
        );
    }
}
