package ru.konungstvo.kmrp_items.client.renderer;

import net.minecraft.util.Vec3;

public class KnuckleRenderer extends UniversalRenderer {
    public KnuckleRenderer() {
        super(
                Vec3.createVectorHelper(0, 0, 0),
                Vec3.createVectorHelper(0, 0.7, 0),
                0.5
        );    }
}
