package dev.errante;

import net.fabricmc.api.ClientModInitializer;
import dev.errante.tumbril.ModEntities;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.NoopRenderer;

public class ErranteClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRenderers.register(ModEntities.TUMBRIL, NoopRenderer::new);
        Errante.LOGGER.info("Cliente de Errante preparado");
    }
}
