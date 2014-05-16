package com.rehven.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import com.rehven.testmod.Blocks.ModBlocks;
import com.rehven.testmod.Items.ItemSuperShovel;
import com.rehven.testmod.Recipes.ModRecipes;
import com.rehven.testmod.References.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, version=References.MODVERSION, name=References.MODNAME)
public class TestMod 
{
	//New creative tab for us
	public static CreativeTabs tabCustom = new CreativeTabs("tabCustom") 
	{
	    public ItemStack getIconItemStack() 
	    {
	    return new ItemStack(Blocks.anvil, 1, 0);
	    }

		@Override
		public Item getTabIconItem() {
			return null;
		}
	};
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModBlocks.RegisterModBlocks();	
		ToolMaterial m = EnumHelper.addToolMaterial("lol", 1, 10, 0.5f, 0.1f, 1);
	}
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		//Register Recipes
		ModRecipes.RegisterModRecipes();
	}
}
