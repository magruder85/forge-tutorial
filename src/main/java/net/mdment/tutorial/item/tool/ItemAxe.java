package net.mdment.tutorial.item.tool;

import net.minecraft.item.Item;
import net.mdment.tutorial.TutorialMod;
import net.mdment.tutorial.item.ItemModelProvider;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {
	
	private String name;
	
	public ItemAxe(ToolMaterial material, String name) {
		
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(TutorialMod.creativeTab);

	}
	
	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
