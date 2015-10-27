## w
显示谁登陆了系统并执行了哪些程序
- w -h 不显示头部信息
- w <username> 显示指定用户信息

## nmon
Nmon(nigel's monitor 的简性能写)是一个显示系统性能信息的工具
- sudo apt-get install nmon
- nmon 显示与network，cpu，memory和磁盘使用情况的信息
- 按 c 显示cpu信息
- 按 n 显示network信息
- 按 d 显示disk信息

## ncdu
是一个支持光标的du程序，用来分析各种目录占用的磁盘空间
- ncdu <目录>
- 按 n 通过文件名来排序
- 按 s 按照文件大小来排序

## slurm
一个基于网络接口的带宽监控命令行程序，它会用字符来显示文本图形
- apt-get install slurm
- slurm -i <interface> or slurm -i eth1
- 按 l 显示lx/tx指示灯
- 按 c 切换到经典模式
- 按 r 刷新屏幕
- 按 q 退出

## findmnt
用于查找挂载的文件系统。它用来列出安装的设备，当需要时也可以挂载或卸载设备，它是util-linux软件包的一部分
- findmnt -l 以列表格式输出
- findmnt -s 列出在fstab中挂载的文件系统
- findmnt -t ex4 按文件类型列出已挂载的文件系统

## dstat
一种灵活的组合工具，它可用于监控内存，进程，网络和磁盘性能，他可以用来取缔ifstat，iostat，dmstat等
- apt-get install dstat
- dstat 查看有关cpu，硬盘和网络的详细信息
- -c cpu
- -d 磁盘

## saidar
另一种基于命令行的系统统计数据监控工具，提供有关磁盘使用，网络，内存，交换分区等信息
- sudo apt-get install saidar
- saidar -c 启动彩色输出

## ss
ss(socket statistics)是一个很好的替代netstat的选择，它从内核空间收集信息，比netstat的性能更好
- ss | less 列出所有连接
- ss -A tcp 列出tcp流量
- ss -ltp 列出进程名和pid

## ccze
一个美化日志的工具
- apt-get install ccze
- ccze -l 列出ccze模块
- tailf /var/log/syslog | ccze -h > /home/user/rajnn.html  将日志保存为html文件

## ranwhen.py
一种基于Python的终端工具，它可以用来以图形方式显示系统活动状态。详细信息以一个丰富多彩的柱状图来展示。
- unzip ranwhen-master.zip && cd ranwhen-master 解压
- python3.2 ranwhen.py 运行工具

