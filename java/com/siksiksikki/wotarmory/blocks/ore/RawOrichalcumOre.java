package com.siksiksikki.wotarmory.blocks.ore;

import java.util.Random;

import com.siksiksikki.wotarmory.blocks.BlockBase;
import com.siksiksikki.wotarmory.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RawOrichalcumOre extends BlockBase {
	
	public RawOrichalcumOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RAW_EBONY;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		return 1;
	}
}
