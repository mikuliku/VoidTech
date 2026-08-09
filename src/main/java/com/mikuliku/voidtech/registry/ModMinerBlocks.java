package com.mikuliku.voidtech.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.mikuliku.voidtech.VoidTech;

public class ModMinerBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    VoidTech.MODID
            );


    public static final RegistryObject<Block> VOID_MINER =
            BLOCKS.register(
                    "void_miner",
                    () -> new Block(
                            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    )
            );


    public static final RegistryObject<Block> VOID_INTERFACE =
            BLOCKS.register(
                    "void_interface",
                    () -> new Block(
                            BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    )
            );

}
