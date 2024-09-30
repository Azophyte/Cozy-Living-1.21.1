package net.zoey.cozyliving.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class ModTooltipItem extends Item {
    String translationKey;

    public ModTooltipItem(Settings settings, String translationID) {
        super(settings);
        translationKey = translationID;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.cozyliving." + translationKey));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
