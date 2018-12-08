package com.pattern;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        Person zhangsan = new Man("张三",3,concreteMediator);
        Person xiaohong = new Woman("小红",2,concreteMediator);
        Person lisi = new Man("李四",2,concreteMediator);

        zhangsan.getPartner(xiaohong);//查看是否相配
        zhangsan.getPartner(lisi);//查看是否相配
        lisi.getPartner(xiaohong);//查看是否相配
    }
}
