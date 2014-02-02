package sheenrox82.RioV.src.entity.mob.core;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import sheenrox82.RioV.src.base.Config;

public class EntityMobDeadBody extends EntityMob
{
	public int counter;
	public int countdown;
	public boolean justJumped;

	public EntityMobDeadBody(World par1World)
	{
		super(par1World);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
	}

	@Override
	protected void onDeathUpdate()
	{
		if(Config.deadBodies)
		{
			++this.deathTime;
			int i;
			i = this.getExperiencePoints(this.attackingPlayer);

			if (this.deathTime == 20)
			{
				if (!this.worldObj.isRemote && (this.recentlyHit > 0 || this.isPlayer()) && !this.isChild() && this.worldObj.getGameRules().getGameRuleBooleanValue("doMobLoot"))
				{

					while (i > 0)
					{
						int j = EntityXPOrb.getXPSplit(i);
						i -= j;
						this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
					}

					for (i = 0; i < 20; ++i)
					{
						double d0 = this.rand.nextGaussian() * 0.02D;
						double d1 = this.rand.nextGaussian() * 0.02D;
						double d2 = this.rand.nextGaussian() * 0.02D;
						this.worldObj.spawnParticle("explode", this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2);
					}
				}
			}
			if(this.deathTime >= 1000)
			{
				this.setDead();
			}
		}
	}
}
