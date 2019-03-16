package com.siksiksikki.wotarmory.items;

import com.siksiksikki.wotarmory.main;
import com.siksiksikki.wotarmory.init.ModItems;
import com.siksiksikki.wotarmory.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
