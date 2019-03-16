package com.siksiksikki.wotarmory.items.models;

import com.siksiksikki.wotarmory.main;
import com.siksiksikki.wotarmory.init.ModItems;
import com.siksiksikki.wotarmory.util.IHasModel;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class ArmorBase extends ItemArmor implements IHasModel 
{
	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		main.proxy.registerItemRenderer(this,0, "inventory");
	}

	@Override
	public ModelBiped getArmorModel (EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot, ModelBiped _default) 
	{
		if(itemStack != ItemStack.EMPTY) 
		{
			if(itemStack.getItem()instanceof ItemArmor) 
			{
				WOT_Helmet model = new WOT_Helmet();
				
				model.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				
				model.isChild = _default.isChild;
				model.isRiding =_default.isRiding;
				model.isSneak =_default.isSneak;
				model.rightArmPose=_default.rightArmPose;
				model.leftArmPose=_default.leftArmPose;
				
				return model;
			}
		}
	
	
	return null;
	
	}
}
		

	
		

