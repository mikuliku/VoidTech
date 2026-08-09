package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModMinerBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    VoidTech.MOD_ID
            );



    public static final RegistryObject<Block> VOID_MINER_CORE =
            BLOCKS.register(
                    "void_miner_core",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                                    .strength(6F)
                    )
            );



    public static final RegistryObject<Block> VOID_FLUID_CORE =
            BLOCKS.register(
                    "void_fluid_core",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_BLUE)
                                    .strength(6F)
                    )
            );


}
