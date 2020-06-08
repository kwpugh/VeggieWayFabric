package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.blocks.PlantLentil;
import com.kwpugh.veggie_way.blocks.PlantQuinoa;
import com.kwpugh.veggie_way.blocks.PlantSoybean;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.kwpugh.veggie_way.VeggieWay.MOD_ID;

public class BlockInit
{
	public static final PlantQuinoa PLANT_QUINOA = Registry.register(Registry.BLOCK, new Identifier(MOD_ID,"plant_quinoa"), new PlantQuinoa(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).build()));
	public static final PlantSoybean PLANT_SOYBEAN = Registry.register(Registry.BLOCK,new Identifier(MOD_ID,"plant_soybean"), new PlantSoybean(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).build()));
	public static final PlantLentil PLANT_LENTIL = Registry.register(Registry.BLOCK,new Identifier(MOD_ID,"plant_lentil"), new PlantLentil(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).build()));
	public static final PlantLentil PLANT_CORN = Registry.register(Registry.BLOCK,new Identifier(MOD_ID,"plant_corn"), new PlantLentil(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0.0f, 0.0f).sounds(BlockSoundGroup.CROP).build()));
	public static void init() {

	}
}
