package com.remolicrack.vanilla_plus.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Map;

import com.remolicrack.vanilla_plus.init.RemolicrackVanillaPlusModBlocks;

public class StrawberriesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.75 && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_3.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_0.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_1.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_1.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_2.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
