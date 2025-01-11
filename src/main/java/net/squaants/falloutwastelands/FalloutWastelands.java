package net.squaants.falloutwastelands;

import net.minecraft.world.item.CreativeModeTabs;
import net.squaants.falloutwastelands.blocks.ModBlocks;
import net.squaants.falloutwastelands.item.ModCreativeModTabs;
import net.squaants.falloutwastelands.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(FalloutWastelands.MOD_ID)
public class FalloutWastelands {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "falloutwastelands";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public FalloutWastelands(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
 }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ACID_WASTE);
            event.accept(ModItems.ALUMINUM_SCRAP);
            event.accept(ModItems.BALLISTIC_FIBER_SCRAP);
            event.accept(ModItems.BLACK_TITANIUM_SCRAP);
            event.accept(ModItems.BULK_ALUMINUM);
            event.accept(ModItems.BULK_BLACK_TITANIUM);
            event.accept(ModItems.BULK_CLOTH);
            event.accept(ModItems.BULK_LEAD);
            event.accept(ModItems.BULK_PLASTIC);
            event.accept(ModItems.BULK_RUBBER);
            event.accept(ModItems.BULK_SCREWS);
            event.accept(ModItems.BULK_SILVER);
            event.accept(ModItems.CERAMIC_SCRAP);
            event.accept(ModItems.CIRCUITS);
            event.accept(ModItems.CORK_SCRAP);
            event.accept(ModItems.EXCESS_ADHESIVE);
            event.accept(ModItems.FIBER_OPTICS_BUNDLE);
            event.accept(ModItems.FIBERGLASS_SPOOL);
            event.accept(ModItems.LEAD_SCRAP);
            event.accept(ModItems.LOOSE_GEARS);
            event.accept(ModItems.LOOSE_SCREWS);
            event.accept(ModItems.LOOSE_SPRINGS);
            event.accept(ModItems.MOLDED_PLASTIC);
            event.accept(ModItems.NUCLEAR_WASTE);
            event.accept(ModItems.RAW_ASBESTOS);
            event.accept(ModItems.RAW_BAUXITE);
            event.accept(ModItems.RAW_BLACK_TITANIUM);
            event.accept(ModItems.RAW_CLOTH);
            event.accept(ModItems.RAW_LEAD);
            event.accept(ModItems.RAW_RUBBER);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.SILVER_SCRAP);
            event.accept(ModItems.WASTE_ANTISEPTIC);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BAUXITE_DEEPSLATE_ORE);
            event.accept(ModBlocks.BAUXITE_ORE);
            event.accept(ModBlocks.BLACK_TITANIUM_DEEPSLATE_ORE);
            event.accept(ModBlocks.LEAD_DEEPSLATE_ORE);
            event.accept(ModBlocks.LEAD_ORE);
            event.accept(ModBlocks.SILVER_DEEPSLATE_ORE);
            event.accept(ModBlocks.SILVER_ORE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
