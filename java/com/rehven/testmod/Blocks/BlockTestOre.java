package com.rehven.testmod.Blocks;

import java.util.Random;

import com.rehven.testmod.TestMod;
import com.rehven.testmod.References.References;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockTestOre extends Block
{
	public BlockTestOre()
	{
		super(Material.rock);
		setBlockName("testOre");
		setBlockTextureName(References.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(TestMod.tabCustom);
		
		//Set mining level; 2=wood
		setHardness(2.0f);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.diamond;
    }
}
