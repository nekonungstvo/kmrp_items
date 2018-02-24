package ru.konungstvo.kmrp_items;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

@Mod(modid = kmrpCore.MODID, version = kmrpCore.VERSION, name = kmrpCore.NAME)
public class kmrpCore {
    static final String MODID = "kmrp_items";
    static final String NAME = "KMRP Items";
    static final String VERSION = "1.2";


    private static Item simple_icon;
    private static Item weapon_icon;


    static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab") {
        public Item getTabIconItem() {
            return kmrpCore.weapon_icon;
        }
    };

    static CreativeTabs KMRPSimpleTab = new CreativeTabs("KMRPSimpleTab") {
        public Item getTabIconItem() {
            return kmrpCore.simple_icon;
        }
    };

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        kmrpCore.simple_icon = ItemSimple.register("itemFork", "kmrp_items:fork");
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

        kmrpCore.weapon_icon = ItemWeapon.register("itemscimitar", "kmrp_items:scimitar");
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

        Item item;
        item = ItemWeapon.register("itemhalberd", "kmrp_items:halberd");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = ItemWeapon.register("itemscythe", "kmrp_items:scythe");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = ItemWeapon.register("itempitchfork", "kmrp_items:pitchfork");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, true));

        item = ItemWeapon.register("itemLance", "kmrp_items:lance");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.8, false));

        item = ItemWeapon.register("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
        MinecraftForgeClient.registerItemRenderer(item, new ScaledItemRenderer(1.5, false));
    }
}