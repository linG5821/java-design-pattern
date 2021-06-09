## Java Design Pattern

## 设计模式的分类

按照意图可以分为以下5类：

1. 接口型模式： 适配器模式、外观模式、合成模式、桥接模式
2. 职责型模式： 单例模式、观察者模式、调停者模式、代理模式、职责链模式、享元模式
3. 构造型模式： 构建者模式、工厂方法模式、抽象工厂模式、原型模式、备忘录模式
4. 操作型模式： 模板方法模式、状态模式、策略模式、策略模式、命令模式、解释器模式
5. 扩展型模式： 装饰器模式、迭代器模式、访问者模式

## 接口型模式的应用场景

| 场景                                           | 可运用的模式 |
| ---------------------------------------------- | ------------ |
| 适配类的接口以匹配客户端期待的接口             | 适配器模式   |
| 为一组类提供的一个简单接口                     | 外观模式     |
| 为单个对象与符合对象提供统一的接口             | 合成模式     |
| 解除抽象与实现之间的耦合，使得二者能够独立演化 | 桥接模式     |

## 适配器模式

* 意图：使用不同类所提供的服务为客户端提供它所期望的接口
* 大白话解释：在无法(无需)修改现有接口或者类的情况下， 让原本接口不兼容的类可以相互合作，供客户类调用的设计就是适配器模式
* 类适配与对象适配
    1. 类适配模式
       ```java
       /**
        适配器实现了抽象目标类接口(Target)，并继承了适配者类(Apaptee) 的适配方式
        缺点:
        1. JAVA语言不支持多重集成，一次最多只能适配一个适配者，不能同时适配多个适配者。
        2. Java中适配者不能为最终类
        3. Java中目标抽象类只能为接口，不能为类，有一定局限性 
       */
       class Adapter extends Apaptee implements Target {
         public void doAction() {
            doApapteeAction();
         }
       }
       ```
    2. 对象适配模式
       ```java
       /**
        适配器中维持一个适配者的引用，实现了抽象目标类接口(Target) 的适配方式
        缺点: 在适配器中置换适配者的某些方法比较麻烦
        1. 
       */
       class Adapter implements Target {
         private Apaptee apaptee;
         public void doAction() {
            apaptee.doApapteeAction();
         }
       }
       ```
    3. 缺省适配模式：在某些情况下我们不需要提供一个接口的所有实现方法，此时可以设计一个抽象类实现该接口，
       并未每个方法提供一个默认实现，那么该抽象类的子类可以选择性的实现某些方法来实现需求。在Java8中的接口支持了默认实现，可以通过 default 关键字提供某个方法的默认实现。
* 适用场景：

1. 系统需要复用一些现有的类，但是这些类的接口（如方法名）不符合系统的需要，甚至没有这些类的源代码。
2. 想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的类一起工作

   
      
      
