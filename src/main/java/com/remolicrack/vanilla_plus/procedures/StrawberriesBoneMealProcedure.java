package com.remolicrack.vanilla_plus.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import com.remolicrack.vanilla_plus.init.RemolicrackVanillaPlusModBlocks;

public class StrawberriesBoneMealProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double RNG = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.GLOW, (x + 0.5), (y + 0.5), (z + 0.5), 15, 1, 1, 1, 0.025);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_0.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_1.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 1);
			if (RNG == 0) {
				world.setBlock(BlockPos.containing(x, y, z), RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_1.get().defaultBlockState(), 3);
			} else if (RNG == 1) {
				world.setBlock(BlockPos.containing(x, y, z), RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_2.get().defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_2.get()) {
			RNG = Mth.nextInt(RandomSource.create(), 0, 0);
			if (RNG == 0) {
				world.setBlock(BlockPos.containing(x, y, z), RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_3.get().defaultBlockState(), 3);
			}
		}
	}
}
