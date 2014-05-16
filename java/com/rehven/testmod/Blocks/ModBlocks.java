package com.rehven.testmod.Blocks;

import java.util.HashSet;
import java.util.Set;

import com.rehven.testmod.References.References;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
	//List of blocks to register
	private static Set<Block> modBlocksList = new HashSet<Block>();
	
	public static void RegisterModBlocks()
	{
		//Create mod blocks
		modBlocksList.add(new BlockTestOre());
		modBlocksList.add(new BlockIrrigationPipe());

		//Add all mod blocks to the game
		for (Block thisBlock : modBlocksList) {
			if (GameRegistry.registerBlock(thisBlock, thisBlock.getUnlocalizedName()) != null)
			{
				System.out.println(References.MODNAME + ": REGISTERMODBLOCKS : Block " + thisBlock.getUnlocalizedName().substring(5) + " registered.");
			}
			else
			{
				System.out.println(References.MODNAME + ": REGISTERMODBLOCKS : Block " + thisBlock.getUnlocalizedName().substring(5) + " NOT registered.");
			}
		}
	}
}
