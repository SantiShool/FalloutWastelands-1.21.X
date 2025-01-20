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
    public static final DeferredItem<Item> BULK_ACID = ITEMS.register("bulk_acid",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_ADHESIVE = ITEMS.register("bulk_adhesive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_ANTISEPTIC = ITEMS.register("bulk_antiseptic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_ASBESTOS = ITEMS.register("bulk_asbestos",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_BALLISTIC_FIBER = ITEMS.register("bulk_ballistic_fiber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_BONES = ITEMS.register("bulk_bones",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CERAMICS = ITEMS.register("bulk_ceramics",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CIRCUITS = ITEMS.register("bulk_circuits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CLOTH = ITEMS.register("bulk_cloth",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CONCRETE = ITEMS.register("bulk_concrete",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CORKS = ITEMS.register("bulk_corks",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_CRYSTALS = ITEMS.register("bulk_crystals",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_FERTILIZER = ITEMS.register("bulk_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_FIBER_OPTICS = ITEMS.register("bulk_fiber_optics",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_FIBERGLASS = ITEMS.register("bulk_fiberglass",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_GEARS = ITEMS.register("bulk_gears",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_GLASS = ITEMS.register("bulk_glass",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_GUNPOWDER = ITEMS.register("bulk_gunpowder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_LEATHER = ITEMS.register("bulk_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_OIL = ITEMS.register("bulk_oil",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_PLASTIC = ITEMS.register("bulk_plastic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_RUBBER = ITEMS.register("bulk_rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_SCREWS = ITEMS.register("bulk_screws",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BULK_SPRINGS = ITEMS.register("bulk_springs",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CERAMIC_SHARD = ITEMS.register("ceramic_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIRCUITS = ITEMS.register("circuits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONCRETE_POWDER = ITEMS.register("concrete_powder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORK_SCRAP = ITEMS.register("cork_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXCESS_ADHESIVE = ITEMS.register("excess_adhesive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBER_OPTICS_SCRAP = ITEMS.register("fiber_optics_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBERGLASS_SCRAP = ITEMS.register("fiberglass_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GLASS_SHARD = ITEMS.register("glass_shard",
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
    public static final DeferredItem<Item> RAW_FERTILIZER = ITEMS.register("raw_fertilizer",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
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
    public static final DeferredItem<Item> UNREFINED_GUNPOWDER = ITEMS.register("unrefined_gunpowder",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> VAULT_STEEL_SCRAP = ITEMS.register("vault_steel_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_ANTISEPTIC = ITEMS.register("waste_antiseptic",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_OIL = ITEMS.register("waste_oil",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
