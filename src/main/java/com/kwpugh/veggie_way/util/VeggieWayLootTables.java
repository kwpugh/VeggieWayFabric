package com.kwpugh.veggie_way.util;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

import com.google.common.collect.Lists;
import com.kwpugh.veggie_way.init.ItemInit;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.FabricLootSupplierBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.ConstantLootTableRange;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class VeggieWayLootTables
{
	private static final List<LootTableInsert> INSERTS = Lists.newArrayList();


	public static void init()
	{	
		FabricLootPoolBuilder QUINOA_SEEDS = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.QUINOA_SEEDS))
				.withCondition(RandomChanceLootCondition.builder(0.03F).build());

		insert(new LootTableInsert(QUINOA_SEEDS,
				new Identifier("minecraft", "blocks/grass")
		));

		FabricLootPoolBuilder SOYBEAN_SEEDS = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.SOYBEAN_SEEDS))
				.withCondition(RandomChanceLootCondition.builder(0.03F).build());

		insert(new LootTableInsert(SOYBEAN_SEEDS,
				new Identifier("minecraft", "blocks/grass")
		));		
		
		FabricLootPoolBuilder LENTIL_SEEDS = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.LENTIL_SEEDS))
				.withCondition(RandomChanceLootCondition.builder(0.03F).build());

		insert(new LootTableInsert(LENTIL_SEEDS,
				new Identifier("minecraft", "blocks/grass")
		));	
		
		FabricLootPoolBuilder CORN_SEEDS = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.CORN_SEEDS))
				.withCondition(RandomChanceLootCondition.builder(0.03F).build());

		insert(new LootTableInsert(CORN_SEEDS,
				new Identifier("minecraft", "blocks/grass")
		));	
		
		FabricLootPoolBuilder DRYING_AGENT = FabricLootPoolBuilder.builder()
				.withRolls(ConstantLootTableRange.create(1))
				.withEntry(ItemEntry.builder(ItemInit.DRYING_AGENT))
				.withCondition(RandomChanceLootCondition.builder(0.03F).build());

		insert(new LootTableInsert(DRYING_AGENT,
				new Identifier("minecraft", "blocks/sand")
		));	
		
		
		
		// Perform Callback insertion
		LootTableLoadingCallback.EVENT.register(((resourceManager, lootManager, identifier, supplier, lootTableSetter) -> {
			INSERTS.forEach(i->{
				if(ArrayUtils.contains(i.tables, identifier))
				{
					i.insert(supplier);
				}
			});
		}));
	}

	public static void insert(LootTableInsert insert)
	{
		INSERTS.add(insert);
	}

	public static class LootTableInsert
	{
		public final Identifier[] tables;
		public final FabricLootPoolBuilder lootPool;

		public LootTableInsert(FabricLootPoolBuilder lootPool, Identifier... tables)
		{
			this.tables = tables;
			this.lootPool = lootPool;
		}

		public void insert(FabricLootSupplierBuilder supplier)
		{
			supplier.withPool(lootPool);
		}
	}
}