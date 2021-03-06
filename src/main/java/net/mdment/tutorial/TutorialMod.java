package net.mdment.tutorial;

import net.mdment.tutorial.block.ModBlocks;
import net.mdment.tutorial.client.TutorialTab;
import net.mdment.tutorial.item.ModItems;
import net.mdment.tutorial.proxy.CommonProxy;
import net.mdment.tutorial.recipe.ModRecipes;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class TutorialMod {

	public static final String modId = "tutorial";
	public static final String name = "Tutorial Mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static TutorialMod instance;
	
	public static final TutorialTab creativeTab = new TutorialTab();
	
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@SidedProxy(serverSide = "net.mdment.tutorial.proxy.CommonProxy", clientSide = "net.mdment.tutorial.proxy.ClientProxy")
	public static CommonProxy proxy;

}