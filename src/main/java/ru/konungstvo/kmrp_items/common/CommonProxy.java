package ru.konungstvo.kmrp_items.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import ru.konungstvo.kmrp_items.common.command.DyeCommand;
import ru.konungstvo.kmrp_items.common.inventory.InventoryGuiHandler;
import ru.konungstvo.kmrp_items.common.item.ItemInventory;
import ru.konungstvo.kmrp_items.common.item.ItemSimple;
import ru.konungstvo.kmrp_items.common.item.ItemWeapon;
import ru.konungstvo.kmrp_items.kmrpCore;

public class CommonProxy {
    @Mod.Instance(kmrpCore.MODID)
    private static kmrpCore instance;

    public static CreativeTabs KMRPSimpleTab = new CreativeTabs("KMRPSimpleTab");
    public static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab");

    public void preInit(FMLPreInitializationEvent event) {
        KMRPSimpleTab.setTabIconItem(
                new ItemSimple("itemFork", "kmrp_items:fork").register()
        );
        new ItemSimple("itemFlut", "kmrp_items:flut").register();
        new ItemSimple("itemGolden_coin", "kmrp_items:golden_coin").register();
        new ItemSimple("itemSilver_coin", "kmrp_items:silver_coin").register();
        new ItemSimple("itemCopper_coin", "kmrp_items:copper_coin").register();
        new ItemSimple("itemWooden_coin", "kmrp_items:wooden_coin").register();
        new ItemSimple("itemRing", "kmrp_items:ring").register();
        new ItemSimple("itemRustyfork", "kmrp_items:rusty_fork").register();
        new ItemSimple("itemSpoon", "kmrp_items:spoon").register();
        new ItemSimple("itemDynamite", "kmrp_items:dynamite").register();
        new ItemSimple("itemBomb", "kmrp_items:bomb").register();
        new ItemSimple("itemPipe", "kmrp_items:tobacco_pipe").register();
        new ItemSimple("itemPhoto", "kmrp_items:photo").register();
        new ItemSimple("itemCamera", "kmrp_items:camera").register();
        new ItemSimple("itemCapsule", "kmrp_items:capsule").register();
        new ItemSimple("itemCharge", "kmrp_items:charge").register();
        new ItemSimple("itemBullet", "kmrp_items:bullet").register();
        new ItemSimple("itemRamrod", "kmrp_items:ramrod").register();
        new ItemSimple("itemNeedle", "kmrp_items:needle").register();
        new ItemSimple("itemPencil", "kmrp_items:pencil").register();
        new ItemSimple("itemJoint", "kmrp_items:joint").register();
        new ItemSimple("itemGoggles", "kmrp_items:goggles").register();
        new ItemSimple("itemWoodenSpoon", "kmrp_items:wooden_spoon").register();
        new ItemSimple("itemWoodenFork", "kmrp_items:wooden_fork").register();
        new ItemSimple("itemCigar", "kmrp_items:cigar").register();
        new ItemSimple("itemCigarette", "kmrp_items:cigarette").register();
        new ItemSimple("itemScrewdriver", "kmrp_items:screwdriver").register();
        new ItemSimple("itemTabletA", "kmrp_items:tabletA").register();
        new ItemSimple("itemTabletB", "kmrp_items:tabletB").register();
        new ItemSimple("itemTabletC", "kmrp_items:tabletC").register();
        new ItemSimple("itemTabletD", "kmrp_items:tabletD").register();
        new ItemSimple("itemLock", "kmrp_items:lock").register();
        new ItemSimple("itemMortiseLock", "kmrp_items:mortise_lock").register();
        new ItemSimple("itemNail", "kmrp_items:nail").register();
        new ItemSimple("itemHook", "kmrp_items:hook").register();
        new ItemSimple("itemLeg", "kmrp_items:leg").register();
        new ItemSimple("itemHand", "kmrp_items:hand").register();
        new ItemSimple("itemMop", "kmrp_items:mop").register();
        new ItemSimple("itemLeatherStrips", "kmrp_items:leather_strips").register();
        new ItemSimple("itemClassicRose", "kmrp_items:rose").register();
        new ItemSimple(
                "itemSpool",
                "kmrp_items:spool",
                "kmrp_items:spool_overlay"
        ).register();
        new ItemSimple(
                "itemCloth",
                "kmrp_items:cloth",
                "kmrp_items:cloth_overlay"
        ).register();

        // Containers
        new ItemInventory("itemSack", "kmrp_items:sack").register();
        new ItemInventory("itemInkwell", "kmrp_items:inkwell").register();
        new ItemInventory("itemBasket", "kmrp_items:basket").register();
        new ItemInventory("itemFlask", "kmrp_items:flask").register();
        new ItemInventory("itemBottle", "kmrp_items:bottle").register();
        new ItemInventory("itemPint", "kmrp_items:pint").register();
        new ItemInventory("itemIronPint", "kmrp_items:iron_pint").register();
        new ItemInventory("itemWaterSkin", "kmrp_items:water_skin").register();
        new ItemInventory("itemWoodenCup", "kmrp_items:wooden_cup").register();
        new ItemInventory("itemTin", "kmrp_items:tin").register();
        new ItemInventory("itemToolbox", "kmrp_items:toolbox").register();

        new ItemInventory(
                "itemBag",
                "kmrp_items:bag",
                "kmrp_items:bag_overlay"
        ).register();

        // Outfit
        new ItemSimple("itemSimpleBelt", "kmrp_items:simple_belt").register();
        new ItemSimple("itemWideBelt", "kmrp_items:wide_belt").register();

        new ItemSimple(
                "itemGloves",
                "kmrp_items:gloves",
                "kmrp_items:gloves_overlay"
        ).register();

        new ItemSimple(
                "itemCotardie",
                "kmrp_items:cotardie",
                "kmrp_items:cotardie_overlay"
        ).register();

        new ItemSimple(
                "itemCloak",
                "kmrp_items:cloak",
                "kmrp_items:cloak_overlay"
        ).register();

        new ItemSimple(
                "itemShirt",
                "kmrp_items:shirt",
                "kmrp_items:shirt_overlay"
        ).register();

        new ItemSimple(
                "itemBoots",
                "kmrp_items:boots",
                "kmrp_items:boots_overlay"
        ).register();

        new ItemSimple(
                "itemPants",
                "kmrp_items:pants",
                "kmrp_items:pants_overlay"
        ).register();

        new ItemSimple(
                "itemShossi",
                "kmrp_items:shossi",
                "kmrp_items:shossi_overlay"
        ).register();

        new ItemSimple(
                "itemHood",
                "kmrp_items:hood",
                "kmrp_items:hood_overlay"
        ).register();

        new ItemSimple(
                "itemBuckleBelt",
                "kmrp_items:buckle_belt",
                "kmrp_items:buckle_belt_overlay"
        ).register();

        new ItemSimple(
                "itemClothBelt",
                "kmrp_items:cloth_belt",
                "kmrp_items:cloth_belt_overlay"
        ).register();

        // Weapons
        KMRPWeaponTab.setTabIconItem(
                new ItemWeapon("itemscimitar", "kmrp_items:scimitar").register()
        );
        new ItemWeapon("itemclub", "kmrp_items:club").register();
        new ItemWeapon("itemsaber", "kmrp_items:saber").register();
        new ItemWeapon("itemknobstick", "kmrp_items:knobstick").register();
        new ItemWeapon("itemmstar", "kmrp_items:m_star").register();
        new ItemWeapon("itemshpaga", "kmrp_items:shpaga").register();
        new ItemWeapon("itemthr_axe", "kmrp_items:thr_axe").register();
        new ItemWeapon("itemflail", "kmrp_items:flail").register();
        new ItemWeapon("itemTrainingSword", "kmrp_items:training_sword").register();
        new ItemWeapon("itemWoodenKnife", "kmrp_items:wooden_knife").register();
        new ItemWeapon("itemFalx", "kmrp_items:falx").register();
        new ItemWeapon("itemChopesh", "kmrp_items:chopesh").register();
        new ItemWeapon("itemSling", "kmrp_items:sling").register();
        new ItemWeapon("itemCane", "kmrp_items:cane").register();
        new ItemWeapon("itemhalberd", "kmrp_items:halberd").register();
        new ItemWeapon("itemHalberdResized", "kmrp_items:halberd").register();
        new ItemWeapon("itemscythe", "kmrp_items:scythe").register();
        new ItemWeapon("itemScytheResized", "kmrp_items:scythe").register();
        new ItemWeapon("itempitchfork", "kmrp_items:pitchfork").register();
        new ItemWeapon("itemPitchforkResized", "kmrp_items:pitchfork").register();
        new ItemWeapon("itemLance", "kmrp_items:lance").register();
        new ItemWeapon("itemtwo_hand_sword", "kmrp_items:twohanded_sword").register();
        new ItemWeapon("itemTwoHandSwordResized", "kmrp_items:twohanded_sword").register();
        new ItemWeapon("itemKnuckle", "kmrp_items:knuckle").register();

        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new InventoryGuiHandler());
    }

    public void registerServerCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new DyeCommand());
    }
}
