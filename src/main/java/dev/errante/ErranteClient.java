package dev.errante;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import dev.errante.tumbril.ModEntities;
import dev.errante.tumbril.client.TumbrilModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRenderers;
import dev.errante.tumbril.client.TumbrilRender;

public class ErranteClient implements ClientModInitializer {
    public static final ModelLayerLocation TUMBRIL_LAYER = new ModelLayerLocation(ModEntities.TUMBRIL_ID, "main");

    @Override
    public void onInitializeClient() {
        ModelLayerRegistry.registerModelLayer(TUMBRIL_LAYER, TumbrilModel::createBodyLayer);
        EntityRenderers.register(ModEntities.TUMBRIL, TumbrilRender::new);
        Errante.LOGGER.info("Cliente de Errante preparado");
    }
}
