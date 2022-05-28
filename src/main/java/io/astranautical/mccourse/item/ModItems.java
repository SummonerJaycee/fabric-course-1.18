package io.astranautical.mccourse.item;

import io.astranautical.mccourse.MCCourseMod;
import io.astranautical.mccourse.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // ORICHALCUM INGOT
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM NUGGET
    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // RAW ORICHALCUM
    public static final Item RAW_ORICHALCUM = registerItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // DOWSING ROD
    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    // TURNIP
    public static final Item TURNIP = registerItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    // COAL SLIVER
    public static final Item COAL_SLIVER = registerItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));


    // ---------------------------------------------------------------------------------- TOOLS!

    // ORICHALCUM PICKAXE
    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM AXE
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModAxeItem(ModToolMaterial.ORICHALCUM, 3, 1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM HOE
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoeItem(ModToolMaterial.ORICHALCUM, 0, 0f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM SHOVEL
    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterial.ORICHALCUM, 1, 2f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM SWORD
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new ModSlowingSwordItem(ModToolMaterial.ORICHALCUM, 3, 3f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ORICHALCUM PAXEL
    public static final Item ORICHALCUM_PAXEL = registerItem("orichalcum_paxel",
            new ModPaxelItem(ModToolMaterial.ORICHALCUM, 1, 1f,
                    new FabricItemSettings().group(ModItemGroups.COURSE)));

    // ----------------------------------------------------------------------------------

    // Adds functionality to add custom Items to the game.

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }

}
