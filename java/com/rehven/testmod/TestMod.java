package com.rehven.testmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.rehven.testmod.Blocks.ModBlocks;
import com.rehven.testmod.References.References;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

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
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		ModBlocks.RegisterModBlocks();	
	}
}
