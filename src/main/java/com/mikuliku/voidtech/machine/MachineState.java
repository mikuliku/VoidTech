package com.mikuliku.voidtech.machine;



public enum MachineState {


    /**
     * 空闲
     */
    IDLE,


    /**
     * 工作中
     */
    RUNNING,


    /**
     * 能量不足
     */
    NO_POWER,


    /**
     * 多方块结构错误
     */
    INVALID_STRUCTURE,


    /**
     * 错误状态
     */
    ERROR


}
