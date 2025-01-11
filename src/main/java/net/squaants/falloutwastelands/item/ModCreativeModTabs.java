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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALUMINUM_SCRAP.get()))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_junk"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ACID_WASTE);
                        output.accept(ModItems.ALUMINUM_SCRAP);
                        output.accept(ModItems.BALLISTIC_FIBER_SCRAP);
                        output.accept(ModBlocks.BAUXITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.BAUXITE_ORE);
                        output.accept(ModItems.BLACK_TITANIUM_SCRAP);
                        output.accept(ModBlocks.BLACK_TITANIUM_DEEPSLATE_ORE);
                        output.accept(ModItems.BLACK_TITANIUM_SCRAP);
                        output.accept(ModItems.BULK_CLOTH);
                        output.accept(ModBlocks.BULK_OF_ALUMINUM);
                        output.accept(ModBlocks.BULK_OF_SILVER);
                        output.accept(ModItems.BULK_PLASTIC);
                        output.accept(ModItems.BULK_RUBBER);
                        output.accept(ModItems.CERAMIC_SCRAP);
                        output.accept(ModItems.CIRCUITS);
                        output.accept(ModItems.CORK_SCRAP);
                        output.accept(ModItems.EXCESS_ADHESIVE);
                        output.accept(ModItems.FIBER_OPTICS_BUNDLE);
                        output.accept(ModItems.FIBERGLASS_SPOOL);
                        output.accept(ModBlocks.LEAD_DEEPSLATE_ORE);
                        output.accept(ModBlocks.LEAD_ORE);
                        output.accept(ModItems.LEAD_SCRAP);
                        output.accept(ModItems.LOOSE_GEARS);
                        output.accept(ModItems.LOOSE_SCREWS);
                        output.accept(ModItems.LOOSE_SPRINGS);
                        output.accept(ModItems.MOLDED_PLASTIC);
                        output.accept(ModItems.NUCLEAR_WASTE);
                        output.accept(ModItems.RAW_ASBESTOS);
                        output.accept(ModItems.RAW_BAUXITE);
                        output.accept(ModItems.RAW_BLACK_TITANIUM);
                        output.accept(ModItems.RAW_CLOTH);
                        output.accept(ModItems.RAW_LEAD);
                        output.accept(ModItems.RAW_RUBBER);
                        output.accept(ModItems. RAW_SILVER);
                        output.accept(ModBlocks.SILVER_DEEPSLATE_ORE);
                        output.accept(ModBlocks.SILVER_ORE);
                        output.accept(ModItems.SILVER_SCRAP);
                        output.accept(ModItems.WASTE_ANTISEPTIC);
                    }).build());

    public static final Supplier<CreativeModeTab> FALLOUT_CONSUMABLES_TAB = CREATIVE_MODE_TAB.register("fallout_consumables_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RADAWAY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FalloutWastelands.MOD_ID, "fallout_junk_tab"))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_consumables"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RADAWAY);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
