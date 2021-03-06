package sheenrox82.RioV.src.world.biome;

import java.util.Random;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.world.feature.WorldGenSanctuatiteTree;

public class BiomeGenSanctuatite extends BiomeGenBase
{
	public BiomeGenSanctuatite(int par1)
	{
		super(par1);
		this.rootHeight = 0.5F;
		this.topBlock = RioVBlocks.sanctuatiteGrass;
		this.fillerBlock = RioVBlocks.sanctuatiteDirt;
		this.setBiomeName("Sanctuatite");
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.theBiomeDecorator.treesPerChunk = 8;
	}
	
	@Override
    public WorldGenerator getRandomWorldGenForGrass(Random var1)
    {
        return new WorldGenTallGrass(RioVBlocks.sanctuatiteTallGrass, 16);
    }
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        return (WorldGenerator)(par1Random.nextInt(3) == 0 ? new WorldGenSanctuatiteTree(false) : new WorldGenSanctuatiteTree(false));
    }
}