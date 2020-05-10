package com.example.examplemod.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods {
    public static final Food PANCAKE = (new Food.Builder())
            .hunger(3)
            .saturation(0.2f)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 5), 0.1f)
            .build();
}
