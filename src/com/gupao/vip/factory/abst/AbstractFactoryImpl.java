package com.gupao.vip.factory.abst;

import com.gupao.vip.factory.Mengniu;
import com.gupao.vip.factory.Milk;
import com.gupao.vip.factory.Yili;

public class AbstractFactoryImpl extends AbstractFactory {
    @Override
    public Milk getMengniu() {
        return new Mengniu();
    }

    @Override
    public Milk getYili() {
        return new Yili();
    }
}
