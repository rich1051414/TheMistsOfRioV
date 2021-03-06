package sheenrox82.RioV.src.render.item;

import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.tileentity.TileEntityBloodChest;

public class ItemRenderBloodChest implements IItemRenderer 
{
    public ItemRenderBloodChest() 
    {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) 
    {
    	return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
    {
        TileEntityBloodChest chest = new TileEntityBloodChest();

    	GL11.glPushMatrix();
        GL11.glScalef(1.0F, 1.0F, 1.0F);        
        TileEntityRendererDispatcher.instance.renderTileEntityAt(chest, 0.0D, 0.0D, 0.0D, 0.0F);
        GL11.glPopMatrix();
    }

}