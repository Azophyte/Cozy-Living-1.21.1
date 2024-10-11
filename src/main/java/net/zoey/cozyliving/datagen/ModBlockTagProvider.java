package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.BlockTags;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)               //Make blocks mineable with pickaxe
                .add(ModBlocks.BENITOITE_BLOCK)
                .add(ModBlocks.BENITOITE_ORE)
                .add(ModBlocks.DEEPSLATE_BENITOITE_ORE)
                .add(ModBlocks.RASPBERRY_RHODOLITE_BLOCK)
                .add(ModBlocks.RASPBERRY_RHODOLITE_ORE)
                .add(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)                //Make blocks mineable with iron tools
                .add(ModBlocks.BENITOITE_BLOCK)
                .add(ModBlocks.BENITOITE_ORE)
                .add(ModBlocks.DEEPSLATE_BENITOITE_ORE)
                .add(ModBlocks.RASPBERRY_RHODOLITE_BLOCK)
                .add(ModBlocks.RASPBERRY_RHODOLITE_ORE)
                .add(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)             //Make blocks useable for beacon base
                .add(ModBlocks.BENITOITE_BLOCK)
                .add(ModBlocks.RASPBERRY_RHODOLITE_BLOCK);

        getOrCreateTagBuilder(BlockTags.CROPS)                          //Make block count as a crop
                .add(ModBlocks.RASPBERRY_BUSH);

        //ALL THE WOODEN BLOCK TYPES
        getOrCreateTagBuilder(ModTags.Blocks.COCONUT_LOGS)
                .add(ModBlocks.COCONUT_LOG)
                .add(ModBlocks.COCONUT_WOOD)
                .add(ModBlocks.STRIPPED_COCONUT_LOG)
                .add(ModBlocks.STRIPPED_COCONUT_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.COCONUT_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.COCONUT_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.COCONUT_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.COCONUT_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.COCONUT_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.COCONUT_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.COCONUT_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.COCONUT_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.COCONUT_SAPLING);
    }
}
