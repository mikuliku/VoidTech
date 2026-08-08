# VoidTech GitHub 自动编译

## 上传
将本目录内的所有文件上传到 `mikuliku/VoidTech` 仓库根目录，保持 `.github/workflows/build.yml` 的路径不变。

## 编译
上传后进入 GitHub 仓库的 **Actions**，选择 **Build VoidTech**。
工作流会自动：
1. 安装 Java 17
2. 安装 Gradle 8.8
3. 下载 Minecraft 1.20.1 / Forge 47.4.22 / ForgeGradle 依赖
4. 执行 `gradle build`
5. 上传 `build/libs/*.jar` 为 Artifact

## 下载 JAR
Actions → 对应成功的 Build → 页面底部 Artifacts → `VoidTech-1.20.1`。

注意：当前仓库工程是一个可持续扩展的 MVP/构建骨架；它包含资源与基础工程配置，但并不声称已经实现最初需求中的所有游戏逻辑。
