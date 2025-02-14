package net.squaants.falloutwastelands.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squaants.falloutwastelands.FalloutWastelands;
import net.squaants.falloutwastelands.blocks.ModBlocks;
import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FalloutWastelands.MOD_ID);

    public static final Supplier<CreativeModeTab> FALLOUT_JUNK_TAB = CREATIVE_MODE_TAB.register("fallout_junk_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.NUCLEAR_WASTE.get()))
                    // Invert ordering: require Food n Drink to come before Junk.
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FalloutWastelands.MOD_ID, "fallout_food_n_drink_tab"))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_junk"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ACID_WASTE);
                        output.accept(ModItems.ALUMINUM_SCRAP);
                        output.accept(ModItems.BALLISTIC_FIBER_SCRAP);
                        output.accept(ModItems.BLACK_TITANIUM_SCRAP);
                        output.accept(ModItems.BLACK_TITANIUM_SCRAP);
                        output.accept(ModItems.BONE_SHARDS);
                        output.accept(ModItems.CERAMIC_SHARDS);
                        output.accept(ModItems.CIRCUIT);
                        output.accept(ModItems.CONCRETE_POWDER);
                        output.accept(ModItems.CORK_SCRAP);
                        output.accept(ModItems.CRYSTAL_SHARDS);
                        output.accept(ModItems.EXCESS_ADHESIVE);
                        output.accept(ModItems.FIBER_OPTICS_SCRAP);
                        output.accept(ModItems.FIBERGLASS_SCRAP);
                        output.accept(ModItems.GLASS_SHARDS);
                        output.accept(ModItems.LEAD_SCRAP);
                        output.accept(ModItems.LOOSE_GEAR);
                        output.accept(ModItems.LOOSE_SCREW);
                        output.accept(ModItems.LOOSE_SPRING);
                        output.accept(ModItems.MOLDED_PLASTIC);
                        output.accept(ModItems.NUCLEAR_WASTE);
                        output.accept(ModItems.RAW_ASBESTOS);
                        output.accept(ModItems.RAW_BAUXITE);
                        output.accept(ModItems.RAW_BLACK_TITANIUM);
                        output.accept(ModItems.RAW_CLOTH);
                        output.accept(ModItems.RAW_FERTILIZER);
                        output.accept(ModItems.RAW_LEAD);
                        output.accept(ModItems.RAW_RUBBER);
                        output.accept(ModItems. RAW_SILVER);
                        output.accept(ModItems.SILVER_SCRAP);
                        output.accept(ModItems.STEEL_SCRAP);
                        output.accept(ModItems.ULTRACITE_SHARD);
                        output.accept(ModItems.UNREFINED_GUNPOWDER);
                        output.accept(ModItems.VAULT_STEEL_SCRAP);
                        output.accept(ModItems.WASTE_ANTISEPTIC);
                        output.accept(ModItems.WASTE_OIL);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> FALLOUT_FOOD_N_DRINK_TAB = CREATIVE_MODE_TAB.register("fallout_food_n_drink_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BLAMCO_BRAND_MAC_AND_CHEESE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FalloutWastelands.MOD_ID, "fallout_chems_tab"))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_food_n_drink"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.ANGLER_FILET);
                        output.accept(ModItems.ANGLER_MEAT);
                        output.accept(ModItems.ANT_MEAT);
                        output.accept(ModItems.ASTER);
                        output.accept(ModItems.BLAMCO_BRAND_MAC_AND_CHEESE);
                        output.accept(ModItems.BLIGHT);
                        output.accept(ModItems.BLOATFLY_MEAT);
                        output.accept(ModItems.BLOODBUG_MEAT);
                        output.accept(ModItems.BLOODLEAF);
                        output.accept(ModItems.BRAIN_FUNGUS);
                        output.accept(ModItems.CAT_TAIL);
                        output.accept(ModItems.CAVE_CRICKET_MEAT);
                        output.accept(ModItems.CAVE_FUNGUS);
                        output.accept(ModItems.COOKED_CAT_TAIL);
                        output.accept(ModItems.COOKED_IGUANA_TAIL);
                        output.accept(ModItems.CORN);
                        output.accept(ModItems.CRANBERRIES);
                        output.accept(ModItems.DEATHCLAW_MEAT);
                        output.accept(ModItems.DEATHCLAW_STEAK);
                        output.accept(ModItems.DOG_MEAT);
                        output.accept(ModItems.FIRECAP);
                        output.accept(ModItems.FIRECRACKER_BERRIES);
                        output.accept(ModItems.FOX_MEAT);
                        output.accept(ModItems.FROG_EGG);
                        output.accept(ModItems.FROG_LEG);
                        output.accept(ModItems.GINSENG_ROOT);
                        output.accept(ModItems.GOURD);
                        output.accept(ModItems.GULPER_MEAT);
                        output.accept(ModItems.GUT_SHROOM);
                        output.accept(ModItems.IGUANA_TAIL);
                        output.accept(ModItems.KALEIDOPORE_FLOWER);
                        output.accept(ModItems.LURE_WEED);
                        output.accept(ModItems.MEGASLOTH_MUSHROOM);
                        output.accept(ModItems.MUTATED_FERN_FLOWER);
                        output.accept(ModItems.MUTFRUIT);
                        output.accept(ModItems.RHODODENDRON_FLOWER);
                        output.accept(ModItems.ROASTED_DOG);
                        output.accept(ModItems.SEARED_GULPER);
                        output.accept(ModItems.SILT_BEAN);
                        output.accept(ModItems.SOOT_FLOWER);
                        output.accept(ModItems.TARBERRIES);
                        output.accept(ModItems.TOMATO);
                        output.accept(ModItems.WILD_BLACKBERRY);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> FALLOUT_CHEMS_TAB = CREATIVE_MODE_TAB.register("fallout_chems_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RADAWAY.get()))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_chems"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.RADAWAY);
                    })
                    .build());
    public static final Supplier<CreativeModeTab> FALLOUT_BLOCKS_TAB = CREATIVE_MODE_TAB.register("fallout_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.BULK_VAULT_STEEL.get()))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_blocks"))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.BAUXITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.BAUXITE_ORE);
                        output.accept(ModBlocks.BLACK_TITANIUM_DEEPSLATE_ORE);
                        output.accept(ModBlocks.BULK_ALUMINUM);
                        output.accept(ModBlocks.BULK_LEAD);
                        output.accept(ModBlocks.BULK_SILVER);
                        output.accept(ModBlocks.BULK_STEEL);
                        output.accept(ModBlocks.BULK_ULTRACITE);
                        output.accept(ModBlocks.BULK_VAULT_STEEL);
                        output.accept(ModBlocks.LEAD_DEEPSLATE_ORE);
                        output.accept(ModBlocks.LEAD_ORE);
                        output.accept(ModBlocks.SILVER_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SILVER_ORE);
                        output.accept(ModBlocks.ULTRACITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.ULTRACITE_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}