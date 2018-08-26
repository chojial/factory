package com.gupao.vip.factory.func;

import com.gupao.vip.factory.Milk;
import com.gupao.vip.factory.Yili;

public class YiliFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
