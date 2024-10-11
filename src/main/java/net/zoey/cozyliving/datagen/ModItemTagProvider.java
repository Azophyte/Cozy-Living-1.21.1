package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.item.ModItems;
import net.zoey.cozyliving.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)            //Adds items to beacon payment system
                .add(ModItems.BENITOITE)
                .add(ModItems.RASPBERRY_RHODOLITE);

        getOrCreateTagBuilder(ItemTags.PLANKS)                  //Adds items to plank tag
                .add(ModBlocks.COCONUT_PLANKS.asItem());

        //ALL THE WOODEN BLOCK TYPES
        getOrCreateTagBuilder(ModTags.Items.COCONUT_LOGS)
                .add(ModBlocks.COCONUT_LOG.asItem())
                .add(ModBlocks.COCONUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_COCONUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_COCONUT_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.COCONUT_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.COCONUT_BUTTON.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.COCONUT_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.COCONUT_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.COCONUT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.COCONUT_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.COCONUT_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.COCONUT_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.COCONUT_SAPLING.asItem());


    }
}
