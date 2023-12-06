
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.remolicrack.vanilla_plus.client.renderer.MuddyPigRenderer;
import com.remolicrack.vanilla_plus.client.renderer.BabyMuddyPigRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RemolicrackVanillaPlusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RemolicrackVanillaPlusModEntities.MUDDY_PIG.get(), MuddyPigRenderer::new);
		event.registerEntityRenderer(RemolicrackVanillaPlusModEntities.BABY_MUDDY_PIG.get(), BabyMuddyPigRenderer::new);
	}
}
