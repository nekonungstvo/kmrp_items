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
        kmrpCore.simple_icon = new ItemSimple("itemFork", "kmrp_items:fork");
        new ItemSimple("itemFlut", "kmrp_items:flut");
        new ItemSimple("itemGolden_coin", "kmrp_items:golden_coin");
        new ItemSimple("itemSilver_coin", "kmrp_items:silver_coin");
        new ItemSimple("itemRing", "kmrp_items:ring");
        new ItemSimple("itemRustyfork", "kmrp_items:rusty_fork");
        new ItemSimple("itemSpoon", "kmrp_items:spoon");
        new ItemSimple("itemDynamite", "kmrp_items:dynamite");
        new ItemSimple("itemBomb", "kmrp_items:bomb");
        new ItemSimple("itemTin", "kmrp_items:tin");
        new ItemSimple("itemPipe", "kmrp_items:tobacco_pipe");
        new ItemSimple("itemPhoto", "kmrp_items:photo");
        new ItemSimple("itemCamera", "kmrp_items:camera");
        new ItemSimple("itemCapsule", "kmrp_items:capsule");
        new ItemSimple("itemCharge", "kmrp_items:charge");
        new ItemSimple("itemBullet", "kmrp_items:bullet");
        new ItemSimple("itemRamrod", "kmrp_items:ramrod");
        new ItemSimple("itemInkwell", "kmrp_items:inkwell");
        new ItemSimple("itemBasket", "kmrp_items:basket");
        new ItemSimple("itemBottle", "kmrp_items:bottle");
        new ItemSimple("itemNeedle", "kmrp_items:needle");
        new ItemSimple("itemPencil", "kmrp_items:pencil");
        new ItemSimple("itemJoint", "kmrp_items:joint");
        new ItemSimple("itemPint", "kmrp_items:pint");
        new ItemSimple("itemGoggles", "kmrp_items:goggles");
        new ItemSimple("itemWoodenCup", "kmrp_items:wooden_cup");
        new ItemSimple("itemWoodenSpoon", "kmrp_items:wooden_spoon");
        new ItemSimple("itemWoodenFork", "kmrp_items:wooden_fork");
        new ItemSpool("itemSpool", "kmrp_items:spool");

        kmrpCore.weapon_icon = new ItemWeapon("itemscimitar", "kmrp_items:scimitar");
        new ItemWeapon("itempitchfork", "kmrp_items:pitchfork");
        new ItemWeapon("itemclub", "kmrp_items:club");
        new ItemWeapon("itemsaber", "kmrp_items:saber");
        new ItemWeapon("itemhalberd", "kmrp_items:halberd");
        new ItemWeapon("itemknobstick", "kmrp_items:knobstick");
        new ItemWeapon("itemmstar", "kmrp_items:m_star");
        new ItemWeapon("itemscythe", "kmrp_items:scythe");
        new ItemWeapon("itemshpaga", "kmrp_items:shpaga");
        new ItemWeapon("itemthr_axe", "kmrp_items:thr_axe");
        new ItemWeapon("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
        new ItemWeapon("itemflail", "kmrp_items:flail");
        new ItemWeapon("itemLance", "kmrp_items:lance");
        new ItemWeapon("itemTrainingSword", "kmrp_items:training_sword");
        new ItemWeapon("itemWoodenKnife", "kmrp_items:wooden_knife");

    }
}