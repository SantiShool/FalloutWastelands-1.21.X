package net.squaants.falloutwastelands.item;

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
    public static final DeferredItem<Item> BULK_ALUMINUM = ITEMS.register("bulk_aluminum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_ASBESTOS = ITEMS.register("bulk_asbestos",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_BLACK_TITANIUM = ITEMS.register("bulk_black_titanium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_BONE_SHARDS = ITEMS.register("bulk_bone_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CLOTH = ITEMS.register("bulk_cloth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_GEARS = ITEMS.register("bulk_gears",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_LEAD = ITEMS.register("bulk_lead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_LEATHER = ITEMS.register("bulk_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_PLASTIC = ITEMS.register("bulk_plastic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_RUBBER = ITEMS.register("bulk_rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_SCREWS = ITEMS.register("bulk_screws",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_SILVER = ITEMS.register("bulk_silver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_SPRINGS = ITEMS.register("bulk_springs",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_STEEL = ITEMS.register("bulk_steel",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERAMIC_SCRAP = ITEMS.register("ceramic_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIRCUITS = ITEMS.register("circuits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORK_SCRAP = ITEMS.register("cork_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_SHARDS = ITEMS.register("crystal_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXCESS_ADHESIVE = ITEMS.register("excess_adhesive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBER_OPTICS_BUNDLE = ITEMS.register("fiber_optics_bundle",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBERGLASS_SPOOL = ITEMS.register("fiberglass_spool",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLASS_SHARDS = ITEMS.register("glass_shards",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_SCRAP = ITEMS.register("lead_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_GEARS = ITEMS.register("loose_gears",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_SCREWS = ITEMS.register("loose_screws",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOOSE_SPRINGS = ITEMS.register("loose_springs",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MOLDED_PLASTIC = ITEMS.register("molded_plastic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NUCLEAR_WASTE = ITEMS.register("nuclear_waste",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RADAWAY = ITEMS.register("radaway",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ASBESTOS = ITEMS.register("raw_asbestos",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BAUXITE = ITEMS.register("raw_bauxite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_BLACK_TITANIUM = ITEMS.register("raw_black_titanium",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CLOTH = ITEMS.register("raw_cloth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEATHER = ITEMS.register("raw_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_RUBBER = ITEMS.register("raw_rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ULTRACITE = ITEMS.register("raw_ultracite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_SCRAP = ITEMS.register("silver_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_SCRAP = ITEMS.register("steel_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTRACITE_SHARD = ITEMS.register("ultracite_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_ANTISEPTIC = ITEMS.register("waste_antiseptic",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
