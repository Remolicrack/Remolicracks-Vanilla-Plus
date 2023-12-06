
package com.remolicrack.vanilla_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.remolicrack.vanilla_plus.entity.MuddyPigEntity;
import com.remolicrack.vanilla_plus.client.model.Modelmuddy_pig;

public class MuddyPigRenderer extends MobRenderer<MuddyPigEntity, Modelmuddy_pig<MuddyPigEntity>> {
	public MuddyPigRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmuddy_pig(context.bakeLayer(Modelmuddy_pig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MuddyPigEntity entity) {
		return new ResourceLocation("remolicrack_vanilla_plus:textures/entities/muddy_pig.png");
	}
}
