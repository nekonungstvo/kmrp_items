package ru.konungstvo.kmrp_items.client;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.konungstvo.kmrp_items.client.renderer.ScaledItemRenderer;
import ru.konungstvo.kmrp_items.common.CommonProxy;
import ru.konungstvo.kmrp_items.kmrpCore;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        Item item;
        item = GameRegistry.findItem(kmrpCore.MODID, "itemHalberdResized");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemscytheResized");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemPitchforkResized");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemLance");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.8, false));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemTwoHandSwordResized");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, false));
    }
}
