## 挑战练习
* 挑战2.1 写出在Java中抽象类和接口的三点区别
   <p>答：</p>
   
    * 抽象类是类，接口不是类
    * 抽象类中可以包含非抽象方法，接口中都是抽象方法
    * 一个类可以继承一个抽象类，但是可以继承多个抽象接口
    * 抽象类可以声明和使用字段，接口不能，但可以创建静态的final常量 (答案补充)
    * 抽象类中的方法可以是 public、protected、private 或者默认的 package，接口的方法都是 public (答案补充) 
      PS: java8接口中的方法可以有默认方法(自补充)
*  挑战2.2
![](https://ling-root-bucket.oss-cn-hangzhou.aliyuncs.com/picgo/20210607195641.png)
![](https://ling-root-bucket.oss-cn-hangzhou.aliyuncs.com/picgo/20210607200736.png)
   <p>答：</p> A B D(答案补充)
* 挑战2.3 请列举一个接口，它包含的方法并不要求实现该接口的类必须返回值，或者代表调用者执行若干操作
    <p>答：</p>
  
   * void setSimTime(double t);(错误)
   * 例如 需要在触发 MouseInputListener(鼠标监听器) 的 mouseDragged 方法时 执行某些操作，但是同一侦听器的 mouseMoved 方法却可以是一个空的实现 (答案补充) 
* 挑战3.1 ![](https://ling-root-bucket.oss-cn-hangzhou.aliyuncs.com/picgo/20210609140901.png)
   <p>答：</p>

  ![](https://ling-root-bucket.oss-cn-hangzhou.aliyuncs.com/picgo/20210609141811.png)
* 挑战3.2 参见 com.ling5821.java.design.pattern.adapter 包下的代码示例