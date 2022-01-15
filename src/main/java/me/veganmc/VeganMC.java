package me.veganmc;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("veganmc")
public class VeganMC
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public VeganMC()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public void playerEat(LivingEntityUseItemEvent.Finish e)
    {
        if(e.getItem().isEdible())
        {
            if(!VeganFoods.isVegan(e.getItem()))
            {
                e.getEntityLiving().kill();
            }
        }
    }

    @SubscribeEvent
    public void playerKill(LivingAttackEvent e)
    {
        if(e.getSource().getEntity() != null)
        {
            e.getSource().getEntity().kill();
        }
    }
}
