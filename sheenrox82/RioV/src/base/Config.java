package sheenrox82.RioV.src.base;

import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config
{

	public static Configuration config;
	
	public static int blockID = 1000;
	public static int itemID = 7000;
	public static int expItemID = 9000;
	public static int biomeBlockID = 200;
	public static int enchantmentID = 80;
	public static int entityID = 8200;
	
	public static String color;
	public static int blindOasisID;
	public static int vaerynID;
	public static int flamonorID;
	public static int sanctuatiteID;
	public static int blindOasisBiomeID;
	public static int glimmerwoodBiomeID;
	public static int snowyMountainsBiomeID;
	public static int savannahBiomeID;
	public static int flamonorBiomeID;
	public static int sanctuatiteBiomeID;
	public static int canopyOasisBiomeID;
	public static int bambooFieldsBiomeID;
	public static int posY;
	public static int posX;
	public static int runesBiomeID;
	public static boolean HUD;
	public static boolean EOS;
	public static boolean showToolInfo;
	public static boolean allowBreathing;
	public static boolean mainMenu;
	public static boolean allowBossSpawning;
	public static boolean deadBodies;
	public static boolean runCapes;

	public static void initialize(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());

		color = config.get("HUD", "The Mists of RioV - vX.X.X Color", "\u00A7f").getString();
		blindOasisID = config.get("Dimension IDs", "Blind Oasis Dimension ID", 11).getInt();
		vaerynID = config.get("Dimension IDs", "Vaeryn Dimension ID", 12).getInt();
		flamonorID = config.get("Dimension IDs", "Flamonor Dimension ID", 13).getInt();
		sanctuatiteID = config.get("Dimension IDs", "Sanctuatite Dimension ID", 14).getInt();
		HUD = config.get("HUD", "Show 'The Mists of RioV - vX.X.X' on screen?", true).getBoolean(HUD);
		EOS = config.get("HUD", "Use the purple Eos bar instead of text?", true).getBoolean(EOS);
		mainMenu = config.get("Misc", "Use the RioV Main Menu? (If Aether II is installed this won't affect anything.)", true).getBoolean(mainMenu);
		allowBreathing = config.get("Misc", "Allow Mob Breathing Sounds? (CLIENT SIDE)", true).getBoolean(allowBreathing);
		blindOasisBiomeID = config.get("Biome IDs", "Blind Oasis Biome ID (Blind Oasis Dimension)", 40).getInt(blindOasisBiomeID);
		glimmerwoodBiomeID = config.get("Biome IDs", "Glimmerwood Biome ID (Vaeryn Dimension)", 41).getInt(glimmerwoodBiomeID);
		snowyMountainsBiomeID = config.get("Biome IDs", "Snowy Mountains Biome ID (Overworld Dimension)", 42).getInt(snowyMountainsBiomeID);
		savannahBiomeID = config.get("Biome IDs", "Savannah Biome ID (Overworld Dimension)", 43).getInt(savannahBiomeID);
		flamonorBiomeID = config.get("Biome IDs", "Flamonor Biome ID (Flamonor Dimension)", 44).getInt(flamonorBiomeID);
		sanctuatiteBiomeID = config.get("Biome IDs", "Sanctuatite Biome ID (Sanctuatite Dimension)", 45).getInt(sanctuatiteBiomeID);
		showToolInfo = config.get("Misc", "Show Tool Info?", true).getBoolean(showToolInfo);
		canopyOasisBiomeID = config.get("Biome IDs", "Canopy Oasis Biome ID (Overworld Dimension)", 46).getInt(canopyOasisBiomeID);
		posX = config.get("HUD", "Position X of the 'The Mists of RioV - vX.X.X'", 2).getInt(posX);
		posY = config.get("HUD", "Position Y of the 'The Mists of RioV - vX.X.X'", 2).getInt(posY);
		allowBossSpawning = config.get("Misc", "Allow Pig, Cow, Chicken, and Sheep Boss Spawning?", true).getBoolean(allowBossSpawning);
		deadBodies = config.get("Misc", "Allow Dead Bodies for mobs?", true).getBoolean(deadBodies);
		runCapes = config.get("Misc", "(Mainly for people running Optifine that have capes) Allow RioV Capes to initialize?", true).getBoolean(runCapes);

		config.load();
	}

	public static int addItem(String name)
	{
		itemID++;

		return config.get("Items", name, itemID).getInt();
	}
	
	public static int addExpansionItem(String name)
	{
		expItemID++;

		return config.get("Items", name, expItemID).getInt();
	}

	public static int addBlock(String name)
	{
		blockID++;

		return config.get("Blocks", name, blockID).getInt();
	}
	
	public static int addBiomeBlock(String name)
	{
		biomeBlockID++;

		return config.get("Blocks", name, biomeBlockID).getInt();
	}

	public static int addEnchantment(String name)
	{
		enchantmentID++;

		return config.get("Enchantments", name, enchantmentID).getInt();
	}

	public static int addEntity(String name)
	{
		entityID++;

		return config.get("Entities", name, entityID).getInt() - 1;
	}
	
	public static void initPost()
	{
		config.save();
	}
}