package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    protected ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BENITOITE_BLOCK);
        addDrop(ModBlocks.RASPBERRY_RHODOLITE_BLOCK);
        addDrop(ModBlocks.BENITOITE_ORE, oreDrops(ModBlocks.BENITOITE_ORE, ModItems.BENITOITE));
        addDrop(ModBlocks.DEEPSLATE_BENITOITE_ORE, oreDrops(ModBlocks.DEEPSLATE_BENITOITE_ORE, ModItems.BENITOITE));
        addDrop(ModBlocks.RASPBERRY_RHODOLITE_ORE, oreDrops(ModBlocks.RASPBERRY_RHODOLITE_ORE, ModItems.RASPBERRY_RHODOLITE));
        addDrop(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE, oreDrops(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE, ModItems.RASPBERRY_RHODOLITE));
    }
}
