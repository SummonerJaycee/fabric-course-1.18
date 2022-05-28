package io.astranautical.mccourse.item.custom;

import io.astranautical.mccourse.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.Tag;

public class ModPaxelItem extends MiningToolItem {
    public ModPaxelItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL_MINEABLE, settings);
    }
}
