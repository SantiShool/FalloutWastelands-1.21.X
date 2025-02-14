package net.squaants.falloutwastelands.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties ANGLER_FILET = new FoodProperties.Builder().nutrition(10).saturationModifier(1.5F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f).build();
    public static final FoodProperties ANGLER_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties ANT_MEAT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties ASTER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties BLAMCO_BRAND_MAC_AND_CHEESE = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 1.0f).build();
    public static final FoodProperties BLIGHT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties BLOATFLY_MEAT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties BLOODBUG_MEAT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties BLOODLEAF = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties BRAIN_FUNGUS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties CAT_TAIL = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties CAVE_CRICKET_MEAT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties CAVE_FUNGUS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties COOKED_CAT_TAIL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties COOKED_IGUANA_TAIL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties CRANBERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties DEATHCLAW_MEAT = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 1.0f).build();
    public static final FoodProperties DEATHCLAW_STEAK = new FoodProperties.Builder().nutrition(10).saturationModifier(1.5F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f).build();
    public static final FoodProperties DOG_MEAT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FIRECAP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FIRECRACKER_BERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties FOX_MEAT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FROG_EGG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FROG_LEG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties GINSENG_ROOT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties GOURD = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties GULPER_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties GUT_SHROOM = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties IGUANA_TAIL = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties KALEIDOPORE_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties LURE_WEED = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties MEGASLOTH_MUSHROOM = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties MUTATED_FERN_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties MUTFRUIT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties RHODODENDRON_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties ROASTED_DOG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties SEARED_GULPER = new FoodProperties.Builder().nutrition(8).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties SILT_BEAN = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties SOOT_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties TARBERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties WILD_BLACKBERRY = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();

}