
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.remolicrack.vanilla_plus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.remolicrack.vanilla_plus.client.model.Modelmuddy_pig;
import com.remolicrack.vanilla_plus.client.model.Modelbaby_muddy_pig;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RemolicrackVanillaPlusModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelmuddy_pig.LAYER_LOCATION, Modelmuddy_pig::createBodyLayer);
		event.registerLayerDefinition(Modelbaby_muddy_pig.LAYER_LOCATION, Modelbaby_muddy_pig::createBodyLayer);
	}
}
