# Eclipse需要安装的插件
## Maven
下载解压Maven包
增加两个环境变量
    Path: 解压目录/bin
    M2_HOME: 解压目录
验证安装:
    cmd命令窗口 Mvn -v
Eclipse中的Maven设置:
    Window->preferences->maven->installation->add Maven的安装目录
Maven配置文件:
    全局配置文件,用户配置文件Window->Preferences->maven->User Settings Global和User设置一个就ok
    配置的文件在 解压目录/conf/settings.xml
    修改配置文件settings.xml <localRepository>d:/Java/.m2/repository</localRepository> Maven引用的jar包,都会通过网络下载到这个仓库中
使用Eclipse创建Maven项目:
    File->new->other..->Maven->Maven Project
    创建jar项目可以选择使用maven-archetype-quickstart来创建
    创建war项目可以选择使用maven-archetype-webapp来创建
    接着填写项目信息:
        Group Id: 项目的唯一标识,并且配置时的生成路径也是由此生成,如org.code
        Artifact Id: 项目通用名
        Version: 版本
        Package: 打包机制
    添加依赖包时通过在pom.xml中添加例如:
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>18.0</version>
        </dependency>

## Git
右击项目Team commit进行相关操作

# Eclipse使用设置
## 字体
UTF-8
window->preferences->general->appearance->colors and fonts全选edit
window->preference->general->workspace->text file encoding
## workspace设置
window->preference->general->Startup and ShutDown 勾选Refresh workspace on startup重启eclipse设置目录

## 代码格式
window->Preferences->java->code style->formatter
edit 修改格式:
    Tabs only 改成 Spaces only大小为4
    类似还有其他的格式修改

# Eclipse使用快捷键
Ctrl + Shift + F: 格式化
Ctrl + Shift + R: 打开资源
Ctrl + Shift + T: 打开类型
Alt + Shift + T: 显示重构菜单
Ctrl + H: 显示搜索对话框
Ctrl + o: 快速outline列出所有方法
Ctrl + e: 快速切换编辑器，在打开的选项卡之间切换
Alt + /: 单词补全
Alt + 上下: 上下移动选中的行
Alt + 左右: 上一个/下一个光标的位置
Ctrl + D: 删除行
Ctrl + m: 最大化显示窗口
Shift + F2: 打开外部Java文档
Ctrl + 1: 快速修正

