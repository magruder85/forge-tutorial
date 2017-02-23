package net.mdment.tutorial.recipe;

import net.mdment.tutorial.item.ModItems;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed, 10), ModItems.corn);
	}

}
