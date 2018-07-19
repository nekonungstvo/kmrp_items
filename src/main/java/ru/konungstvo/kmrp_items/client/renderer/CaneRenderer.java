package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class CaneRenderer extends UniversalRenderer {
    public CaneRenderer() {
        super(
                Vec3.createVectorHelper(0, 60, 0),
                Vec3.createVectorHelper(0, 0.5, -0.2),
                1
        );
    }
}
