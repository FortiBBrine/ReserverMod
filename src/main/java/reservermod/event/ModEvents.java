package reservermod.event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import reservermod.ReserverMod;

@Mod.EventBusSubscriber(modid = ReserverMod.MODID)
public class ModEvents {

    @SubscribeEvent
    public void onSpawn(LivingSpawnEvent event) {
        Entity entity = event.getEntity();

        if (entity.getType() == EntityType.BAT) {
            event.setCanceled(true);
        }
    }


}
