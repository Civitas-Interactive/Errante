package dev.errante.tumbril;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class TumbrilEntity extends Entity {
    private double followDistance = 2.0;

    public TumbrilEntity(EntityType<? extends TumbrilEntity> entityType, Level level) {
        super(entityType, level);
    }

    public void setFollowDistance(double newDistance) {
        if(newDistance <= 0){
            return;
        }

        this.followDistance = newDistance;
    }
}
