package ru.konungstvo.kmrp_items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = kmrpCore.MODID, version = kmrpCore.VERSION, name = kmrpCore.NAME)
public class kmrpCore {
    public static final String MODID = "kmrp_items";
    public static final String NAME = "KMRP Items";
    public static final String VERSION = "1.0";


    private static Item simple_icon;
    private static Item weapon_icon;
    private static ToolMaterial NO_MATERIAL = EnumHelper.addToolMaterial(
            "NO_MATERIAL", 0, 1000,
            0.0F, 0.0F, 30
    );

    private static CreativeTabs KMRPWeaponTab = new CreativeTabs("KMRPWeaponTab") {
        public Item getTabIconItem() {
            return kmrpCore.weapon_icon;
        }
    };

    private static CreativeTabs KMRPSimpleTab = new CreativeTabs("KMRPSimpleTab") {
        public Item getTabIconItem() {
            return kmrpCore.simple_icon;
        }
    };

    private Item registerItem(Item item, String name, String texture, CreativeTabs tab) {
        item.setUnlocalizedName(name)
                .setCreativeTab(tab)
                .setTextureName(texture);
        GameRegistry.registerItem(item, name);
        return item;
    }

    private Item registerWeapon(String name, String texture) {
        return this.registerItem(new ItemSword(NO_MATERIAL), name, texture, KMRPWeaponTab);
    }

    private Item registerSimpleItem(String name, String texture) {
        return this.registerItem(new Item(), name, texture, KMRPSimpleTab);
    }

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        kmrpCore.simple_icon = this.registerSimpleItem("itemFork", "kmrp_items:fork");
        this.registerSimpleItem("itemFlut", "kmrp_items:flut");
        this.registerSimpleItem("itemGolden_coin", "kmrp_items:golden_coin");
        this.registerSimpleItem("itemSilver_coin", "kmrp_items:silver_coin");
        this.registerSimpleItem("itemRing", "kmrp_items:ring");
        this.registerSimpleItem("itemRustyfork", "kmrp_items:rusty_fork");
        this.registerSimpleItem("itemSpoon", "kmrp_items:spoon");
        this.registerSimpleItem("itemDynamite", "kmrp_items:dynamite");
        this.registerSimpleItem("itemBomb", "kmrp_items:bomb");
        this.registerSimpleItem("itemTin", "kmrp_items:tin");
        this.registerSimpleItem("itemPipe", "kmrp_items:tobacco_pipe");
        this.registerSimpleItem("itemPhoto", "kmrp_items:photo");
        this.registerSimpleItem("itemCamera", "kmrp_items:camera");
        this.registerSimpleItem("itemCapsule", "kmrp_items:capsule");
        this.registerSimpleItem("itemCharge", "kmrp_items:charge");
        this.registerSimpleItem("itemBullet", "kmrp_items:bullet");
        this.registerSimpleItem("itemRamrod", "kmrp_items:ramrod");

        this.registerSimpleItem("itemInkwell", "kmrp_items:inkwell");
        this.registerSimpleItem("itemBasket", "kmrp_items:basket");
        this.registerSimpleItem("itemBottle", "kmrp_items:bottle");
        this.registerSimpleItem("itemNeedle", "kmrp_items:needle");
        this.registerSimpleItem("itemPencil", "kmrp_items:pencil");
        this.registerSimpleItem("itemSpool", "kmrp_items:spool");
        this.registerSimpleItem("itemJoint", "kmrp_items:joint");
        this.registerSimpleItem("itemPint", "kmrp_items:pint");
        this.registerSimpleItem("itemGoggles", "kmrp_items:goggles");
        this.registerSimpleItem("itemWoodenCup", "kmrp_items:wooden_cup");
        this.registerSimpleItem("itemWoodenSpoon", "kmrp_items:wooden_spoon");
        this.registerSimpleItem("itemWoodenFork", "kmrp_items:wooden_fork");

        kmrpCore.weapon_icon = this.registerWeapon("itemscimitar", "kmrp_items:scimitar");
        this.registerWeapon("itempitchfork", "kmrp_items:pitchfork");
        this.registerWeapon("itemclub", "kmrp_items:club");
        this.registerWeapon("itemsaber", "kmrp_items:saber");
        this.registerWeapon("itemhalberd", "kmrp_items:halberd");
        this.registerWeapon("itemknobstick", "kmrp_items:knobstick");
        this.registerWeapon("itemmstar", "kmrp_items:m_star");
        this.registerWeapon("itemscythe", "kmrp_items:scythe");
        this.registerWeapon("itemshpaga", "kmrp_items:shpaga");
        this.registerWeapon("itemthr_axe", "kmrp_items:thr_axe");
        this.registerWeapon("itemtwo_hand_sword", "kmrp_items:twohanded_sword");
        this.registerWeapon("itemflail", "kmrp_items:flail");
        this.registerWeapon("itemLance", "kmrp_items:lance");
        this.registerWeapon("itemTrainingSword", "kmrp_items:training_sword");
        this.registerWeapon("itemWoodenKnife", "kmrp_items:wooden_knife");
    }
}