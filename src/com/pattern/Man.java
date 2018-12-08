package com.pattern;

/**
 * 男人
 */
public class Man extends Person{
    public Man(String name, int condition,ConcreteMediator mediator) {
        super(name, condition, mediator);
    }

    @Override
    void getPartner(Person person) {
        this.mediator.setWoman(null);//初始化
        this.mediator.setMan(this);//设置自己
        this.mediator.contact(person);//去匹配
    }
}
