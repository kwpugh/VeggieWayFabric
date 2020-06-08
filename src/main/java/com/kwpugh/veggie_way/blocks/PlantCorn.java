package com.kwpugh.veggie_way.blocks;

import java.util.List;

import com.kwpugh.veggie_way.init.ItemInit;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;

public class PlantCorn extends CropBlock
{ 
    public PlantCorn(Block.Settings builder)
    {
        super(builder);
    }

    @Environment(EnvType.CLIENT)
    protected ItemConvertible getSeedsItem()
    {
        return ItemInit.CORN_SEEDS;
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void buildTooltip(ItemStack stack, BlockView view, List<Text> tooltip, TooltipContext options)
    {
        super.buildTooltip(stack, view, tooltip, options);
        tooltip.add((new TranslatableText("block.veggie_way.corn_plant").formatted(Formatting.GREEN)));
    }
}