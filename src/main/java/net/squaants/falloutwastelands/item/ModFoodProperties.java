package net.squaants.falloutwastelands.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BLAMCO_BRAND_MAC_AND_CHEESE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600), 0.65f).build();

}