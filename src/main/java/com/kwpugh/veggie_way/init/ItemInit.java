package com.kwpugh.veggie_way.init;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.items.DrinkBase;
import com.kwpugh.veggie_way.items.ItemCactusChunk;
import com.kwpugh.veggie_way.items.ItemCaffeine;
import com.kwpugh.veggie_way.items.ItemCarbs;
import com.kwpugh.veggie_way.items.ItemCropCorn;
import com.kwpugh.veggie_way.items.ItemCropLentil;
import com.kwpugh.veggie_way.items.ItemCropQuinoa;
import com.kwpugh.veggie_way.items.ItemCropSoybean;
import com.kwpugh.veggie_way.items.ItemDough;
import com.kwpugh.veggie_way.items.ItemDryingAgent;
import com.kwpugh.veggie_way.items.ItemEnergyPowder;
import com.kwpugh.veggie_way.items.ItemFlour;
import com.kwpugh.veggie_way.items.ItemFructose;
import com.kwpugh.veggie_way.items.ItemHandRake;
import com.kwpugh.veggie_way.items.ItemHandScraper;
import com.kwpugh.veggie_way.items.ItemKnife;
import com.kwpugh.veggie_way.items.ItemMelonChunk;
import com.kwpugh.veggie_way.items.ItemMill;
import com.kwpugh.veggie_way.items.ItemProteins;
import com.kwpugh.veggie_way.items.ItemPumpkinChunk;
import com.kwpugh.veggie_way.items.ItemSeedCorn;
import com.kwpugh.veggie_way.items.ItemSeedLentil;
import com.kwpugh.veggie_way.items.ItemSeedQuinoa;
import com.kwpugh.veggie_way.items.ItemSeedSoybean;
import com.kwpugh.veggie_way.items.ItemSuperPetals;
import com.kwpugh.veggie_way.items.ItemSuperfoodPowder;
import com.kwpugh.veggie_way.items.ItemVitamins;
import com.kwpugh.veggie_way.items.ItemWheatgerm;
import com.kwpugh.veggie_way.lists.FoodList;

import net.minecraft.item.Item;
import net.minecraft.item.MushroomStewItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit
{
	public static final ItemKnife KNIFE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knife"), new ItemKnife(new Item.Settings().maxDamage(250).group(VeggieWay.veggie_way)));
	public static final ItemHandRake HAND_RAKE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hand_rake"), new ItemHandRake(ToolMaterials.IRON, -2, -3, new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemHandScraper HAND_SCRAPER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hand_scraper"), new ItemHandScraper(new Item.Settings().maxDamage(250).group(VeggieWay.veggie_way)));
	public static final Item BAMBOO_SHEET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "bamboo_sheet"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item LARGE_BAMBOO_SHEET = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "large_bamboo_sheet"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));	
	
	public static final Item FRESH_TOFU = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fresh_tofu"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item COOKED_TOFU = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cooked_tofu"), new Item(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item FRIED_EGG = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fried_egg"), new Item(new Item.Settings().food(FoodList.fried_egg).group(VeggieWay.veggie_way)));
	
	public static final ItemMill MILL = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "mill"), new ItemMill(new Item.Settings().maxDamage(512).group(VeggieWay.veggie_way)));
	public static final ItemFlour FLOUR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flour"), new ItemFlour(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemDough DOUGH = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dough"), new ItemDough(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final Item CHOCOLATE_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "chocolate_bar"), new Item(new Item.Settings().food(FoodList.superfood_bar).group(VeggieWay.veggie_way)));

	public static final ItemPumpkinChunk PUMPKIN_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_chunk"), new ItemPumpkinChunk(new Item.Settings().food(FoodList.pumpkin_chunk).group(VeggieWay.veggie_way)));
	public static final ItemCactusChunk CACTUS_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cactus_chunk"), new ItemCactusChunk(new Item.Settings().food(FoodList.cactus_chunk).group(VeggieWay.veggie_way)));	
	public static final ItemMelonChunk MELON_CHUNK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_chunk"), new ItemMelonChunk(new Item.Settings().food(FoodList.melon_chunk).group(VeggieWay.veggie_way)));
	
	public static final MushroomStewItem PUMPKIN_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pumpkin_soup"), new MushroomStewItem(new Item.Settings().maxCount(1).food(FoodList.pumpkin_soup).group(VeggieWay.veggie_way)));
	public static final MushroomStewItem CACTUS_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "cactus_soup"), new MushroomStewItem(new Item.Settings().maxCount(1).food(FoodList.cactus_soup).group(VeggieWay.veggie_way)));
	public static final MushroomStewItem MELON_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_soup"), new MushroomStewItem(new Item.Settings().maxCount(1).food(FoodList.melon_soup).group(VeggieWay.veggie_way)));
	public static final MushroomStewItem CARROT_SOUP = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carrot_soup"), new MushroomStewItem(new Item.Settings().maxCount(1).food(FoodList.carrot_soup).group(VeggieWay.veggie_way)));
	
	public static final Item APPLE_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "apple_pie"), new Item(new Item.Settings().food(FoodList.apple_pie).group(VeggieWay.veggie_way)));	
	public static final Item SWEET_BERRY_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "sweet_berry_pie"), new Item(new Item.Settings().food(FoodList.sweet_berry_pie).group(VeggieWay.veggie_way)));
	public static final Item MELON_PIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "melon_pie"), new Item(new Item.Settings().food(FoodList.melon_pie).group(VeggieWay.veggie_way)));
	
	public static final ItemSuperPetals SUPER_PETALS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "super_petals"), new ItemSuperPetals(new Item.Settings().food(FoodList.super_petals).group(VeggieWay.veggie_way)));
	
	public static final ItemSeedQuinoa QUINOA_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quinoa_seeds"), new ItemSeedQuinoa(BlockInit.PLANT_QUINOA, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropQuinoa QUINOA = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "quinoa"), new ItemCropQuinoa(new Item.Settings().group(VeggieWay.veggie_way)));

	public static final ItemSeedSoybean SOYBEAN_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soybean_seeds"), new ItemSeedSoybean(BlockInit.PLANT_SOYBEAN, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropSoybean SOYBEAN = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "soybean"), new ItemCropSoybean(new Item.Settings().group(VeggieWay.veggie_way)));
	
	public static final ItemSeedLentil LENTIL_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lentil_seeds"), new ItemSeedLentil(BlockInit.PLANT_LENTIL, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropLentil LENTIL = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "lentil"), new ItemCropLentil(new Item.Settings().group(VeggieWay.veggie_way)));
	
	public static final ItemSeedCorn CORN_SEEDS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corn_seeds"), new ItemSeedCorn(BlockInit.PLANT_CORN, (new Item.Settings().group(VeggieWay.veggie_way))));
	public static final ItemCropCorn CORN = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "corn"), new ItemCropCorn(new Item.Settings().group(VeggieWay.veggie_way)));
	
	public static final ItemDryingAgent DRYING_AGENT = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "drying_agent"), new ItemDryingAgent(new Item.Settings().group(VeggieWay.veggie_way)));
	
	public static final ItemCarbs CARBS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "carbs"), new ItemCarbs(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemFructose FRUCTOSE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fructose"), new ItemFructose(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemProteins PROTEINS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "proteins"), new ItemProteins(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemVitamins VITAMINS = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "vitamins"), new ItemVitamins(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemCaffeine CAFFEINE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "caffeine"), new ItemCaffeine(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemWheatgerm WHEATGERM = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wheatgerm"), new ItemWheatgerm(new Item.Settings().group(VeggieWay.veggie_way)));	
	
	public static final ItemEnergyPowder ENERGY_POWDER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_powder"), new ItemEnergyPowder(new Item.Settings().group(VeggieWay.veggie_way)));
	public static final ItemSuperfoodPowder SUPERFOOD_POWDER = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_powder"), new ItemSuperfoodPowder(new Item.Settings().group(VeggieWay.veggie_way)));
	
	public static final DrinkBase ENERGY_DRINK = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_drink"), new DrinkBase(new Item.Settings().food(FoodList.energy_drink).group(VeggieWay.veggie_way)));
	public static final DrinkBase SUPERFOOD_SHAKE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_shake"), new DrinkBase(new Item.Settings().food(FoodList.superfood_shake).group(VeggieWay.veggie_way)));
	public static final DrinkBase SUPERFOOD_SMOOTHIE = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_smoothie"), new DrinkBase(new Item.Settings().food(FoodList.superfood_smoothie).group(VeggieWay.veggie_way)));
	
	public static final Item ENERGY_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "energy_bar"), new Item(new Item.Settings().food(FoodList.energy_bar).group(VeggieWay.veggie_way)));
	public static final Item SUPERFOOD_BAR = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "superfood_bar"), new Item(new Item.Settings().food(FoodList.superfood_bar).group(VeggieWay.veggie_way)));
	
	public static void init()
	{
	}
}
