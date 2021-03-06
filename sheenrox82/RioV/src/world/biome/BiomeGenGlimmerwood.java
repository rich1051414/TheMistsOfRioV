package sheenrox82.RioV.src.world.biome;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.world.feature.WorldGenGlimmerWoodTree;
import sheenrox82.RioV.src.world.feature.WorldGenGlimmerWoodTree2;

public class BiomeGenGlimmerwood extends BiomeGenBase
{

	public BiomeGenGlimmerwood(int par1)
	{
		super(par1);
		this.rootHeight = 0.4F;
		this.topBlock = RioVBlocks.glimmerGrass;
		this.fillerBlock = RioVBlocks.glimmerDirt;
		this.setBiomeName("Vaeryn");
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.theBiomeDecorator.treesPerChunk = 8;
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return (WorldGenerator)(par1Random.nextInt(3) == 0 ? new WorldGenGlimmerWoodTree(false) : new WorldGenGlimmerWoodTree2(false));
	}
}