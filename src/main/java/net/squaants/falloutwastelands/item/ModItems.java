package net.squaants.falloutwastelands.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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


    public static final DeferredItem<Item> BLAMCO_BRAND_MAC_AND_CHEESE = ITEMS.register("blamco_brand_mac_and_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLAMCO_BRAND_MAC_AND_CHEESE)));
    public static final DeferredItem<Item> RADAWAY = ITEMS.register("radaway",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
