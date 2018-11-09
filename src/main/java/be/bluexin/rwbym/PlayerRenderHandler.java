package be.bluexin.rwbym;

import be.bluexin.rwbym.capabilities.ruby.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRenderHandler {
	
	@SubscribeEvent
	public void PlayerRenderEvent(RenderPlayerEvent.Pre event) {
		EntityPlayer entityPlayer = event.getEntityPlayer();
		
		String name = entityPlayer.getName();

		//FIXME do NOT do this in a render event!
		//RWBYNetworkHandler.sendToServer(new MessageGetPlayerData(name));
		
		if (entityPlayer.hasCapability(RubyProvider.RUBY_CAP, null)) {
			IRuby Ruby = entityPlayer.getCapability(RubyProvider.RUBY_CAP, null);
		
			if (Ruby.getInvisibility()) {
				entityPlayer.setInvisible(true);
				event.setCanceled(true);
			}
			else {
				entityPlayer.setInvisible(false);
			}
		}
	}
}
