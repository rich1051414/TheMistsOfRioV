package sheenrox82.RioV.src.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.util.MethodUtil;
import sheenrox82.RioV.src.util.Util;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RioVConsumable extends ItemFood
{
	public int foodEffectRand;

	public RioVConsumable(int par2, float par3, boolean par4)
	{
		super(par2, par3, par4);
		this.setCreativeTab(TheMistsOfRioV.getInstance().tab);
	}

	@Override
	public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer entityPlayer)
	{
		if(itemStack.getItem().equals(RioVItems.blackDurii))
		{
			--itemStack.stackSize;
			entityPlayer.getFoodStats().func_151686_a(this, itemStack);
			world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 10 * 20, 2));//again, sets effect an time
			entityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 50, 2));
			this.onFoodEaten(itemStack, world, entityPlayer);
			return itemStack;
		}

		if(itemStack.getItem().equals(RioVItems.blueMagicApple))
		{
			--itemStack.stackSize;
			entityPlayer.getFoodStats().func_151686_a(this, itemStack);
			world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

			entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 3));//again, sets effect an time
			entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 3));
			this.onFoodEaten(itemStack, world, entityPlayer);
			return itemStack;
		}
		
		if(TheMistsOfRioV.getInstance().aether)
		{
			if(itemStack.getItem().equals(RioVItems.magicalBlueBerry))
			{
				--itemStack.stackSize;
				entityPlayer.getFoodStats().func_151686_a(this, itemStack);
				world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);

				entityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 3));//again, sets effect an time
				entityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 300, 3));
				this.onFoodEaten(itemStack, world, entityPlayer);
				return itemStack;
			}
		}

		--itemStack.stackSize;
		entityPlayer.getFoodStats().func_151686_a(this, itemStack);
		world.playSoundAtEntity(entityPlayer, "random.burp", 0.5F, world.rand.nextFloat() * 0.1F + 0.9F);
		this.onFoodEaten(itemStack, world, entityPlayer);
		return itemStack;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInformation(ItemStack var1, EntityPlayer var2, List var3, boolean var4)
	{
		if (var1.getItem().equals(RioVItems.manchet))
		{
			var3.add(StatCollector.translateToLocal("A fine, white bread"));
		}
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack)
	{
		if (par1ItemStack.getItem().equals(RioVItems.blueMagicApple))
		{
			return true;
		}
		
		if(TheMistsOfRioV.getInstance().aether)
		{
			if(par1ItemStack.getItem().equals(RioVItems.magicalBlueBerry))
			{
				return true;
			}
		}

		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + MethodUtil.getName(this.getUnlocalizedName()));
	}
}
