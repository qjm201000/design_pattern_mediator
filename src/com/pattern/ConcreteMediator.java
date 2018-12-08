package com.pattern;

/**
 * 中介实现类
 */
public class ConcreteMediator implements Mediator{
    private Man man;//男的
    private Woman woman;//女的

    @Override
    public void contact(Person person) {//中介中去匹配
        if(person instanceof  Man){
            this.setMan((Man) person);
        }else if(person instanceof  Woman){
            this.setWoman((Woman) person);
        }

        //判断条件
        if(man == null || woman == null){
            System.out.println("我不是同性恋！");
        }else if(man.getCondition() == woman.getCondition()){
            System.out.println(man.getName() + "和"  + woman.getName() + "绝配。");
        }else{
            System.out.println(man.getName() + "和" + woman.getName() + "不配");
        }
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }

    public Woman getWoman() {
        return woman;
    }

    public void setWoman(Woman woman) {
        this.woman = woman;
    }
}
