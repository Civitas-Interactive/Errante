package dev.errante.tumbril;

import dev.errante.Errante;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.core.Registry;

public class ModEntities {
    public static final Identifier TUMBRIL_ID = Identifier.fromNamespaceAndPath(Errante.MOD_ID, "tumbril");
    public static final ResourceKey<EntityType<?>> TUMBRIL_KEY = ResourceKey.create(Registries.ENTITY_TYPE, TUMBRIL_ID);
    public static final EntityType<TumbrilEntity> TUMBRIL = EntityType.Builder.<TumbrilEntity>of(TumbrilEntity::new, MobCategory.MISC).sized(1.5f, 1.0f).build(TUMBRIL_KEY);

    public static void initialize() {
        Registry.register(BuiltInRegistries.ENTITY_TYPE, TUMBRIL_KEY, TUMBRIL);
        Errante.LOGGER.info("Preparando entidades de errante");
    }
}
