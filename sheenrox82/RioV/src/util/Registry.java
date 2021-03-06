package sheenrox82.RioV.src.util;

import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.MinecraftForge;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.Crafting;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.Biomes;
import sheenrox82.RioV.src.content.Enchantments;
import sheenrox82.RioV.src.content.EntityLoader;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.event.Events;
import sheenrox82.RioV.src.gui.GuiEosBar;
import sheenrox82.RioV.src.handler.FuelHandler;
import sheenrox82.RioV.src.handler.SoundHandler;
import sheenrox82.RioV.src.recipe.AnvilCraftingManager;
import sheenrox82.RioV.src.registries.HarvestLevelRegistry;
import sheenrox82.RioV.src.registries.LangRegistry;
import sheenrox82.RioV.src.tileentity.TileEntityBloodChest;
import sheenrox82.RioV.src.tileentity.TileEntityCherryBlossomChest;
import sheenrox82.RioV.src.tileentity.TileEntityFlag;
import sheenrox82.RioV.src.tileentity.TileEntityGlimmerwoodChest;
import sheenrox82.RioV.src.tileentity.TileEntityInfuser;
import sheenrox82.RioV.src.tileentity.TileEntityShrine;
import sheenrox82.RioV.src.tileentity.TileEntitySkywoodChest;
import sheenrox82.RioV.src.world.WorldGen;
import sheenrox82.RioV.src.world.provider.WorldProviderBlindOasis;
import sheenrox82.RioV.src.world.provider.WorldProviderFlamonor;
import sheenrox82.RioV.src.world.provider.WorldProviderSanctuatite;
import sheenrox82.RioV.src.world.provider.WorldProviderVaeryn;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class Registry 
{
	public static int render = 3;

	public static void preInit(FMLPreInitializationEvent initEvent)
	{		
		/**Inits and Regs**/
		TheMistsOfRioV.commonProxy.init();
		ModMetadata data = initEvent.getModMetadata();
		data.autogenerated = false;
		data.modId = Util.MOD_ID;
		data.name = Util.MOD_NAME;
		data.logoFile = "/assets/riov/textures/misc/RioV.png";
		data.version = (Util.VERSION);
		data.url = "http://www.minecraftforum.net/user/630621-sheenrox82/";
		data.authorList = Arrays.asList(new String[] {"sheenrox82"});
		data.description = Util.MOD_NAME + " - The imagined world is called RioV, " +
				"in the year of 1301 DoC (Death of Carigon.), the land of RioV is " +
				"filled with Nizonians. A native creature that are basically giant beasts. " +
				"In 1278 DoC the Natives found a new threat across the land called humans, " +
				"another wild creature. Since then, the races have been weakened and new races have " +
				"arrived, such as the dark elves. There is a myth that in 1610 a monster called a " +
				"Soverian Overlord will destroy the land of RioV and leave it in ashes. " +
				"This is The Mists of RioV.";
		Config.initialize(initEvent);
		MinecraftForge.EVENT_BUS.register(new Events());
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
		RioVItems.add();
		RioVBlocks.add();
		Crafting.add();
		Biomes.add();
		Enchantments.add();
		LangRegistry.addNames();
		HarvestLevelRegistry.addHarvestLevels();
		GameRegistry.registerFuelHandler(new FuelHandler());
		GameRegistry.registerTileEntity(TileEntityInfuser.class, "Infuser");
		GameRegistry.registerTileEntity(TileEntityGlimmerwoodChest.class, "GlimmerwoodChest");
		GameRegistry.registerTileEntity(TileEntityCherryBlossomChest.class, "CherryBlossomChest");
		GameRegistry.registerTileEntity(TileEntityBloodChest.class, "BloodChest");
		GameRegistry.registerTileEntity(TileEntitySkywoodChest.class, "SkywoodChest");
		GameRegistry.registerTileEntity(TileEntityShrine.class, "Shrine");
		GameRegistry.registerTileEntity(TileEntityFlag.class, "Flag");
		GameRegistry.registerWorldGenerator(new WorldGen(), 3);
		NetworkRegistry.INSTANCE.registerGuiHandler(TheMistsOfRioV.getInstance(), TheMistsOfRioV.getInstance().guiHandler);
		MethodUtil.registerDimension(Config.blindOasisID, WorldProviderBlindOasis.class);
		MethodUtil.registerDimension(Config.vaerynID, WorldProviderVaeryn.class);
		MethodUtil.registerDimension(Config.flamonorID, WorldProviderFlamonor.class);
		MethodUtil.registerDimension(Config.sanctuatiteID, WorldProviderSanctuatite.class);
		AnvilCraftingManager.instance = new AnvilCraftingManager();
	}

	public static void init(FMLInitializationEvent init)
	{		
		TheMistsOfRioV.commonProxy.cape();
		TheMistsOfRioV.commonProxy.registerItemRenderers();
		EntityLoader.add();
		EntityLoader.addOverworldSpawning();
		EntityLoader.addNetherSpawning();
		EntityLoader.addEndSpawning();
		EntityLoader.addDimensionSpawning();
		ExpansionChecker.check();
		BiomeGenBase.extremeHills.theBiomeDecorator.treesPerChunk = 15;
		BiomeGenBase.plains.theBiomeDecorator.treesPerChunk = 1;
		BiomeGenBase.forest.theBiomeDecorator.treesPerChunk = 46;
		BiomeGenBase.plains.theBiomeDecorator.bigMushroomsPerChunk = 1;
		BiomeGenBase.plains.theBiomeDecorator.flowersPerChunk = 30;
	}

	public static void postInit(FMLPostInitializationEvent postInit)
	{
		FMLLog.info("[" + Util.MOD_NAME + "] Loading...");
		if (FMLCommonHandler.instance().getEffectiveSide().isClient())
		{
			MinecraftForge.EVENT_BUS.register(new GuiEosBar(Minecraft.getMinecraft()));
		}

		BiomeDictionary.registerAllBiomes();
		Config.initPost();
		FMLLog.info("[" + Util.MOD_NAME + "] Loaded! Have fun!");
	}
}
