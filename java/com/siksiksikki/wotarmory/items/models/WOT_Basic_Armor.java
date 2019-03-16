package com.siksiksikki.wotarmory.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelPlayer - SikSikSikki
 * Created using Tabula 7.0.1
 */
public class WOT_Basic_Armor extends ModelBiped 
{
    public ModelRenderer WOT_Helmet1;
    public ModelRenderer WOT_Helmet2;
    public ModelRenderer WOT_Torso1;
    public ModelRenderer WOT_Torso2;
    public ModelRenderer WOT_RightArm1;
    public ModelRenderer WOT_RightArm2;
    public ModelRenderer WOT_LeftArm1;
    public ModelRenderer WOT_LeftArm2;
    public ModelRenderer WOT_RightLeg1;
    public ModelRenderer WOT_RightLeg2;
    public ModelRenderer WOT_LeftLeg1;
    public ModelRenderer WOT_LeftLeg2;

    public WOT_Basic_Armor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.WOT_LeftLeg1 = new ModelRenderer(this, 0, 16);
        this.WOT_LeftLeg1.mirror = true;
        this.WOT_LeftLeg1.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.WOT_LeftLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.1F);
        this.WOT_LeftArm1 = new ModelRenderer(this, 40, 16);
        this.WOT_LeftArm1.mirror = true;
        this.WOT_LeftArm1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.WOT_LeftArm1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.1F);
        this.WOT_RightLeg1 = new ModelRenderer(this, 0, 16);
        this.WOT_RightLeg1.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.WOT_RightLeg1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.1F);
        this.WOT_Helmet1 = new ModelRenderer(this, 0, 0);
        this.WOT_Helmet1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WOT_Helmet1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.1F);
        this.WOT_Torso1 = new ModelRenderer(this, 16, 16);
        this.WOT_Torso1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WOT_Torso1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.1F);
        this.WOT_Torso2 = new ModelRenderer(this, 16, 32);
        this.WOT_Torso2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WOT_Torso2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.2F);
        this.WOT_RightArm2 = new ModelRenderer(this, 40, 32);
        this.WOT_RightArm2.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.WOT_RightArm2.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.2F);
        this.WOT_LeftLeg2 = new ModelRenderer(this, 0, 32);
        this.WOT_LeftLeg2.mirror = true;
        this.WOT_LeftLeg2.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.WOT_LeftLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.2F);
        this.WOT_RightArm1 = new ModelRenderer(this, 40, 16);
        this.WOT_RightArm1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.WOT_RightArm1.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.1F);
        this.WOT_LeftArm2 = new ModelRenderer(this, 40, 32);
        this.WOT_LeftArm2.mirror = true;
        this.WOT_LeftArm2.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.WOT_LeftArm2.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.2F);
        this.WOT_RightLeg2 = new ModelRenderer(this, 0, 32);
        this.WOT_RightLeg2.setRotationPoint(-1.8F, 12.0F, 0.0F);
        this.WOT_RightLeg2.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.2F);
        this.WOT_Helmet2 = new ModelRenderer(this, 32, 0);
        this.WOT_Helmet2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WOT_Helmet2.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.3F);
        
        this.bipedHead.addChild(WOT_Helmet1);
        this.bipedHead.addChild(WOT_Helmet2);
        this.bipedBody.addChild(WOT_Torso1);
        this.bipedBody.addChild(WOT_Torso2);
        this.bipedRightArm.addChild(WOT_RightArm1);
        this.bipedRightArm.addChild(WOT_RightArm2);
        this.bipedRightLeg.addChild(WOT_RightLeg1);
        this.bipedRightLeg.addChild(WOT_RightLeg2);
        this.bipedLeftArm.addChild(WOT_LeftArm1);
        this.bipedLeftArm.addChild(WOT_LeftArm2);
        this.bipedLeftLeg.addChild(WOT_LeftLeg1);
        this.bipedLeftLeg.addChild(WOT_LeftLeg2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
        super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
