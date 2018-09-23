#git用法介绍

###我的git地址：
[nuaa@101.132.46.252:/home/nuaa/Software-Test/.git](http: "nuaa@101.132.46.252:/home/nuaa/Software-Test/.git")
##安装
apt-get update
apt-get git 
即可

##创建仓库
git init --bare

##克隆仓库
git clone user@[url]

##设置远程仓库
git remote [url]

##添加监视文件
git add

##提交更改
git commit

##拉取代码
git pull

##提交代码
git push

###以上是我在搭建git时候时使用的代码

<br />


##搭建流程
在云上初始化仓库并创建test.txt文件
![](https://raw.githubusercontent.com/Sk-Raven/Software-Test/master/photo/1.png)
在本地git clone nuaa@101.132.46.252:/home/nuaa/Software-Test/.git

设置远程仓库
![](https://raw.githubusercontent.com/Sk-Raven/Software-Test/master/photo/3.png)

可以看到文件夹里出现了test.txt文件
![](https://raw.githubusercontent.com/Sk-Raven/Software-Test/master/photo/2.png)

 在里面添加 **I love Software test. ** 后保存
 
 git add，commit，push三连
 ![](https://raw.githubusercontent.com/Sk-Raven/Software-Test/master/photo/4.png)
 
 在服务器上看test.txt
  ![](https://raw.githubusercontent.com/Sk-Raven/Software-Test/master/photo/5.png)
  
  git pull可以同步服务器的代码到本地，用法和push一样。
 
 
 







