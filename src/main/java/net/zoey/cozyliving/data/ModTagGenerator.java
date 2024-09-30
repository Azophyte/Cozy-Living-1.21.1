package net.zoey.cozyliving.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.zoey.cozyliving.CozyLiving;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.TagKey.of;

public class ModTagGenerator extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Biome> HAS_RASPBERRY_PATCHES = of(RegistryKeys.BIOME, Identifier.of(CozyLiving.MOD_ID + "has_raspberry_patches"));

    public ModTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

    }
}
