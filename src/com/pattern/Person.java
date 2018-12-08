package com.pattern;

/**
 * Colleague 抽象类
 */
public abstract class Person {
    private int condition;//条件，条件相同时，才匹配
    private String name;//用户名

    public Person(String name,int condition,ConcreteMediator mediator){
        this.name = name;
        this.condition = condition;
        this.mediator = mediator;
    }

    protected ConcreteMediator mediator;//代理

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    abstract void getPartner(Person persion);//进行匹配
}
