package sheenrox82.RioV.src.content;

import net.minecraft.block.Block;
import sheenrox82.RioV.src.block.BlockAnvil;
import sheenrox82.RioV.src.block.BlockBlackFire;
import sheenrox82.RioV.src.block.BlockBlindOasisPortal;
import sheenrox82.RioV.src.block.BlockBloodChest;
import sheenrox82.RioV.src.block.BlockBloodGrass;
import sheenrox82.RioV.src.block.BlockBloodLog;
import sheenrox82.RioV.src.block.BlockBloodRock;
import sheenrox82.RioV.src.block.BlockBricks;
import sheenrox82.RioV.src.block.BlockBush;
import sheenrox82.RioV.src.block.BlockCherryBlossomChest;
import sheenrox82.RioV.src.block.BlockCherryLog;
import sheenrox82.RioV.src.block.BlockCoreOne;
import sheenrox82.RioV.src.block.BlockFlag;
import sheenrox82.RioV.src.block.BlockFlamonorPortal;
import sheenrox82.RioV.src.block.BlockGlimmerGrass;
import sheenrox82.RioV.src.block.BlockGlimmerwoodChest;
import sheenrox82.RioV.src.block.BlockGlimmerwoodLog;
import sheenrox82.RioV.src.block.BlockInfuser;
import sheenrox82.RioV.src.block.BlockPlanks;
import sheenrox82.RioV.src.block.BlockPlantCore;
import sheenrox82.RioV.src.block.BlockRedFire;
import sheenrox82.RioV.src.block.BlockRioVCake;
import sheenrox82.RioV.src.block.BlockRioVDoor;
import sheenrox82.RioV.src.block.BlockRioVFence;
import sheenrox82.RioV.src.block.BlockRioVFenceGate;
import sheenrox82.RioV.src.block.BlockRioVLadder;
import sheenrox82.RioV.src.block.BlockRioVLeaf;
import sheenrox82.RioV.src.block.BlockRioVSapling;
import sheenrox82.RioV.src.block.BlockRioVTrapDoor;
import sheenrox82.RioV.src.block.BlockRioVWorkbench;
import sheenrox82.RioV.src.block.BlockSanctuatiteFire;
import sheenrox82.RioV.src.block.BlockSanctuatiteFlowing;
import sheenrox82.RioV.src.block.BlockSanctuatiteGrass;
import sheenrox82.RioV.src.block.BlockSanctuatitePortal;
import sheenrox82.RioV.src.block.BlockSancuatiteStill;
import sheenrox82.RioV.src.block.BlockShrine;
import sheenrox82.RioV.src.block.BlockSkycloud;
import sheenrox82.RioV.src.block.BlockSkywoodChest;
import sheenrox82.RioV.src.block.BlockSkywoodLog;
import sheenrox82.RioV.src.block.BlockStainedGlass;
import sheenrox82.RioV.src.block.BlockVaerynPortal;
import sheenrox82.RioV.src.block.BlockVoidFlowing;
import sheenrox82.RioV.src.block.BlockVoidStill;
import sheenrox82.RioV.src.block.BlockWhiteFire;
import sheenrox82.RioV.src.item.metadata.ItemBlackQuartzBlock;
import sheenrox82.RioV.src.item.metadata.ItemBricks;
import sheenrox82.RioV.src.item.metadata.ItemPlanksColored;
import sheenrox82.RioV.src.item.metadata.ItemStainedGlass;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.common.registry.GameRegistry;

public class RioVBlocks 
{
	public static Block onyxOre = new BlockCoreOne().setBlockName("onyxOre");
	public static Block garnetOre = new BlockCoreOne().setBlockName("garnetOre");
	public static Block infuser = new BlockInfuser(true).setBlockName("infuser");
	public static Block slate = new BlockCoreOne().setBlockName("slate");
	public static Block nironiteOre = new BlockCoreOne().setBlockName("nironiteOre");
	public static Block dragonOre = new BlockCoreOne().setBlockName("dragonOre");
	public static Block netherCrystal = new BlockCoreOne().setBlockName("netherCrystal");
	public static Block bloodRock = new BlockBloodRock().setBlockName("bloodRock");
	public static Block blackDuriiPlant = new BlockPlantCore().setBlockName("blackDuriiPlant");
	public static Block tomatoPlant = new BlockPlantCore().setBlockName("tomatoPlant");
	public static Block grapePlant = new BlockPlantCore().setBlockName("grapePlant");
	public static Block onyxBlock = new BlockCoreOne().setBlockName("onyxBlock");
	public static Block amethystBlock = new BlockCoreOne().setBlockName("amethystBlock");
	public static Block garnetBlock = new BlockCoreOne().setBlockName("garnetBlock");
	public static Block nironiteBlock = new BlockCoreOne().setBlockName("nironiteBlock");
	public static Block dragonBlock = new BlockCoreOne().setBlockName("dragonBlock");
	public static Block plankColored = new BlockPlanks().setBlockName("plankColored");
	public static Block glimmerwoodPlanks = new BlockCoreOne().setBlockName("glimmerwoodPlanks");
	public static Block cherryPlanks = new BlockCoreOne().setBlockName("cherryPlanks");
	public static Block skywoodPlanks = new BlockCoreOne().setBlockName("skywoodPlanks");
	public static Block bloodPlanks = new BlockCoreOne().setBlockName("bloodPlanks");
	public static Block pepperPlant = new BlockPlantCore().setBlockName("pepperPlant");
	public static Block amethystOre = new BlockCoreOne().setBlockName("amethystOre");
	public static Block lamp = new BlockCoreOne().setLightLevel(0.7F).setBlockName("lamp");
	public static Block blackQuartz = new BlockCoreOne().setBlockName("blackQuartz");
	public static Block blueFlower = new BlockPlantCore().setBlockName("blueFlower");
	public static Block blindOasisPortal = new BlockBlindOasisPortal().setBlockName("blindOasisPortal");
	public static Block blackFire = new BlockBlackFire().setBlockName("blackFire");
	public static Block blindoniteOre = new BlockCoreOne().setBlockName("blindoniteOre");
	public static Block blackRock = new BlockCoreOne().setBlockName("blackRock");
	public static Block whiteStone = new BlockCoreOne().setBlockName("whiteStone");
	public static Block blindoniteBlock = new BlockCoreOne().setBlockName("blindoniteBlock");
	public static Block glimmerwoodLeaf = new BlockRioVLeaf().setBlockName("glimmerwoodLeaf");
	public static Block glimmerwoodLog = new BlockGlimmerwoodLog().setBlockName("glimmerwoodLog");
	public static Block glimmerwoodSapling = new BlockRioVSapling().setBlockName("glimmerwoodSapling");
	public static Block glimmerGrass = new BlockGlimmerGrass().setBlockName("glimmerGrass");
	public static Block glimmerDirt = new BlockCoreOne().setBlockName("glimmerDirt");
	public static Block vaerynPortal = new BlockVaerynPortal().setBlockName("vaerynPortal");
	public static Block whiteFire = new BlockWhiteFire().setBlockName("whiteFire");
	public static Block glimmerwoodWorkbench = new BlockRioVWorkbench().setBlockName("glimmerwoodWorkbench");
	public static Block vraviniteOre = new BlockCoreOne().setBlockName("vraviniteOre");
	public static Block glimmerwoodFence = new BlockRioVFence("glimmerwoodPlanks").setBlockName("glimmerwoodFence");
	public static Block glimmerwoodFenceGate = new BlockRioVFenceGate().setBlockName("glimmerwoodFenceGate");
	public static Block glimmerRock = new BlockCoreOne().setBlockName("glimmerRock");
	public static Block glimmerwoodDoor = new BlockRioVDoor().setBlockName("glimmerwoodDoor");
	public static Block glimmerwoodLadder = new BlockRioVLadder().setBlockName("glimmerwoodLadder");
	public static Block glimmerwoodTrapdoor = new BlockRioVTrapDoor().setBlockName("glimmerwoodTrapdoor");
	public static Block bloodGrass = new BlockBloodGrass().setBlockName("bloodGrass");
	public static Block bloodDirt = new BlockCoreOne().setBlockName("bloodDirt");
	public static Block flamonorPortal = new BlockFlamonorPortal().setBlockName("flamonorPortal");
	public static Block flamonorRock = new BlockCoreOne().setBlockName("flamonorRock");
	public static Block redFire = new BlockRedFire().setBlockName("redFire");
	public static Block drakiuzOre = new BlockCoreOne().setBlockName("drakiuzOre");
	public static Block glimmerwoodChest = new BlockGlimmerwoodChest(0).setBlockName("glimmerwoodChest");
	public static Block slateCobble = new BlockCoreOne().setBlockName("slateCobble");
	public static Block slateBricks = new BlockCoreOne().setBlockName("slateBricks");
	public static Block cherryLeaf = new BlockRioVLeaf().setBlockName("cherryLeaf");
	public static Block cherryLog = new BlockCherryLog().setBlockName("cherryLog");
	public static Block cherryBlossomSapling = new BlockRioVSapling().setBlockName("cherryBlossomSapling");
	public static Block cherryWorkbench = new BlockRioVWorkbench().setBlockName("cherryWorkbench");
	public static Block cherryBlossomFence = new BlockRioVFence("cherryPlanks").setBlockName("cherryBlossomFence");
	public static Block cherryBlossomFenceGate = new BlockRioVFenceGate().setBlockName("cherryBlossomFenceGate");
	public static Block cherryBlossomDoor = new BlockRioVDoor().setBlockName("cherryBlossomDoor");
	public static Block cherryBlossomLadder = new BlockRioVLadder().setBlockName("cherryBlossomLadder");
	public static Block cherryBlossomTrapdoor = new BlockRioVTrapDoor().setBlockName("cherryBlossomTrapdoor");
	public static Block cherryBlossomChest = new BlockCherryBlossomChest().setBlockName("cherryBlossomChest");
	public static Block paleLeaf = new BlockRioVLeaf().setBlockName("paleLeaf");
	public static Block bloodLog = new BlockBloodLog().setBlockName("bloodLog");
	public static Block bloodSapling = new BlockRioVSapling().setBlockName("bloodSapling");
	public static Block sanctuatiteMoving = new BlockSanctuatiteFlowing().setBlockName("sanctuatiteMoving");
	public static Block sanctuatiteStill = new BlockSancuatiteStill().setBlockName("sanctuatiteStill");
	public static Block sanctuatitePortal = new BlockSanctuatitePortal().setBlockName("sanctuatitePortal");
	public static Block sanctuatiteFire = new BlockSanctuatiteFire().setBlockName("sanctuatiteFire");
	public static Block sanctuatiteGrass = new BlockSanctuatiteGrass().setBlockName("sanctuatiteGrass");
	public static Block sanctuatiteDirt = new BlockRioVLadder().setBlockName("sanctuatiteDirt");
	public static Block sanctuatiteTallGrass = new BlockRioVLadder().setBlockName("sanctuatiteTallGrass");
	public static Block sanctuaryStone = new BlockRioVLadder().setBlockName("sanctuaryStone");
	public static Block skycloud = new BlockSkycloud().setBlockName("skycloud");
	public static Block skywoodLog = new BlockSkywoodLog().setBlockName("skywoodLog");
	public static Block skywoodSapling = new BlockRioVSapling().setBlockName("skywoodSapling");
	public static Block bloodWorkbench = new BlockRioVWorkbench().setBlockName("bloodWorkbench");
	public static Block bloodFence = new BlockRioVFence("bloodPlanks").setBlockName("bloodFence");
	public static Block bloodFenceGate = new BlockRioVFenceGate().setBlockName("bloodFenceGate");
	public static Block bloodDoor = new BlockRioVDoor().setBlockName("bloodDoor");
	public static Block bloodLadder = new BlockRioVLadder().setBlockName("bloodLadder");
	public static Block bloodTrapdoor = new BlockRioVTrapDoor().setBlockName("bloodTrapdoor");
	public static Block bloodChest = new BlockBloodChest().setBlockName("bloodChest");
	public static Block skywoodWorkbench = new BlockRioVWorkbench().setBlockName("skywoodWorkbench");
	public static Block skywoodFence = new BlockRioVFence("skywoodPlanks").setBlockName("skywoodFence");
	public static Block skywoodFenceGate = new BlockRioVFenceGate().setBlockName("skywoodFenceGate");
	public static Block skywoodDoor = new BlockRioVDoor().setBlockName("skywoodDoor");
	public static Block skywoodLadder = new BlockRioVLadder().setBlockName("skywoodLadder");
	public static Block skywoodTrapdoor = new BlockRioVTrapDoor().setBlockName("skywoodTrapdoor");
	public static Block skywoodChest = new BlockSkywoodChest().setBlockName("skywoodChest");
	public static Block alerisOre = new BlockCoreOne().setBlockName("alerisOre");
	public static Block anvil = new BlockAnvil().setBlockName("anvil");
	public static Block voidMoving = new BlockVoidFlowing().setBlockName("voidMoving");
	public static Block voidStill = new BlockVoidStill().setBlockName("voidStill");
	public static Block blueBerryBush = new BlockBush().setBlockName("blueBerryBush");
	public static Block raspBerryBush = new BlockBush().setBlockName("raspBerryBush");
	public static Block blackBerryBush = new BlockBush().setBlockName("blackBerryBush");
	public static Block strawberryBush = new BlockBush().setBlockName("strawberryBush");
	public static Block bush = new BlockBush().setBlockName("bush");
	public static Block bloodBerryBush = new BlockBush().setBlockName("bloodBerryBush");
	public static Block jaavikOre = new BlockCoreOne().setBlockName("jaavikOre");
	public static Block jaavikBlock = new BlockRioVLadder().setBlockName("jaavikBlock");
	public static Block steamingBloodDeposit = new BlockBloodRock().setBlockName("steamingBloodDeposit");
	public static Block alerisBlock = new BlockCoreOne().setBlockName("alerisBlock");
	public static Block drakiuzBlock = new BlockCoreOne().setBlockName("drakiuzBlock");
	public static Block crackedSlateBricks = new BlockCoreOne().setBlockName("crackedSlateBricks");
	public static Block bricks = new BlockBricks().setBlockName("bricks");
	public static Block vraviniteBlock = new BlockCoreOne().setBlockName("vraviniteBlock");
	public static Block stainedGlass = new BlockStainedGlass().setBlockName("stainedGlass");
	public static Block bloodFlower = new BlockPlantCore().setBlockName("bloodFlower");
	public static Block paleBush = new BlockBush().setBlockName("paleBush");
	public static Block shrine = new BlockShrine().setBlockName("shrine");
	public static Block chocolateCake = new BlockRioVCake().setBlockName("chocolateCake");
	public static Block flag = (new BlockFlag()).setBlockName("flag");

	public static void add()
	{	
		MethodUtil.registerBlock(flag, "Flag");
		//GameRegistry.registerBlock(stainedGlass, ItemStainedGlass.class, Util.MOD_ID + (stainedGlass.func_149739_a().substring(5)));	
		//GameRegistry.registerBlock(blackQuartz, ItemBlackQuartzBlock.class, Util.MOD_ID + (blackQuartz.func_149739_a().substring(5)));		
		//GameRegistry.registerBlock(bricks, ItemBricks.class, Util.MOD_ID + (bricks.func_149739_a().substring(5)));		
		//GameRegistry.registerBlock(plankColored, ItemPlanksColored.class, Util.MOD_ID + (plankColored.func_149739_a().substring(5)));		
		MethodUtil.registerBlock(steamingBloodDeposit, "Steaming Blood Deposit");
		MethodUtil.registerBlock(bloodBerryBush, "Blood Berry Bush");
		MethodUtil.registerBlock(bloodFlower, "Blood Flower");
		MethodUtil.registerBlock(chocolateCake, "Chocolate Cake");
		MethodUtil.registerBlock(paleBush, "Pale Bush");
		MethodUtil.registerBlock(shrine, "Shrine");
		MethodUtil.registerBlock(drakiuzBlock, "Drakiuz Block");
		MethodUtil.registerBlock(vraviniteBlock, "Vravinite Block");
		MethodUtil.registerBlock(crackedSlateBricks, "Cracked Slate Bricks");
		MethodUtil.registerBlock(alerisBlock, "Aleris Block");
		MethodUtil.registerBlock(glimmerwoodPlanks, "Glimmerwood Planks");
		MethodUtil.registerBlock(cherryPlanks, "Cherry Blossom Planks");
		MethodUtil.registerBlock(skywoodPlanks, "Skywood Planks");
		MethodUtil.registerBlock(bloodPlanks, "Blood Planks");
		MethodUtil.registerBlock(bush, "Bush");
		MethodUtil.registerBlock(blueBerryBush, "Blueberry Bush");
		MethodUtil.registerBlock(raspBerryBush, "Raspberry Bush");
		MethodUtil.registerBlock(blackBerryBush, "Blackberry Bush");
		MethodUtil.registerBlock(strawberryBush, "Strawberry Bush");
		MethodUtil.registerBlock(jaavikBlock, "Jaavik Block");
		MethodUtil.registerBlock(jaavikOre, "Jaavik Ore");
		MethodUtil.registerBlock(voidMoving, "Void Liquid Moving");
		MethodUtil.registerBlock(voidStill, "Void Liquid Still");
		MethodUtil.registerBlock(anvil, "Anvil");
		MethodUtil.registerBlock(alerisOre, "Aleris Ore");
		MethodUtil.registerBlock(bloodChest, "Blood Chest");
		MethodUtil.registerBlock(bloodLadder, "Blood Ladder");
		MethodUtil.registerBlock(bloodTrapdoor, "Blood Trapdoor");
		MethodUtil.registerBlock(bloodFence, "Blood Fence");
		MethodUtil.registerBlock(bloodFenceGate, "Blood Fence Gate");
		MethodUtil.registerBlock(bloodWorkbench, "Blood Workbench");
		MethodUtil.registerBlock(skywoodChest, "Skywood Chest");
		MethodUtil.registerBlock(skywoodLadder, "Skywood Ladder");
		MethodUtil.registerBlock(skywoodTrapdoor, "Skywood Trapdoor");
		MethodUtil.registerBlock(skywoodFence, "Skywood Fence");
		MethodUtil.registerBlock(skywoodFenceGate, "Skywood Fence Gate");
		MethodUtil.registerBlock(skywoodWorkbench, "Skywood Workbench");
		MethodUtil.registerBlock(skycloud, "Skycloud");
		MethodUtil.registerBlock(skywoodLog, "Skywood Log");
		MethodUtil.registerBlock(skywoodSapling, "Skywood Sapling");
		MethodUtil.registerBlock(sanctuaryStone, "Sanctuary Stone");
		MethodUtil.registerBlock(sanctuatiteTallGrass, "Sanctuatite Tall Grass");
		MethodUtil.registerBlock(sanctuatitePortal, "Sanctuatite Portal");
		MethodUtil.registerBlock(sanctuatiteGrass, "Sanctuatite Grass");
		MethodUtil.registerBlock(sanctuatiteDirt, "Sanctuatite Dirt");
		MethodUtil.registerBlock(sanctuatiteFire, "Fire of Flamonor");
		MethodUtil.registerBlock(sanctuatiteMoving, "Sancuatite Moving");
		MethodUtil.registerBlock(sanctuatiteStill, "Sancuatite Still");
		MethodUtil.registerBlock(paleLeaf, "Pale Leaf");
		MethodUtil.registerBlock(bloodLog, "Blood Log");
		MethodUtil.registerBlock(bloodSapling, "Blood Sapling");
		MethodUtil.registerBlock(cherryBlossomChest, "Cherry Blossom Chest");
		MethodUtil.registerBlock(cherryBlossomLadder, "Cherry Blossom Ladder");
		MethodUtil.registerBlock(cherryBlossomTrapdoor, "Cherry Blossom Trapdoor");
		MethodUtil.registerBlock(cherryBlossomFence, "Cherry Blossom Fence");
		MethodUtil.registerBlock(cherryBlossomFenceGate, "Cherry Blossom Fence Gate");
		MethodUtil.registerBlock(cherryWorkbench, "Cherry Blossom Workbench");
		MethodUtil.registerBlock(cherryBlossomSapling, "Cherry Blossom Sapling");
		MethodUtil.registerBlock(cherryLog, "Cherry Blossom Log");
		MethodUtil.registerBlock(cherryLeaf, "Cherry Blossom Leaf");
		MethodUtil.registerBlock(slateBricks, "Slate Bricks");
		MethodUtil.registerBlock(slateCobble, "Cobbleslate");
		MethodUtil.registerBlock(glimmerwoodChest, "Glimmerwood Chest");
		MethodUtil.registerBlock(drakiuzOre, "Drakiuz Ore");
		MethodUtil.registerBlock(flamonorRock, "Flamonor Rock");
		MethodUtil.registerBlock(flamonorPortal, "Flamonor Portal");
		MethodUtil.registerBlock(bloodGrass, "Blood Grass");
		MethodUtil.registerBlock(bloodDirt, "Blood Dirt");
		MethodUtil.registerBlock(glimmerwoodTrapdoor, "Glimmerwood Trapdoor");
		MethodUtil.registerBlock(glimmerwoodLadder, "Glimmerwood Ladder");
		MethodUtil.registerBlock(glimmerRock, "Glimmer Rock");
		MethodUtil.registerBlock(glimmerwoodFenceGate, "Glimmerwood Fence Gate");
		MethodUtil.registerBlock(glimmerwoodFence, "Glimmerwood Fence");
		MethodUtil.registerBlock(vraviniteOre, "Vravinite Ore");
		MethodUtil.registerBlock(glimmerwoodWorkbench, "Glimmerwood Workbench");
		MethodUtil.registerBlock(vaerynPortal, "Vaeryn Portal");
		MethodUtil.registerBlock(whiteFire, "White Fire");
		MethodUtil.registerBlock(glimmerGrass, "Glimmer Grass");
		MethodUtil.registerBlock(glimmerDirt, "Glimmer Dirt");
		MethodUtil.registerBlock(glimmerwoodLeaf, "Glimmerwood Leaf");
		MethodUtil.registerBlock(glimmerwoodLog, "Glimmerwood Log");
		MethodUtil.registerBlock(glimmerwoodSapling, "Glimmerwood Sapling");
		MethodUtil.registerBlock(blindoniteBlock, "Blindonite Block");
		MethodUtil.registerBlock(infuser, "Infuser");
		MethodUtil.registerBlock(blindoniteOre, "Blindonite Ore");
		MethodUtil.registerBlock(blackFire, "Black Fire");
		MethodUtil.registerBlock(blindOasisPortal, "Blind Oasis Portal");
		MethodUtil.registerBlock(blackRock, "Black Stone");
		MethodUtil.registerBlock(blueFlower, "Blue Flower");
		MethodUtil.registerBlock(lamp, "Lamp");
		MethodUtil.registerBlock(amethystOre, "Amethyst Ore");
		MethodUtil.registerBlock(pepperPlant, "Pepper Plant");
		MethodUtil.registerBlock(grapePlant, "Grape Plant");
		MethodUtil.registerBlock(tomatoPlant, "Tomato Plant");
		MethodUtil.registerBlock(onyxOre, "Onyx Ore");
		MethodUtil.registerBlock(blackDuriiPlant, "Black Durii Plant");
		MethodUtil.registerBlock(garnetOre, "Garnet Ore");
		MethodUtil.registerBlock(slate, "Slate");
		MethodUtil.registerBlock(nironiteOre, "Nironite Ore");
		MethodUtil.registerBlock(dragonOre, "Dragon Ore");
		MethodUtil.registerBlock(whiteStone, "White Stone");
		MethodUtil.registerBlock(netherCrystal, "Black Quartz Ore");
		MethodUtil.registerBlock(bloodRock, "Blood Rock");
		MethodUtil.registerBlock(onyxBlock, "Onyx Block");
		MethodUtil.registerBlock(amethystBlock, "Amethyst Block");
		MethodUtil.registerBlock(garnetBlock, "Garnet Block");
		MethodUtil.registerBlock(nironiteBlock, "Nironite Block");
		MethodUtil.registerBlock(dragonBlock, "Dragon Soul Block");
	}
}
