package net.squaants.falloutwastelands.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squaants.falloutwastelands.FalloutWastelands;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FalloutWastelands.MOD_ID);

    public static final DeferredItem<Item> ACID_WASTE = ITEMS.register("acid_waste",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_SCRAP = ITEMS.register("aluminum_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BALLISTIC_FIBER_SCRAP = ITEMS.register("ballistic_fiber_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TITANIUM_SCRAP = ITEMS.register("black_titanium_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BONE_SHARDS = ITEMS.register("bone_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERAMIC_SHARDS = ITEMS.register("ceramic_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIRCUIT = ITEMS.register("circuit",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONCRETE_POWDER = ITEMS.register("concrete_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORK_SCRAP = ITEMS.register("cork_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_SHARDS = ITEMS.register("crystal_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXCESS_ADHESIVE = ITEMS.register("excess_adhesive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBER_OPTICS_SCRAP = ITEMS.register("fiber_optics_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBERGLASS_SCRAP = ITEMS.register("fiberglass_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLASS_SHARDS = ITEMS.register("glass_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_SCRAP = ITEMS.register("lead_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_GEAR = ITEMS.register("loose_gear",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_SCREW = ITEMS.register("loose_screw",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_SPRING = ITEMS.register("loose_spring",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLDED_PLASTIC = ITEMS.register("molded_plastic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NUCLEAR_WASTE = ITEMS.register("nuclear_waste",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ASBESTOS = ITEMS.register("raw_asbestos",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BAUXITE = ITEMS.register("raw_bauxite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BLACK_TITANIUM = ITEMS.register("raw_black_titanium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CLOTH = ITEMS.register("raw_cloth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_FERTILIZER = ITEMS.register("raw_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RUBBER = ITEMS.register("raw_rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_SCRAP = ITEMS.register("silver_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SCRAP = ITEMS.register("steel_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTRACITE_SHARD = ITEMS.register("ultracite_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNREFINED_GUNPOWDER = ITEMS.register("unrefined_gunpowder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VAULT_STEEL_SCRAP = ITEMS.register("vault_steel_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_ANTISEPTIC = ITEMS.register("waste_antiseptic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_OIL = ITEMS.register("waste_oil",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ANGLER_FILET = ITEMS.register("angler_filet",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ANGLER_FILET)));
    public static final DeferredItem<Item> ANGLER_MEAT = ITEMS.register("angler_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ANGLER_MEAT)));
    public static final DeferredItem<Item> ANT_MEAT = ITEMS.register("ant_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ANT_MEAT)));
    public static final DeferredItem<Item> ASTER = ITEMS.register("aster",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ASTER)));
    public static final DeferredItem<Item> BLAMCO_BRAND_MAC_AND_CHEESE = ITEMS.register("blamco_brand_mac_and_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLAMCO_BRAND_MAC_AND_CHEESE)));
    public static final DeferredItem<Item> BLIGHT = ITEMS.register("blight",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLIGHT)));
    public static final DeferredItem<Item> BLOATFLY_MEAT = ITEMS.register("bloatfly_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOATFLY_MEAT)));
    public static final DeferredItem<Item> BLOODBUG_MEAT = ITEMS.register("bloodbug_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODBUG_MEAT)));
    public static final DeferredItem<Item> BLOODLEAF = ITEMS.register("bloodleaf",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODLEAF)));
    public static final DeferredItem<Item> BRAIN_FUNGUS = ITEMS.register("brain_fungus",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRAIN_FUNGUS)));
    public static final DeferredItem<Item> CAT_TAIL = ITEMS.register("cat_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAT_TAIL)));
    public static final DeferredItem<Item> CAVE_CRICKET_MEAT = ITEMS.register("cave_cricket_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAVE_CRICKET_MEAT)));
    public static final DeferredItem<Item> CAVE_FUNGUS = ITEMS.register("cave_fungus",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAVE_FUNGUS)));
    public static final DeferredItem<Item> COOKED_CAT_TAIL = ITEMS.register("cooked_cat_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CAT_TAIL)));
    public static final DeferredItem<Item> COOKED_IGUANA_TAIL = ITEMS.register("cooked_iguana_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_IGUANA_TAIL)));
    public static final DeferredItem<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)));
    public static final DeferredItem<Item> CRANBERRIES = ITEMS.register("cranberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRIES)));
    public static final DeferredItem<Item> DEATHCLAW_MEAT = ITEMS.register("deathclaw_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_MEAT)));
    public static final DeferredItem<Item> DEATHCLAW_STEAK = ITEMS.register("deathclaw_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_STEAK)));
    public static final DeferredItem<Item> DOG_MEAT = ITEMS.register("dog_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOG_MEAT)));
    public static final DeferredItem<Item> FIRECAP = ITEMS.register("firecap",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECAP)));
    public static final DeferredItem<Item> FIRECRACKER_BERRIES = ITEMS.register("firecracker_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECRACKER_BERRIES)));
    public static final DeferredItem<Item> FOX_MEAT = ITEMS.register("fox_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOX_MEAT)));
    public static final DeferredItem<Item> FROG_EGG = ITEMS.register("frog_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_EGG)));
    public static final DeferredItem<Item> FROG_LEG = ITEMS.register("frog_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_LEG)));
    public static final DeferredItem<Item> GINSENG_ROOT = ITEMS.register("ginseng_root",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GINSENG_ROOT)));
    public static final DeferredItem<Item> GOURD = ITEMS.register("gourd",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOURD)));
    public static final DeferredItem<Item> GULPER_MEAT = ITEMS.register("gulper_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GULPER_MEAT)));
    public static final DeferredItem<Item> GUT_SHROOM = ITEMS.register("gut_shroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GUT_SHROOM)));
    public static final DeferredItem<Item> IGUANA_TAIL = ITEMS.register("iguana_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IGUANA_TAIL)));
    public static final DeferredItem<Item> KALEIDOPORE_FLOWER = ITEMS.register("kaleidopore_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.KALEIDOPORE_FLOWER)));
    public static final DeferredItem<Item> LURE_WEED = ITEMS.register("lure_weed",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LURE_WEED)));
    public static final DeferredItem<Item> MEGASLOTH_MUSHROOM = ITEMS.register("megasloth_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGASLOTH_MUSHROOM)));
    public static final DeferredItem<Item> MUTATED_FERN_FLOWER = ITEMS.register("mutated_fern_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTATED_FERN_FLOWER)));
    public static final DeferredItem<Item> MUTFRUIT = ITEMS.register("mutfruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTFRUIT)));
    public static final DeferredItem<Item> RHODODENDRON_FLOWER = ITEMS.register("rhododendron_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RHODODENDRON_FLOWER)));
    public static final DeferredItem<Item> ROASTED_DOG = ITEMS.register("roasted_dog",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROASTED_DOG)));
    public static final DeferredItem<Item> SEARED_GULPER = ITEMS.register("seared_gulper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SEARED_GULPER)));
    public static final DeferredItem<Item> SILT_BEAN = ITEMS.register("silt_bean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILT_BEAN)));
    public static final DeferredItem<Item> SOOT_FLOWER = ITEMS.register("soot_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOOT_FLOWER)));
    public static final DeferredItem<Item> TARBERRIES = ITEMS.register("tarberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TARBERRIES)));
    public static final DeferredItem<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final DeferredItem<Item> WILD_BLACKBERRY = ITEMS.register("wild_blackberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WILD_BLACKBERRY)));


    public static final DeferredItem<Item> RADAWAY = ITEMS.register("radaway",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
