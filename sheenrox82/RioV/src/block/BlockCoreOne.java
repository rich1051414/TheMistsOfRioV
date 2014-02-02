package sheenrox82.RioV.src.block;

import sheenrox82.RioV.src.base.TheMistsOfRioV;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCoreOne extends Block
{

	public BlockCoreOne()
	{
		super(Material.field_151566_D);
		this.func_149647_a(TheMistsOfRioV.tab);
	}
	
	/**@Override
	public int idDropped(int par1, Random par2Random, int par3)
	{
		if(blockID == RioVBlocks.onyxOre.blockID)
		{
			return RioVItems.onyx.itemID;
		}
		if(blockID == RioVBlocks.garnetOre.blockID)
		{
			return RioVItems.garnet.itemID;
		}
		if(blockID == RioVBlocks.nironiteOre.blockID)
		{
			return RioVItems.nironite.itemID;
		}
		if(blockID == RioVBlocks.dragonOre.blockID)
		{
			return RioVItems.dragonSoul.itemID;
		}
		if(blockID == RioVBlocks.netherCrystal.blockID)
		{
			return RioVItems.burnedQuartz.itemID;
		}
		if(blockID == RioVBlocks.slate.blockID)
		{
			return RioVBlocks.slateCobble.blockID;
		}
		if(blockID == RioVBlocks.sapphireOre.blockID)
		{
			return RioVItems.sapphire.itemID;
		}
		if(blockID == RioVBlocks.topazOre.blockID)
		{
			return RioVItems.topaz.itemID;
		}
		if(blockID == RioVBlocks.amethystOre.blockID)
		{
			return RioVItems.amethyst.itemID;
		}
		if(blockID == RioVBlocks.blindoniteOre.blockID)
		{
			return RioVItems.blindonite.itemID;
		}
		if(blockID == RioVBlocks.vraviniteOre.blockID)
		{
			return RioVItems.vravinite.itemID;
		}

		if(blockID == RioVBlocks.drakiuzOre.blockID)
		{
			return RioVItems.drakiuz.itemID;
		}

		if(blockID == RioVBlocks.alerisOre.blockID)
		{
			return RioVItems.aleris.itemID;
		}

		if(blockID == RioVBlocks.jaavikOre.blockID)
		{
			return RioVItems.jaavik.itemID;
		}

		return blockID;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + this.getName());
	} 

	public String getName()
	{
		return this.unlocalizedName;
	}

	@Override
	public int quantityDropped(Random par1Random)
	{
		int var2 = par1Random.nextInt(6);

		if(var2 == 0)
		{
			if(blockID == RioVBlocks.onyxOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.garnetOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.nironiteOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.dragonOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.netherCrystal.blockID)
			{
				return 5;
			}
			if(blockID == RioVBlocks.sapphireOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.topazOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.amethystOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.blindoniteOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.vraviniteOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.drakiuzOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.alerisOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.runestone.blockID)
			{
				return 0;
			}
		}

		if(var2 == 1)
		{

			if(blockID == RioVBlocks.onyxOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.garnetOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.nironiteOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.dragonOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.netherCrystal.blockID)
			{
				return 6;
			}
			if(blockID == RioVBlocks.sapphireOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.topazOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.amethystOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.blindoniteOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.vraviniteOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.drakiuzOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.alerisOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.runestone.blockID)
			{
				return 0;
			}
		}

		if(var2 == 3)
		{

			if(blockID == RioVBlocks.onyxOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.garnetOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.nironiteOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.dragonOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.netherCrystal.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.sapphireOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.topazOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.amethystOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.blindoniteOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.vraviniteOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.drakiuzOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.alerisOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.runestone.blockID)
			{
				return 0;
			}
		}

		if(var2 == 4)
		{
			if(blockID == RioVBlocks.onyxOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.garnetOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.nironiteOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.dragonOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.netherCrystal.blockID)
			{
				return 5;
			}
			if(blockID == RioVBlocks.sapphireOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.topazOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.amethystOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.blindoniteOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.vraviniteOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.drakiuzOre.blockID)
			{
				return 0;
			}
			if(blockID == RioVBlocks.alerisOre.blockID)
			{
				return 1;
			}
			if(blockID == RioVBlocks.runestone.blockID)
			{
				return 0;
			}
		}

		if(var2 == 5)
		{
			if(blockID == RioVBlocks.onyxOre.blockID)
			{
				return 4;
			}
			if(blockID == RioVBlocks.garnetOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.nironiteOre.blockID)
			{
				return 4;
			}
			if(blockID == RioVBlocks.dragonOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.netherCrystal.blockID)
			{
				return 7;
			}
			if(blockID == RioVBlocks.sapphireOre.blockID)
			{
				return 4;
			}
			if(blockID == RioVBlocks.topazOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.amethystOre.blockID)
			{
				return 4;
			}
			if(blockID == RioVBlocks.blindoniteOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.vraviniteOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.drakiuzOre.blockID)
			{
				return 2;
			}
			if(blockID == RioVBlocks.alerisOre.blockID)
			{
				return 3;
			}
			if(blockID == RioVBlocks.runestone.blockID)
			{
				return 1;
			}
		}

		return 1;
	}**/
}
