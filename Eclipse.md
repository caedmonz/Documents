# Eclipse需要安装的插件<br />
## Maven<br />
下载解压Maven包<br />
增加两个环境变量<br />
-    Path: 解压目录/bin<br />
-    M2_HOME: 解压目录<br />

验证安装:<br />
-    cmd命令窗口 Mvn -v<br />

Eclipse中的Maven设置:<br />
-    Window->preferences->maven->installation->add Maven的安装目录<br />
Maven配置文件:<br />
-    全局配置文件,用户配置文件Window->Preferences->maven->User Settings Global和User设置一个就ok<br />
-    配置的文件在 解压目录/conf/settings.xml<br />
-    修改配置文件settings.xml <localRepository>d:/Java/.m2/repository</localRepository> Maven引用的jar包,都会通过网络下载到这个仓库中<br />

使用Eclipse创建Maven项目:<br />
-    File->new->other..->Maven->Maven Project<br />
-    创建jar项目可以选择使用maven-archetype-quickstart来创建<br />
-    创建war项目可以选择使用maven-archetype-webapp来创建<br />
-    接着填写项目信息:<br />

>       Group Id: 项目的唯一标识,并且配置时的生成路径也是由此生成,如org.code
        Artifact Id: 项目通用名
        Version: 版本
        Package: 打包机制

-    添加依赖包时通过在pom.xml中添加例如:<br />

>        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>18.0</version>
        </dependency>

## Git<br />
右击项目Team commit进行相关操作<br />
<br />
# Eclipse使用设置<br />
## 字体<br />
UTF-8<br />
window->preferences->general->appearance->colors and fonts全选edit<br />
window->preference->general->workspace->text file encoding<br />
## workspace设置<br />
window->preference->general->Startup and ShutDown 勾选Refresh workspace on startup重启eclipse设置目录<br />
<br />
## 代码格式<br />
window->Preferences->java->code style->formatter<br />
edit 修改格式:<br />
-    Tabs only 改成 Spaces only大小为4<br />
-    类似还有其他的格式修改<br />

<br />
# Eclipse使用快捷键<br />
Ctrl + Shift + F: 格式化<br />
Ctrl + Shift + R: 打开资源<br />
Ctrl + Shift + T: 打开类型<br />
Alt + Shift + T: 显示重构菜单<br />
Ctrl + H: 显示搜索对话框<br />
Ctrl + o: 快速outline列出所有方法<br />
Ctrl + e: 快速切换编辑器，在打开的选项卡之间切换<br />
Alt + /: 单词补全<br />
Alt + 上下: 上下移动选中的行<br />
Alt + 左右: 上一个/下一个光标的位置<br />
Ctrl + D: 删除行<br />
Ctrl + m: 最大化显示窗口<br />
Shift + F2: 打开外部Java文档<br />
Ctrl + 1: 快速修正<br />
<br />
<br />
