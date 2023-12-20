package reservermod.event;

import net.minecraft.server.MinecraftServer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import reservermod.ReserverMod;

@Mod.EventBusSubscriber(modid = ReserverMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
public class ModEventBusServerEvents {

    @SubscribeEvent
    public void onStartServer(ServerStartedEvent event) {
        MinecraftServer server = event.getServer();

    }

}
