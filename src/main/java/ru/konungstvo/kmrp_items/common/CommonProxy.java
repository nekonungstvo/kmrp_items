package ru.konungstvo.kmrp_items.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import ru.konungstvo.kmrp_items.common.command.DyeCommand;
import ru.konungstvo.kmrp_items.common.item.ItemColoredParts;
import ru.konungstvo.kmrp_items.common.item.ItemSimple;
import ru.konungstvo.kmrp_items.common.item.ItemWeapon;

public class CommonProxy {
    public static CreativeTabs KMRPSimpleTab = new CreativeTabs("KMRPSimpleTab");
    public static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab");

    public void preInit(FMLPreInitializationEvent event) {
        KMRPSimpleTab.setTabIconItem(
                ItemSimple.register("itemFork", "kmrp_items:fork")
        );
        ItemSimple.register("itemFlut", "kmrp_items:flut");
        ItemSimple.register("itemGolden_coin", "kmrp_items:golden_coin");
        ItemSimple.register("itemSilver_coin", "kmrp_items:silver_coin");
        ItemSimple.register("itemCopper_coin", "kmrp_items:copper_coin");
        ItemSimple.register("itemWooden_coin", "kmrp_items:wooden_coin");
        ItemSimple.register("itemRing", "kmrp_items:ring");
        ItemSimple.register("itemRustyfork", "kmrp_items:rusty_fork");
        ItemSimple.register("itemSpoon", "kmrp_items:spoon");
        ItemSimple.register("itemDynamite", "kmrp_items:dynamite");
        ItemSimple.register("itemBomb", "kmrp_items:bomb");
        ItemSimple.register("itemTin", "kmrp_items:tin");
        ItemSimple.register("itemPipe", "kmrp_items:tobacco_pipe");
        ItemSimple.register("itemPhoto", "kmrp_items:photo");
        ItemSimple.register("itemCamera", "kmrp_items:camera");
        ItemSimple.register("itemCapsule", "kmrp_items:capsule");
        ItemSimple.register("itemCharge", "kmrp_items:charge");
        ItemSimple.register("itemBullet", "kmrp_items:bullet");
        ItemSimple.register("itemRamrod", "kmrp_items:ramrod");
        ItemSimple.register("itemInkwell", "kmrp_items:inkwell");
        ItemSimple.register("itemBasket", "kmrp_items:basket");
        ItemSimple.register("itemBottle", "kmrp_items:bottle");
        ItemSimple.register("itemFlask", "kmrp_items:flask");
        ItemSimple.register("itemNeedle", "kmrp_items:needle");
        ItemSimple.register("itemPencil", "kmrp_items:pencil");
        ItemSimple.register("itemJoint", "kmrp_items:joint");
        ItemSimple.register("itemPint", "kmrp_items:pint");
        ItemSimple.register("itemIronPint", "kmrp_items:iron_pint");
        ItemSimple.register("itemWaterSkin", "kmrp_items:water_skin");
        ItemSimple.register("itemGoggles", "kmrp_items:goggles");
        ItemSimple.register("itemWoodenCup", "kmrp_items:wooden_cup");
        ItemSimple.register("itemWoodenSpoon", "kmrp_items:wooden_spoon");
        ItemSimple.register("itemWoodenFork", "kmrp_items:wooden_fork");
        ItemSimple.register("itemCigar", "kmrp_items:cigar");
        ItemSimple.register("itemCigarette", "kmrp_items:cigarette");
        ItemSimple.register("itemSack", "kmrp_items:sack");
        ItemSimple.register("itemScrewdriver", "kmrp_items:screwdriver");
        ItemSimple.register("itemTabletA", "kmrp_items:tabletA");
        ItemSimple.register("itemTabletB", "kmrp_items:tabletB");
        ItemSimple.register("itemTabletC", "kmrp_items:tabletC");
        ItemSimple.register("itemTabletD", "kmrp_items:tabletD");
        ItemSimple.register("itemLock", "kmrp_items:lock");
        ItemSimple.register("itemMortiseLock", "kmrp_items:mortise_lock");
        ItemSimple.register("itemNail", "kmrp_items:nail");
        ItemSimple.register("itemHook", "kmrp_items:hook");
        ItemSimple.register("itemToolbox", "kmrp_items:toolbox");
        ItemSimple.register("itemLeg", "kmrp_items:leg");
        ItemSimple.register("itemHand", "kmrp_items:hand");
        ItemSimple.register("itemMop", "kmrp_items:mop");
        ItemSimple.register("itemLeatherStrips", "kmrp_items:leather_strips");
        ItemSimple.register("itemClassicRose", "kmrp_items:rose");
        ItemColoredParts.register("itemSpool", "kmrp_items:spool");
        ItemColoredParts.register("itemBag", "kmrp_items:bag");
        ItemColoredParts.register("itemCloth", "kmrp_items:cloth");

        // Outfit
        ItemSimple.register("itemSimpleBelt", "kmrp_items:simple_belt");
        ItemSimple.register("itemWideBelt", "kmrp_items:wide_belt");

        ItemColoredParts.register("itemGloves", "kmrp_items:gloves");
        ItemColoredParts.register("itemCotardie", "kmrp_items:cotardie");
        ItemColoredParts.register("itemCloak", "kmrp_items:cloak");
        ItemColoredParts.register("itemShirt", "kmrp_items:shirt");
        ItemColoredParts.register("itemBoots", "kmrp_items:boots");
        ItemColoredParts.register("itemPants", "kmrp_items:pants");
        ItemColoredParts.register("itemShossi", "kmrp_items:shossi");
        ItemColoredParts.register("itemHood", "kmrp_items:hood");

        ItemColoredParts.register("itemBuckleBelt", "kmrp_items:buckle_belt");
        ItemColoredParts.register("itemClothBelt", "kmrp_items:cloth_belt");

        KMRPWeaponTab.setTabIconItem(
                ItemWeapon.register("itemscimitar", "kmrp_items:scimitar")
        );
        ItemWeapon.register("itemclub", "kmrp_items:club");
        ItemWeapon.register("itemsaber", "kmrp_items:saber");
        ItemWeapon.register("itemknobstick", "kmrp_items:knobstick");
        ItemWeapon.register("itemmstar", "kmrp_items:m_star");
        ItemWeapon.register("itemshpaga", "kmrp_items:shpaga");
        ItemWeapon.register("itemthr_axe", "kmrp_items:thr_axe");
        ItemWeapon.register("itemflail", "kmrp_items:flail");
        ItemWeapon.register("itemTrainingSword", "kmrp_items:training_sword");
        ItemWeapon.register("itemWoodenKnife", "kmrp_items:wooden_knife");
        ItemWeapon.register("itemFalx", "kmrp_items:falx");
        ItemWeapon.register("itemChopesh", "kmrp_items:chopesh");
        ItemWeapon.register("itemSling", "kmrp_items:sling");
        ItemWeapon.register("itemCane", "kmrp_items:cane");
        ItemWeapon.register("itemhalberd", "kmrp_items:halberd");
        ItemWeapon.register("itemHalberdResized", "kmrp_items:halberd");
        ItemWeapon.register("itemscythe", "kmrp_items:scythe");
        ItemWeapon.register("itemScytheResized", "kmrp_items:scythe");
        ItemWeapon.register("itempitchfork", "kmrp_items:pitchfork");
        ItemWeapon.register("itemPitchforkResized", "kmrp_items:pitchfork");
        ItemWeapon.register("itemLance", "kmrp_items:lance");
        ItemWeapon.register("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
        ItemWeapon.register("itemTwoHandSwordResized", "kmrp_items:twohanded_sword");
        ItemWeapon.register("itemKnuckle", "kmrp_items:knuckle");
    }

    public void registerServerCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new DyeCommand());
    }
}
