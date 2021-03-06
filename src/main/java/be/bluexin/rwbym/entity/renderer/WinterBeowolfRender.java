package be.bluexin.rwbym.entity.renderer;

import be.bluexin.rwbym.RWBYModels;
import be.bluexin.rwbym.entity.EntityWinterBeowolf;
import be.bluexin.rwbym.entity.ModelBeowolf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class WinterBeowolfRender extends RenderLivingBase<EntityWinterBeowolf> {

    public static Factory FACTORY = new Factory();

    public WinterBeowolfRender(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn) {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
    }

    protected boolean canRenderName(EntityWinterBeowolf entity) {
        return false;
    }

    protected void preRenderCallback(EntityWinterBeowolf entitylivingbaseIn, float partialTickTime) {
        GlStateManager.scale(1.5F, 1.5F, 1.5F);
        GlStateManager.translate(0, 0.3, 0);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityWinterBeowolf entity) {
        return new ResourceLocation(RWBYModels.MODID, "textures/entity/winter_beowolf.png");
    }

    public static class Factory implements IRenderFactory<EntityWinterBeowolf> {

        @Override
        public Render<? super EntityWinterBeowolf> createRenderFor(RenderManager manager) {
            return new WinterBeowolfRender(manager, new ModelBeowolf(), 0);
        }

    }
}
