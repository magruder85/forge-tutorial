package net.mdment.tutorial.recipe;

import net.mdment.tutorial.item.ModItems;
import net.mdment.tutorial.block.ModBlocks;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed, 10), ModItems.corn);
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_STEW), " R ", "CPM", " B ", 'R', Items.COOKED_RABBIT, 'C', ModItems.corn, 'P', Items.BAKED_POTATO, 'M', Blocks.BROWN_MUSHROOM, 'B', Items.BOWL);
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);

	}

}
