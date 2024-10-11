package net.zoey.cozyliving;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.zoey.cozyliving.data.ModWorldGenerator;
import net.zoey.cozyliving.datagen.ModBlockTagProvider;
import net.zoey.cozyliving.datagen.ModItemTagProvider;
import net.zoey.cozyliving.datagen.ModLootTableProvider;
import net.zoey.cozyliving.datagen.ModRecipeProvider;
import net.zoey.cozyliving.world.ModConfiguredFeatures;
import net.zoey.cozyliving.world.gen.ModPlacedFeatures;

public class CozyLivingDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		//pack.addProvider(ModWorldGenerator::new);
		//pack.addProvider(ModBlockTagProvider::new);
		//pack.addProvider(ModItemTagProvider::new);
		//pack.addProvider(ModLootTableProvider::new);
		//pack.addProvider(ModRecipeProvider::new);

		//THIS IS SO CONFUSING MAYBE JUST DON'T USE IT

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

	}
}
