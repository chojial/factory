package com.gupao.vip.factory.func;

import com.gupao.vip.factory.Milk;

public interface Factory {
    //工厂必然具有生产产品技能，统一的产品出口
    Milk getMilk();

}
