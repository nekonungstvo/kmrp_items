package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class ShieldRender extends UniversalRenderer {
    public ShieldRender() {
        super(
                Vec3.createVectorHelper(90, -20, 10),
                Vec3.createVectorHelper(0.15, 0,0),
                1
        );
    }
}
