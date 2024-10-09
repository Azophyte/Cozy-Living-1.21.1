package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.zoey.cozyliving.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {








        /*getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)               //Make blocks mineable with pickaxe
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
                .add(ModBlocks.RASPBERRY_BUSH);*/
    }
}
