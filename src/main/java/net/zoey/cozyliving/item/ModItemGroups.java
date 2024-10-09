package net.zoey.cozyliving.item;

import net.minecraft.item.ItemGroup;
import net.zoey.cozyliving.CozyLiving;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.zoey.cozyliving.block.ModBlocks;


public class ModItemGroups {

    public static final ItemGroup COZYLIVINGITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CozyLiving.MOD_ID, "itemgroup"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RASPBERRY))
                    .displayName(Text.translatable("itemgroup.cozyliving.itemgroup"))
                    .entries((displayContext, entries) -> {

                        //EDIBLE ITEMS
                        entries.add(ModItems.APPLE_SAUCE);
                        entries.add(ModItems.CANDY_APPLE);
                        entries.add(ModItems.CINNAMON_BUN);
                        entries.add(ModItems.HEAVY_CREAM);
                        entries.add(ModItems.RASPBERRY);
                        entries.add(ModItems.ROASTED_MELON_SEEDS);
                        entries.add(ModItems.ROASTED_PUMPKIN_SEEDS);

                        //EDIBLE BLOCK ITEMS AND THEIR SLICES
                        entries.add(ModItems.GLOWBERRY_TART_SLICE);
                        entries.add(ModItems.GLOWBERRY_TART);

                        //MATERIALS
                        entries.add(ModItems.CINNAMON_STICK);

                        //COCONUT BLOCKS
                        entries.add(ModBlocks.COCONUT_LOG);
                        entries.add(ModBlocks.COCONUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_COCONUT_LOG);
                        entries.add(ModBlocks.STRIPPED_COCONUT_WOOD);
                        entries.add(ModBlocks.COCONUT_PLANKS);
                        entries.add(ModBlocks.COCONUT_STAIRS);
                        entries.add(ModBlocks.COCONUT_SLAB);
                        entries.add(ModBlocks.COCONUT_FENCE);
                        entries.add(ModBlocks.COCONUT_FENCE_GATE);
                        entries.add(ModBlocks.COCONUT_DOOR);
                        entries.add(ModBlocks.COCONUT_TRAPDOOR);
                        entries.add(ModBlocks.COCONUT_PRESSURE_PLATE);
                        entries.add(ModBlocks.COCONUT_BUTTON);
                            //TerraformAPI stuff
                        entries.add(ModItems.COCONUT_SIGN);
                        entries.add(ModItems.HANGING_COCONUT_SIGN);
                        entries.add(ModItems.COCONUT_BOAT);
                        entries.add(ModItems.COCONUT_CHEST_BOAT);


                        //GEMSTONES
                        entries.add(ModItems.BENITOITE);
                        entries.add(ModBlocks.BENITOITE_BLOCK);
                        entries.add(ModBlocks.BENITOITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BENITOITE_ORE);
                        entries.add(ModItems.RASPBERRY_RHODOLITE);
                        entries.add(ModBlocks.RASPBERRY_RHODOLITE_BLOCK);
                        entries.add(ModBlocks.RASPBERRY_RHODOLITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE);

                        //DEBUG
                        entries.add(ModItems.WAND_OF_HUNGER);

                    }).build());

    public static void registerItemGroups() {
        CozyLiving.LOGGER.info("Registering Item Groups for " + CozyLiving.MOD_ID);
    }
}
