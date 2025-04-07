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
                        output.accept(ModItems.RAW_SILVER);
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
                    .icon(() -> new ItemStack(ModItems.SALISBURY_STEAK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(FalloutWastelands.MOD_ID, "fallout_chems_tab"))
                    .title(Component.translatable("creativetab.falloutwastelands.fallout_food_n_drink"))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.AGED_MIRELURK_QUEEN_STEAK);
                        output.accept(ModItems.ANGLER_MEAT);
                        output.accept(ModItems.ANT_MEAT);
                        output.accept(ModItems.ASH_ROSE);
                        output.accept(ModItems.ASTER);
                        output.accept(ModItems.AWESOME_OPOSSUM_BACON);
                        output.accept(ModItems.BAKED_BLOATFLY);
                        output.accept(ModItems.BLACKBERRY_HONEY_CRISP);
                        output.accept(ModItems.BLAMCO_BRAND_MAC_AND_CHEESE);
                        output.accept(ModItems.BLIGHT);
                        output.accept(ModItems.BLIGHT_SOUP);
                        output.accept(ModItems.BLOATFLY_MEAT);
                        output.accept(ModItems.BLOODBUG_MEAT);
                        output.accept(ModItems.BLOODBUG_PEPPER_STEAK);
                        output.accept(ModItems.BLOODBUG_STEAK);
                        output.accept(ModItems.BLOODLEAF);
                        output.accept(ModItems.BRAHAMIN_MEAT);
                        output.accept(ModItems.BRAIN_FUNGUS);
                        output.accept(ModItems.BRAIN_FUNGUS_SOUP);
                        output.accept(ModItems.BUBBLE_GUM);
                        output.accept(ModItems.CAJUN_RICE_N_BEANS);
                        output.accept(ModItems.CANNED_DOG_FOOD);
                        output.accept(ModItems.CAT_TAIL);
                        output.accept(ModItems.CAVE_CRICKET_MEAT);
                        output.accept(ModItems.CHEW_STICK);
                        output.accept(ModItems.CHICKEN_NOODLE_SOUP);
                        output.accept(ModItems.CHILI);
                        output.accept(ModItems.COOKED_CAT_TAIL);
                        output.accept(ModItems.COOKED_SOFTSHELL_MEAT);
                        output.accept(ModItems.CORN);
                        output.accept(ModItems.CORN_PONE);
                        output.accept(ModItems.CORN_SOUP);
                        output.accept(ModItems.COTTON_CANDY_BITES);
                        output.accept(ModItems.CRAM);
                        output.accept(ModItems.CRAMBURGER);
                        output.accept(ModItems.CRANBERRIES);
                        output.accept(ModItems.CRANBERRY_COBBLER);
                        output.accept(ModItems.CRANBERRY_JAM);
                        output.accept(ModItems.CRANBERRY_MEATBALL_GRINDER);
                        output.accept(ModItems.CRANBERRY_RELISH);
                        output.accept(ModItems.CRISPY_CAVE_CRICKET);
                        output.accept(ModItems.CRISPY_RADRAT_BITS);
                        output.accept(ModItems.CRISPY_SQUIRREL_BITS);
                        output.accept(ModItems.DANDY_BOY_APPLES);
                        output.accept(ModItems.DEATHCLAW_EGG);
                        output.accept(ModItems.DEATHCLAW_EGG_OMELETTE);
                        output.accept(ModItems.DEATHCLAW_MEAT);
                        output.accept(ModItems.DEATHCLAW_STEAK);
                        output.accept(ModItems.DEATHCLAW_WELLINGTON);
                        output.accept(ModItems.DOG_MEAT_STEAK);
                        output.accept(ModItems.FANCY_LADS_SNACK_CAKES);
                        output.accept(ModItems.FIRECAP);
                        output.accept(ModItems.FIRECAP_SOUP);
                        output.accept(ModItems.FIRECAP_TASTY_SOUFFLE);
                        output.accept(ModItems.FIRECRACKER_BERRIES);
                        output.accept(ModItems.FOX_JERKY);
                        output.accept(ModItems.FOX_MEAT);
                        output.accept(ModItems.FRIED_DEERSKIN);
                        output.accept(ModItems.FRIED_FOG_CRAWLER);
                        output.accept(ModItems.FRIED_RADTOAD_LEGS);
                        output.accept(ModItems.FROG_EGG);
                        output.accept(ModItems.FROG_LEG);
                        output.accept(ModItems.FUNNEL_CAKE);
                        output.accept(ModItems.GINSENG_ROOT);
                        output.accept(ModItems.GLOWING_FUNGUS);
                        output.accept(ModItems.GLOWING_FUNGUS_PUREE);
                        output.accept(ModItems.GLOWING_FUNGUS_SOUP);
                        output.accept(ModItems.GLOWING_MEAT);
                        output.accept(ModItems.GLOWING_MEAT_STEAK);
                        output.accept(ModItems.GLOWING_RESIN);
                        output.accept(ModItems.GOURD);
                        output.accept(ModItems.GOURD_SOUP);
                        output.accept(ModItems.GRILLED_HERMIT_CRAB);
                        output.accept(ModItems.GRILLED_RADROACH);
                        output.accept(ModItems.GRILLED_RADSTAG);
                        output.accept(ModItems.GRILLED_RADTOAD);
                        output.accept(ModItems.GROUND_MOLE_RAT);
                        output.accept(ModItems.GULPER_INNARDS);
                        output.accept(ModItems.GULPER_SLURRY);
                        output.accept(ModItems.GUM_DROPS);
                        output.accept(ModItems.HERMIT_CRAB_MEAT);
                        output.accept(ModItems.IGUANA_BITS);
                        output.accept(ModItems.IGUANA_ON_A_STICK);
                        output.accept(ModItems.IGUANA_SOUP);
                        output.accept(ModItems.IMITATION_SEAFOOD);
                        output.accept(ModItems.INSTAMASH);
                        output.accept(ModItems.LURE_WEED);
                        output.accept(ModItems.MEGASLOTH_MEAT);
                        output.accept(ModItems.MEGASLOTH_MUSHROOM);
                        output.accept(ModItems.MEGASLOTH_MUSHROOM_SOUP);
                        output.accept(ModItems.MEGASLOTH_TENDERLOIN);
                        output.accept(ModItems.MIRELURK_CAKE);
                        output.accept(ModItems.MIRELURK_EGG);
                        output.accept(ModItems.MIRELURK_EGG_OMELETTE);
                        output.accept(ModItems.MIRELURK_JERKY);
                        output.accept(ModItems.MIRELURK_MEAT);
                        output.accept(ModItems.MIRELURK_QUEEN_STEAK);
                        output.accept(ModItems.MOLE_RAT_CHUNKS);
                        output.accept(ModItems.MOLE_RAT_MEAT);
                        output.accept(ModItems.MONGREL_DOG_MEAT);
                        output.accept(ModItems.MOUNTAIN_HOCKS);
                        output.accept(ModItems.MUD_COOKIE);
                        output.accept(ModItems.MUTANT_HOUND_CHOPS);
                        output.accept(ModItems.MUTANT_HOUND_MEAT);
                        output.accept(ModItems.MUTATED_FERN_FLOWER);
                        output.accept(ModItems.MUTFRUIT);
                        output.accept(ModItems.MUTT_CHOPS);
                        output.accept(ModItems.OPOSSUM_MEAT);
                        output.accept(ModItems.PEPPER);
                        output.accept(ModItems.PERFECTLY_PRESERVED_PIE);
                        output.accept(ModItems.POACHED_ANGLER);
                        output.accept(ModItems.PORK_N_BEANS);
                        output.accept(ModItems.POTATO_CRISPS);
                        output.accept(ModItems.POTHOLE_POTPIE);
                        output.accept(ModItems.PUMPKIN_SOUP);
                        output.accept(ModItems.QUEEN_MIRELURK_MEAT);
                        output.accept(ModItems.RADRAT_MEAT);
                        output.accept(ModItems.RADROACH_MEAT);
                        output.accept(ModItems.RADSCORPION_EGG);
                        output.accept(ModItems.RADSCORPION_EGG_OMELETTE);
                        output.accept(ModItems.RADSCORPION_FILLET);
                        output.accept(ModItems.RADSCORPION_MEAT);
                        output.accept(ModItems.RADSCORPION_STEAK);
                        output.accept(ModItems.RADSTAG_MEAT);
                        output.accept(ModItems.RADSTAG_STEW);
                        output.accept(ModItems.RADTOAD_EGG);
                        output.accept(ModItems.RADTOAD_LEG);
                        output.accept(ModItems.RADTOAD_OMELETTE);
                        output.accept(ModItems.RAW_FOG_CRAWLER_MEAT);
                        output.accept(ModItems.RAW_WOLF_MEAT);
                        output.accept(ModItems.RAZORGRAIN_SOUP);
                        output.accept(ModItems.RHODODENDRON_FLOWER);
                        output.accept(ModItems.RIBEYE_STEAK);
                        output.accept(ModItems.ROAST_MEGASLOTH);
                        output.accept(ModItems.ROASTED_ANT);
                        output.accept(ModItems.ROASTED_MIRELURK_MEAT);
                        output.accept(ModItems.ROYAL_JELLY);
                        output.accept(ModItems.ROYAL_JELLY_TAFFY);
                        output.accept(ModItems.SALISBURY_STEAK);
                        output.accept(ModItems.SALT);
                        output.accept(ModItems.SEARED_VENISON_WITH_BERRIES);
                        output.accept(ModItems.SEASONED_RABBIT_SKEWERS);
                        output.accept(ModItems.SILT_BEAN);
                        output.accept(ModItems.SILT_BEAN_PUREE);
                        output.accept(ModItems.SILT_BEAN_SOUP);
                        output.accept(ModItems.SMOKED_MIRELURK_FILLETS);
                        output.accept(ModItems.SOFTSHELL_MIRELURK_MEAT);
                        output.accept(ModItems.SOOT_FLOWER);
                        output.accept(ModItems.SOOT_FLOWER_HERB_PASTE);
                        output.accept(ModItems.SPICES);
                        output.accept(ModItems.SQUIRREL_BITS);
                        output.accept(ModItems.SQUIRREL_ON_A_STICK);
                        output.accept(ModItems.STARLIGHT_BERRIES);
                        output.accept(ModItems.STARLIGHT_BERRY_COBBLER);
                        output.accept(ModItems.STINGWING_FILLET);
                        output.accept(ModItems.STINGWING_MEAT);
                        output.accept(ModItems.STINGWING_STEW);
                        output.accept(ModItems.SUGAR);
                        output.accept(ModItems.SUGAR_BOMBS);
                        output.accept(ModItems.SWEET_ROLL);
                        output.accept(ModItems.SWEET_TATO_STEW);
                        output.accept(ModItems.TARBERRY);
                        output.accept(ModItems.TASTY_MUTANT_HOUND_STEW);
                        output.accept(ModItems.TASTY_RADSCORPION_EGG_OMELETTE);
                        output.accept(ModItems.TASTY_SQUIRREL_STEW);
                        output.accept(ModItems.TASTY_YAO_GUAI_ROAST);
                        output.accept(ModItems.TATO);
                        output.accept(ModItems.TATO_SOUP);
                        output.accept(ModItems.VEGETABLE_MEDLEY_SOUP);
                        output.accept(ModItems.VEGETARIAN_HAM);
                        output.accept(ModItems.WILD_BLACKBERRY);
                        output.accept(ModItems.WOLF_RIBS);
                        output.accept(ModItems.YAO_GUAI_MEAT);
                        output.accept(ModItems.YAO_GUAI_RIBS);
                        output.accept(ModItems.YUM_YUM_DEVILED_EGGS);
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