package com.siksiksikki.wotarmory.items.tools;

import com.siksiksikki.wotarmory.main;
import com.siksiksikki.wotarmory.init.ModItems;
import com.siksiksikki.wotarmory.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel{


	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
