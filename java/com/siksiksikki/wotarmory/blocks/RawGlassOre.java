package com.siksiksikki.wotarmory.blocks;

import java.util.Random;

import com.siksiksikki.wotarmory.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RawGlassOre extends BlockBase {
	
	public RawGlassOre(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(4.0F);
		setResistance(70.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.RAW_GLASS;
	}
	
	@Override
	public int quantityDropped(Random rand) {
		int max = 3;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
