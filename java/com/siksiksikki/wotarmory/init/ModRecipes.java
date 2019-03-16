package com.siksiksikki.wotarmory.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.PROCESSED_EBONY, new ItemStack(ModItems.TAMRIEL_EBONY_INGOT, 1), 10F);
		GameRegistry.addSmelting(ModBlocks.RAW_CORUNDUM_BLOCK, new ItemStack(ModItems.TAMRIEL_CORUNDUM_INGOT, 1), 10F);
		GameRegistry.addSmelting(ModBlocks.RAW_MOONSTONE_BLOCK, new ItemStack(ModItems.TAMRIEL_MOONSTONE_INGOT, 1), 10F);
		GameRegistry.addSmelting(ModBlocks.RAW_MITHRIL_BLOCK, new ItemStack(ModItems.TAMRIEL_MITHRIL_INGOT, 1), 10F);
		GameRegistry.addSmelting(ModBlocks.RAW_ORICHALCUM_BLOCK, new ItemStack(ModItems.TAMRIEL_ORICHALCUM_INGOT, 1), 10F);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ModItems.TAMRIEL_IRON_INGOT, 1), 10F);
	}
}
