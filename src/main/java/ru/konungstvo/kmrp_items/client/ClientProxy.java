package ru.konungstvo.kmrp_items.client;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import ru.konungstvo.kmrp_items.client.renderer.*;
import ru.konungstvo.kmrp_items.common.CommonProxy;
import ru.konungstvo.kmrp_items.kmrpCore;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        Item item;

        UniversalRenderer shortSwordRender = new SwordRenderer(1.0);
        UniversalRenderer middleSwordRender = new SwordRenderer(1.3);
        UniversalRenderer longSwordRender = new SwordRenderer(1.5);

        // Short swords
        item = GameRegistry.findItem(kmrpCore.MODID, "itemtwo_hand_sword");
        MinecraftForgeClient.registerItemRenderer(item, shortSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemscimitar");
        MinecraftForgeClient.registerItemRenderer(item, shortSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemsaber");
        MinecraftForgeClient.registerItemRenderer(item, shortSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemsaber");
        MinecraftForgeClient.registerItemRenderer(item, shortSwordRender);

        // Middle swords
        item = GameRegistry.findItem(kmrpCore.MODID, "itemUrukHaiSword");
        MinecraftForgeClient.registerItemRenderer(item, middleSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemUrukHaiSword2");
        MinecraftForgeClient.registerItemRenderer(item, middleSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemSaberElven");
        MinecraftForgeClient.registerItemRenderer(item, middleSwordRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemSaberElven2");
        MinecraftForgeClient.registerItemRenderer(item, middleSwordRender);

        // Long swords
        item = GameRegistry.findItem(kmrpCore.MODID, "itemTwoHandSwordResized");
        MinecraftForgeClient.registerItemRenderer(item, longSwordRender);

        // Shields
        UniversalRenderer shieldRenderer = new ShieldRender();
        item = GameRegistry.findItem(kmrpCore.MODID, "itemRomanShield");
        MinecraftForgeClient.registerItemRenderer(item, shieldRenderer);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemRomanShield2");
        MinecraftForgeClient.registerItemRenderer(item, shieldRenderer);

        // Spears or Stuffs
        UniversalRenderer spearLikeRender = new StaffRenderer(1.5);
        item = GameRegistry.findItem(kmrpCore.MODID, "itemHalberdResized");
        MinecraftForgeClient.registerItemRenderer(item, spearLikeRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemScytheResized");
        MinecraftForgeClient.registerItemRenderer(item, spearLikeRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemPitchforkResized");
        MinecraftForgeClient.registerItemRenderer(item, spearLikeRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemRomanSpear");
        MinecraftForgeClient.registerItemRenderer(item, spearLikeRender);

        // Aquila
        UniversalRenderer aquilaRender = new AquilaRender();

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila01");
        MinecraftForgeClient.registerItemRenderer(item, aquilaRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila02");
        MinecraftForgeClient.registerItemRenderer(item, aquilaRender);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemAquila03");
        MinecraftForgeClient.registerItemRenderer(item, aquilaRender);

        // Bows
        UniversalRenderer shortBowRenderer = new BowRenderer(1, -0.1);
        UniversalRenderer longBowRenderer = new BowRenderer(1.5, -0.1);

        // Short bows
        item = GameRegistry.findItem(kmrpCore.MODID, "itemBow02");
        MinecraftForgeClient.registerItemRenderer(item, shortBowRenderer);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemBow03");
        MinecraftForgeClient.registerItemRenderer(item, shortBowRenderer);

        // Long bows
        item = GameRegistry.findItem(kmrpCore.MODID, "itemLongBow02");
        MinecraftForgeClient.registerItemRenderer(item, longBowRenderer);

        item = GameRegistry.findItem(kmrpCore.MODID, "itemLongBow03");
        MinecraftForgeClient.registerItemRenderer(item, longBowRenderer);

        // Other bows
        item = GameRegistry.findItem(kmrpCore.MODID, "itemBow01");
        MinecraftForgeClient.registerItemRenderer(item, new BowRenderer(1, -0.05));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemLongBow01");
        MinecraftForgeClient.registerItemRenderer(item, new BowRenderer(1.5d, -0.05));

        // Others
        item = GameRegistry.findItem(kmrpCore.MODID, "itemCane");
        MinecraftForgeClient.registerItemRenderer(item, new CaneRenderer());

        item = GameRegistry.findItem(kmrpCore.MODID, "itemLance");
        MinecraftForgeClient.registerItemRenderer(item, new SwordRenderer(1.8));

        item = GameRegistry.findItem(kmrpCore.MODID, "itemKnuckle");
        MinecraftForgeClient.registerItemRenderer(item, new KnuckleRenderer());
    }
}
