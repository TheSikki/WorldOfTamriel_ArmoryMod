package com.siksiksikki.wotarmory.init;

import java.util.ArrayList;
import java.util.List;

import com.siksiksikki.wotarmory.items.ItemBase;
import com.siksiksikki.wotarmory.items.food.FoodBase;
import com.siksiksikki.wotarmory.items.models.ArmorBase;
import com.siksiksikki.wotarmory.items.tools.ToolAxe;
import com.siksiksikki.wotarmory.items.tools.ToolDagger;
import com.siksiksikki.wotarmory.items.tools.ToolHoe;
import com.siksiksikki.wotarmory.items.tools.ToolKatana;
import com.siksiksikki.wotarmory.items.tools.ToolMace;
import com.siksiksikki.wotarmory.items.tools.ToolPickaxe;
import com.siksiksikki.wotarmory.items.tools.ToolSpade;
import com.siksiksikki.wotarmory.items.tools.ToolSword;
import com.siksiksikki.wotarmory.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	
	public static final List <Item> ITEMS = new ArrayList<Item>();
	
	//Tool Materials
	public static final ToolMaterial MATERIAL_CHAINMAIL = EnumHelper.addToolMaterial ("material_chainmail",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_LEATHER = EnumHelper.addToolMaterial ("material_leather",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_IRON = EnumHelper.addToolMaterial ("material_iron",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_DWARVEN = EnumHelper.addToolMaterial ("material_dwarven",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_STEEL = EnumHelper.addToolMaterial ("material_steel",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_MITHRIL = EnumHelper.addToolMaterial ("material_mithril",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_ELVEN = EnumHelper.addToolMaterial ("material_elven",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_ORCISH = EnumHelper.addToolMaterial ("material_orcish",2, 250, 6.0F, 2.0F, 14);
	public static final ToolMaterial MATERIAL_EBONY = EnumHelper.addToolMaterial("material_ebony", 3, 1700, 8.0F, 4.0F, 10);
	public static final ToolMaterial MATERIAL_GLASS = EnumHelper.addToolMaterial("material_glass", 2, 250, 6.0F, 2.5F, 22);
	public static final ToolMaterial MATERIAL_STALHRIM = EnumHelper.addToolMaterial("material_stalhrim", 3, 1600, 7.0F, 3.5F, 12);
	public static final ToolMaterial MATERIAL_DAEDRIC = EnumHelper.addToolMaterial("material_daedric", 4, 2000, 8.5F, 4.5F, 18);
	public static final ToolMaterial MATERIAL_DRAGON = EnumHelper.addToolMaterial ("material_dragon",2, 250, 6.0F, 2.0F, 14);
	
	//Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_EBONY = EnumHelper.addArmorMaterial("armor_material_ebony", Reference.MOD_ID + ":ebony", 15, new int[] {2, 6, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	
	
	//Armor
	//Ebony
	public static final Item MORROW_EBONY_HELMET = new ArmorBase ("morrow_ebony_helmet", ARMOR_MATERIAL_EBONY, 1, EntityEquipmentSlot.HEAD);
	public static final Item MORROW_EBONY_CHESTPLATE = new ArmorBase ("morrow_ebony_chestplate", ARMOR_MATERIAL_EBONY, 1, EntityEquipmentSlot.CHEST);
	public static final Item MORROW_EBONY_GREAVES = new ArmorBase ("morrow_ebony_greaves", ARMOR_MATERIAL_EBONY, 2, EntityEquipmentSlot.LEGS);
	public static final Item MORROW_EBONY_BOOTS = new ArmorBase ("morrow_ebony_boots", ARMOR_MATERIAL_EBONY, 1, EntityEquipmentSlot.FEET);
	
	//Items
	public static final Item AMULET_OF_KINGS = new ItemBase ("amulet_of_kings");
	public static final Item AZURA_STAR = new ItemBase ("azura_star");
	public static final Item PETTY_SOULGEM = new ItemBase ("petty_soulgem");
	public static final Item LESSER_SOULGEM = new ItemBase ("lesser_soulgem");
	public static final Item COMMON_SOULGEM = new ItemBase ("common_soulgem");
	public static final Item GREATER_SOULGEM = new ItemBase ("greater_soulgem");
	public static final Item GRAND_SOULGEM = new ItemBase ("grand_soulgem");
	public static final Item OGHMA_INFINIUM = new ItemBase ("oghma_infinium");
	public static final Item SIGIL_STONE = new ItemBase ("sigil_stone");
	
	//Crafting
	public static final Item TAMRIEL_DWARVEN_INGOT = new ItemBase ("tamriel_dwarven_ingot");
	public static final Item TAMRIEL_IRON_INGOT = new ItemBase ("tamriel_iron_ingot");
	public static final Item TAMRIEL_STEEL_INGOT = new ItemBase ("tamriel_steel_ingot");
	public static final Item TAMRIEL_EBONY_INGOT = new ItemBase ("tamriel_ebony_ingot");
	public static final Item TAMRIEL_MITHRIL_INGOT = new ItemBase ("tamriel_mithril_ingot");
	public static final Item TAMRIEL_MOONSTONE_INGOT = new ItemBase ("tamriel_moonstone_ingot");
	public static final Item TAMRIEL_CORUNDUM_INGOT = new ItemBase ("tamriel_corundum_ingot");
	public static final Item TAMRIEL_ORICHALCUM_INGOT = new ItemBase ("tamriel_orichalcum_ingot");
	public static final Item RAW_EBONY = new ItemBase ("raw_ebony");
	public static final Item PROCESSED_EBONY = new ItemBase ("processed_ebony");
	public static final Item DAEDRA_HEART = new ItemBase ("daedra_heart");
	public static final Item RAW_GLASS = new ItemBase ("raw_glass");
	public static final Item RAW_STALHRIM = new ItemBase ("raw_stalhrim");
	
	//Tools
	//Iron
	public static final ItemSword CYRO_IRON_SWORD = new ToolSword ("cyro_iron_sword", MATERIAL_IRON);
	public static final ItemAxe CYRO_IRON_AXE = new ToolAxe ("cyro_iron_axe", MATERIAL_IRON);
	public static final ItemHoe CYRO_IRON_HOE = new ToolHoe ("cyro_iron_hoe", MATERIAL_IRON);
	public static final ItemPickaxe CYRO_IRON_PICKAXE = new ToolPickaxe ("cyro_iron_pickaxe", MATERIAL_IRON);
	public static final ItemSpade CYRO_IRON_SHOVEL = new ToolSpade ("cyro_iron_shovel", MATERIAL_IRON);
	
	//Steel
	public static final ItemSword CYRO_STEEL_SWORD = new ToolSword ("cyro_steel_sword", MATERIAL_STEEL);
	public static final ItemAxe CYRO_STEEL_AXE = new ToolAxe ("cyro_steel_axe", MATERIAL_STEEL);
	public static final ItemHoe CYRO_STEEL_HOE = new ToolHoe ("cyro_steel_hoe", MATERIAL_STEEL);
	public static final ItemPickaxe CYRO_STEEL_PICKAXE = new ToolPickaxe ("cyro_steel_pickaxe", MATERIAL_STEEL);
	public static final ItemSpade CYRO_STEEL_SHOVEL = new ToolSpade ("cyro_steel_shovel", MATERIAL_STEEL);
	
	//Mithril
	public static final ItemSword MITHRIL_SWORD = new ToolSword ("mithril_sword", MATERIAL_MITHRIL);
	public static final ItemAxe MITHRIL_AXE = new ToolAxe ("mithril_axe", MATERIAL_MITHRIL);
	public static final ItemHoe MITHRIL_HOE = new ToolHoe ("mithril_hoe", MATERIAL_MITHRIL);
	public static final ItemPickaxe MITHRIL_PICKAXE = new ToolPickaxe ("mithril_pickaxe", MATERIAL_MITHRIL);
	public static final ItemSpade MITHRIL_SHOVEL = new ToolSpade ("mithril_shovel", MATERIAL_MITHRIL);
	
	//Daedric
	public static final ItemSword DAEDRIC_LONGSWORD = new ToolSword ("daedric_longsword", MATERIAL_DAEDRIC);
	public static final ItemSword DAEDRIC_KATANA = new ToolKatana ("daedric_katana", MATERIAL_DAEDRIC);
	public static final ItemSpade DAEDRIC_SHOVEL = new ToolSpade ("daedric_shovel", MATERIAL_DAEDRIC);
	public static final ItemPickaxe DAEDRIC_PICKAXE = new ToolPickaxe ("daedric_pickaxe", MATERIAL_DAEDRIC);
	public static final ItemAxe DAEDRIC_AXE = new ToolAxe ("daedric_axe", MATERIAL_DAEDRIC);
	public static final ItemHoe DAEDRIC_HOE = new ToolHoe ("daedric_hoe", MATERIAL_DAEDRIC);
	
	//Dwarven
	public static final ItemSword DWARVEN_SWORD = new ToolSword ("dwarven_sword", MATERIAL_DWARVEN);
	public static final ItemSword DWARVEN_MACE = new ToolMace ("dwarven_mace", MATERIAL_DWARVEN);
	public static final ItemPickaxe DWARVEN_PICKAXE = new ToolPickaxe ("dwarven_pickaxe", MATERIAL_DWARVEN);
	public static final ItemAxe DWARVEN_AXE = new ToolAxe ("dwarven_axe", MATERIAL_DWARVEN);
	
	//Orcish
	public static final ItemSword ORCISH_SWORD = new ToolSword ("orcish_sword", MATERIAL_ORCISH);
	public static final ItemSpade ORCISH_SHOVEL = new ToolSpade ("orcish_shovel", MATERIAL_ORCISH);
	public static final ItemPickaxe ORCISH_PICKAXE = new ToolPickaxe ("orcish_pickaxe", MATERIAL_ORCISH);
	public static final ItemAxe ORCISH_AXE = new ToolAxe ("orcish_axe", MATERIAL_ORCISH);
	public static final ItemHoe ORCISH_HOE = new ToolHoe ("orcish_hoe", MATERIAL_ORCISH);
	
	//Ebony
	public static final ItemSword EBONY_BROADSWORD = new ToolSword ("ebony_broadsword", MATERIAL_EBONY);
	public static final ItemSword EBONY_MACE = new ToolMace ("ebony_mace", MATERIAL_EBONY);
	public static final ItemSpade EBONY_SHOVEL = new ToolSpade ("ebony_shovel", MATERIAL_EBONY);
	public static final ItemPickaxe EBONY_PICKAXE = new ToolPickaxe ("ebony_pickaxe", MATERIAL_EBONY);
	public static final ItemAxe EBONY_AXE = new ToolAxe ("ebony_axe", MATERIAL_EBONY);
	public static final ItemHoe EBONY_HOE = new ToolHoe ("ebony_hoe", MATERIAL_EBONY);
	
	//Elven
	public static final ItemSword ELVEN_SWORD = new ToolSword ("elven_sword", MATERIAL_ELVEN);
	public static final ItemAxe ELVEN_AXE = new ToolAxe ("elven_axe", MATERIAL_ELVEN);
	public static final ItemHoe ELVEN_HOE = new ToolHoe ("elven_hoe", MATERIAL_ELVEN);
	public static final ItemPickaxe ELVEN_PICKAXE = new ToolPickaxe ("elven_pickaxe", MATERIAL_ELVEN);
	public static final ItemSpade ELVEN_SHOVEL = new ToolSpade ("elven_shovel", MATERIAL_ELVEN);
	
	//Glass
	public static final ItemSword GLASS_BROADSWORD = new ToolSword ("glass_broadsword", MATERIAL_GLASS);
	public static final ItemAxe GLASS_AXE = new ToolAxe ("glass_axe", MATERIAL_GLASS);
	public static final ItemSpade GLASS_SHOVEL = new ToolSpade ("glass_shovel", MATERIAL_GLASS);
	public static final ItemPickaxe GLASS_PICKAXE = new ToolPickaxe ("glass_pickaxe", MATERIAL_GLASS);
	public static final ItemHoe GLASS_HOE = new ToolHoe ("glass_hoe", MATERIAL_GLASS);
	
	//Artifacts
	public static final ItemSword ART_KEENING = new ToolDagger ("art_keening", MATERIAL_DWARVEN);
	public static final ItemSword ART_CHILLREND = new ToolSword ("art_chillrend", MATERIAL_GLASS);
	public static final ItemSword ART_FORK_OF_HORRIPILATION = new ToolDagger ("art_fork_of_horripilation", MATERIAL_IRON);
	
	//Special
	public static final ItemSword DARK_SEDUCER_SWORD = new ToolSword ("dark_seducer_sword", MATERIAL_EBONY);
	public static final ItemSword GOLDEN_SAINT_SWORD = new ToolSword ("golden_saint_sword", MATERIAL_EBONY);
	
	
	
	//Food
	public static final Item WOT_SWEETROLL = new FoodBase ("wot_sweetroll", 2, 2f, false);
	public static final Item WOT_SALMON_STEAK = new FoodBase ("wot_salmon_steak", 6, 5f, true);
	public static final Item WOT_BEEF_STEW = new FoodBase ("wot_beef_stew", 5, 9.5f, false);
	public static final Item WOT_APPLE_DUMPLING = new FoodBase ("wot_apple_dumpling", 4, 2.5f, false);
	
	
}
