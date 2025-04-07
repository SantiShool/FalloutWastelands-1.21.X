package net.squaants.falloutwastelands.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    //END
    public static final FoodProperties AGED_MIRELURK_QUEEN_STEAK = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 7200, 2), 1.0f).build();
    public static final FoodProperties ANGLER_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties ANT_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties ASH_ROSE = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties ASTER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties AWESOME_OPOSSUM_BACON = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600, 1), 1.0f).build();
    //RADIATION RESISTANCE
    public static final FoodProperties BAKED_BLOATFLY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties BLACKBERRY_HONEY_CRISP = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 10800), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 10800), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10800), 1.0f).build();

    public static final FoodProperties BLAMCO_BRAND_MAC_AND_CHEESE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties BLIGHT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //CRIT DAMAGE
    public static final FoodProperties BLIGHT_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties BLOATFLY_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties BLOODBUG_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties BLOODBUG_PEPPER_STEAK = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480, 1), 1.0f).build();
    public static final FoodProperties BLOODBUG_STEAK = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600), 1.0f).build();
    public static final FoodProperties BLOODLEAF = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties BRAHAMIN_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties BRAIN_FUNGUS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //INT
    public static final FoodProperties BRAIN_FUNGUS_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties BUBBLE_GUM = new FoodProperties.Builder().nutrition(0).saturationModifier(5.0F).build();
    public static final FoodProperties CAJUN_RICE_N_BEANS = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 420), 1.0f).build();
    public static final FoodProperties CANNED_DOG_FOOD = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 420), 1.0f).build();
    public static final FoodProperties CAT_TAIL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties CAVE_CRICKET_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties CHEW_STICK = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600, 1), 1.0f).build();
    //DISEASE RESIST
    public static final FoodProperties CHICKEN_NOODLE_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties CHILI = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600, 1), 1.0f).build();
    //AGI
    public static final FoodProperties COOKED_CAT_TAIL = new FoodProperties.Builder().nutrition(4).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1), 1.0f).build();
    //AGI
    public static final FoodProperties COOKED_SOFTSHELL_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //CHA
    public static final FoodProperties CORN_PONE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 3600, 1), 1.0f).build();
    //AGI
    public static final FoodProperties CORN_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    //AGI
    public static final FoodProperties COTTON_CANDY_BITES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties CRAM = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties CRAMBURGER = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties CRANBERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //XP BOOST
    public static final FoodProperties CRANBERRY_COBBLER = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties CRANBERRY_JAM = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200), 1.0f).build();
    public static final FoodProperties CRANBERRY_MEATBALL_GRINDER = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 10800, 1), 1.0f).build();
    //AGI XP BOOST
    public static final FoodProperties CRANBERRY_RELISH = new FoodProperties.Builder().nutrition(8).saturationModifier(1.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 420), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 7200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200), 1.0f).build();
    public static final FoodProperties CRISPY_CAVE_CRICKET = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 420), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600), 1.0f).build();
    //PER
    public static final FoodProperties CRISPY_RADRAT_BITS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    //END
    public static final FoodProperties CRISPY_SQUIRREL_BITS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 2), 1.0f).build();
    public static final FoodProperties DANDY_BOY_APPLES = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties DEATHCLAW_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties DEATHCLAW_EGG_OMELETTE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360, 1), 1.0f).build();
    public static final FoodProperties DEATHCLAW_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties DEATHCLAW_STEAK = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties DEATHCLAW_WELLINGTON = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2), 1.0f).build();
    //END
    public static final FoodProperties DOG_MEAT_STEAK = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 7200, 2), 1.0f).build();
    public static final FoodProperties FANCY_LADS_SNACK_CAKES = new FoodProperties.Builder().nutrition(4).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties FIRECAP = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FIRECAP_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600), 1.0f).build();
    public static final FoodProperties FIRECAP_TASTY_SOUFFLE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    public static final FoodProperties FIRECRACKER_BERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //AGI
    public static final FoodProperties FOX_JERKY = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600, 1), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1), 1.0f).build();
    public static final FoodProperties FOX_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties FRIED_DEERSKIN = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 7200), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200), 1.0f).build();
    public static final FoodProperties FRIED_FOG_CRAWLER = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600), 1.0f).build();
    public static final FoodProperties FRIED_RADTOAD_LEGS = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties FROG_EGG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FROG_LEG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties FUNNEL_CAKE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties GINSENG_ROOT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties GLOWING_FUNGUS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties GLOWING_FUNGUS_PUREE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    //RADIATION RESISTANCE
    public static final FoodProperties GLOWING_FUNGUS_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties GLOWING_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties GLOWING_MEAT_STEAK = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties GLOWING_RESIN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties GOURD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    //PER
    public static final FoodProperties GOURD_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //DISEASE RESISTANCE RADIATION RESISTANCE
    public static final FoodProperties GRILLED_HERMIT_CRAB = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1), 1.0f).build();
    //DISEASE RESISTANCE RADIATION RESISTANCE
    public static final FoodProperties GRILLED_RADROACH = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600), 1.0f).build();
    public static final FoodProperties GRILLED_RADSTAG = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties GRILLED_RADTOAD = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties GROUND_MOLE_RAT = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 7200, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 2), 1.0f).build();
    public static final FoodProperties GULPER_INNARDS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties GULPER_SLURRY = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 600), 1.0f).build();
    //AGI
    public static final FoodProperties GUM_DROPS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties HERMIT_CRAB_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties IGUANA_BITS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties IGUANA_ON_A_STICK = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600), 1.0f).build();
    public static final FoodProperties IGUANA_SOUP = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 7200, 2), 1.0f).build();
    public static final FoodProperties IMITATION_SEAFOOD = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties INSTAMASH = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties LURE_WEED = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties MEGASLOTH_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties MEGASLOTH_MUSHROOM = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //CRIT DAMAGE BOOST
    public static final FoodProperties MEGASLOTH_MUSHROOM_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties MEGASLOTH_TENDERLOIN = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    public static final FoodProperties MIRELURK_CAKE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 7200), 1.0f).build();
    public static final FoodProperties MIRELURK_EGG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties MIRELURK_EGG_OMELETTE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties MIRELURK_JERKY = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200), 1.0f).build();
    public static final FoodProperties MIRELURK_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    //DISEASE RESISTANCE RADIATION RESISTANCE
    public static final FoodProperties MIRELURK_QUEEN_STEAK = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties MOLE_RAT_CHUNKS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600), 1.0f).build();
    public static final FoodProperties MOLE_RAT_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties MONGREL_DOG_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //RADIATION RESISTANCE
    public static final FoodProperties MOUNTAIN_HOCKS = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties MUD_COOKIE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties MUTANT_HOUND_CHOPS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties MUTANT_HOUND_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties MUTATED_FERN_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties MUTFRUIT = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    //END
    public static final FoodProperties MUTT_CHOPS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties OPOSSUM_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties PEPPER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties PERFECTLY_PRESERVED_PIE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    //AGI
    public static final FoodProperties POACHED_ANGLER = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties PORK_N_BEANS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties POTATO_CRISPS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties POTHOLE_POTPIE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600), 1.0f).build();
    //PER
    public static final FoodProperties PUMPKIN_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties QUEEN_MIRELURK_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties RADRAT_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties RADROACH_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties RADSCORPION_EGG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //REMOVES RANDOM ADDICTION
    public static final FoodProperties RADSCORPION_EGG_OMELETTE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties RADSCORPION_FILLET = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    public static final FoodProperties RADSCORPION_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties RADSCORPION_STEAK = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    public static final FoodProperties RADSTAG_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties RADSTAG_STEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 7200, 1), 1.0f).build();
    public static final FoodProperties RADTOAD_EGG = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties RADTOAD_LEG = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //END
    public static final FoodProperties RADTOAD_OMELETTE = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600), 1.0f).build();
    public static final FoodProperties RAW_FOG_CRAWLER_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties RAW_WOLF_MEAT = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    //DISEASE RESIST
    public static final FoodProperties RAZORGRAIN_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties RHODODENDRON_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties RIBEYE_STEAK = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties ROAST_MEGASLOTH = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600), 1.0f).build();
    public static final FoodProperties ROASTED_ANT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //AGI
    public static final FoodProperties ROASTED_MIRELURK_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    //AGI
    public static final FoodProperties ROYAL_JELLY = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    //AGI
    public static final FoodProperties ROYAL_JELLY_TAFFY = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    public static final FoodProperties SALISBURY_STEAK = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties SALT = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties SEARED_VENISON_WITH_BERRIES = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 10800, 2), 1.0f).build();
    public static final FoodProperties SEASONED_RABBIT_SKEWERS = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 3600), 1.0f).build();
    public static final FoodProperties SILT_BEAN = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties SILT_BEAN_PUREE = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 7200), 1.0f).build();
    //END
    public static final FoodProperties SILT_BEAN_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties SMOKED_MIRELURK_FILLETS = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 10800, 1), 1.0f).build();
    public static final FoodProperties SOFTSHELL_MIRELURK_MEAT = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    public static final FoodProperties SOOT_FLOWER = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    //RADIATION RESISTANCE
    public static final FoodProperties SOOT_FLOWER_HERB_PASTE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties SPICES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    public static final FoodProperties SQUIRREL_BITS = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    //AGI
    public static final FoodProperties SQUIRREL_ON_A_STICK = new FoodProperties.Builder().nutrition(6).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 7200, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 7200, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 7200, 2), 1.0f).build();
    public static final FoodProperties STARLIGHT_BERRIES = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    //END
    public static final FoodProperties STARLIGHT_BERRY_COBBLER = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600), 1.0f).build();
    public static final FoodProperties STINGWING_FILLET = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties STINGWING_MEAT = new FoodProperties.Builder().nutrition(5).saturationModifier(0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 300), 1.0f).build();
    //PER
    public static final FoodProperties STINGWING_STEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties SUGAR = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 60), 1.0f).build();
    //AGI
    public static final FoodProperties SUGAR_BOMBS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 3600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600), 1.0f).build();
    //AGI CHA
    public static final FoodProperties SWEET_ROLL = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 10800, 2), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 10800), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 10800), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 10800), 1.0f).build();
    public static final FoodProperties SWEET_TATO_STEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480, 1), 1.0f).build();
    public static final FoodProperties TARBERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 180), 1.0f).build();
    public static final FoodProperties TASTY_MUTANT_HOUND_STEW = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2), 1.0f).build();
    //REMOVES ALL ADDICTIONS
    public static final FoodProperties TASTY_RADSCORPION_EGG_OMELETTE = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    //XP BOOST
    public static final FoodProperties TASTY_SQUIRREL_STEW = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
    public static final FoodProperties TASTY_YAO_GUAI_ROAST = new FoodProperties.Builder().nutrition(10).saturationModifier(2.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 600), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 7200, 2), 1.0f).build();
    public static final FoodProperties TATO = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //POISON RESISTANCE
    public static final FoodProperties TATO_SOUP = new FoodProperties.Builder().nutrition(4).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 240), 1.0f).build();
    //DISEASE RESISTANCE
    public static final FoodProperties VEGETABLE_MEDLEY_SOUP = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties VEGETARIAN_HAM = new FoodProperties.Builder().nutrition(8).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties WILD_BLACKBERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    //PER
    public static final FoodProperties WOLF_RIBS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 120), 1.0f).build();
    public static final FoodProperties YAO_GUAI_MEAT = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 480), 1.0f).build();
    public static final FoodProperties YAO_GUAI_RIBS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 1), 1.0f).build();
    public static final FoodProperties YUM_YUM_DEVILED_EGGS = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 360), 1.0f).build();
}