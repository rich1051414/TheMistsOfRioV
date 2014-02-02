package sheenrox82.RioV.src.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.common.eventhandler.Event;

public class RioVVoidHolder extends ItemBucket
{
	private Block isFull;

	public RioVVoidHolder(Block par2)
	{
		super(par2);
		this.maxStackSize = 1;
		this.isFull = par2;
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		 boolean flag = this.isFull == Blocks.air;
	        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, flag);

	        if (movingobjectposition == null)
	        {
	            return par1ItemStack;
	        }
	        else
	        {
	            FillBucketEvent event = new FillBucketEvent(par3EntityPlayer, par1ItemStack, par2World, movingobjectposition);
	            if (MinecraftForge.EVENT_BUS.post(event))
	            {
	                return par1ItemStack;
	            }

	            if (event.getResult() == Event.Result.ALLOW)
	            {
	                if (par3EntityPlayer.capabilities.isCreativeMode)
	                {
	                    return par1ItemStack;
	                }

	                if (--par1ItemStack.stackSize <= 0)
	                {
	                    return event.result;
	                }

	                if (!par3EntityPlayer.inventory.addItemStackToInventory(event.result))
	                {
	                    par3EntityPlayer.dropPlayerItemWithRandomChoice(event.result, false);
	                }

	                return par1ItemStack;
	            }
	            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
	            {
	                int i = movingobjectposition.blockX;
	                int j = movingobjectposition.blockY;
	                int k = movingobjectposition.blockZ;

	                if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
	                {
	                    return par1ItemStack;
	                }

	                if (flag)
	                {
	                    if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	                    {
	                        return par1ItemStack;
	                    }

	                    Material material = par2World.func_147439_a(i, j, k).func_149688_o();
	                    int l = par2World.getBlockMetadata(i, j, k);

	                    if (material == Material.field_151586_h && l == 0)
	                    {
	                        par2World.func_147468_f(i, j, k);
	                        return this.func_150910_a(par1ItemStack, par3EntityPlayer, RioVItems.voidHolderFilled);
	                    }
	                }
	                else
	                {
	                    if (this.isFull == Blocks.air)
	                    {
	                        return new ItemStack(Items.bucket);
	                    }

	                    if (movingobjectposition.sideHit == 0)
	                    {
	                        --j;
	                    }

	                    if (movingobjectposition.sideHit == 1)
	                    {
	                        ++j;
	                    }

	                    if (movingobjectposition.sideHit == 2)
	                    {
	                        --k;
	                    }

	                    if (movingobjectposition.sideHit == 3)
	                    {
	                        ++k;
	                    }

	                    if (movingobjectposition.sideHit == 4)
	                    {
	                        --i;
	                    }

	                    if (movingobjectposition.sideHit == 5)
	                    {
	                        ++i;
	                    }

	                    if (!par3EntityPlayer.canPlayerEdit(i, j, k, movingobjectposition.sideHit, par1ItemStack))
	                    {
	                        return par1ItemStack;
	                    }

	                    if (this.tryPlaceContainedLiquid(par2World, i, j, k) && !par3EntityPlayer.capabilities.isCreativeMode)
	                    {
	                        return new ItemStack(RioVItems.voidHolder);
	                    }
	                }
	            }

	            return par1ItemStack;
	        }
	}

	private ItemStack func_150910_a(ItemStack p_150910_1_, EntityPlayer p_150910_2_, Item p_150910_3_)
    {
        if (p_150910_2_.capabilities.isCreativeMode)
        {
            return p_150910_1_;
        }
        else if (--p_150910_1_.stackSize <= 0)
        {
            return new ItemStack(p_150910_3_);
        }
        else
        {
            if (!p_150910_2_.inventory.addItemStackToInventory(new ItemStack(p_150910_3_)))
            {
                p_150910_2_.dropPlayerItemWithRandomChoice(new ItemStack(p_150910_3_, 1, 0), false);
            }

            return p_150910_1_;
        }
    }
	
	public boolean tryPlaceContainedLiquid(World par1World, int par2, int par3, int par4)
    {
        if (this.isFull == Blocks.air)
        {
            return false;
        }
        else
        {
            Material material = par1World.func_147439_a(par2, par3, par4).func_149688_o();
            boolean flag = !material.isSolid();

            if (!par1World.func_147437_c(par2, par3, par4) && !flag)
            {
                return false;
            }
            else
            {
                if (par1World.provider.isHellWorld && this.isFull == RioVBlocks.voidMoving)
                {
                    par1World.playSoundEffect((double)((float)par2 + 0.5F), (double)((float)par3 + 0.5F), (double)((float)par4 + 0.5F), "random.fizz", 0.5F, 2.6F + (par1World.rand.nextFloat() - par1World.rand.nextFloat()) * 0.8F);

                    for (int l = 0; l < 8; ++l)
                    {
                        par1World.spawnParticle("largesmoke", (double)par2 + Math.random(), (double)par3 + Math.random(), (double)par4 + Math.random(), 0.0D, 0.0D, 0.0D);
                    }
                }
                else
                {
                    if (!par1World.isRemote && flag && !material.isLiquid())
                    {
                        par1World.func_147480_a(par2, par3, par4, true);
                    }

                    par1World.func_147465_d(par2, par3, par4, this.isFull, 0, 3);
                }

                return true;
            }
        }
    }

	@Override
	public void registerIcons(IIconRegister i)
	{
		this.itemIcon = i.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}
}
