package dev.errante.tumbril;

import net.minecraft.network.syncher.SynchedEntityData.Builder;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;

public class TumbrilEntity extends Entity {
    private double followDistance = 2.0;

    public TumbrilEntity(EntityType<? extends TumbrilEntity> entityType, Level level) {
        super(entityType, level);
    }

	@Override
	protected void addAdditionalSaveData(ValueOutput output) {
	}

	@Override
	protected void defineSynchedData(Builder entityData) {
	}

	@Override
	public boolean hurtServer(ServerLevel level, DamageSource source, float damage) {
		return false;
	}

	@Override
	protected void readAdditionalSaveData(ValueInput input) {
	}

    public void setFollowDistance(double newDistance) {
        if(newDistance <= 0){
            return;
        }

        this.followDistance = newDistance;
    }
}
