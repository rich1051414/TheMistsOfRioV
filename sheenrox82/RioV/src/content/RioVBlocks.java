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
	public static Block onyxOre = new BlockCoreOne().func_149663_c("onyxOre");
	public static Block garnetOre = new BlockCoreOne().func_149663_c("garnetOre");
	public static Block infuser = new BlockInfuser(true).func_149663_c("infuser");
	public static Block slate = new BlockCoreOne().func_149663_c("slate");
	public static Block nironiteOre = new BlockCoreOne().func_149663_c("nironiteOre");
	public static Block dragonOre = new BlockCoreOne().func_149663_c("dragonOre");
	public static Block netherCrystal = new BlockCoreOne().func_149663_c("netherCrystal");
	public static Block bloodRock = new BlockBloodRock().func_149663_c("bloodRock");
	public static Block blackDuriiPlant = new BlockPlantCore().func_149663_c("blackDuriiPlant");
	public static Block tomatoPlant = new BlockPlantCore().func_149663_c("tomatoPlant");
	public static Block grapePlant = new BlockPlantCore().func_149663_c("grapePlant");
	public static Block onyxBlock = new BlockCoreOne().func_149663_c("onyxBlock");
	public static Block amethystBlock = new BlockCoreOne().func_149663_c("amethystBlock");
	public static Block garnetBlock = new BlockCoreOne().func_149663_c("garnetBlock");
	public static Block nironiteBlock = new BlockCoreOne().func_149663_c("nironiteBlock");
	public static Block dragonBlock = new BlockCoreOne().func_149663_c("dragonBlock");
	public static Block plankColored = new BlockPlanks().func_149663_c("plankColored");
	public static Block glimmerwoodPlanks = new BlockCoreOne().func_149663_c("glimmerwoodPlanks");
	public static Block cherryPlanks = new BlockCoreOne().func_149663_c("cherryPlanks");
	public static Block skywoodPlanks = new BlockCoreOne().func_149663_c("skywoodPlanks");
	public static Block bloodPlanks = new BlockCoreOne().func_149663_c("bloodPlanks");
	public static Block pepperPlant = new BlockCoreOne().func_149663_c("pepperPlant");
	public static Block amethystOre = new BlockCoreOne().func_149663_c("amethystOre");
	public static Block lamp = new BlockCoreOne().func_149715_a(0.7F).func_149663_c("lamp");
	public static Block blackQuartz = new BlockCoreOne().func_149663_c("blackQuartz");
	public static Block blueFlower = new BlockPlantCore().func_149663_c("blueFlower");
	public static Block blindOasisPortal = new BlockBlindOasisPortal().func_149663_c("blindOasisPortal");
	public static Block blackFire = new BlockBlackFire().func_149663_c("blackFire");
	public static Block blindoniteOre = new BlockCoreOne().func_149663_c("blindoniteOre");
	public static Block blackRock = new BlockCoreOne().func_149663_c("blackRock");
	public static Block whiteStone = new BlockCoreOne().func_149663_c("whiteStone");
	public static Block blindoniteBlock = new BlockCoreOne().func_149663_c("blindoniteBlock");
	public static Block glimmerwoodLeaf = new BlockRioVLeaf().func_149663_c("glimmerwoodLeaf");
	public static Block glimmerwoodLog = new BlockGlimmerwoodLog().func_149663_c("glimmerwoodLog");
	public static Block glimmerwoodSapling = new BlockRioVSapling().func_149663_c("glimmerwoodSapling");
	public static Block glimmerGrass = new BlockGlimmerGrass().func_149663_c("glimmerGrass");
	public static Block glimmerDirt = new BlockCoreOne().func_149663_c("glimmerDirt");
	public static Block vaerynPortal = new BlockVaerynPortal().func_149663_c("vaerynPortal");
	public static Block whiteFire = new BlockWhiteFire().func_149663_c("whiteFire");
	public static Block glimmerwoodWorkbench = new BlockRioVWorkbench().func_149663_c("glimmerwoodWorkbench");
	public static Block vraviniteOre = new BlockCoreOne().func_149663_c("vraviniteOre");
	public static Block glimmerwoodFence = new BlockRioVFence("glimmerwoodPlanks").func_149663_c("glimmerwoodFence");
	public static Block glimmerwoodFenceGate = new BlockRioVFenceGate().func_149663_c("glimmerwoodFenceGate");
	public static Block glimmerRock = new BlockCoreOne().func_149663_c("glimmerRock");
	public static Block glimmerwoodDoor = new BlockRioVDoor().func_149663_c("glimmerwoodDoor");
	public static Block glimmerwoodLadder = new BlockRioVLadder().func_149663_c("glimmerwoodLadder");
	public static Block glimmerwoodTrapdoor = new BlockRioVTrapDoor().func_149663_c("glimmerwoodTrapdoor");
	public static Block bloodGrass = new BlockBloodGrass().func_149663_c("bloodGrass");
	public static Block bloodDirt = new BlockCoreOne().func_149663_c("bloodDirt");
	public static Block flamonorPortal = new BlockFlamonorPortal().func_149663_c("flamonorPortal");
	public static Block flamonorRock = new BlockCoreOne().func_149663_c("flamonorRock");
	public static Block redFire = new BlockRedFire().func_149663_c("redFire");
	public static Block drakiuzOre = new BlockCoreOne().func_149663_c("drakiuzOre");
	public static Block glimmerwoodChest = new BlockGlimmerwoodChest(0).func_149663_c("glimmerwoodChest");
	public static Block slateCobble = new BlockCoreOne().func_149663_c("slateCobble");
	public static Block slateBricks = new BlockCoreOne().func_149663_c("slateBricks");
	public static Block cherryLeaf = new BlockRioVLeaf().func_149663_c("cherryLeaf");
	public static Block cherryLog = new BlockCherryLog().func_149663_c("cherryLog");
	public static Block cherryBlossomSapling = new BlockRioVSapling().func_149663_c("cherryBlossomSapling");
	public static Block cherryWorkbench = new BlockRioVWorkbench().func_149663_c("cherryWorkbench");
	public static Block cherryBlossomFence = new BlockRioVFence("cherryPlanks").func_149663_c("cherryBlossomFence");
	public static Block cherryBlossomFenceGate = new BlockRioVFenceGate().func_149663_c("cherryBlossomFenceGate");
	public static Block cherryBlossomDoor = new BlockRioVDoor().func_149663_c("cherryBlossomDoor");
	public static Block cherryBlossomLadder = new BlockRioVLadder().func_149663_c("cherryBlossomLadder");
	public static Block cherryBlossomTrapdoor = new BlockRioVTrapDoor().func_149663_c("cherryBlossomTrapdoor");
	public static Block cherryBlossomChest = new BlockCherryBlossomChest().func_149663_c("cherryBlossomChest");
	public static Block paleLeaf = new BlockRioVLeaf().func_149663_c("paleLeaf");
	public static Block bloodLog = new BlockBloodLog().func_149663_c("bloodLog");
	public static Block bloodSapling = new BlockRioVSapling().func_149663_c("bloodSapling");
	public static Block sanctuatiteMoving = new BlockSanctuatiteFlowing().func_149663_c("sanctuatiteMoving");
	public static Block sanctuatiteStill = new BlockSancuatiteStill().func_149663_c("sanctuatiteStill");
	public static Block sanctuatitePortal = new BlockSanctuatitePortal().func_149663_c("sanctuatitePortal");
	public static Block sanctuatiteFire = new BlockSanctuatiteFire().func_149663_c("sanctuatiteFire");
	public static Block sanctuatiteGrass = new BlockSanctuatiteGrass().func_149663_c("sanctuatiteGrass");
	public static Block sanctuatiteDirt = new BlockRioVLadder().func_149663_c("sanctuatiteDirt");
	public static Block sanctuatiteTallGrass = new BlockRioVLadder().func_149663_c("sanctuatiteTallGrass");
	public static Block sanctuaryStone = new BlockRioVLadder().func_149663_c("sanctuaryStone");
	public static Block skycloud = new BlockSkycloud().func_149663_c("skycloud");
	public static Block skywoodLog = new BlockSkywoodLog().func_149663_c("skywoodLog");
	public static Block skywoodSapling = new BlockRioVSapling().func_149663_c("skywoodSapling");
	public static Block bloodWorkbench = new BlockRioVWorkbench().func_149663_c("bloodWorkbench");
	public static Block bloodFence = new BlockRioVFence("bloodPlanks").func_149663_c("bloodFence");
	public static Block bloodFenceGate = new BlockRioVFenceGate().func_149663_c("bloodFenceGate");
	public static Block bloodDoor = new BlockRioVDoor().func_149663_c("bloodDoor");
	public static Block bloodLadder = new BlockRioVLadder().func_149663_c("bloodLadder");
	public static Block bloodTrapdoor = new BlockRioVTrapDoor().func_149663_c("bloodTrapdoor");
	public static Block bloodChest = new BlockBloodChest().func_149663_c("bloodChest");
	public static Block skywoodWorkbench = new BlockRioVWorkbench().func_149663_c("skywoodWorkbench");
	public static Block skywoodFence = new BlockRioVFence("skywoodPlanks").func_149663_c("skywoodFence");
	public static Block skywoodFenceGate = new BlockRioVFenceGate().func_149663_c("skywoodFenceGate");
	public static Block skywoodDoor = new BlockRioVDoor().func_149663_c("skywoodDoor");
	public static Block skywoodLadder = new BlockRioVLadder().func_149663_c("skywoodLadder");
	public static Block skywoodTrapdoor = new BlockRioVTrapDoor().func_149663_c("skywoodTrapdoor");
	public static Block skywoodChest = new BlockSkywoodChest().func_149663_c("skywoodChest");
	public static Block alerisOre = new BlockCoreOne().func_149663_c("alerisOre");
	public static Block anvil = new BlockAnvil().func_149663_c("anvil");
	public static Block voidMoving = new BlockVoidFlowing().func_149663_c("voidMoving");
	public static Block voidStill = new BlockVoidStill().func_149663_c("voidStill");
	public static Block blueBerryBush = new BlockBush().func_149663_c("blueBerryBush");
	public static Block raspBerryBush = new BlockBush().func_149663_c("raspBerryBush");
	public static Block blackBerryBush = new BlockBush().func_149663_c("blackBerryBush");
	public static Block strawberryBush = new BlockBush().func_149663_c("strawberryBush");
	public static Block bush = new BlockBush().func_149663_c("bush");
	public static Block bloodBerryBush = new BlockBush().func_149663_c("bloodBerryBush");
	public static Block jaavikOre = new BlockCoreOne().func_149663_c("jaavikOre");
	public static Block jaavikBlock = new BlockRioVLadder().func_149663_c("jaavikBlock");
	public static Block steamingBloodDeposit = new BlockBloodRock().func_149663_c("steamingBloodDeposit");
	public static Block alerisBlock = new BlockCoreOne().func_149663_c("alerisBlock");
	public static Block drakiuzBlock = new BlockCoreOne().func_149663_c("drakiuzBlock");
	public static Block crackedSlateBricks = new BlockCoreOne().func_149663_c("crackedSlateBricks");
	public static Block bricks = new BlockBricks().func_149663_c("bricks");
	public static Block vraviniteBlock = new BlockCoreOne().func_149663_c("vraviniteBlock");
	public static Block stainedGlass = new BlockStainedGlass().func_149663_c("stainedGlass");
	public static Block bloodFlower = new BlockPlantCore().func_149663_c("bloodFlower");
	public static Block paleBush = new BlockBush().func_149663_c("paleBush");
	public static Block shrine = new BlockShrine().func_149663_c("shrine");
	public static Block chocolateCake = new BlockRioVCake().func_149663_c("chocolateCake");
	public static Block flag = (new BlockFlag()).func_149663_c("flag");

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