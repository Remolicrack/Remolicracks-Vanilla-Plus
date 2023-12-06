
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.remolicrack.vanilla_plus.entity.MuddyPigEntity;
import com.remolicrack.vanilla_plus.entity.BabyMuddyPigEntity;
import com.remolicrack.vanilla_plus.RemolicrackVanillaPlusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RemolicrackVanillaPlusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, RemolicrackVanillaPlusMod.MODID);
	public static final RegistryObject<EntityType<MuddyPigEntity>> MUDDY_PIG = register("muddy_pig",
			EntityType.Builder.<MuddyPigEntity>of(MuddyPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MuddyPigEntity::new)

					.sized(0.9f, 0.9f));
	public static final RegistryObject<EntityType<BabyMuddyPigEntity>> BABY_MUDDY_PIG = register("baby_muddy_pig",
			EntityType.Builder.<BabyMuddyPigEntity>of(BabyMuddyPigEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyMuddyPigEntity::new)

					.sized(0.6f, 0.6f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MuddyPigEntity.init();
			BabyMuddyPigEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MUDDY_PIG.get(), MuddyPigEntity.createAttributes().build());
		event.put(BABY_MUDDY_PIG.get(), BabyMuddyPigEntity.createAttributes().build());
	}
}
