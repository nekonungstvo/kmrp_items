package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class AquilaRender extends UniversalRenderer {
    public AquilaRender() {
        super(
                Vec3.createVectorHelper(0, 50, 0),
                Vec3.createVectorHelper(0, -0.32,0),
                3
        );
    }
}
