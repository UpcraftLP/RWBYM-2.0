package be.bluexin.rwbym.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

public class ModelUrsa extends ModelBase {
    public ModelRenderer bs2;
    public ModelRenderer bs1;
    public ModelRenderer bs4;
    public ModelRenderer bs3;
    public ModelRenderer bs6;
    public ModelRenderer bs5;
    public ModelRenderer bs8;
    public ModelRenderer bs7;
    public ModelRenderer h1;
    public ModelRenderer bs9;
    public ModelRenderer h2;
    public ModelRenderer h3;
    public ModelRenderer h4;
    public ModelRenderer b1;
    public ModelRenderer b2;
    public ModelRenderer b3;
    public ModelRenderer bs12;
    public ModelRenderer bs10;
    public ModelRenderer bs11;
    public ModelRenderer llb4;
    public ModelRenderer llb5;
    public ModelRenderer llb2;
    public ModelRenderer llf6;
    public ModelRenderer llb3;
    public ModelRenderer llf7;
    public ModelRenderer rlf1;
    public ModelRenderer rlf3;
    public ModelRenderer rlf2;
    public ModelRenderer rlb5;
    public ModelRenderer llf1;
    public ModelRenderer rlb4;
    public ModelRenderer llf4;
    public ModelRenderer rlb1;
    public ModelRenderer rlf5;
    public ModelRenderer rlf4;
    public ModelRenderer llb1;
    public ModelRenderer llf5;
    public ModelRenderer llf2;
    public ModelRenderer rlb3;
    public ModelRenderer rlf7;
    public ModelRenderer llf3;
    public ModelRenderer rlb2;
    public ModelRenderer rlf6;

    public ModelUrsa() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.rlb4 = new ModelRenderer(this, 52, 30);
        this.rlb4.setRotationPoint(-3.5F, 14.0F, 8.5F);
        this.rlb4.addBox(-3.5F, 8.699999809265137F, -7.0F, 3, 1, 3, 0.0F);
        this.rlf4 = new ModelRenderer(this, 52, 30);
        this.rlf4.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf4.addBox(-3.5F, 8.699999809265137F, -5.0F, 3, 1, 3, 0.0F);
        this.llf3 = new ModelRenderer(this, 52, 23);
        this.llf3.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf3.addBox(0.5F, 9.0F, -2.0F, 3, 1, 5, 0.0F);
        this.rlb1 = new ModelRenderer(this, 79, 0);
        this.rlb1.setRotationPoint(-3.5F, 14.0F, 8.5F);
        this.rlb1.addBox(-4.5F, -2.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(rlb1, -0.18325960636138916F, 0.0F, 0.0F);
        this.b2 = new ModelRenderer(this, 0, 64);
        this.b2.setRotationPoint(-0.5F, 12.0F, 6.0F);
        this.b2.addBox(-5.0F, -5.0F, -2.0F, 11, 11, 9, 0.0F);
        this.setRotateAngle(b2, -0.18589310348033902F, 0.0F, 0.0F);
        this.bs2 = new ModelRenderer(this, 57, 52);
        this.bs2.setRotationPoint(-0.5F, 6.0F, -8.0F);
        this.bs2.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(bs2, -0.1745329052209854F, 0.0F, 0.0F);
        this.llf7 = new ModelRenderer(this, 43, 17);
        this.llf7.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf7.addBox(3.5F, -1.0F, -1.5F, 2, 2, 2, 0.0F);
        this.llb3 = new ModelRenderer(this, 79, 23);
        this.llb3.setRotationPoint(3.5F, 14.0F, 8.5F);
        this.llb3.addBox(0.0F, 9.0F, -4.0F, 4, 1, 5, 0.0F);
        this.rlb3 = new ModelRenderer(this, 79, 23);
        this.rlb3.setRotationPoint(-3.5F, 14.0F, 8.5F);
        this.rlb3.addBox(-4.0F, 9.0F, -4.0F, 4, 1, 5, 0.0F);
        this.llf2 = new ModelRenderer(this, 52, 14);
        this.llf2.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf2.addBox(0.5F, 5.0F, -1.0F, 3, 4, 4, 0.0F);
        this.h4 = new ModelRenderer(this, 25, 15);
        this.h4.setRotationPoint(0.0F, 12.5F, -11.0F);
        this.h4.addBox(-2.5F, 2.0F, -7.0F, 5, 1, 2, 0.0F);
        this.llb5 = new ModelRenderer(this, 100, 15);
        this.llb5.setRotationPoint(3.5F, 14.0F, 8.5F);
        this.llb5.addBox(2.0F, 5.0F, -5.0F, 1, 1, 2, 0.0F);
        this.llf1 = new ModelRenderer(this, 52, 0);
        this.llf1.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf1.addBox(0.0F, -2.0F, -2.5F, 4, 8, 5, 0.0F);
        this.h2 = new ModelRenderer(this, 0, 4);
        this.h2.setRotationPoint(0.0F, 12.5F, -11.0F);
        this.h2.addBox(-3.5F, -2.5F, -7.5F, 7, 4, 2, 0.0F);
        this.llf4 = new ModelRenderer(this, 52, 30);
        this.llf4.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf4.addBox(0.5F, 8.699999809265137F, -5.0F, 3, 1, 3, 0.0F);
        this.b3 = new ModelRenderer(this, 0, 19);
        this.b3.setRotationPoint(-1.0F, 12.0F, -11.0F);
        this.b3.addBox(-4.0F, -4.5F, -2.0F, 10, 10, 6, 0.0F);
        this.setRotateAngle(b3, 0.22307169437408447F, 0.0F, 0.0F);
        this.bs10 = new ModelRenderer(this, 62, 59);
        this.bs10.setRotationPoint(2.0F, 6.0F, -4.0F);
        this.bs10.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs10, -0.1745329052209854F, 0.0F, 0.0F);
        this.rlf1 = new ModelRenderer(this, 52, 0);
        this.rlf1.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf1.addBox(-4.0F, -2.0F, -2.5F, 4, 8, 5, 0.0F);
        this.rlb5 = new ModelRenderer(this, 100, 15);
        this.rlb5.setRotationPoint(-3.5F, 14.0F, 8.5F);
        this.rlb5.addBox(-3.0F, 5.0F, -5.0F, 1, 1, 2, 0.0F);
        this.llf5 = new ModelRenderer(this, 43, 22);
        this.llf5.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf5.addBox(4.0F, -0.30000001192092896F, -1.2000000476837158F, 1, 2, 2, 2.9802322387695312E-8F);
        this.bs6 = new ModelRenderer(this, 62, 47);
        this.bs6.setRotationPoint(1.5F, 5.5F, -11.0F);
        this.bs6.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs6, 0.22307050228118896F, 0.0F, 0.0F);
        this.llf6 = new ModelRenderer(this, 43, 27);
        this.llf6.setRotationPoint(3.5F, 14.0F, -7.0F);
        this.llf6.addBox(4.0F, 2.0F, -0.5F, 1, 1, 1, 0.0F);
        this.bs7 = new ModelRenderer(this, 62, 59);
        this.bs7.setRotationPoint(-3.0F, 6.0F, -4.0F);
        this.bs7.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs7, -0.1745329052209854F, 0.0F, 0.0F);
        this.bs8 = new ModelRenderer(this, 62, 53);
        this.bs8.setRotationPoint(-3.0F, 6.0F, -7.5F);
        this.bs8.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs8, -0.1745329052209854F, 0.0F, 0.0F);
        this.llb1 = new ModelRenderer(this, 79, 0);
        this.llb1.setRotationPoint(3.5F, 14.0F, 8.5F);
        this.llb1.addBox(-0.5F, -2.0F, -2.5F, 5, 7, 5, 0.0F);
        this.setRotateAngle(llb1, -0.18325960636138916F, 0.0F, 0.0F);
        this.bs9 = new ModelRenderer(this, 62, 53);
        this.bs9.setRotationPoint(2.0F, 6.0F, -7.5F);
        this.bs9.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs9, -0.1745329052209854F, 0.0F, 0.0F);
        this.rlf2 = new ModelRenderer(this, 52, 14);
        this.rlf2.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf2.addBox(-3.5F, 5.0F, -1.0F, 3, 4, 4, 0.0F);
        this.rlf7 = new ModelRenderer(this, 43, 27);
        this.rlf7.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf7.addBox(-5.0F, 2.0F, -0.5F, 1, 1, 1, 0.0F);
        this.bs1 = new ModelRenderer(this, 57, 46);
        this.bs1.setRotationPoint(-0.5F, 3.5F, -12.0F);
        this.bs1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(bs1, 0.22307050228118896F, 0.0F, 0.0F);
        this.bs11 = new ModelRenderer(this, 62, 65);
        this.bs11.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.bs11.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs11, -0.1745329052209854F, 0.0F, 0.0F);
        this.llb4 = new ModelRenderer(this, 52, 30);
        this.llb4.setRotationPoint(3.5F, 14.0F, 8.5F);
        this.llb4.addBox(0.5F, 8.699999809265137F, -7.0F, 3, 1, 3, 0.0F);
        this.rlf5 = new ModelRenderer(this, 43, 17);
        this.rlf5.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf5.addBox(-5.5F, -1.0F, -1.5F, 2, 2, 2, 0.0F);
        this.bs5 = new ModelRenderer(this, 62, 47);
        this.bs5.setRotationPoint(-2.5F, 5.5F, -11.0F);
        this.bs5.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs5, 0.22307050228118896F, 0.0F, 0.0F);
        this.bs12 = new ModelRenderer(this, 62, 65);
        this.bs12.setRotationPoint(-3.0F, 6.0F, 0.0F);
        this.bs12.addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(bs12, -0.1745329052209854F, 0.0F, 0.0F);
        this.h3 = new ModelRenderer(this, 0, 0);
        this.h3.setRotationPoint(0.0F, 12.5F, -11.0F);
        this.h3.addBox(-3.0F, -0.5F, -8.5F, 6, 2, 1, 0.0F);
        this.rlf6 = new ModelRenderer(this, 43, 22);
        this.rlf6.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf6.addBox(-5.0F, -0.30000001192092896F, -1.2000000476837158F, 1, 2, 2, 2.9802322387695312E-8F);
        this.rlb2 = new ModelRenderer(this, 79, 13);
        this.rlb2.setRotationPoint(-3.5F, 14.0F, 8.5F);
        this.rlb2.addBox(-4.0F, 4.0F, -3.0F, 4, 5, 4, 0.0F);
        this.bs3 = new ModelRenderer(this, 57, 59);
        this.bs3.setRotationPoint(-0.5F, 6.0F, -4.5F);
        this.bs3.addBox(0.0F, -5.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(bs3, -0.1745329052209854F, 0.0F, 0.0F);
        this.llb2 = new ModelRenderer(this, 79, 13);
        this.llb2.setRotationPoint(3.5F, 14.0F, 8.5F);
        this.llb2.addBox(0.0F, 4.0F, -3.0F, 4, 5, 4, 0.0F);
        this.bs4 = new ModelRenderer(this, 57, 66);
        this.bs4.setRotationPoint(-0.5F, 6.0F, -0.5F);
        this.bs4.addBox(0.0F, -4.0F, 0.0F, 1, 4, 1, 0.0F);
        this.setRotateAngle(bs4, -0.1745329052209854F, 0.0F, 0.0F);
        this.h1 = new ModelRenderer(this, 19, 0);
        this.h1.setRotationPoint(0.0F, 12.5F, -11.0F);
        this.h1.addBox(-3.5F, -3.5F, -5.5F, 7, 7, 6, 0.0F);
        this.b1 = new ModelRenderer(this, 0, 36);
        this.b1.setRotationPoint(-1.0F, 12.0F, -9.0F);
        this.b1.addBox(-5.0F, -6.0F, 0.0F, 12, 13, 14, 0.0F);
        this.rlf3 = new ModelRenderer(this, 52, 23);
        this.rlf3.setRotationPoint(-3.5F, 14.0F, -7.0F);
        this.rlf3.addBox(-3.5F, 9.0F, -2.0F, 3, 1, 5, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.rlb4.render(f5);
        this.rlf4.render(f5);
        this.llf3.render(f5);
        this.rlb1.render(f5);
        this.b2.render(f5);
        this.bs2.render(f5);
        this.llf7.render(f5);
        this.llb3.render(f5);
        this.rlb3.render(f5);
        this.llf2.render(f5);
        this.h4.render(f5);
        this.llb5.render(f5);
        this.llf1.render(f5);
        this.h2.render(f5);
        this.llf4.render(f5);
        this.b3.render(f5);
        this.bs10.render(f5);
        this.rlf1.render(f5);
        this.rlb5.render(f5);
        this.llf5.render(f5);
        this.bs6.render(f5);
        this.llf6.render(f5);
        this.bs7.render(f5);
        this.bs8.render(f5);
        this.llb1.render(f5);
        this.bs9.render(f5);
        this.rlf2.render(f5);
        this.rlf7.render(f5);
        this.bs1.render(f5);
        this.bs11.render(f5);
        this.llb4.render(f5);
        this.rlf5.render(f5);
        this.bs5.render(f5);
        this.bs12.render(f5);
        this.h3.render(f5);
        this.rlf6.render(f5);
        this.rlb2.render(f5);
        this.bs3.render(f5);
        this.llb2.render(f5);
        this.bs4.render(f5);
        this.h1.render(f5);
        this.b1.render(f5);
        this.rlf3.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    public void setLivingAnimations(EntityLivingBase par1EntityLivingBase, float par2, float par3, float par4) {
        this.rlb1.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3 - 0.1832596f;
        this.rlb2.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.rlb3.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.rlb4.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.rlb5.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llb1.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3 - 0.1832596f;
        this.llb2.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.llb3.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.llb4.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.llb5.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf1.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf2.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf3.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf4.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf5.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf6.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.rlf7.rotateAngleX = MathHelper.cos(par2 * 0.6662f + 3.1415927f) * 1.4f * par3;
        this.llf1.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf2.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf3.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf4.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf5.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf6.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
        this.llf7.rotateAngleX = MathHelper.cos(par2 * 0.6662f) * 1.4f * par3;
    }

    public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
        this.h1.rotateAngleX = par5 / 57.295776f;
        this.h1.rotateAngleY = par4 / 57.295776f;
        this.h2.rotateAngleX = par5 / 57.295776f;
        this.h2.rotateAngleY = par4 / 57.295776f;
        this.h3.rotateAngleX = par5 / 57.295776f;
        this.h3.rotateAngleY = par4 / 57.295776f;
        this.h4.rotateAngleX = par5 / 57.295776f;
        this.h4.rotateAngleY = par4 / 57.295776f;
    }
}