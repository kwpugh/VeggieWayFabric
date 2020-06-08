package com.kwpugh.veggie_way.lists;

import com.kwpugh.veggie_way.VeggieWay;
import net.minecraft.item.FoodComponent;

public class FoodList
{
    static int friedEggHunger = VeggieWay.getConfig().misc.fried_egg_hunger;
    static float friedEggSaturation = VeggieWay.getConfig().misc.fried_egg_saturation;
    
    static int chocolateBarHunger = VeggieWay.getConfig().misc.chocolate_bar_hunger;
    static float chocolateBarSaturation = VeggieWay.getConfig().misc.chocolate_bar_saturation;

    static int cactusChunkHunger = VeggieWay.getConfig().chunks.cactus_chunk_hunger;
    static float cactusChunkSaturation = VeggieWay.getConfig().chunks.cactus_chunk_saturation;

    static int melonChunkHunger = VeggieWay.getConfig().chunks.melon_chunk_hunger;
    static float melonChunkSaturation = VeggieWay.getConfig().chunks.melon_chunk_saturation;

    static int pumpkinChunkHunger = VeggieWay.getConfig().chunks.pumpkin_chunk_hunger;
    static float pumpkinChunkSaturation = VeggieWay.getConfig().chunks.pumpkin_chunk_saturation;

    static int applePieHunger = VeggieWay.getConfig().pies.apple_pie_hunger;
    static float applePieSaturation = VeggieWay.getConfig().pies.apple_pie_saturation;

    static int melonPieHunger = VeggieWay.getConfig().pies.melon_pie_hunger;
    static float melonPieSaturation = VeggieWay.getConfig().pies.melon_pie_saturation;

    static int berryPieHunger = VeggieWay.getConfig().pies.berry_pie_hunger;
    static float berryPieSaturation = VeggieWay.getConfig().pies.berry_pie_saturation;

    static int pumpkinSoupHunger = VeggieWay.getConfig().soups.pumpkin_soup_hunger;
    static float pumpkinSoupSaturation = VeggieWay.getConfig().soups.pumpkin_soup_saturation;

    static int melonSoupHunger = VeggieWay.getConfig().soups.melon_soup_hunger;
    static float melonSoupSaturation = VeggieWay.getConfig().soups.cactus_soup_saturation;

    static int cactusSoupHunger = VeggieWay.getConfig().soups.cactus_soup_hunger;
    static float cactusSoupSaturation = VeggieWay.getConfig().soups.cactus_soup_saturation;

    static int carrotSoupHunger = VeggieWay.getConfig().soups.carrot_soup_hunger;
    static float carrotSoupSaturation = VeggieWay.getConfig().soups.carrot_soup_saturation;

    static int superPetalsHunger = VeggieWay.getConfig().super_foods.super_petals_hunger;
    static float superPetalsSaturation = VeggieWay.getConfig().super_foods.super_petals_saturation;

    static int energyDrinkHunger = VeggieWay.getConfig().super_foods.energy_drink_hunger;
    static float energyDrinkSaturation = VeggieWay.getConfig().super_foods.energy_drink_saturation;

    static int shakeHunger = VeggieWay.getConfig().super_foods.shake_hunger;
    static float shakeSaturation = VeggieWay.getConfig().super_foods.shake_saturation;

    static int smoothieHunger = VeggieWay.getConfig().super_foods.smoothie_hunger;
    static float smoothieSaturation = VeggieWay.getConfig().super_foods.smoothie_saturation;

    static int energyBarHunger = VeggieWay.getConfig().super_foods.energyBar_hunger;
    static float energyBarSaturation = VeggieWay.getConfig().super_foods.energyBar_saturation;

    static int superFoodHunger = VeggieWay.getConfig().super_foods.superFoodBar_hunger;
    static float superFoodSaturation = VeggieWay.getConfig().super_foods.superFoodBar_saturation;

    public static FoodComponent fried_egg = (new FoodComponent.Builder()).hunger(friedEggHunger).saturationModifier(friedEggSaturation).alwaysEdible().snack().build();
    
    public static FoodComponent chocolate_bar = (new FoodComponent.Builder()).hunger(chocolateBarHunger).saturationModifier(chocolateBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_chunk = (new FoodComponent.Builder()).hunger(cactusChunkHunger).saturationModifier(cactusChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent pumpkin_chunk = (new FoodComponent.Builder()).hunger(pumpkinChunkHunger).saturationModifier(pumpkinChunkSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_chunk = (new FoodComponent.Builder()).hunger(melonChunkHunger).saturationModifier(melonChunkSaturation).alwaysEdible().snack().build();

    public static FoodComponent apple_pie = (new FoodComponent.Builder()).hunger(applePieHunger).saturationModifier(applePieSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_pie = (new FoodComponent.Builder()).hunger(melonPieHunger).saturationModifier(melonPieSaturation).alwaysEdible().snack().build();
    public static FoodComponent sweet_berry_pie = (new FoodComponent.Builder()).hunger(berryPieHunger).saturationModifier(berryPieSaturation).alwaysEdible().snack().build();

    public static FoodComponent pumpkin_soup = (new FoodComponent.Builder()).hunger(pumpkinSoupHunger).saturationModifier(pumpkinSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent cactus_soup = (new FoodComponent.Builder()).hunger(cactusSoupHunger).saturationModifier(cactusSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent melon_soup = (new FoodComponent.Builder()).hunger(melonSoupHunger).saturationModifier(melonSoupSaturation).alwaysEdible().snack().build();
    public static FoodComponent carrot_soup = (new FoodComponent.Builder()).hunger(carrotSoupHunger).saturationModifier(carrotSoupSaturation).alwaysEdible().snack().build();

    public static FoodComponent super_petals = (new FoodComponent.Builder()).hunger(superPetalsHunger).saturationModifier(superPetalsSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_drink = (new FoodComponent.Builder()).hunger(energyDrinkHunger).saturationModifier(energyDrinkSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_shake = (new FoodComponent.Builder()).hunger(shakeHunger).saturationModifier(shakeSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_smoothie = (new FoodComponent.Builder()).hunger(smoothieHunger).saturationModifier(smoothieSaturation).alwaysEdible().snack().build();

    public static FoodComponent energy_bar = (new FoodComponent.Builder()).hunger(energyBarHunger).saturationModifier(energyBarSaturation).alwaysEdible().snack().build();
    public static FoodComponent superfood_bar = (new FoodComponent.Builder()).hunger(superFoodHunger).saturationModifier(superFoodSaturation).alwaysEdible().snack().build();
}

