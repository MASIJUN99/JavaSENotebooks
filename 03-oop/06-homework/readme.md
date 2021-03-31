说句实在话，我感觉太难了...主要是controller难写。

仔细理一下各个类的方法

# [view包](./src/sample/java/view)

## [View类](./src/sample/java/view/View.java)

视图类，包含的方法都是为了界面的

### mainMenu()

主视图，循环选择身份

### userMenu()

用户视图，目前就一个取出快递

### adminMenu()

快递员视图，四个选项，返回数字

### insertInfo()

获取信息

### printExpress()

将传入的Express类对象打印

### printExpress()

基本上与insertInfo差不多

### deleteConfirm()

删除确认

### getConfirm()

取出确认

### getCode()

输入取件码

### getNumber(String usage)

因为是面向快递员，删除、修改都会用到，所以传入“删除”或者“修改”

# [domain包](./src/sample/java/domain)

## [Express](./src/sample/java/domain/Express.java)

常规类，包含三个属性，公司名、单号、取件码。

# [dao包](./src/sample/java/dao)

## [ExpressDao类](./src/sample/java/dao/ExpressDao.java)

含四个属性

分别是快递柜长宽、快递柜、快件数量

### 具体方法基本都有备注，去看下吧

# [service包](./src/sample/java/service)

## [AdminService类](./src/sample/java/service/AdminService.java)

面向快递员的类

包含了删除、插入、更新

有部分内容应该放在view里，我实在懒了，就这样吧。

## [UserService类](./src/sample/java/service/UserService.java)

面向用户的类

仅有取件功能

有部分内容也应该在view里


> 写这个写吐了，被自己恶心吐了
> 
> 总结写在最后面，这个我写的实在太拉稀了，等回头写个spring-mybatis版本的，
> 这个版本藕合度太高了（其实也还好）。
> 
> 尤其是view包，写起来真难受，我真的很讨厌while去不停的读输入，总感觉会Stackoverflow，
> 还是jsp好用，等回头再搞，先把进度追到我不会的部分重点去学。