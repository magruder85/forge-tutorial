package net.mdment.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemBase ingotCopper;
	public static ItemCornSeed cornSeed;
	public static ItemBase corn;

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper"));
		cornSeed = register(new ItemCornSeed());
		corn = register(new ItemBase("corn"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel(item);
		}

		return item;
	}

}