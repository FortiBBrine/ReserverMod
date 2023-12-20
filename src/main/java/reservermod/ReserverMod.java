package reservermod;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ReserverMod.MODID)
public class ReserverMod {

    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "reservermod";

    public ReserverMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    }

}
