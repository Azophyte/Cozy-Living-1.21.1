package net.zoey.cozyliving.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.zoey.cozyliving.CozyLiving;

public class ModEntities {
    /*public static final EntityType<FallingCoconutEntity> FALLING_COCONUT_ENTITY_ENTITY_TYPE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(CozyLiving.MOD_ID, "falling_coconut"),
            FabricEntityType.Builder.createMob(FallingCoconutEntity::new, SpawnGroup.MISC).dimensions(0.5f, 0.5f).build());*/

    public static final EntityType<FallingCoconutEntity> FALLING_COCONUT_ENTITY_ENTITY_TYPE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(CozyLiving.MOD_ID, "falling_coconut"),
            EntityType.Builder.create(FallingCoconutEntity::new, SpawnGroup.MISC).dimensions(0.5f, 0.5f).build("falling_coconut")
    );
}
