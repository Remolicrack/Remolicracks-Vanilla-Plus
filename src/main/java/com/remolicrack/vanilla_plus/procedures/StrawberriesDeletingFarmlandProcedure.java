package com.remolicrack.vanilla_plus.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import com.remolicrack.vanilla_plus.init.RemolicrackVanillaPlusModItems;
import com.remolicrack.vanilla_plus.init.RemolicrackVanillaPlusModBlocks;

public class StrawberriesDeletingFarmlandProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_3.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RemolicrackVanillaPlusModItems.STRAWBERRY.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RemolicrackVanillaPlusModItems.STRAWBERRY_SEEDS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(RemolicrackVanillaPlusModItems.STRAWBERRY_SEEDS.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
