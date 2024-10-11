package net.zoey.cozyliving.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.zoey.cozyliving.block.ModBlocks;

public class FallingCoconutEntity extends FallingBlockEntity {

    private BlockState block;
    private int fallHurtMax;

    public FallingCoconutEntity(EntityType<? extends FallingBlockEntity> entityType, World world) {
        super(entityType, world);
        this.block = ModBlocks.COCONUT.getDefaultState();
        this.dropItem = true;
        this.fallHurtMax = 40;
    }

    public static FallingCoconutEntity spawn(World world, BlockPos pos, BlockState state) {
        FallingCoconutEntity fallingCoconutEntity = new FallingCoconutEntity(ModEntities.FALLING_COCONUT_ENTITY_ENTITY_TYPE, world);
        fallingCoconutEntity.setFallingBlockPos(pos);
        world.spawnEntity(fallingCoconutEntity);
        return fallingCoconutEntity;
    }

}
