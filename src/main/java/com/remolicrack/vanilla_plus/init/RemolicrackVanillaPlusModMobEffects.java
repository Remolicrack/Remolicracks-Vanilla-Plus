
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import com.remolicrack.vanilla_plus.potion.ThornsMobEffect;
import com.remolicrack.vanilla_plus.potion.FrostWalkerMobEffect;
import com.remolicrack.vanilla_plus.RemolicrackVanillaPlusMod;

public class RemolicrackVanillaPlusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, RemolicrackVanillaPlusMod.MODID);
	public static final RegistryObject<MobEffect> THORNS = REGISTRY.register("thorns", () -> new ThornsMobEffect());
	public static final RegistryObject<MobEffect> FROST_WALKER = REGISTRY.register("frost_walker", () -> new FrostWalkerMobEffect());
}
