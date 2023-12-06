
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.remolicrack.vanilla_plus.RemolicrackVanillaPlusMod;

public class RemolicrackVanillaPlusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RemolicrackVanillaPlusMod.MODID);
	public static final RegistryObject<CreativeModeTab> VANILLA_ARMOR_PLUS = REGISTRY.register("vanilla_armor_plus", () -> CreativeModeTab.builder().title(Component.translatable("item_group.remolicrack_vanilla_plus.vanilla_armor_plus"))
			.icon(() -> new ItemStack(RemolicrackVanillaPlusModItems.ECHO_SHARD_ARMOR_CHESTPLATE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RemolicrackVanillaPlusModItems.AMETHYST_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMETHYST_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMETHYST_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMETHYST_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.BRICK_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.BRICK_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.BRICK_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.BRICK_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CACTUS_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CACTUS_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CACTUS_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CACTUS_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRIMSON_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRIMSON_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRIMSON_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRIMSON_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRYING_OBSIDIAN_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRYING_OBSIDIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRYING_OBSIDIAN_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CRYING_OBSIDIAN_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ECHO_SHARD_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ECHO_SHARD_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ECHO_SHARD_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ECHO_SHARD_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.EMERALD_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.EMERALD_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.EMERALD_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.EMERALD_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.FROZEN_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.FROZEN_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.FROZEN_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.FROZEN_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.LAPIS_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.LAPIS_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.LAPIS_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.LAPIS_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.NETHER_BRICK_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.NETHER_BRICK_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.NETHER_BRICK_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.NETHER_BRICK_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.OBSIDIAN_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.OBSIDIAN_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.QUARTZ_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.QUARTZ_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.QUARTZ_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.QUARTZ_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.REDSTONE_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.REDSTONE_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.REDSTONE_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.REDSTONE_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.SLIME_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.SLIME_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.SLIME_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.SLIME_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WARPED_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WARPED_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WARPED_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WARPED_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WOOD_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WOOD_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WOOD_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.WOOD_ARMOR_BOOTS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_ARMOR_HELMET.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_ARMOR_CHESTPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_ARMOR_LEGGINGS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_ARMOR_BOOTS.get());
			})

			.build());
	public static final RegistryObject<CreativeModeTab> VANILLA_ORES_PLUS = REGISTRY.register("vanilla_ores_plus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.remolicrack_vanilla_plus.vanilla_ores_plus")).icon(() -> new ItemStack(RemolicrackVanillaPlusModItems.AMBER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_UPGRADE_SMITHING_TEMPLATE.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.ENDERITE_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.ENDERITE_BLOCK.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_SCRAP.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_INGOT.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.AMBER_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.DEEPSLATE_AMBER_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.AMBER_BLOCK.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.RUBY_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.DEEPSLATE_RUBY_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.RUBY_BLOCK.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.JADE_ORE.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.RAW_JADE_BLOCK.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.JADE_BLOCK.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModItems.RAW_JADE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> REMOLICRACKS_VANILLA_PLUS = REGISTRY.register("remolicracks_vanilla_plus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.remolicrack_vanilla_plus.remolicracks_vanilla_plus")).icon(() -> new ItemStack(RemolicrackVanillaPlusModItems.ORANGE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RemolicrackVanillaPlusModItems.ORANGE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.STRAWBERRY.get());
				tabData.accept(RemolicrackVanillaPlusModItems.STRAWBERRY_SEEDS.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CHERRY.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ORANGE_JUICE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.STRAWBERRY_JUICE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.CHERRY_JUICE.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.ORANGE_LEAVES.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.APPLE_LEAVES.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModItems.MUDDY_PIG_SPAWN_EGG.get());
				tabData.accept(RemolicrackVanillaPlusModItems.GLASS_SHARDS.get());
				tabData.accept(RemolicrackVanillaPlusModBlocks.WHITE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.WHITE_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.ORANGE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.ORANGE_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BLACK_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BLACK_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BLUE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BLUE_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BROWN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.BROWN_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.CYAN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.CYAN_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.GRAY_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.GRAY_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.GREEN_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.GREEN_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIGHT_BLUE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIGHT_BLUE_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIGHT_GRAY_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIGHT_GRAY_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIME_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.LIME_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.MAGENTA_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.MAGENTA_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.PINK_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.PINK_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.PURPLE_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.PURPLE_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.RED_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.RED_CONCRETE_SLAB.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.YELLOW_CONCRETE_STAIRS.get().asItem());
				tabData.accept(RemolicrackVanillaPlusModBlocks.YELLOW_CONCRETE_SLAB.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> VANILLA_TOOLS_PLUS = REGISTRY.register("vanilla_tools_plus", () -> CreativeModeTab.builder().title(Component.translatable("item_group.remolicrack_vanilla_plus.vanilla_tools_plus"))
			.icon(() -> new ItemStack(RemolicrackVanillaPlusModItems.ENDERITE_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_AXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_PICKAXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_SWORD.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_SHOVEL.get());
				tabData.accept(RemolicrackVanillaPlusModItems.ENDERITE_HOE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_PICKAXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_AXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_SWORD.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_SHOVEL.get());
				tabData.accept(RemolicrackVanillaPlusModItems.AMBER_HOE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_PICKAXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_AXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_SWORD.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_SHOVEL.get());
				tabData.accept(RemolicrackVanillaPlusModItems.RUBY_HOE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_AXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_HOE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_PICKAXE.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_SHOVEL.get());
				tabData.accept(RemolicrackVanillaPlusModItems.JADE_SWORD.get());
			})

			.build());
}
