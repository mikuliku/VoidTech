package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
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
                    () -> new Block(
                            BlockBehaviour.Properties
                            .of(Material.STONE)
                            .strength(3f)
                    )
            );


    public static final RegistryObject<Block> VOID_CRYSTAL_BLOCK =
            BLOCKS.register(
                    "void_crystal_block",
                    () -> new Block(
                            BlockBehaviour.Properties
                            .of(Material.METAL)
                            .strength(5f)
                    )
            );

}
