package ru.konungstvo.kmrp_items.client;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Vec3;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.konungstvo.kmrp_items.client.renderer.AquilaRender;
import ru.konungstvo.kmrp_items.client.renderer.ScaledItemRenderer;
import ru.konungstvo.kmrp_items.client.renderer.ShieldRender;
import ru.konungstvo.kmrp_items.client.renderer.UniversalRenderer;
import ru.konungstvo.kmrp_items.common.CommonProxy;
import ru.konungstvo.kmrp_items.kmrpCore;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        Item item;
        item = GameRegistry.findItem(kmrpCore.MODID, "itemCane");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.1, true));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemLance");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.8, false));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemTwoHandSwordResized");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, false));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemKnuckle");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(0.5, false));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemRomanShield");
        MinecraftForgeClient.registerItemRenderer(item, new ShieldRender());

        UniversalRenderer spear_like_render = new ScaledItemRenderer(1.5, true);
        item = GameRegistry.findItem(kmrpCore.MODID, "itemHalberdResized");
        MinecraftForgeClient.registerItemRenderer(item, spear_like_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemScytheResized");
        MinecraftForgeClient.registerItemRenderer(item, spear_like_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemPitchforkResized");
        MinecraftForgeClient.registerItemRenderer(item, spear_like_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemRomanSpear");
        MinecraftForgeClient.registerItemRenderer(item, spear_like_render);

        UniversalRenderer bastard_render = new ScaledItemRenderer(1.3, false);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemUrukHaiSword");
        MinecraftForgeClient.registerItemRenderer(item, bastard_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemSaberElven");
        MinecraftForgeClient.registerItemRenderer(item, bastard_render);

        UniversalRenderer aquila_render = new AquilaRender();

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila01");
        MinecraftForgeClient.registerItemRenderer(item, aquila_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila02");
        MinecraftForgeClient.registerItemRenderer(item, aquila_render);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila03");
        MinecraftForgeClient.registerItemRenderer(item, aquila_render);
    }
}
