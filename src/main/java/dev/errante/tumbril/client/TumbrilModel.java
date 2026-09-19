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
            // Piso.
            root.addOrReplaceChild(
                    "floor",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-8, -1, -12, 16, 2, 24),
                    PartPose.ZERO
            );

            // Laterales.
            root.addOrReplaceChild(
                    "side_left",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-8, -9, -12, 2, 8, 24),
                    PartPose.ZERO
            );

            root.addOrReplaceChild(
                    "side_right",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(6, -9, -12, 2, 8, 24),
                    PartPose.ZERO
            );

            // Parte trasera. El frente queda abierto hacia Z negativo.
            root.addOrReplaceChild(
                    "back",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-6, -9, 10, 12, 8, 2),
                    PartPose.ZERO
            );

            // Eje transversal, debajo del piso.
            root.addOrReplaceChild(
                    "axle",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-12, 3, -1, 24, 2, 2),
                    PartPose.ZERO
            );

            // Ruedas provisionales: cada una tiene su propio pivote.
            root.addOrReplaceChild(
                    "wheel_left",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-1, -6, -6, 2, 12, 12),
                    PartPose.offset(-11, 4, 0)
            );

            root.addOrReplaceChild(
                    "wheel_right",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-1, -6, -6, 2, 12, 12),
                    PartPose.offset(11, 4, 0)
            );

            // Varas que salen hacia el caballo.
            root.addOrReplaceChild(
                    "shaft_left",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(-7, -1, -36, 2, 2, 24),
                    PartPose.ZERO
            );

            root.addOrReplaceChild(
                    "shaft_right",
                    CubeListBuilder.create().texOffs(0, 0)
                            .addBox(5, -1, -36, 2, 2, 24),
                    PartPose.ZERO
            );

        return LayerDefinition.create(mesh, 128, 128);
    }
}
