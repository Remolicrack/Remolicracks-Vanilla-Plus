
package com.remolicrack.vanilla_plus.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FrostWalkerMobEffect extends MobEffect {
	public FrostWalkerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724788);
	}

	@Override
	public String getDescriptionId() {
		return "effect.remolicrack_vanilla_plus.frost_walker";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
