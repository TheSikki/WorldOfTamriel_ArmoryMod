package com.siksiksikki.wotarmory.init;

import java.util.ArrayList;
import java.util.List;

import com.siksiksikki.wotarmory.blocks.BlockBase;
import com.siksiksikki.wotarmory.blocks.decorative.DaedricBrickMotifBlock;
import com.siksiksikki.wotarmory.blocks.decorative.DunmerCobblestoneBrickBlock;
import com.siksiksikki.wotarmory.blocks.decorative.NordicCobblestoneBrickBlock;
import com.siksiksikki.wotarmory.blocks.decorative.NorthernDwemerPillarBlock;
import com.siksiksikki.wotarmory.blocks.decorative.TelvanniMushroomFloorBlock;
import com.siksiksikki.wotarmory.blocks.decorative.TelvanniMushroomWallBlock;
import com.siksiksikki.wotarmory.blocks.natural.DaedricAshBlock;
import com.siksiksikki.wotarmory.blocks.natural.DaedricCinderStoneBlock;
import com.siksiksikki.wotarmory.blocks.natural.DaedricCinderstoneCHBlock;
import com.siksiksikki.wotarmory.blocks.natural.DaedricStoneBlock;
import com.siksiksikki.wotarmory.blocks.natural.VolcanicAshBlock;
import com.siksiksikki.wotarmory.blocks.natural.VolcanicStoneFormationBlock;
import com.siksiksikki.wotarmory.blocks.ore.RawCorundumOre;
import com.siksiksikki.wotarmory.blocks.ore.RawEbonyOre;
import com.siksiksikki.wotarmory.blocks.ore.RawGlassOre;
import com.siksiksikki.wotarmory.blocks.ore.RawMithrilOre;
import com.siksiksikki.wotarmory.blocks.ore.RawMoonstoneOre;
import com.siksiksikki.wotarmory.blocks.ore.RawOrichalcumOre;
import com.siksiksikki.wotarmory.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.common.util.EnumHelper;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block RAW_EBONY_BLOCK = new RawEbonyOre("raw_ebony_block", Material.ROCK);
	public static final Block RAW_GLASS_BLOCK = new RawGlassOre("raw_glass_block", Material.ROCK);
	public static final Block RAW_MITHRIL_BLOCK = new RawMithrilOre("raw_mithril_block", Material.ROCK);
	public static final Block RAW_CORUNDUM_BLOCK = new RawCorundumOre("raw_corundum_block", Material.ROCK);
	public static final Block RAW_MOONSTONE_BLOCK = new RawMoonstoneOre("raw_moonstone_block", Material.ROCK);
	public static final Block RAW_ORICHALCUM_BLOCK = new RawOrichalcumOre("raw_orichalcum_block", Material.ROCK);
	
	//Natural
	public static final Block VOLCANIC_ASH_BLOCK = new VolcanicAshBlock("volcanic_ash_block", Material.SAND);
	public static final Block VOLCANIC_STONE_FORMATION_BLOCK = new VolcanicStoneFormationBlock ("volcanic_stone_formation_block", Material.ROCK);
	public static final Block DAEDRIC_ASH_BLOCK = new DaedricAshBlock("daedric_ash_block", Material.SAND);
	public static final Block DAEDRIC_STONE_BLOCK = new DaedricStoneBlock ("daedric_stone_block", Material.ROCK);
	public static final Block DAEDRIC_CINDERSTONE_BLOCK = new DaedricCinderStoneBlock ("daedric_cinderstone_block", Material.ROCK);
	public static final Block DAEDRIC_CINDERSTONECH_BLOCK = new DaedricCinderstoneCHBlock("daedric_cinderstonech_block", Material.ROCK);
	
	//Decorative
	public static final Block NORTHERN_DWEMER_PILLAR_BLOCK = new NorthernDwemerPillarBlock("northern_dwemer_pillar_block", Material.ROCK);
	public static final Block DAEDRIC_BRICK_MOTIF_BLOCK = new DaedricBrickMotifBlock("daedric_brick_motif_block", Material.ROCK);
	public static final Block DUNMER_COBBLESTONE_BRICK_BLOCK = new DunmerCobblestoneBrickBlock("dunmer_cobblestone_brick_block", Material.ROCK);
	public static final Block TELVANNI_MUSHROOM_WALL_BLOCK = new TelvanniMushroomWallBlock("telvanni_mushroom_wall_block", Material.ROCK);
	public static final Block TELVANNI_MUSHROOM_FLOOR_BLOCK = new TelvanniMushroomFloorBlock("telvanni_mushroom_floor_block", Material.ROCK);
	public static final Block NORDIC_COBBLESTONE_BRICK_BLOCK = new NordicCobblestoneBrickBlock("nordic_cobblestone_brick_block", Material.ROCK);
	
	//Utility
	
	
	
}
