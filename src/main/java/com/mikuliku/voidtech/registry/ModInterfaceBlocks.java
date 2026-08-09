package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModInterfaceBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    VoidTech.MOD_ID
            );



    public static final RegistryObject<Block> ENERGY_INTERFACE =
            BLOCKS.register(
                    "energy_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_CYAN)
                                    .strength(4F)
                    )
            );



    public static final RegistryObject<Block> ITEM_INTERFACE =
            BLOCKS.register(
                    "item_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                                    .strength(4F)
                    )
            );



    public static final RegistryObject<Block> FLUID_INTERFACE =
            BLOCKS.register(
                    "fluid_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_BLUE)
                                    .strength(4F)
                    )
            );


}
