package net.zoey.cozyliving.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.zoey.cozyliving.CozyLiving;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> COCONUT_LOGS = createTag("coconut_logs");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CozyLiving.MOD_ID, name));
        }
    }

    public static void registerModTags() {
        CozyLiving.LOGGER.info("Registering Mod Tags for " + CozyLiving.MOD_ID);
    }

}
