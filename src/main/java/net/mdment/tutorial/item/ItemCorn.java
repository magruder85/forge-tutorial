package net.mdment.tutorial.item;

import net.mdment.tutorial.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCorn extends ItemFood implements ItemModelProvider {

	public ItemCorn() {
		super(3, 0.6f, false);
		setUnlocalizedName("corn");
		setRegistryName("corn");
		setCreativeTab(TutorialMod.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, "corn");
	}



}