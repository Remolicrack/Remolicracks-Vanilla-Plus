
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.remolicrack.vanilla_plus.block.entity.StrawberryCrop3BlockEntity;
import com.remolicrack.vanilla_plus.block.entity.StrawberryCrop2BlockEntity;
import com.remolicrack.vanilla_plus.block.entity.StrawberryCrop1BlockEntity;
import com.remolicrack.vanilla_plus.block.entity.StrawberryCrop0BlockEntity;
import com.remolicrack.vanilla_plus.RemolicrackVanillaPlusMod;

public class RemolicrackVanillaPlusModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RemolicrackVanillaPlusMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_CROP_0 = register("strawberry_crop_0", RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_0, StrawberryCrop0BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_CROP_1 = register("strawberry_crop_1", RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_1, StrawberryCrop1BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_CROP_2 = register("strawberry_crop_2", RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_2, StrawberryCrop2BlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> STRAWBERRY_CROP_3 = register("strawberry_crop_3", RemolicrackVanillaPlusModBlocks.STRAWBERRY_CROP_3, StrawberryCrop3BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
