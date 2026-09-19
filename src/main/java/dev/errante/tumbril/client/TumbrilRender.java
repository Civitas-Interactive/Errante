package dev.errante.tumbril.client;

import dev.errante.tumbril.TumbrilEntity;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import com.mojang.blaze3d.vertex.PoseStack;
import dev.errante.ErranteClient;
import net.minecraft.resources.Identifier;

public class TumbrilRender extends EntityRenderer<TumbrilEntity, TumbrilRenderState> {
    private final TumbrilModel model;
    private static final Identifier TEXTURE = Identifier.fromNamespaceAndPath("errante", "textures/entity/tumbril.png");

    @Override
    public void submit(TumbrilRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector,
            CameraRenderState camera) {
        super.submit(state, poseStack, submitNodeCollector, camera);
        poseStack.pushPose();
        //submitNodeCollector.submitModel(model, state, poseStack, renderType, lightCoords, overlayCoords, outlineColor);
        poseStack.popPose();
    }

    public TumbrilRender(EntityRendererProvider.Context context) {
        super(context);
        this.model = new TumbrilModel(context.bakeLayer(ErranteClient.TUMBRIL_LAYER));
    }

    @Override
    public TumbrilRenderState createRenderState() {
        return new TumbrilRenderState();
    }
}
