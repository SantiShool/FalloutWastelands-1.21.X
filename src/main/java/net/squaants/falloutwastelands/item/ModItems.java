package net.squaants.falloutwastelands.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.squaants.falloutwastelands.FalloutWastelands;

import java.util.List;

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

    public static final DeferredItem<Item> AGED_MIRELURK_QUEEN_STEAK = ITEMS.register("aged_mirelurk_queen_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AGED_MIRELURK_QUEEN_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.aged_mirelurk_queen_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ANGLER_MEAT = ITEMS.register("angler_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ANGLER_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.angler_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ANT_MEAT = ITEMS.register("ant_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ANT_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.ant_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ASH_ROSE = ITEMS.register("ash_rose",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ASH_ROSE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.ash_rose.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ASTER = ITEMS.register("aster",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ASTER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.aster.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> AWESOME_OPOSSUM_BACON = ITEMS.register("awesome_opossum_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.AWESOME_OPOSSUM_BACON)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.awesome_opossum_bacon.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BAKED_BLOATFLY = ITEMS.register("baked_bloatfly",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BAKED_BLOATFLY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.baked_bloatfly.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLACKBERRY_HONEY_CRISP = ITEMS.register("blackberry_honey_crisp",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLACKBERRY_HONEY_CRISP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.blackberry_honey_crisp.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLAMCO_BRAND_MAC_AND_CHEESE = ITEMS.register("blamco_brand_mac_and_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLAMCO_BRAND_MAC_AND_CHEESE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.blamco_brand_mac_and_cheese.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLIGHT = ITEMS.register("blight",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLIGHT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.blight.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLIGHT_SOUP = ITEMS.register("blight_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLIGHT_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.blight_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLOATFLY_MEAT = ITEMS.register("bloatfly_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOATFLY_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bloatfly_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLOODBUG_MEAT = ITEMS.register("bloodbug_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODBUG_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bloodbug_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLOODBUG_PEPPER_STEAK = ITEMS.register("bloodbug_pepper_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODBUG_PEPPER_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bloodbug_pepper_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLOODBUG_STEAK = ITEMS.register("bloodbug_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODBUG_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bloodbug_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BLOODLEAF = ITEMS.register("bloodleaf",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BLOODLEAF)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bloodleaf.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BRAHAMIN_MEAT = ITEMS.register("brahamin_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRAHAMIN_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.brahamin_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BRAIN_FUNGUS = ITEMS.register("brain_fungus",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRAIN_FUNGUS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.brain_fungus.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BRAIN_FUNGUS_SOUP = ITEMS.register("brain_fungus_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BRAIN_FUNGUS_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.brain_fungus_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> BUBBLE_GUM = ITEMS.register("bubble_gum",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BUBBLE_GUM)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.bubble_gumtooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CAJUN_RICE_N_BEANS = ITEMS.register("cajun_rice_n_beans",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAJUN_RICE_N_BEANS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cajun_rice_n_beans.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CANNED_DOG_FOOD = ITEMS.register("canned_dog_food",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANNED_DOG_FOOD)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.canned_dog_food.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CAT_TAIL = ITEMS.register("cat_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAT_TAIL)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cat_tail.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CAVE_CRICKET_MEAT = ITEMS.register("cave_cricket_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CAVE_CRICKET_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cave_cricket_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CHEW_STICK = ITEMS.register("chew_stick",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEW_STICK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.chew_stick.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CHICKEN_NOODLE_SOUP = ITEMS.register("chicken_noodle_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHICKEN_NOODLE_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.chicken_noodle_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CHILI = ITEMS.register("chili",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHILI)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.chili.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> COOKED_CAT_TAIL = ITEMS.register("cooked_cat_tail",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CAT_TAIL)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cooked_cat_tail.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> COOKED_SOFTSHELL_MEAT = ITEMS.register("cooked_softshell_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_SOFTSHELL_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cooked_softshell_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CORN = ITEMS.register("corn",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.corn.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CORN_PONE = ITEMS.register("corn_pone",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN_PONE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.corn_pone.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CORN_SOUP = ITEMS.register("corn_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CORN_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.corn_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> COTTON_CANDY_BITES = ITEMS.register("cotton_candy_bites",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COTTON_CANDY_BITES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cotton_candy_bites.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRAM = ITEMS.register("cram",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRAM)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cram.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRAMBURGER = ITEMS.register("cramburger",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRAMBURGER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cramburger.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRANBERRIES = ITEMS.register("cranberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRIES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cranberries.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRANBERRY_COBBLER = ITEMS.register("cranberry_cobbler",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRY_COBBLER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cranberry_cobbler.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRANBERRY_JAM = ITEMS.register("cranberry_jam",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRY_JAM)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cranberry_jam.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRANBERRY_MEATBALL_GRINDER = ITEMS.register("cranberry_meatball_grinder",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRY_MEATBALL_GRINDER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cranberry_meatball_grinder.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRANBERRY_RELISH = ITEMS.register("cranberry_relish",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRANBERRY_RELISH)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.cranberry_relish.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRISPY_CAVE_CRICKET = ITEMS.register("crispy_cave_cricket",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRISPY_CAVE_CRICKET)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.crispy_cave_cricket.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRISPY_RADRAT_BITS = ITEMS.register("crispy_radrat_bits",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRISPY_RADRAT_BITS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.crispy_radrat_bits.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> CRISPY_SQUIRREL_BITS = ITEMS.register("crispy_squirrel_bits",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRISPY_SQUIRREL_BITS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.crispy_squirrel_bits.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DANDY_BOY_APPLES = ITEMS.register("dandy_boy_apples",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DANDY_BOY_APPLES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.dandy_boy_apples.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DEATHCLAW_EGG = ITEMS.register("deathclaw_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_EGG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.deathclaw_egg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DEATHCLAW_EGG_OMELETTE = ITEMS.register("deathclaw_egg_omelette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_EGG_OMELETTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.deathclaw_egg_omelette.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DEATHCLAW_MEAT = ITEMS.register("deathclaw_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.deathclaw_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DEATHCLAW_STEAK = ITEMS.register("deathclaw_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.deathclaw_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DEATHCLAW_WELLINGTON = ITEMS.register("deathclaw_wellington",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DEATHCLAW_WELLINGTON)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.deathclaw_wellington.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> DOG_MEAT_STEAK = ITEMS.register("dog_meat_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOG_MEAT_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.dog_meat_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FANCY_LADS_SNACK_CAKES = ITEMS.register("fancy_lads_snack_cakes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FANCY_LADS_SNACK_CAKES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fancy_lads_snack_cakes.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FIRECAP = ITEMS.register("firecap",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECAP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.firecap.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FIRECAP_SOUP = ITEMS.register("firecap_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECAP_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.firecap_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FIRECAP_TASTY_SOUFFLE = ITEMS.register("firecap_tasty_souffle",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECAP_TASTY_SOUFFLE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.firecap_tasty_souffle.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FIRECRACKER_BERRIES = ITEMS.register("firecracker_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FIRECRACKER_BERRIES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.firecracker_berries.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FOX_JERKY = ITEMS.register("fox_jerky",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOX_JERKY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fox_jerky.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FOX_MEAT = ITEMS.register("fox_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FOX_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fox_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRIED_DEERSKIN = ITEMS.register("fried_deerskin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_DEERSKIN)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fried_deerskin.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRIED_FOG_CRAWLER = ITEMS.register("fried_fog_crawler",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_FOG_CRAWLER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fried_fog_crawler.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FRIED_RADTOAD_LEGS = ITEMS.register("fried_radtoad_legs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FRIED_RADTOAD_LEGS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fried_radtoad_legs.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FROG_EGG = ITEMS.register("frog_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_EGG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.frog_egg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FROG_LEG = ITEMS.register("frog_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FROG_LEG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.frog_leg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> FUNNEL_CAKE = ITEMS.register("funnel_cake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.FUNNEL_CAKE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.funnel_cake.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GINSENG_ROOT = ITEMS.register("ginseng_root",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GINSENG_ROOT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.ginseng_root.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_FUNGUS = ITEMS.register("glowing_fungus",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_FUNGUS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_fungus.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_FUNGUS_PUREE = ITEMS.register("glowing_fungus_puree",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_FUNGUS_PUREE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_fungus_puree.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_FUNGUS_SOUP = ITEMS.register("glowing_fungus_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_FUNGUS_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_fungus_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_MEAT = ITEMS.register("glowing_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_MEAT_STEAK = ITEMS.register("glowing_meat_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_MEAT_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_meat_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GLOWING_RESIN = ITEMS.register("glowing_resin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GLOWING_RESIN)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.glowing_resin.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GOURD = ITEMS.register("gourd",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOURD)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.gourd.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GOURD_SOUP = ITEMS.register("gourd_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GOURD_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.gourd_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GRILLED_HERMIT_CRAB = ITEMS.register("grilled_hermit_crab",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_HERMIT_CRAB)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.grilled_hermit_crab.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GRILLED_RADROACH = ITEMS.register("grilled_radroach",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_RADROACH)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.grilled_radroach.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GRILLED_RADSTAG = ITEMS.register("grilled_radstag",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_RADSTAG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.grilled_radstag.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GRILLED_RADTOAD = ITEMS.register("grilled_radtoad",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_RADTOAD)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.grilled_radtoad.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GROUND_MOLE_RAT = ITEMS.register("ground_mole_rat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GROUND_MOLE_RAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.ground_mole_rat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GULPER_INNARDS = ITEMS.register("gulper_innards",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GULPER_INNARDS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.gulper_innards.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GULPER_SLURRY = ITEMS.register("gulper_slurry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GULPER_SLURRY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.gulper_slurry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> GUM_DROPS = ITEMS.register("gum_drops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GUM_DROPS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.gum_drops.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> HERMIT_CRAB_MEAT = ITEMS.register("hermit_crab_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HERMIT_CRAB_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.hermit_crab_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> IGUANA_BITS = ITEMS.register("iguana_bits",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IGUANA_BITS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.iguana_bits.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> IGUANA_ON_A_STICK = ITEMS.register("iguana_on_a_stick",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IGUANA_ON_A_STICK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.iguana_on_a_stick.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> IGUANA_SOUP = ITEMS.register("iguana_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IGUANA_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.iguana_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> IMITATION_SEAFOOD = ITEMS.register("imitation_seafood",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IMITATION_SEAFOOD)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.imitation_seafood.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> INSTAMASH = ITEMS.register("instamash",
            () -> new Item(new Item.Properties().food(ModFoodProperties.INSTAMASH)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.instamash.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> LURE_WEED = ITEMS.register("lure_weed",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LURE_WEED)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.lure_weed.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MEGASLOTH_MEAT = ITEMS.register("megasloth_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGASLOTH_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.megasloth_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MEGASLOTH_MUSHROOM = ITEMS.register("megasloth_mushroom",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGASLOTH_MUSHROOM)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.megasloth_mushroom.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MEGASLOTH_MUSHROOM_SOUP = ITEMS.register("megasloth_mushroom_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGASLOTH_MUSHROOM_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.megasloth_mushroom_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MEGASLOTH_TENDERLOIN = ITEMS.register("megasloth_tenderloin",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MEGASLOTH_TENDERLOIN)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.megasloth_tenderloin.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_CAKE = ITEMS.register("mirelurk_cake",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_CAKE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_cake.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_EGG = ITEMS.register("mirelurk_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_EGG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_egg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_EGG_OMELETTE = ITEMS.register("mirelurk_egg_omelette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_EGG_OMELETTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_egg_omelette.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_JERKY = ITEMS.register("mirelurk_jerky",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_JERKY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_jerky.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_MEAT = ITEMS.register("mirelurk_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MIRELURK_QUEEN_STEAK = ITEMS.register("mirelurk_queen_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MIRELURK_QUEEN_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mirelurk_queen_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOLE_RAT_CHUNKS = ITEMS.register("mole_rat_chunks",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MOLE_RAT_CHUNKS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mole_rat_chunks.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOLE_RAT_MEAT = ITEMS.register("mole_rat_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MOLE_RAT_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mole_rat_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MONGREL_DOG_MEAT = ITEMS.register("mongrel_dog_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MONGREL_DOG_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mongrel_dog_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MOUNTAIN_HOCKS = ITEMS.register("mountain_hocks",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MOUNTAIN_HOCKS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mountain_hocks.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUD_COOKIE = ITEMS.register("mud_cookie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUD_COOKIE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mud_cookie.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUTANT_HOUND_CHOPS = ITEMS.register("mutant_hound_chops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTANT_HOUND_CHOPS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mutant_hound_chops.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUTANT_HOUND_MEAT = ITEMS.register("mutant_hound_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTANT_HOUND_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mutant_hound_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUTATED_FERN_FLOWER = ITEMS.register("mutated_fern_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTATED_FERN_FLOWER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mutated_fern_flower.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUTFRUIT = ITEMS.register("mutfruit",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTFRUIT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mutfruit.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> MUTT_CHOPS = ITEMS.register("mutt_chops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MUTT_CHOPS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.mutt_chops.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> OPOSSUM_MEAT = ITEMS.register("opossum_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.OPOSSUM_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.opossum_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PEPPER = ITEMS.register("pepper",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PEPPER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.pepper.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PERFECTLY_PRESERVED_PIE = ITEMS.register("perfectly_preserved_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PERFECTLY_PRESERVED_PIE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.perfectly_preserved_pie.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> POACHED_ANGLER = ITEMS.register("poached_angler",
            () -> new Item(new Item.Properties().food(ModFoodProperties.POACHED_ANGLER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.poached_angler.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PORK_N_BEANS = ITEMS.register("pork_n_beans",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PORK_N_BEANS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.pork_n_beans.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> POTATO_CRISPS = ITEMS.register("potato_crisps",
            () -> new Item(new Item.Properties().food(ModFoodProperties.POTATO_CRISPS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.potato_crisps.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> POTHOLE_POTPIE = ITEMS.register("pothole_potpie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.POTHOLE_POTPIE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.pothole_potpie.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> PUMPKIN_SOUP = ITEMS.register("pumpkin_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PUMPKIN_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.pumpkin_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> QUEEN_MIRELURK_MEAT = ITEMS.register("queen_mirelurk_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.QUEEN_MIRELURK_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.queen_mirelurk_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADRAT_MEAT = ITEMS.register("radrat_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADRAT_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radrat_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADROACH_MEAT = ITEMS.register("radroach_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADROACH_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radroach_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSCORPION_EGG = ITEMS.register("radscorpion_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSCORPION_EGG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radscorpion_egg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSCORPION_EGG_OMELETTE = ITEMS.register("radscorpion_egg_omelette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSCORPION_EGG_OMELETTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radscorpion_egg_omelette.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSCORPION_FILLET = ITEMS.register("radscorpion_fillet",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSCORPION_FILLET)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radscorpion_fillet.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSCORPION_MEAT = ITEMS.register("radscorpion_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSCORPION_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radscorpion_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSCORPION_STEAK = ITEMS.register("radscorpion_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSCORPION_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radscorpion_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSTAG_MEAT = ITEMS.register("radstag_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSTAG_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radstag_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADSTAG_STEW = ITEMS.register("radstag_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADSTAG_STEW)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radstag_stew.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADTOAD_EGG = ITEMS.register("radtoad_egg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADTOAD_EGG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radtoad_egg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADTOAD_LEG = ITEMS.register("radtoad_leg",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADTOAD_LEG)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radtoad_leg.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RADTOAD_OMELETTE = ITEMS.register("radtoad_omelette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RADTOAD_OMELETTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.radtoad_omelette.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RAW_FOG_CRAWLER_MEAT = ITEMS.register("fog_crawler_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_FOG_CRAWLER_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.fog_crawler_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RAW_WOLF_MEAT = ITEMS.register("raw_wolf_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_WOLF_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.raw_wolf_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RAZORGRAIN_SOUP = ITEMS.register("razorgrain_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAZORGRAIN_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.razorgrain_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RHODODENDRON_FLOWER = ITEMS.register("rhododendron_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RHODODENDRON_FLOWER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.rhododendron_flower.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> RIBEYE_STEAK = ITEMS.register("ribeye_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RIBEYE_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.ribeye_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ROAST_MEGASLOTH = ITEMS.register("roast_megasloth",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROAST_MEGASLOTH)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.roast_megasloth.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ROASTED_ANT = ITEMS.register("roasted_ant",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROASTED_ANT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.roasted_ant.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ROASTED_MIRELURK_MEAT = ITEMS.register("roasted_mirelurk_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROASTED_MIRELURK_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.roasted_mirelurk_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ROYAL_JELLY = ITEMS.register("royal_jelly",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROYAL_JELLY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.royal_jelly.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> ROYAL_JELLY_TAFFY = ITEMS.register("royal_jelly_taffy",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROYAL_JELLY_TAFFY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.royal_jelly_taffy.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SALISBURY_STEAK = ITEMS.register("salisbury_steak",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALISBURY_STEAK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.salisbury_steak.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SALT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.salt.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SEARED_VENISON_WITH_BERRIES = ITEMS.register("seared_venison_with_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SEARED_VENISON_WITH_BERRIES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.seared_venison_with_berries.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SEASONED_RABBIT_SKEWERS = ITEMS.register("seasoned_rabbit_skewers",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SEASONED_RABBIT_SKEWERS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.seasoned_rabbit_skewers.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SILT_BEAN = ITEMS.register("silt_bean",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILT_BEAN)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.silt_bean.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SILT_BEAN_PUREE = ITEMS.register("silt_bean_puree",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILT_BEAN_PUREE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.silt_bean_puree.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SILT_BEAN_SOUP = ITEMS.register("silt_bean_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SILT_BEAN_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.silt_bean_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SMOKED_MIRELURK_FILLETS = ITEMS.register("smoked_mirelurk_fillets",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SMOKED_MIRELURK_FILLETS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.smoked_mirelurk_fillets.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SOFTSHELL_MIRELURK_MEAT = ITEMS.register("softshell_mirelurk_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOFTSHELL_MIRELURK_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.softshell_mirelurk_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SOOT_FLOWER = ITEMS.register("soot_flower",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOOT_FLOWER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.soot_flower.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SOOT_FLOWER_HERB_PASTE = ITEMS.register("soot_flower_herb_paste",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SOOT_FLOWER_HERB_PASTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.soot_flower_herb_paste.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SPICES = ITEMS.register("spices",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SPICES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.spices.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SQUIRREL_BITS = ITEMS.register("squirrel_bits",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SQUIRREL_BITS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.squirrel_bits.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SQUIRREL_ON_A_STICK = ITEMS.register("squirrel_on_a_stick",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SQUIRREL_ON_A_STICK)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.squirrel_on_a_stick.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STARLIGHT_BERRIES = ITEMS.register("starlight_berries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STARLIGHT_BERRIES)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.starlight_berries.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STARLIGHT_BERRY_COBBLER = ITEMS.register("starlight_berry_cobbler",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STARLIGHT_BERRY_COBBLER)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.starlight_berry_cobbler.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STINGWING_FILLET = ITEMS.register("stingwing_fillet",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STINGWING_FILLET)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.stingwing_fillet.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STINGWING_MEAT = ITEMS.register("stingwing_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STINGWING_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.stingwing_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> STINGWING_STEW = ITEMS.register("stingwing_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.STINGWING_STEW)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.stingwing_stew.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SUGAR = ITEMS.register("sugar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGAR)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.sugar.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SUGAR_BOMBS = ITEMS.register("sugar_bombs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SUGAR_BOMBS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.sugar_bombs.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SWEET_ROLL = ITEMS.register("sweet_roll",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_ROLL)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.sweet_roll.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> SWEET_TATO_STEW = ITEMS.register("sweet_tato_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SWEET_TATO_STEW)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.sweet_tato_stew.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TARBERRY = ITEMS.register("tarberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TARBERRY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tarberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TASTY_MUTANT_HOUND_STEW = ITEMS.register("tasty_mutant_hound_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TASTY_MUTANT_HOUND_STEW)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tasty_mutant_hound_stew.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TASTY_RADSCORPION_EGG_OMELETTE = ITEMS.register("tasty_radscorpion_egg_omelette",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TASTY_RADSCORPION_EGG_OMELETTE)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tasty_radscorpion_egg_omelette.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TASTY_SQUIRREL_STEW = ITEMS.register("tasty_squirrel_stew",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TASTY_SQUIRREL_STEW)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tasty_squirrel_stew.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TASTY_YAO_GUAI_ROAST = ITEMS.register("tasty_yao_guai_roast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TASTY_YAO_GUAI_ROAST)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tasty_yao_guai_roast.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TATO = ITEMS.register("tato",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TATO)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tato.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> TATO_SOUP = ITEMS.register("tato_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TATO_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.tato_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> VEGETABLE_MEDLEY_SOUP = ITEMS.register("vegetable_medley_soup",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VEGETABLE_MEDLEY_SOUP)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.vegetable_medley_soup.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> VEGETARIAN_HAM = ITEMS.register("vegetarian_ham",
            () -> new Item(new Item.Properties().food(ModFoodProperties.VEGETARIAN_HAM)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.vegetarian_ham.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> WILD_BLACKBERRY = ITEMS.register("wild_blackberry",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WILD_BLACKBERRY)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.wild_blackberry.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> WOLF_RIBS = ITEMS.register("wolf_ribs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.WOLF_RIBS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.wolf_ribs.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> YAO_GUAI_MEAT = ITEMS.register("yao_guai_meat",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YAO_GUAI_MEAT)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.yao_guai_meat.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> YAO_GUAI_RIBS = ITEMS.register("yao_guai_ribs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YAO_GUAI_RIBS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.yao_guai_ribs.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<Item> YUM_YUM_DEVILED_EGGS = ITEMS.register("yum_yum_deviled_eggs",
            () -> new Item(new Item.Properties().food(ModFoodProperties.YUM_YUM_DEVILED_EGGS)) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.falloutwastelands.yum_yum_deviled_eggs.tooltip"));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    public static final DeferredItem<Item> RADAWAY = ITEMS.register("radaway",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
