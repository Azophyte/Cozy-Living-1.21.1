package net.zoey.cozyliving.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class ModAliasedBlockToolTipItem extends AliasedBlockItem {
    String translationKey;

    public ModAliasedBlockToolTipItem(Block block, Settings settings, String translationID) {
        super(block, settings);
        translationKey = translationID;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.cozyliving." + translationKey));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
