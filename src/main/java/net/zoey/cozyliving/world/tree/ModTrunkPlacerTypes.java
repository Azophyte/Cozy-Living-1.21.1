package net.zoey.cozyliving.world.tree;

import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.zoey.cozyliving.CozyLiving;
import net.zoey.cozyliving.mixin.TrunkPlacerTypeInvoker;
import net.zoey.cozyliving.world.tree.custom.CoconutTrunkPlacer;

public class ModTrunkPlacerTypes {
    //public static final TrunkPlacerType<?> COCONUT_TRUNK_PLACER = TrunkPlacerTypeInvoker.register("coconut_trunk_placer", CoconutTrunkPlacer.CODEC);

    public static void register(){
        CozyLiving.LOGGER.info("Registering Trunk Placers for " + CozyLiving.MOD_ID);
    }
}
