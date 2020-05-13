package com.example.examplemod;

import com.example.examplemod.blocks.PancakeBlock;
import com.example.examplemod.list.BlockList;
import com.example.examplemod.list.FoodList;
import com.example.examplemod.list.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod {

    public static ExampleMod instance;
    public static final String MOD_ID = "examplemod";
    private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static final ExampleItemGroup exampleItemGroup = new ExampleItemGroup();

    public ExampleMod() {
        instance = this;

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup method registered");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        LOGGER.info("doClientStuff method registered");
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(
                    ItemList.pancake = new Item(new Item.Properties().group(exampleItemGroup).food(FoodList.PANCAKE))
                            .setRegistryName(location("pancake")),
                    ItemList.pancakeBlock = new BlockItem(BlockList.pancakeBlock, new Item.Properties().group(exampleItemGroup))
                            .setRegistryName(BlockList.pancakeBlock.getRegistryName())
            );
            LOGGER.info("Items registered");
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            event.getRegistry().registerAll(
                    BlockList.pancakeBlock = new PancakeBlock().setRegistryName(location("pancake_block"))
            );
            LOGGER.info("Blocks registered");
        }

        private static ResourceLocation location(String name) {
            return new ResourceLocation(MOD_ID, name);
        }
    }
}
