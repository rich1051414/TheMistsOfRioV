package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBloodGrass extends Block
{
	@SideOnly(Side.CLIENT)
	private IIcon iconGrassTop;
	@SideOnly(Side.CLIENT)
	private IIcon blockIcon;
	
	public BlockBloodGrass()
	{
		super(Material.field_151577_b);
		this.func_149675_a(true);
		this.func_149647_a(TheMistsOfRioV.getInstance().tab);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.iconGrassTop : (par1 == 0 ? RioVBlocks.bloodDirt.func_149733_h(par1) : this.blockIcon);
	}

	public void func_149674_a(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.func_147449_b(p_149674_2_, p_149674_3_, p_149674_4_, RioVBlocks.bloodDirt);
            }
            else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                    int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                    int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;

                    if (p_149674_1_.func_147439_a(i1, j1, k1) == RioVBlocks.bloodGrass && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        p_149674_1_.func_147449_b(i1, j1, k1, RioVBlocks.bloodGrass);
                    }
                }
            }
        }
    }

	@Override
	public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return RioVBlocks.bloodDirt.func_149650_a(0, p_149650_2_, p_149650_3_);
    }

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon func_149673_e(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
	{
		if (par5 == 1)
		{
			return this.iconGrassTop;
		}
		else if (par5 == 0)
		{
			return RioVBlocks.bloodDirt.func_149733_h(par2);
		}
		else
		{

			return this.blockIcon;
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void func_149651_a(IIconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.func_149739_a()) + "Side");
		this.iconGrassTop = par1IconRegister.registerIcon(Util.MOD_ID + ":" + "bloodGrassTop");
	}
}