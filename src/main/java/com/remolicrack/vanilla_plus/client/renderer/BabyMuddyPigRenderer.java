
package com.remolicrack.vanilla_plus.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.remolicrack.vanilla_plus.entity.BabyMuddyPigEntity;
import com.remolicrack.vanilla_plus.client.model.Modelbaby_muddy_pig;

public class BabyMuddyPigRenderer extends MobRenderer<BabyMuddyPigEntity, Modelbaby_muddy_pig<BabyMuddyPigEntity>> {
	public BabyMuddyPigRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbaby_muddy_pig(context.bakeLayer(Modelbaby_muddy_pig.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BabyMuddyPigEntity entity) {
		return new ResourceLocation("remolicrack_vanilla_plus:textures/entities/baby_muddy_pig.png");
	}
}
