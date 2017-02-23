package net.mdment.tutorial.client;

import net.mdment.tutorial.TutorialMod;
import net.mdment.tutorial.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super(TutorialMod.modId);
		setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.ingotCopper;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}