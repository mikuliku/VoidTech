# VoidTech — Minecraft 1.20.1 Forge

这是一个**可继续开发的技术模组原型工程**，目标对应你的需求：

- Minecraft 1.20.1 Forge
- 白/蓝色、偏 AE2 风格的科技视觉方向
- 六级科技路线
- 中空金字塔多方块机器
- 虚空采矿与虚空产流体两套机器
- 能量 / 物品 / 流体接口
- 速度、产量、精准采集升级
- Patchouli 指南书数据
- 建筑手杖自动生成基础金字塔

## 当前原型已经包含

1. Forge 47.4.22 工程结构。
2. 机器控制器、结构框架、三种接口。
3. 控制器 BlockEntity，带 FE 能量、升级槽、进度、等级数据。
4. 建筑手杖：自动搭建 5×5 → 3×3 → 1×1 的中空金字塔。
5. 六级容量/速度参数表已经放入控制器。
6. 三种升级物品。
7. Voidite / Azureite / Singularium / Nebularium / Aetherium / Infinity Core 六档材料名。
8. Patchouli 书籍 JSON。
9. 中英文语言文件。
10. 数据包式配方和资源模型骨架。

## 六级路线建议

| 等级 | 核心材料 | FE 容量 | 基础周期 |
|---|---|---:|---:|
| I | Voidite | 100k | 200t |
| II | Azureite | 250k | 160t |
| III | Singularium | 500k | 120t |
| IV | Nebularium | 1M | 80t |
| V | Aetherium | 2.5M | 50t |
| VI | Infinity Core | 5M | 25t |

建议正式版把每一级控制器做成独立配方/独立核心，而不是让玩家直接修改 NBT。

## 多方块结构

基础形状：

```text
      [F]
   [F][ ][F]
 [F][ ][ ][F]
[F][ ][C][ ][F]
```

实际实现使用 5×5、3×3、1×1 三层的“边框”，内部保持空心。

正式版建议：
- 每一级使用不同框架材质；
- 控制器负责扫描结构；
- 三种接口必须位于指定槽位；
- 结构形成后显示蓝色能量环；
- 拆掉关键框架后自动失效。

## 模组矿物兼容

正式版应使用 Forge Tag / Recipe Ingredient，而不是硬编码模组 ID。例如：
- `forge:ores/*`
- `forge:ores/copper`
- `forge:ores/iron`
- `forge:ores/gold`

虚空采矿结果池应从 Tag 动态建立，这样可以兼容其他矿物模组。

## Patchouli

工程里已经放入 Patchouli-compatible book JSON。正式版可将 Patchouli 作为可选前置，并把所有机器、升级、六级路线和结构说明放进书里。

## 构建

需要 JDK 17。Forge 官方 1.20.1 文档要求该版本使用 Java 17；Forge 当前 1.20.1 页面列出的最新版本为 47.4.22。

```bash
./gradlew genIntellijRuns
./gradlew build
```

构建后的 JAR 位于：

```text
build/libs/
```

## 下一阶段应该实现

这是一个**工程原型/MVP**，不是已经完成所有视觉资源和所有生产逻辑的最终发布版。正式版还应补齐：

- 真正的六级控制器方块/配方；
- Void Miner 独立 BlockEntity；
- Void Fluid Synthesizer 独立 BlockEntity；
- FluidTank 与流体接口；
- 物品输入/输出接口；
- 真实的多方块结构扫描；
- 升级效果和升级槽限制；
- 按 Forge Tags 动态生成矿物池；
- 精准采集对应 Silk Touch；
- JEI/EMI 配方显示；
- 完整 GUI；
- 蓝白材质、动画、粒子和模型；
- 建筑手杖按机器等级自动选择结构材料；
- Patchouli 中文完整手册。

Forge 官方资料：
- Forge 1.20.1 文档
- Forge 1.20.1 下载页
