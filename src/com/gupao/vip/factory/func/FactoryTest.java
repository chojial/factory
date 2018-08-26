package com.gupao.vip.factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MengniuFactory();
        System.out.println(factory.getMilk());

        Factory factory2 = new YiliFactory();
        System.out.println(factory2.getMilk());
    }
}
