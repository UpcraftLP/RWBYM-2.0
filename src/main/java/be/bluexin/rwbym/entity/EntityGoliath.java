package be.bluexin.rwbym.entity;

        import be.bluexin.rwbym.ModLootTables;
        import net.minecraft.entity.*;
        import net.minecraft.entity.ai.*;
        import net.minecraft.entity.monster.EntityIronGolem;
        import net.minecraft.entity.monster.EntityMob;
        import net.minecraft.entity.monster.EntitySilverfish;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.init.SoundEvents;
        import net.minecraft.util.ResourceLocation;
        import net.minecraft.util.SoundEvent;
        import net.minecraft.world.World;

public class EntityGoliath extends EntityMob
{

    World world = null;

    public EntityGoliath(World var1) {
        super(var1);
        world = var1;
        this.setSize(3.95F, 3.95F);
    }

    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIAttackMelee(this, 1.0D, false));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityIronGolem.class, true));
    }

    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.44D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(60.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(1000.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(5.0D);
    }



    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ILLAGER;
    }

    protected ResourceLocation getLootTable() {
        return ModLootTables.Boss;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT;
    }

    protected SoundEvent getHurtSound() {
        return SoundEvents.ENTITY_SQUID_DEATH;
    }


    protected net.minecraft.util.SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_ELDER_GUARDIAN_DEATH;
    }

    @Override
    protected float getSoundVolume() {
        return 1.0F;
    }


}