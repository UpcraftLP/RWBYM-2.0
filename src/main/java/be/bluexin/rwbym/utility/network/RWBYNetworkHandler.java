package be.bluexin.rwbym.utility.network;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.fml.relauncher.Side;

public class RWBYNetworkHandler {
    private static SimpleNetworkWrapper INSTANCE;
    public static void init() {
    INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel("rwbym");

    INSTANCE.registerMessage(MessageRose.class, MessageRose.class, 0, Side.SERVER);
    INSTANCE.registerMessage(MessageGetPlayerData.class, MessageGetPlayerData.class, 1, Side.SERVER);
    INSTANCE.registerMessage(MessageSendPlayerData.class, MessageSendPlayerData.class, 2, Side.CLIENT);

    }
    public static void sendToServer(IMessage message){
        INSTANCE.sendToServer(message);
    }
    
    public static void sendToClient(IMessage message, EntityPlayerMP player) {
    	INSTANCE.sendTo(message, player);
    }
    
    public static void sendToAll(IMessage message) {
    	INSTANCE.sendToAll(message);
    }
}
