package net.zoey.cozyliving.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.zoey.cozyliving.block.ModBlocks;
import net.zoey.cozyliving.item.ModItems;
import net.zoey.cozyliving.util.ModTags;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        Ingredient coconutPlanks = Ingredient.ofItems(ModBlocks.COCONUT_PLANKS.asItem());

        /*createDoorRecipe(ModBlocks.COCONUT_DOOR.asItem(), coconutPlanks);
        createFenceGateRecipe(ModBlocks.COCONUT_FENCE_GATE.asItem(), coconutPlanks);
        createFenceRecipe(ModBlocks.COCONUT_FENCE.asItem(), coconutPlanks);
        createPressurePlateRecipe(RecipeCategory.REDSTONE, ModBlocks.COCONUT_PRESSURE_PLATE.asItem(), coconutPlanks);
        createSignRecipe(ModBlocks.COCONUT_SIGN.asItem(), coconutPlanks);
        createTrapdoorRecipe(ModBlocks.COCONUT_TRAPDOOR.asItem(), coconutPlanks);
        createStairsRecipe(ModBlocks.COCONUT_STAIRS.asItem(), coconutPlanks);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,ModBlocks.COCONUT_STAIRS.asItem(), coconutPlanks);*/

        /*ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_PLANKS, 4)
                .input(Ingredient.fromTag(ModTags.Items.COCONUT_LOGS))
                //.criterion(hasTag(ModTags.Items.COCONUT_LOGS), conditionsFromTag(ModTags.Items.COCONUT_LOGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_SLAB, 6)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_STAIRS, 4)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_FENCE, 3)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("TST")
                .pattern("TST")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_FENCE_GATE)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("STT")
                .pattern("STT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_DOOR, 3)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("TT")
                .pattern("TT")
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COCONUT_TRAPDOOR, 2)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("TT")
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.COCONUT_BUTTON)
                .input(ModBlocks.COCONUT_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.COCONUT_PRESSURE_PLATE)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.COCONUT_SIGN, 3)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("TTT")
                .pattern("TTT")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModItems.HANGING_COCONUT_SIGN, 6)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .input('C', ConventionalItemTags.CHAINS)
                .pattern("C C")
                .pattern("TTT")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .criterion(hasTag(ConventionalItemTags.CHAINS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.CHAINS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.COCONUT_BOAT)
                .input('T', ModBlocks.COCONUT_PLANKS)
                .pattern("T T")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COCONUT_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COCONUT_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.COCONUT_CHEST_BOAT)
                .input(ModItems.COCONUT_BOAT)
                .input(ConventionalItemTags.WOODEN_CHESTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COCONUT_BOAT), FabricRecipeProvider.conditionsFromItem(ModItems.COCONUT_BOAT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_CHESTS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_CHESTS))
                .offerTo(exporter);

        var CoconutFamily = new BlockFamily.Builder(ModBlocks.COCONUT_PLANKS)
                .button(ModBlocks.COCONUT_BUTTON)
                .fence(ModBlocks.COCONUT_FENCE)
                .fenceGate(ModBlocks.COCONUT_FENCE_GATE)
                .pressurePlate(ModBlocks.COCONUT_PRESSURE_PLATE)
                .sign(ModBlocks.COCONUT_SIGN, ModBlocks.COCONUT_WALL_SIGN)
                .slab(ModBlocks.COCONUT_SLAB)
                .stairs(ModBlocks.COCONUT_STAIRS)
                .door(ModBlocks.COCONUT_DOOR)
                .trapdoor(ModBlocks.COCONUT_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();

        generateFamily(exporter, CoconutFamily, FeatureSet.empty());


        offerHangingSignRecipe(exporter,ModBlocks.COCONUT_HANGING_SIGN.asItem(), ModBlocks.STRIPPED_COCONUT_LOG);
        offerPlanksRecipe(exporter, ModBlocks.COCONUT_PLANKS.asItem(), ModTags.Items.COCONUT_LOGS, 4);

    }

    private static @NotNull String hasTag(@NotNull TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    */
    }
}
