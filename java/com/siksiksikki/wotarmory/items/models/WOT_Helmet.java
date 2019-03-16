package com.siksiksikki.wotarmory.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelCustomArmor - Either Mojang or a mod author
 * Created using Tabula 7.0.1
 */
public class WOT_Helmet extends ModelBiped {
    public ModelRenderer Helmet_01;
    public ModelRenderer Helmet_02;

    public WOT_Helmet() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        
        this.Helmet_01 = new ModelRenderer(this, 0, 0);
        this.Helmet_01.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet_01.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        
        this.Helmet_02 = new ModelRenderer(this, 32, 0);
        this.Helmet_02.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Helmet_02.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        
        this.bipedHead.addChild(Helmet_01);
        this.bipedHead.addChild(Helmet_02);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Helmet_01.offsetX, this.Helmet_01.offsetY, this.Helmet_01.offsetZ);
        GlStateManager.translate(this.Helmet_01.rotationPointX * f5, this.Helmet_01.rotationPointY * f5, this.Helmet_01.rotationPointZ * f5);
        GlStateManager.scale(1.04D, 1.04D, 1.04D);
        GlStateManager.translate(-this.Helmet_01.offsetX, -this.Helmet_01.offsetY, -this.Helmet_01.offsetZ);
        GlStateManager.translate(-this.Helmet_01.rotationPointX * f5, -this.Helmet_01.rotationPointY * f5, -this.Helmet_01.rotationPointZ * f5);
        this.Helmet_01.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Helmet_02.offsetX, this.Helmet_02.offsetY, this.Helmet_02.offsetZ);
        GlStateManager.translate(this.Helmet_02.rotationPointX * f5, this.Helmet_02.rotationPointY * f5, this.Helmet_02.rotationPointZ * f5);
        GlStateManager.scale(1.06D, 1.06D, 1.06D);
        GlStateManager.translate(-this.Helmet_02.offsetX, -this.Helmet_02.offsetY, -this.Helmet_02.offsetZ);
        GlStateManager.translate(-this.Helmet_02.rotationPointX * f5, -this.Helmet_02.rotationPointY * f5, -this.Helmet_02.rotationPointZ * f5);
        this.Helmet_02.render(f5);
        GlStateManager.popMatrix();
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
