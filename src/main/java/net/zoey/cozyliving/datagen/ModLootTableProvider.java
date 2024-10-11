package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.state.property.Properties;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.block.custom.CoconutPlantBlock;
import net.zoey.cozyliving.item.ModItems;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.state.property.Properties.*;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //SPECIAL CASES THAT HAVE DEDICATED JSON FILE:
        // - RASPBERRY BUSHES
        // - COCONUT PLANT



        addDrop(ModBlocks.BENITOITE_BLOCK);
        addDrop(ModBlocks.RASPBERRY_RHODOLITE_BLOCK);
        addDrop(ModBlocks.BENITOITE_ORE, oreDrops(ModBlocks.BENITOITE_ORE, ModItems.BENITOITE));
        addDrop(ModBlocks.DEEPSLATE_BENITOITE_ORE, oreDrops(ModBlocks.DEEPSLATE_BENITOITE_ORE, ModItems.BENITOITE));
        addDrop(ModBlocks.RASPBERRY_RHODOLITE_ORE, oreDrops(ModBlocks.RASPBERRY_RHODOLITE_ORE, ModItems.RASPBERRY_RHODOLITE));
        addDrop(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE, oreDrops(ModBlocks.DEEPSLATE_RASPBERRY_RHODOLITE_ORE, ModItems.RASPBERRY_RHODOLITE));

        //WOODS
        addDrop(ModBlocks.COCONUT_SAPLING);
        addDrop(ModBlocks.COCONUT_PLANKS);
        addDrop(ModBlocks.COCONUT_TRAPDOOR);
        addDrop(ModBlocks.COCONUT_BUTTON);
        addDrop(ModBlocks.COCONUT_FENCE);
        addDrop(ModBlocks.COCONUT_FENCE_GATE);
        addDrop(ModBlocks.COCONUT_LOG);
        addDrop(ModBlocks.COCONUT_PRESSURE_PLATE);
        addDrop(ModBlocks.COCONUT_STAIRS);
        addDrop(ModBlocks.COCONUT_WOOD);
        addDrop(ModBlocks.STRIPPED_COCONUT_LOG);
        addDrop(ModBlocks.STRIPPED_COCONUT_WOOD);
        addDrop(ModBlocks.COCONUT_SLAB, slabDrops(ModBlocks.COCONUT_SLAB));
        addDrop(ModBlocks.COCONUT_DOOR, doorDrops(ModBlocks.COCONUT_DOOR));

        //SIGNS
        addDrop(ModBlocks.COCONUT_SIGN, drops(ModItems.COCONUT_SIGN));
        addDrop(ModBlocks.COCONUT_WALL_SIGN, drops(ModItems.COCONUT_SIGN));
        addDrop(ModBlocks.COCONUT_HANGING_SIGN, drops(ModItems.HANGING_COCONUT_SIGN));
        addDrop(ModBlocks.COCONUT_WALL_HANGING_SIGN, drops(ModItems.HANGING_COCONUT_SIGN));

        //LEAVES
        addDrop(ModBlocks.COCONUT_LEAVES, leavesDrops(ModBlocks.COCONUT_LEAVES, ModBlocks.COCONUT_SAPLING, 0.15f));
        addDrop(ModBlocks.COCONUT_LEAVES_CORNER, leavesDrops(ModBlocks.COCONUT_LEAVES, ModBlocks.COCONUT_SAPLING, 0.15f));


    }
}
