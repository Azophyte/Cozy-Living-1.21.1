package net.zoey.cozyliving.world.gen.raspberry_bush_patches;

import com.mojang.serialization.Codec;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.zoey.cozyliving.CozyLiving;
import net.zoey.cozyliving.block.ModBlocks;

import static net.zoey.cozyliving.block.custom.RaspberryBushBlock.AGE;
import static net.zoey.cozyliving.block.custom.RaspberryBushBlock.HALF;

public class RaspberryBushesFeature extends Feature<DefaultFeatureConfig> {
    public RaspberryBushesFeature(Codec<DefaultFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureWorldAccess structureWorldAccess = context.getWorld();
        BlockPos blockPos = context.getOrigin();
        context.getConfig();
        if (!structureWorldAccess.isAir(blockPos)) {
            return false;
        }
        structureWorldAccess.setBlockState(blockPos, ModBlocks.RASPBERRY_BUSH.getDefaultState().with(AGE, 4), 2);
        structureWorldAccess.setBlockState(blockPos.up(), ModBlocks.RASPBERRY_BUSH.getDefaultState().with(AGE, 4).with(HALF, DoubleBlockHalf.UPPER), 2);
        return true;
    }

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registries.FEATURE, name, feature);
    }

    public static final Feature<DefaultFeatureConfig> RASPBERRY_BUSHES;
    static{ RASPBERRY_BUSHES = register("raspberry_bushes", new RaspberryBushesFeature(DefaultFeatureConfig.CODEC));}

    public static void registerRaspberryBushesFeature() {
        CozyLiving.LOGGER.info("Registering Raspberry Bushes Feature for " + CozyLiving.MOD_ID);
    }
}
