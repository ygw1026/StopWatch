package com.nhnacademy;

public class ArrayListTestMain {
    public static void main(String[] args) {
        PerformanceTestable performanceTestable = new ArrayListTest();
        ArrayListTestProxy arrayListTestProxy = new ArrayListTestProxy(performanceTestable);
        arrayListTestProxy.test();
    }
}
