package net.zoey.cozyliving.item;

import net.minecraft.util.Rarity;
import net.zoey.cozyliving.CozyLiving;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.item.custom.CandyAppleItem;
import net.zoey.cozyliving.item.custom.HeavyCreamItem;
import net.zoey.cozyliving.item.custom.ModAliasedBlockToolTipItem;
import net.zoey.cozyliving.item.custom.ModTooltipItem;


public class ModItems {
    //INEDIBLE ITEMS
    public static final Item RASPBERRY_RHODOLITE = registerItem("raspberry_rhodolite",
            new ModTooltipItem(new Item.Settings().fireproof(), "raspberry_rhodolite"));

    public static final Item BENITOITE = registerItem("benitoite",
            new ModTooltipItem(new Item.Settings().fireproof(), "benitoite"));

    public static final Item CINNAMON_STICK = registerItem("cinnamon_stick",
            new ModTooltipItem(new Item.Settings(), "cinnamon_stick"));

    public static final Item GILDED_CINNAMON_STICK = registerItem("gilded_cinnamon_stick",
            new ModTooltipItem(new Item.Settings().rarity(Rarity.RARE), "gilded_cinnamon_stick"));

    //EDIBLE ITEMS
    public static final Item CINNAMON_BUN = registerItem("cinnamon_bun",
            new ModTooltipItem(new Item.Settings().food(ModFoodComponents.CINNAMON_BUN), "cinnamon_bun"));

    public static final Item RASPBERRY = registerItem("raspberry",
            new ModAliasedBlockToolTipItem(ModBlocks.RASPBERRY_BUSH,new Item.Settings().food(ModFoodComponents.RASPBERRY), "raspberry"));

    public static final Item HEAVY_CREAM = registerItem("heavy_cream",
            new HeavyCreamItem(new Item.Settings().food(ModFoodComponents.HEAVY_CREAM), "heavy_cream"));

    public static final Item CANDY_APPLE = registerItem("candy_apple",
            new CandyAppleItem(new Item.Settings().food(ModFoodComponents.CANDY_APPLE), "candy_apple"));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CozyLiving.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyLiving.LOGGER.info("Registering Mod Items for " + CozyLiving.MOD_ID);
    }

}
