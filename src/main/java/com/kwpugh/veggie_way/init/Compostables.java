package com.kwpugh.veggie_way.init;

import net.minecraft.block.ComposterBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class Compostables
{
	public static void init()
	{
		registerCompostableItem(ItemInit.LENTIL_SEEDS, 0.3F);
		registerCompostableItem(ItemInit.QUINOA_SEEDS, 0.3F);
		registerCompostableItem(ItemInit.SOYBEAN_SEEDS, 0.3F);
		
		registerCompostableItem(ItemInit.LENTIL, 0.65F);
		registerCompostableItem(ItemInit.QUINOA, 0.65F);
		registerCompostableItem(ItemInit.SOYBEAN, 0.65F);
	}
	
	public static void registerCompostableItem(ItemConvertible item, float chance)
	{
		if (item.asItem() != Items.AIR)
		{
			ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(item.asItem(), chance);
		}
	}
}
