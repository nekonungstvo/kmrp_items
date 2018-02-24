package ru.konungstvo.kmrp_items.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
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
        ItemSimple.register("itemLock", "kmrp_items:lock");
        ItemSimple.register("itemSack", "kmrp_items:sack");
        ItemSimple.register("itemScrewdriver", "kmrp_items:screwdriver");
        ItemSimple.register("itemTabletA", "kmrp_items:tabletA");
        ItemSimple.register("itemTabletB", "kmrp_items:tabletB");
        ItemSimple.register("itemTabletC", "kmrp_items:tabletC");
        ItemSimple.register("itemTabletD", "kmrp_items:tabletD");
        ItemSimple.register("itemMortiseLock", "kmrp_items:mortise_lock");
        ItemColoredParts.register("itemSpool", "kmrp_items:spool");
        ItemColoredParts.register("itemBag", "kmrp_items:bag");
        ItemColoredParts.register("itemCloth", "kmrp_items:cloth");

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
        ItemWeapon.register("itemhalberd", "kmrp_items:halberd");
        ItemWeapon.register("itemscythe", "kmrp_items:scythe");
        ItemWeapon.register("itemscytheResized", "kmrp_items:scythe");
        ItemWeapon.register("itempitchfork", "kmrp_items:pitchfork");
        ItemWeapon.register("itemLance", "kmrp_items:lance");
        ItemWeapon.register("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
    }
}