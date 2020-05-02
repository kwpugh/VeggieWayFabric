package com.kwpugh.veggie_way.items;

import com.kwpugh.veggie_way.api.CustomRecipeRemainder;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ItemLargePot extends Item implements CustomRecipeRemainder
{
	public ItemLargePot(Settings properties)
	{
		super(properties);
	}

	@Override
	public boolean hasRecipeRemainder()
	{
		return true;
	}

    @Override
    public ItemStack getRecipeRemainder(ItemStack stackIn)
    {	
        return stackIn; // This item doesnt have a durability during creation, it is maxCount=1 so it must be infinite use?
    }
    
	@Override
	public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
		super.appendTooltip(stack, world, tooltip, context);
		tooltip.add((new TranslatableText("item.veggie_way.large_pot.line1").formatted(Formatting.GREEN)));
	}

}