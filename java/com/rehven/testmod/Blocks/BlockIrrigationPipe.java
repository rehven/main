package com.rehven.testmod.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import com.rehven.testmod.TestMod;
import com.rehven.testmod.References.References;

public class BlockIrrigationPipe extends Block
{
	public BlockIrrigationPipe()
	{
		super(Material.rock);
		setBlockName("irrigationPipe");
		setBlockTextureName(References.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(TestMod.tabCustom);
		
		//Set mining level; 2=wood
		setHardness(2.0f);
	}
	
	//Drop itself when broken
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }
	
	//Prevent Minecraft from drawing this block, since we're doing a custom renderer
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}
	public boolean isOpaque()
	{
		return false;
	}
}
