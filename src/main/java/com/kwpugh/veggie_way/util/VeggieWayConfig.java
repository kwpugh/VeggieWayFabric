package com.kwpugh.veggie_way.util;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.*;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

@Config(name=MOD_ID)
public class VeggieWayConfig implements ConfigData
{

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Chunks chunks = new Chunks();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Pies pies = new Pies();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Soups soups = new Soups();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public SuperFoods super_foods = new SuperFoods();

	@ConfigEntry.Gui.CollapsibleObject
	@ConfigEntry.Gui.PrefixText
	public Misc misc = new Misc();


	public static class Chunks
	{
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float melon_chunk_saturation = 0.1F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int pumpkin_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float pumpkin_chunk_saturation = 0.1F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int cactus_chunk_hunger = 2;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float cactus_chunk_saturation = 0.1F;
	}
	
	public static class Pies
	{
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int apple_pie_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float apple_pie_saturation = 0.2F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_pie_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float melon_pie_saturation = 0.2F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int berry_pie_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float berry_pie_saturation = 0.2F;
	}
	
	public static class Soups
	{
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int pumpkin_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float pumpkin_soup_saturation = 0.3F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int cactus_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float cactus_soup_saturation = 0.3F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int melon_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float melon_soup_saturation = 0.3F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int carrot_soup_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float carrot_soup_saturation = 0.3F;
	}
	
	public static class SuperFoods
	{
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int super_petals_hunger = 6;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float super_petals_saturation = 0.8F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int energy_drink_hunger = 9;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float energy_drink_saturation = 0.2F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int shake_hunger = 10;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float shake_saturation = 0.3F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int smoothie_hunger = 10;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float smoothie_saturation = 0.3F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int energyBar_hunger = 10;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float energyBar_saturation = 0.4F;

		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int superFoodBar_hunger = 12;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float superFoodBar_saturation = 0.8F;
	}
	
	public static class Misc
	{
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int chocolate_bar_hunger = 4;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float chocolate_bar_saturation = 0.2F;
		
		@ConfigEntry.BoundedDiscrete(min=0,max=30)
		public int fried_egg_hunger = 3;
		@ConfigEntry.BoundedDiscrete(min=0,max=10)
		public float fried_egg_saturation = 0.2F;
	}
}