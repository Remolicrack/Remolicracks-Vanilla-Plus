package com.remolicrack.vanilla_plus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.remolicrack.vanilla_plus.init.RemolicrackVanillaPlusModMobEffects;
import com.remolicrack.vanilla_plus.RemolicrackVanillaPlusMod;

@Mod.EventBusSubscriber
public class FrostWalkerEffectStartedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(RemolicrackVanillaPlusModMobEffects.FROST_WALKER.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.ICE.defaultBlockState(), 3);
			}
			RemolicrackVanillaPlusMod.queueServerWork(200, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ICE) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.WATER.defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.ICE) {
					world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.WATER.defaultBlockState(), 3);
				}
			});
		}
	}
}
