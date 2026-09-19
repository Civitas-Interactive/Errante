package dev.errante.tumbril.client;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class TumbrilModel extends EntityModel<TumbrilRenderState> {
    public TumbrilModel(ModelPart root) {
        super(root);
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition mesh = new MeshDefinition();
        PartDefinition root = mesh.getRoot();

        root.addOrReplaceChild(
            "body",
            CubeListBuilder.create()
                .texOffs(0, 0)
                .addBox(-8.0f, -4.0f, -12.0f, 16.0f, 8.0f, 24.0f),
            PartPose.ZERO
        );

        return LayerDefinition.create(mesh, 64, 64);
    }
}
