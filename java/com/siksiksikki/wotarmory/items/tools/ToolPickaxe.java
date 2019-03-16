package com.siksiksikki.wotarmory.items.tools;

import com.siksiksikki.wotarmory.main;
import com.siksiksikki.wotarmory.init.ModItems;
import com.siksiksikki.wotarmory.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{



	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
