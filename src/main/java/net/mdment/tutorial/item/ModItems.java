package net.mdment.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.mdment.tutorial.TutorialMod;
import net.mdment.tutorial.item.tool.*;

public class ModItems {
	
	public static ItemBase ingotCopper;
	public static ItemCornSeed cornSeed;
	public static ItemCorn corn;
	public static ItemSword copperSword;
	public static ItemHoe copperHoe;
	public static ItemPickaxe copperPickaxe;
	public static ItemShovel copperShovel;
	public static ItemAxe copperAxe;

	public static void init() {
		ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
		cornSeed = register(new ItemCornSeed());
		corn = register(new ItemCorn());
		copperSword = register(new ItemSword(TutorialMod.copperToolMaterial, "copperSword"));
		copperHoe = register(new ItemHoe(TutorialMod.copperToolMaterial, "copperHoe"));
		copperPickaxe = register(new ItemPickaxe(TutorialMod.copperToolMaterial, "copperPickaxe"));
		copperShovel = register(new ItemShovel(TutorialMod.copperToolMaterial, "copperShovel"));
		copperAxe = register(new ItemAxe(TutorialMod.copperToolMaterial, "copperAxe"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		


		return item;
	}

}