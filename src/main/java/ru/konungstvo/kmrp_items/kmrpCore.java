package ru.konungstvo.kmrp_items;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import ru.konungstvo.kmrp_items.common.CommonProxy;

@Mod(modid = kmrpCore.MODID, version = kmrpCore.VERSION, name = kmrpCore.NAME)
public class kmrpCore {
    public static final String MODID = "kmrp_items";
    static final String NAME = "KMRP Items";
    static final String VERSION = "1.3";

    @SidedProxy(
            clientSide = "ru.konungstvo.kmrp_items.client.ClientProxy",
            serverSide = "ru.konungstvo.kmrp_items.common.CommonProxy"
    )
    private static CommonProxy proxy;

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        proxy.registerServerCommands(event);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
}