java17打包二进制包
```shell
 jpackage.exe  --type app-image --name power --input target --main-jar power-1.0.jar --java-options "-Djava.awt.headless=true" --win-noconsole --dest dist
```

将该文件放入开始菜单中
```shell
按 Win + R，输入 shell:startup，回车，打开启动文件夹。将创建的 .bat 文件放入此文件夹中。
```