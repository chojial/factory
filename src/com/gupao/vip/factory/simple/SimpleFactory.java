package com.gupao.vip.factory.simple;

import com.gupao.vip.factory.Mengniu;
import com.gupao.vip.factory.Milk;
import com.gupao.vip.factory.Yili;

class SimpleFactory {

    Milk getMilk(String name){


        switch (name){

            case "蒙牛": return new Mengniu();

            case "伊利": return new Yili();
            default:
                System.out.println("不能生产您所需的产品");

        }



        return  null;
    }
}
