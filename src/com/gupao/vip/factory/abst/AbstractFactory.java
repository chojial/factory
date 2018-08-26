package com.gupao.vip.factory.abst;

import com.gupao.vip.factory.Milk;

/**
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展
 */
public abstract class AbstractFactory {

    /**
     * 获得一个蒙牛牛奶
     *
     */
    public abstract Milk getMengniu();

    /**
     * 获得一个伊利牛奶
     *
     */
    public abstract Milk getYili();
}
