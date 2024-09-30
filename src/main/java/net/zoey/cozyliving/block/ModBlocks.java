package net.zoey.cozyliving.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.zoey.cozyliving.CozyLiving;
import net.zoey.cozyliving.block.custom.RaspberryBushBlock;

public class ModBlocks {

    public static final Block RASPBERRY_RHODOLITE_BLOCK = registerBlock("raspberry_rhodolite_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.DARK_RED).requiresTool().strength(5.5F, 6.5F).sounds(BlockSoundGroup.METAL)));

    public static final Block RASPBERRY_RHODOLITE_ORE = registerBlock("raspberry_rhodolite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 24), AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 3.5F)));
    public static final Block DEEPSLATE_RASPBERRY_RHODOLITE_ORE = registerBlock("deepslate_raspberry_rhodolite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 24), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(5F, 3.5F)));

    public static final Block BENITOITE_BLOCK = registerBlock("benitoite_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BLUE).requiresTool().strength(5.5F, 6.5F).sounds(BlockSoundGroup.METAL)));
    public static final Block BENITOITE_ORE = registerBlock("benitoite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 24), AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 3.5F)));
    public static final Block DEEPSLATE_BENITOITE_ORE = registerBlock("deepslate_benitoite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(16, 24), AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(5F, 3.5F)));

    public static final Block RASPBERRY_BUSH = registerBlockWithoutItem("raspberry_bush",
            new RaspberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CozyLiving.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(CozyLiving.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CozyLiving.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CozyLiving.LOGGER.info("Registering Mod Blocks for " + CozyLiving.MOD_ID);

    }
}
