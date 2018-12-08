package com.pattern;

/**
 * 女人
 */
public class Woman extends Person {
    public Woman(String name, int condition,ConcreteMediator mediator) {
        super(name, condition,mediator);
    }

    @Override
    void getPartner(Person person) {
        this.mediator.setMan(null);//初始化
        this.mediator.setWoman(this);//设置自己
        this.mediator.contact(person);//去匹配
    }
}
