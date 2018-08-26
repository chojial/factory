package com.gupao.vip.factory.func;

import com.gupao.vip.factory.Mengniu;
import com.gupao.vip.factory.Milk;

public class MengniuFactory implements Factory {
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
