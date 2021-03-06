package sheenrox82.RioV.src.world.mineable;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenBalance extends WorldGenerator
{
    private Block field_150552_a;
    private int field_150551_b;

    public WorldGenBalance(Block p_i45452_1_)
    {
        this.field_150552_a = p_i45452_1_;
    }

    public void func_150550_a(Block p_150550_1_, int p_150550_2_)
    {
        this.field_150552_a = p_150550_1_;
        this.field_150551_b = p_150550_2_;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int j1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int k1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);

            if (par1World.isAirBlock(i1, j1, k1) && (!par1World.provider.hasNoSky || j1 < 255) && this.field_150552_a.canBlockStay(par1World, i1, j1, k1))
            {
                par1World.setBlock(i1, j1, k1, this.field_150552_a, this.field_150551_b, 2);
            }
        }

        return true;
    }
}