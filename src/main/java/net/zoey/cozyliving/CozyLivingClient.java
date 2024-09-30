package net.zoey.cozyliving;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.GrassColors;
import net.zoey.cozyliving.block.ModBlocks;

public class CozyLivingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //Allow blocks to have transparency
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RASPBERRY_BUSH, RenderLayer.getCutout());

        //Colour Registry Stuff
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getColor(0.5, 1.0);
            }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.RASPBERRY_BUSH);
    }
}
