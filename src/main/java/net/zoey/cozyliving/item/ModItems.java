package net.zoey.cozyliving.item;

import net.zoey.cozyliving.CozyLiving;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item RASPBERRY_RHODOLITE = registerItem("raspberry_rhodolite",
            new Item(new Item.Settings().fireproof()));

    public static final Item BENITOITE = registerItem("benitoite",
            new Item(new Item.Settings().fireproof()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CozyLiving.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CozyLiving.LOGGER.info("Registering Mod Items for " + CozyLiving.MOD_ID);

    }

}
