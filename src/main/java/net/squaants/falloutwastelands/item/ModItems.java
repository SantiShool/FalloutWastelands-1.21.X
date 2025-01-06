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
    public static final DeferredItem<Item> CERAMIC_SCRAP = ITEMS.register("ceramic_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CIRCUITS = ITEMS.register("circuits",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORK_SCRAP = ITEMS.register("cork_scrap",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> EXCESS_ADHESIVE = ITEMS.register("excess_adhesive",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBER_OPTICS_BUNDLE = ITEMS.register("fiber_optics_bundle",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FIBERGLASS_SPOOL = ITEMS.register("fiberglass_spool",
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
    public static final DeferredItem<Item> RAW_RUBBER = ITEMS.register("raw_rubber",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WASTE_ANTISEPTIC = ITEMS.register("waste_antiseptic",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
