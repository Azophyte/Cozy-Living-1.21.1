package net.zoey.cozyliving.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.zoey.cozyliving.CozyLiving;
import net.zoey.cozyliving.block.custom.*;
import net.zoey.cozyliving.foodComponents.ModFoodComponents;
import net.zoey.cozyliving.item.ModItems;
import net.zoey.cozyliving.sound.ModSounds;
import net.zoey.cozyliving.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModBlocks {

    //Test blocks
    public static final Block TEST_BLOCK = registerBlock("test_block",
            new TestBlock(AbstractBlock.Settings.create()));

    //Plant blocks
    public static final Block RASPBERRY_BUSH = registerBlockWithoutItem("raspberry_bush",
            new RaspberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block COCONUT = registerBlock("coconut",
            new CoconutBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).sounds(ModSounds.COCONUT_SOUNDS).nonOpaque().hardness(2f)));

    public static final Block COCONUT_PLANT = registerBlockWithoutItem("coconut_plant",
            new CoconutPlantBlock(AbstractBlock.Settings.copy(COCONUT)));

    public static final Block COCONUT_SAPLING = registerBlock("coconut_sapling",
            new CoconutSaplingBlock(
                    new SaplingGenerator(
                            CozyLiving.MOD_ID,
                            0.1F,
                            Optional.empty(),
                            Optional.empty(),
                            Optional.of(ModConfiguredFeatures.COCONUT_TREE_KEY),
                            Optional.empty(),
                            Optional.empty(),
                            Optional.empty()
                    ), AbstractBlock.Settings.copy(Blocks.JUNGLE_SAPLING)));
    //TODO: remove coconut plant item, should not be placeable, only grown from coconut sapling as part of the tree

    public static final Block COCONUT_LEAVES = registerBlock("coconut_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES)));

    public static final Block COCONUT_LEAVES_CORNER = registerBlock("coconut_leaves_corner",
            new CoconutLeavesCornerBlock(AbstractBlock.Settings.copy(ModBlocks.COCONUT_LEAVES)));



    //Sliceable blocks
    public static final Block GLOWBERRY_TART = registerBlockWithoutItem("glowberry_tart",
            new SliceableBlock(ModItems.GLOWBERRY_TART_SLICE.asItem(), ModFoodComponents.GLOWBERRY_TART,
                    AbstractBlock.Settings.copy(Blocks.CAKE)));

    //Coconut Block Set Type
    static BlockSetType COCONUT_BLOCK_SET_TYPE = new BlockSetType("coconut", true, true, true, BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    //Coconut Wood Type
    static WoodType COCONUT_WOOD_TYPE = new WoodType("coconut", COCONUT_BLOCK_SET_TYPE);

    //Coconut wood blocks
    public static final Block COCONUT_PLANKS = registerBlock("coconut_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

    public static final Block COCONUT_LOG = registerBlock("coconut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)));

    public static final Block COCONUT_WOOD = registerBlock("coconut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));

    public static final Block STRIPPED_COCONUT_LOG = registerBlock("stripped_coconut_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)));

    public static final Block STRIPPED_COCONUT_WOOD = registerBlock("stripped_coconut_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD)));

    public static final Block COCONUT_PRESSURE_PLATE = registerBlock("coconut_pressure_plate",
            new PressurePlateBlock(COCONUT_BLOCK_SET_TYPE, AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE)));

    public static final Block COCONUT_TRAPDOOR = registerBlock("coconut_trapdoor",
            new TrapdoorBlock(COCONUT_BLOCK_SET_TYPE, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR)));

    public static final Block COCONUT_STAIRS = registerBlock("coconut_stairs",
            new StairsBlock(COCONUT_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(COCONUT_PLANKS)));

    public static final Block COCONUT_BUTTON = registerBlock("coconut_button",
            new ButtonBlock(COCONUT_BLOCK_SET_TYPE, 30, AbstractBlock.Settings.copy(Blocks.MANGROVE_BUTTON)));

    public static final Block COCONUT_SLAB = registerBlock("coconut_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB)));

    public static final Block COCONUT_FENCE_GATE = registerBlock("coconut_fence_gate",
            new FenceGateBlock(COCONUT_WOOD_TYPE, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE)));

    public static final Block COCONUT_FENCE = registerBlock("coconut_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE)));

    public static final Block COCONUT_DOOR = registerBlock("coconut_door",
            new DoorBlock(COCONUT_BLOCK_SET_TYPE, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE)));

    //SIGN STUFF
    public static final Identifier COCONUT_SIGN_TEXTURE = Identifier.of(CozyLiving.MOD_ID, "entity/signs/coconut");
    public static final Identifier COCONUT_HANGING_SIGN_TEXTURE = Identifier.of(CozyLiving.MOD_ID, "entity/signs/hanging/coconut");
    public static final Identifier COCONUT_HANGING_GUI_SIGN_TEXTURE = Identifier.of(CozyLiving.MOD_ID, "textures/gui/hanging_signs/coconut");

    public static final Block COCONUT_SIGN = registerBlockWithoutItem("coconut_standing_sign",
            new TerraformSignBlock(COCONUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN)));
    public static final Block COCONUT_WALL_SIGN = registerBlockWithoutItem("coconut_wall_sign",
            new TerraformWallSignBlock(COCONUT_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_SIGN)));
    public static final Block COCONUT_HANGING_SIGN = registerBlockWithoutItem("coconut_hanging_sign",
            new TerraformHangingSignBlock(COCONUT_HANGING_SIGN_TEXTURE, COCONUT_HANGING_GUI_SIGN_TEXTURE,AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN)));
    public static final Block COCONUT_WALL_HANGING_SIGN = registerBlockWithoutItem("coconut_wall_hanging_sign",
            new TerraformWallHangingSignBlock(COCONUT_HANGING_SIGN_TEXTURE, COCONUT_HANGING_GUI_SIGN_TEXTURE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_HANGING_SIGN)));

    public static final BlockFamily COCONUT_FAMILY = BlockFamilies.register(ModBlocks.COCONUT_PLANKS)
            .sign(ModBlocks.COCONUT_SIGN, ModBlocks.COCONUT_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Old gemstone blocks

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
