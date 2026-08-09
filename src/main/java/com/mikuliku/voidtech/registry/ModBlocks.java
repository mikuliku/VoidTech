package com.mikuliku.voidtech.registry;

import com.mikuliku.voidtech.VoidTech;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(
                    ForgeRegistries.BLOCKS,
                    VoidTech.MOD_ID
            );


    // 虚空水晶矿
    public static final RegistryObject<Block> VOID_CRYSTAL_ORE =
            BLOCKS.register(
                    "void_crystal_ore",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                                    .strength(3.0F, 5.0F)
                            )
            );


    // 虚空核心方块
    public static final RegistryObject<Block> VOID_CORE =
            BLOCKS.register(
                    "void_core",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_BLUE)
                                    .strength(5.0F, 10.0F)
                            )
            );


    // 精密机械框架
    public static final RegistryObject<Block> MACHINE_FRAME =
            BLOCKS.register(
                    "machine_frame",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.QUARTZ)
                                    .strength(4.0F, 8.0F)
                            )
            );


    // 能量接口
    public static final RegistryObject<Block> ENERGY_INTERFACE =
            BLOCKS.register(
                    "energy_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_CYAN)
                                    .strength(4.0F, 8.0F)
                            )
            );


    // 物品接口
    public static final RegistryObject<Block> ITEM_INTERFACE =
            BLOCKS.register(
                    "item_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                                    .strength(4.0F, 8.0F)
                            )
            );


    // 流体接口
    public static final RegistryObject<Block> FLUID_INTERFACE =
            BLOCKS.register(
                    "fluid_interface",
                    () -> new Block(
                            BlockBehaviour.Properties
                                    .of()
                                    .mapColor(MapColor.COLOR_BLUE)
                                    .strength(4.0F, 8.0F)
                            )
            );


}
