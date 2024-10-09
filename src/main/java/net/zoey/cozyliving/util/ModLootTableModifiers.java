package net.zoey.cozyliving.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.zoey.cozyliving.item.ModItems;

public class ModLootTableModifiers {


    public static void modifyLootTables() {

        //MAKE JUNGLE LEAVES RARELY DROP CINNAMON
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(source.isBuiltin() && (Blocks.JUNGLE_LEAVES.getLootTableKey()).equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.035f)) //Drops from roughly one in 29 blocks (~twice per tree)
                        .with(ItemEntry.builder(ModItems.CINNAMON_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        //MAKE JUNGLE LEAVES RARELY DROP GILDED CINNAMON
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(source.isBuiltin() && (Blocks.JUNGLE_LEAVES.getLootTableKey()).equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0015f)) //Drops from roughly one in twelve trees
                        .with(ItemEntry.builder(ModItems.GILDED_CINNAMON_STICK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });

        //MAKE GRASS RARELY DROP RASPBERRIES
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if(source.isBuiltin() && (Blocks.SHORT_GRASS.getLootTableKey()).equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.0078125f)) //Should drop one raspberry for every sixteen seeds
                        .with(ItemEntry.builder(ModItems.RASPBERRY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}