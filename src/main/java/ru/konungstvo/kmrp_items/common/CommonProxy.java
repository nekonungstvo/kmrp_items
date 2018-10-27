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

    private static Permissions permissionLoader = new Permissions();

    public static CreativeTabs KMRPSimpleTab = new CreativeTabs("KMRPSimpleTab");
    public static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab");

    public void preInit(FMLPreInitializationEvent event) {
    //Misc
        KMRPSimpleTab.setTabIconItem(
                new ItemSimple("itemFork", "kmrp_items:fork").register()
        );
        new ItemSimple("itemFlut", "kmrp_items:flut").register();
        new ItemSimple("itemGolden_coin", "kmrp_items:golden_coin").register();
        new ItemSimple("itemSilver_coin", "kmrp_items:silver_coin").register();
        new ItemSimple("itemCopper_coin", "kmrp_items:copper_coin").register();
        new ItemSimple("itemWooden_coin", "kmrp_items:wooden_coin").register();
        new ItemSimple("itemRustyfork", "kmrp_items:rusty_fork").register();
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
        new ItemSimple("itemComb", "kmrp_items:comb").register();

        new ItemSimple("itemHourglass", "kmrp_items:hourglass").register();
        new ItemSimple("itemSwine", "kmrp_items:swine").register();

        new ItemSimple(
                "itemSpoon",
                "kmrp_items:spoon"
        ).register();

        new ItemSimple(
                "itemSpool",
                "kmrp_items:spool",
                "kmrp_items:spool_overlay"
        ).register();
        new ItemSimple(
                "itemCloth",
                "kmrp_items:cloth",
                "kmrp_items:cloth"
        ).register();
        new ItemSimple("itemScalpel", "kmrp_items:scalpel").register();
        new ItemSimple(
                "itemIgnot", 
                "kmrp_items:ignot",
                "kmrp_items:ignot_overlay"
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

        new ItemInventory("itemPouch", "kmrp_items:pouch").register();

        new ItemInventory("itemBag01", "kmrp_items:bag01").register();
        new ItemInventory("itemBag02", "kmrp_items:bag02").register();
        new ItemInventory("itemBag03", "kmrp_items:bag03").register();
        new ItemInventory("itemBag04", "kmrp_items:bag04").register();

        new ItemInventory("itemCasket", "kmrp_items:casket").register();

        new ItemInventory("itemTeapot01", "kmrp_items:teapot01").register();
        new ItemInventory("itemTeapot02", "kmrp_items:teapot02").register();
        new ItemInventory("itemTeapot03", "kmrp_items:teapot03").register();

        new ItemInventory(
                "itemBag",
                "kmrp_items:bag",
                "kmrp_items:bag_overlay"
        ).register();

        new ItemInventory(
                "itemBottleWine",
                "kmrp_items:bottle_wine",
                "kmrp_items:bottle_wine_overlay"
        ).register();

        new ItemInventory(
                "itemPhial",
                "kmrp_items:phial_1",
                "kmrp_items:phial_1_overlay"
        ).register();

        new ItemInventory(
                "itemPhial2",
                "kmrp_items:phial_2",
                "kmrp_items:phial_2_overlay"
        ).register();

        new ItemInventory(
                "itemGoblet",
                "kmrp_items:goblet",
                "kmrp_items:goblet"
        ).register();

        new ItemInventory(
                "itemEnvelope",
                "kmrp_items:envelope",
                "kmrp_items:envelope"
        ).register();

        new ItemInventory(
                "itemPaperPile",
                "kmrp_items:paper_pile",
                "kmrp_items:paper_pile"
        ).register();

        // Outfit
        new ItemSimple("itemSimpleBelt", "kmrp_items:simple_belt").register();
        new ItemSimple("itemWideBelt", "kmrp_items:wide_belt").register();
        new ItemSimple("itemRomanHelm", "kmrp_items:roman_helm").register();

        new ItemSimple(
                "itemGloves",
                "kmrp_items:gloves",
                "kmrp_items:gloves"
        ).register();

        new ItemSimple(
                "itemCotardie",
                "kmrp_items:cotardie",
                "kmrp_items:cotardie_overlay"
        ).register();

        new ItemSimple(
                "itemCloak",
                "kmrp_items:cloak",
                "kmrp_items:cloak"
        ).register();

        new ItemSimple(
                "itemShirt",
                "kmrp_items:shirt",
                "kmrp_items:shirt"
        ).register();

        new ItemSimple(
                "itemBoots",
                "kmrp_items:boots",
                "kmrp_items:boots"
        ).register();

        new ItemSimple(
                "itemPants",
                "kmrp_items:pants",
                "kmrp_items:pants"
        ).register();

        new ItemSimple(
                "itemShossi",
                "kmrp_items:shossi",
                "kmrp_items:shossi_overlay"
        ).register();

        new ItemSimple(
                "itemHood",
                "kmrp_items:hood",
                "kmrp_items:hood"
        ).register();

        new ItemSimple(
                "itemBuckleBelt",
                "kmrp_items:buckle_belt",
                "kmrp_items:buckle_belt_overlay"
        ).register();

        new ItemSimple(
                "itemClothBelt",
                "kmrp_items:cloth_belt",
                "kmrp_items:cloth_belt"
        ).register();

        new ItemSimple(
                "itemRing",
                "kmrp_items:ring",
                "kmrp_items:ring"
        ).register();

        new ItemSimple(
                "itemVest",
                "kmrp_items:vest",
                "kmrp_items:vest"
        ).register();

        new ItemSimple(
                "itemDiadem",
                "kmrp_items:diadem",
                "kmrp_items:diadem_overlay"
        ).register();

        new ItemSimple(
                "itemCog",
                "kmrp_items:cog",
                "kmrp_items:cog"
        ).register();

        new ItemSimple(
                "itemCrystal",
                "kmrp_items:crystal",
                "kmrp_items:crystal"
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
        new ItemWeapon("itemButcherAxe", "kmrp_items:butcher_axe").register();
        new ItemWeapon("itemTableKnife", "kmrp_items:table_knife").register();
        new ItemWeapon("itemKitchenKnife", "kmrp_items:kitchen_knife").register();
        new ItemWeapon("itemStiletto", "kmrp_items:stiletto").register();
        new ItemWeapon("itemStiletto2", "kmrp_items:stiletto2").register();
	new ItemWeapon("itemSword", "kmrp_items:sword").register();

        // Bows
        new ItemWeapon("itemBow01", "kmrp_items:bow_1").register();
        new ItemWeapon("itemBow02", "kmrp_items:bow_2").register();
        new ItemWeapon("itemBow03", "kmrp_items:bow_3").register();

        new ItemWeapon("itemLongBow01", "kmrp_items:bow_1").register();
        new ItemWeapon("itemLongBow02", "kmrp_items:bow_2").register();
        new ItemWeapon("itemLongBow03", "kmrp_items:bow_3").register();

        // Elven weapon
        new ItemWeapon("itemElvenDagger", "kmrp_items:elven_dagger").register();

        new ItemWeapon("itemSaberElven", "kmrp_items:elven_saber_1").register();
        new ItemWeapon("itemSaberElven2", "kmrp_items:elven_saber_2").register();

        // Ork weapon
        new ItemWeapon("itemUrukHaiSword", "kmrp_items:uruk_hai_sword_1").register();
        new ItemWeapon("itemUrukHaiSword2", "kmrp_items:uruk_hai_sword_2").register();

        // Romanian weapon
        new ItemWeapon("itemRomanSword", "kmrp_items:roman_sword_1").register();
        new ItemWeapon("itemRomanSword2", "kmrp_items:roman_sword_2").register();
        new ItemWeapon("itemRomanSword3", "kmrp_items:roman_sword_3").register();

        new ItemWeapon("itemRomanSpear", "kmrp_items:roman_spear").register();

        new ItemWeapon("itemRomanShield", "kmrp_items:roman_shield_1").register();
        new ItemWeapon("itemRomanShield2", "kmrp_items:roman_shield_2").register();

        new ItemWeapon("itemAquila01", "kmrp_items:aquila01").register();
        new ItemWeapon("itemAquila02", "kmrp_items:aquila02").register();
        new ItemWeapon("itemAquila03", "kmrp_items:aquila03").register();

                NetworkRegistry.INSTANCE.registerGuiHandler(instance, new InventoryGuiHandler());
    }

    public void registerServerCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new DyeCommand());
    }
}
