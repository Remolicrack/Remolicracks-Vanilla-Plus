
package com.remolicrack.vanilla_plus.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ThornsMobEffect extends MobEffect {
	public ThornsMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16738048);
	}

	@Override
	public String getDescriptionId() {
		return "effect.remolicrack_vanilla_plus.thorns";
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
