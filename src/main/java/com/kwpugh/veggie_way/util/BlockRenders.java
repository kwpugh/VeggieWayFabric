package com.kwpugh.veggie_way.util;

import com.kwpugh.veggie_way.init.BlockInit;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenders
{
	public static void defineRenders()
	{
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PLANT_QUINOA, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PLANT_SOYBEAN, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PLANT_LENTIL, RenderLayer.getCutoutMipped());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.PLANT_CORN, RenderLayer.getCutoutMipped());
	}	
}
