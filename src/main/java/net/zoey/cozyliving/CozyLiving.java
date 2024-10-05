package net.zoey.cozyliving;

import net.fabricmc.api.ModInitializer;

import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.foodComponents.ModFoodComponents;
import net.zoey.cozyliving.item.ModItemGroups;
import net.zoey.cozyliving.item.ModItems;
import net.zoey.cozyliving.util.ModLootTableModifiers;
import net.zoey.cozyliving.world.gen.ModFeatureGeneration;
import net.zoey.cozyliving.world.gen.raspberry_bush_patches.RaspberryBushesFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CozyLiving implements ModInitializer {
	public static final String MOD_ID = "cozyliving";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Cozy Living Initializing!");
		ModFoodComponents.registerModFoodComponents();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();

		RaspberryBushesFeature.registerRaspberryBushesFeature();
		ModFeatureGeneration.generateVegetation();
		ModFeatureGeneration.generateOres();

		LOGGER.info("Cozy Living Initialized! :D");


	}
}