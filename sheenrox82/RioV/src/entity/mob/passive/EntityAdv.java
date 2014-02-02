package sheenrox82.RioV.src.entity.mob.passive;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.base.TheMistsOfRioV;
import sheenrox82.RioV.src.content.RioVItems;
import sheenrox82.RioV.src.content.Sound;
import sheenrox82.RioV.src.entity.mob.core.EntityMobDeadBody;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTun;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTunBodyguard;
import sheenrox82.RioV.src.entity.mob.hostile.EntityAunTunMinion;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDarkElf;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDarkEssence;
import sheenrox82.RioV.src.entity.mob.hostile.EntityDemonAngel;
import sheenrox82.RioV.src.entity.mob.hostile.EntityHellhound;
import sheenrox82.RioV.src.entity.mob.hostile.EntityMage;
import sheenrox82.RioV.src.entity.mob.hostile.EntityPaladin;
import sheenrox82.RioV.src.entity.mob.hostile.EntityTerron;
import sheenrox82.RioV.src.entity.mob.hostile.EntityVravinite;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityAdv extends EntityMobDeadBody
{
	private static ItemStack defaultHeldItem;

	public EntityAdv(World par1World)
	{
		super(par1World);
		isImmuneToFire = false;
		if(TheMistsOfRioV.getInstance().riovValis)
		{
			isImmuneToFire = true;
		}
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(5, new EntityAIWander(this, 0.56D));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAltruEssence.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAunTun.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityHellhound.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAunTunBodyguard.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityAunTunMinion.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityDarkElf.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityDemonAngel.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityMage.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySkeletalHorse.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityTerron.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityZombie.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityGhast.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityGiantZombie.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityMagmaCube.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPigZombie.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntitySilverfish.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityWitch.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityDarkEssence.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityVravinite.class, 0, true));
		targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPaladin.class, 0, true));

		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		tasks.addTask(4, new EntityAIAttackOnCollide(this, 0.56D, true));

		int var1 = this.rand.nextInt(2);
		int var2 = this.rand.nextInt(5);
		int var3 = this.rand.nextInt(4);

		if (var1 == 0)
		{
			if (var2 == 0)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(RioVItems.amethystHelmet));
				this.setCurrentItemOrArmor(3, new ItemStack(RioVItems.amethystChestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(RioVItems.amethystLeggings));
				this.setCurrentItemOrArmor(1, new ItemStack(RioVItems.amethystBoots));
			}
			else if (var2 == 1)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
				this.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
			}
			else if (var2 == 2)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
				this.setCurrentItemOrArmor(3, new ItemStack(Items.iron_chestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
				this.setCurrentItemOrArmor(1, new ItemStack(Items.iron_boots));
			}
			else if (var2 == 3)
			{
				this.setCurrentItemOrArmor(3, new ItemStack(Items.golden_chestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
				this.setCurrentItemOrArmor(1, new ItemStack(Items.golden_boots));
			}
			else if (var2 == 4)
			{
				this.setCurrentItemOrArmor(3, new ItemStack(RioVItems.onyxChestplate));
				this.setCurrentItemOrArmor(4, new ItemStack(Items.iron_helmet));
				this.setCurrentItemOrArmor(2, new ItemStack(Items.iron_leggings));
				this.setCurrentItemOrArmor(1, new ItemStack(RioVItems.onyxBoots));
			}
		}
		else if (var1 == 1)
		{
			if (var3 == 0)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(RioVItems.onyxHelmet));
				this.setCurrentItemOrArmor(3, new ItemStack(RioVItems.onyxChestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(RioVItems.onyxLeggings));
				this.setCurrentItemOrArmor(1, new ItemStack(RioVItems.onyxBoots));
			}
			else if (var3 == 1)
			{
				this.setCurrentItemOrArmor(3, new ItemStack(RioVItems.onyxChestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(RioVItems.onyxLeggings));
				this.setCurrentItemOrArmor(1, new ItemStack(RioVItems.onyxBoots));
			}

			if (var3 == 2)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(RioVItems.onyxHelmet));
				this.setCurrentItemOrArmor(3, new ItemStack(RioVItems.amethystChestplate));
				this.setCurrentItemOrArmor(2, new ItemStack(RioVItems.onyxLeggings));
			}
			else if (var3 == 3)
			{
				this.setCurrentItemOrArmor(4, new ItemStack(RioVItems.amethystHelmet));
				this.setCurrentItemOrArmor(2, new ItemStack(RioVItems.onyxLeggings));
				this.setCurrentItemOrArmor(1, new ItemStack(RioVItems.onyxBoots));
			}

		}
	}

	@Override
	protected void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(16, new Byte((byte)0));
	}

	@Override
	protected boolean isValidLightLevel()
	{
		return true;
	}

	@Override
	public ItemStack getHeldItem()
	{
		return defaultHeldItem;
	}

	static
	{
		defaultHeldItem = new ItemStack(RioVItems.amethystSword);
	}

	@Override
	protected void attackEntity(Entity par1Entity, float par2)
	{

	}

	@Override
	public boolean isAIEnabled()
	{
		return true;
	}

	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
		int var1 = this.rand.nextInt(10);

		if (var1 == 0)
		{
			this.func_145779_a(RioVItems.ambrosia, 1);
		}
		if (var1 == 1)
		{
			this.func_145779_a(RioVItems.amethystSword, 1);
		}
		if (var1 == 2)
		{
		}
		if (var1 == 3)
		{
			this.func_145779_a(RioVItems.greenApple, 1);
		}
		if (var1 == 4)
		{
			this.func_145779_a(RioVItems.greenApple, 1);
		}
		if (var1 == 5)
		{
			this.func_145779_a(RioVItems.manchet, 1);
		}
		if (var1 == 6)
		{
		}
		if (var1 == 7)
		{
		}
		if (var1 == 8)
		{
		}
		if (var1 == 9)
		{
		}

	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.62D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(8.0D);
	}

	/**@Override
	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		par1EntityPlayer.playSound(Sound.hello, 1, 1);

		if(!this.worldObj.isRemote)
			par1EntityPlayer.sendChatToPlayer(ChatMessageComponent.createFromText("Hello to you too, " + par1EntityPlayer.username + "!"));
		return true;
	}**/
	
	@Override
	@SideOnly(Side.CLIENT)
	protected String getLivingSound()
	{
		if(Config.allowBreathing)
		{
			return Sound.exhale;
		}
		
		return null;
	}
}