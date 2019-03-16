package com.siksiksikki.wotarmory.items.tools;

import com.siksiksikki.wotarmory.main;
import com.siksiksikki.wotarmory.init.ModItems;
import com.siksiksikki.wotarmory.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ToolMace_BAK extends ItemSword implements IHasModel
{
    private final float attackDamage;

    public ToolMace_BAK(String name, ToolMaterial material)
    {
          super(material);
          this.attackDamage = 4.0F + material.getAttackDamage();
  		setUnlocalizedName(name);
  		setRegistryName(name);
  		setCreativeTab(CreativeTabs.COMBAT);
  		
  		ModItems.ITEMS.add(this);
    }
    
    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.MOB_SPAWNER || block == Blocks.IRON_BARS || block == Blocks.ICE || block == Blocks.PACKED_ICE || block instanceof BlockGlass || block instanceof BlockPane  || block instanceof BlockStainedGlass || block instanceof BlockTrapDoor || block instanceof BlockDoor)
        {
            return 5.0F;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material  != Material.LEAVES && material != Material.WEB && material != Material.SNOW && material != Material.GRASS  ? 0.0F : 1.5F;
        }
    }
    @Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}