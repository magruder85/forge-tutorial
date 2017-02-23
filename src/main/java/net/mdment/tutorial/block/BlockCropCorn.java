package net.mdment.tutorial.block;

import net.mdment.tutorial.TutorialMod;
import net.mdment.tutorial.item.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropCorn extends BlockCrops {

	public BlockCropCorn() {
		setUnlocalizedName("cropCorn");
		setRegistryName("cropCorn");

		setCreativeTab(TutorialMod.creativeTab);
	}

	@Override
	protected Item getSeed() {
		return ModItems.cornSeed;
	}

	@Override
	protected Item getCrop() {
		return ModItems.corn;
	}

}