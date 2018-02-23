package ru.konungstvo.kmrp_items;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = kmrpCore.MODID, version = kmrpCore.VERSION, name = kmrpCore.NAME)
public class kmrpCore {
    public static final String MODID = "kmrp_items";
    public static final String NAME = "KMRP Items";
    public static final String VERSION = "1.1";


    private static Item simple_icon;
    private static Item weapon_icon;


    protected static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab") {
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
        ItemSimple.register("itemNeedle", "kmrp_items:needle");
        ItemSimple.register("itemPencil", "kmrp_items:pencil");
        ItemSimple.register("itemJoint", "kmrp_items:joint");
        ItemSimple.register("itemPint", "kmrp_items:pint");
        ItemSimple.register("itemGoggles", "kmrp_items:goggles");
        ItemSimple.register("itemWoodenCup", "kmrp_items:wooden_cup");
        ItemSimple.register("itemWoodenSpoon", "kmrp_items:wooden_spoon");
        ItemSimple.register("itemWoodenFork", "kmrp_items:wooden_fork");
        ItemSpool.register("itemSpool", "kmrp_items:spool");

        kmrpCore.weapon_icon = ItemWeapon.register("itemscimitar", "kmrp_items:scimitar");
        ItemWeapon.register("itempitchfork", "kmrp_items:pitchfork");
        ItemWeapon.register("itemclub", "kmrp_items:club");
        ItemWeapon.register("itemsaber", "kmrp_items:saber");
        ItemWeapon.register("itemhalberd", "kmrp_items:halberd");
        ItemWeapon.register("itemknobstick", "kmrp_items:knobstick");
        ItemWeapon.register("itemmstar", "kmrp_items:m_star");
        ItemWeapon.register("itemscythe", "kmrp_items:scythe");
        ItemWeapon.register("itemshpaga", "kmrp_items:shpaga");
        ItemWeapon.register("itemthr_axe", "kmrp_items:thr_axe");
        ItemWeapon.register("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
        ItemWeapon.register("itemflail", "kmrp_items:flail");
        ItemWeapon.register("itemLance", "kmrp_items:lance");
        ItemWeapon.register("itemTrainingSword", "kmrp_items:training_sword");
        ItemWeapon.register("itemWoodenKnife", "kmrp_items:wooden_knife");

    }
}