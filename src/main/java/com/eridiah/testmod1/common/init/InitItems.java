package com.eridiah.testmod1.common.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import com.eridiah.testmod1.common.items.ItemBasic;

public class InitItems 
{
	public static Item broken_blade;
	public static Item tin_ingot;

	public static void init() 
	{
		broken_blade = new ItemBasic("broken_blade");
		tin_ingot = new ItemBasic("tin_ingot");
	}
	
	public static void register()
	{
		registerItem(broken_blade);
		registerItem(tin_ingot);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(CreativeTabs.MISC);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
