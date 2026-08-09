package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;


import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModBlocks {


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    VoidTech.MOD_ID
            );



    public static final RegistryObject<Block> VOID_CRYSTAL_ORE =
            BLOCKS.register(
                    "void_crystal_ore",
                    () ->
                            new Block(
                                    BlockBehaviour.Properties.copy(
                                            Blocks.DIAMOND_ORE
                                    )
                            )
            );



    public static final RegistryObject<Block> VOID_CORE =
            BLOCKS.register(
                    "void_core",
                    () ->
                            new Block(
                                    BlockBehaviour.Properties.copy(
                                            Blocks.OBSIDIAN
                                    )
                            )
            );



    public static final RegistryObject<Block> MACHINE_FRAME =
            BLOCKS.register(
                    "machine_frame",
                    () ->
                            new Block(
                                    BlockBehaviour.Properties.copy(
                                            Blocks.IRON_BLOCK
                                    )
                            )
            );


}
