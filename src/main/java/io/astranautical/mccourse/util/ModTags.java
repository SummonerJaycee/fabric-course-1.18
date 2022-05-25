package io.astranautical.mccourse.util;

import io.astranautical.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final Tag.Identified<Block> DOWSING_ROD_DETECTABLE_BLOCKS =
                createTag("dowsing_rod_detectable_blocks");

        public static final Tag.Identified<Block> ORICHALCUM_BLOCKS =
                createCommonTag("orichalcum_blocks");

        public static final Tag.Identified<Block> ORICHALCUM_ORE =
                createCommonTag("orichalcum_ore");

        private static Tag.Identified<Block> createTag(String name) {
            return TagFactory.BLOCK.create(new Identifier(MCCourseMod.MOD_ID, name));
        }

        private static Tag.Identified<Block> createCommonTag(String name) {
            return TagFactory.BLOCK.create(new Identifier("c", name));
        }

    }

    public static class Items {
        public static final Tag.Identified<Item> ORICHALCUM_INGOTS = createCommonTag("orichalcum_ingots");
        public static final Tag.Identified<Item> ORICHALCUM_NUGGETS = createCommonTag("orichalcum_nuggets");

        private static Tag.Identified<Item> createTag(String name) {
            return TagFactory.ITEM.create(new Identifier(MCCourseMod.MOD_ID, name));
        }

        private static Tag.Identified<Item> createCommonTag(String name) {
            return TagFactory.ITEM.create(new Identifier("c", name));
        }

    }
}
