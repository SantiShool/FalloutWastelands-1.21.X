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
                        output.accept(ModBlocks.BAUXITE_DEEPSLATE_ORE);
                        output.accept(ModBlocks.BAUXITE_ORE);
                        output.accept(ModBlocks.BULK_OF_ALUMINUM);
                        output.accept(ModItems.RAW_BAUXITE);
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
