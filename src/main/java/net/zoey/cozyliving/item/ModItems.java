package net.zoey.cozyliving.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.SignItem;
import net.minecraft.util.Rarity;
import net.zoey.cozyliving.CozyLiving;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.entity.ModBoats;
import net.zoey.cozyliving.foodComponents.ModFoodComponents;
import net.zoey.cozyliving.item.custom.*;
import net.minecraft.item.Items;


public class ModItems {

    //DEBUG ITEMS
    public static final Item WAND_OF_HUNGER = registerItem("wand_of_hunger",
            new WandOfHungerItem(new Item.Settings().maxCount(1), "wand_of_hunger"));

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

    public static final Item HEAVY_CREAM = registerItem("heavy_cream",
            new BottledIngredientItem(new Item.Settings().food(ModFoodComponents.HEAVY_CREAM), 90,"heavy_cream"));

    public static final Item CANDY_APPLE = registerItem("candy_apple",
            new CandyAppleItem(new Item.Settings().food(ModFoodComponents.CANDY_APPLE), "candy_apple"));

    public static final Item ROASTED_PUMPKIN_SEEDS = registerItem("roasted_pumpkin_seeds",
            new ModTooltipItem(new Item.Settings().food(ModFoodComponents.ROASTED_SEEDS), "roasted_pumpkin_seeds"));

    public static final Item ROASTED_MELON_SEEDS = registerItem("roasted_melon_seeds",
            new ModTooltipItem(new Item.Settings().food(ModFoodComponents.ROASTED_SEEDS), "roasted_melon_seeds"));

    public static final Item GLOWBERRY_TART_SLICE = registerItem("glowberry_tart_slice",
            new ModTooltipItem(new Item.Settings().food(ModFoodComponents.GLOWBERRY_TART), "glowberry_tart_slice"));

    public static final Item APPLE_SAUCE = registerItem("apple_sauce",
            new BottledIngredientItem(new Item.Settings().food(ModFoodComponents.APPLE_SAUCE), 15, "apple_sauce"));

    //BLOCK ITEMS (MUST BE CALLED LAST, ELSE REQUIRED ITEMS MAY NOT BE REGISTERED

    public static final Item RASPBERRY = registerItem("raspberry",
            new ModAliasedBlockToolTipItem(ModBlocks.RASPBERRY_BUSH,new Item.Settings().food(ModFoodComponents.RASPBERRY), "raspberry"));

    public static final Item GLOWBERRY_TART = registerItem("glowberry_tart",
            new ModAliasedBlockToolTipItem(ModBlocks.GLOWBERRY_TART, new Item.Settings(), "glowberry_tart"));

    //SIGN ITEMS
    public static final Item COCONUT_SIGN = registerItem("coconut_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.COCONUT_SIGN, ModBlocks.COCONUT_WALL_SIGN));
    public static final Item HANGING_COCONUT_SIGN = registerItem("coconut_hanging_sign",
            new HangingSignItem(ModBlocks.COCONUT_HANGING_SIGN, ModBlocks.COCONUT_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    //BOAT ITEMS
    public static final Item COCONUT_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.COCONUT_BOAT_ID, ModBoats.COCONUT_BOAT_KEY, false);
    public static final Item COCONUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(ModBoats.COCONUT_CHEST_BOAT_ID, ModBoats.COCONUT_BOAT_KEY, true);




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CozyLiving.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyLiving.LOGGER.info("Registering Mod Items for " + CozyLiving.MOD_ID);
    }

}