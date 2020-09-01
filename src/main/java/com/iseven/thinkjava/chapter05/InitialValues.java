package com.iseven.thinkjava.chapter05;

import java.util.Date;

public class InitialValues {
	//基本类型可以直接指定具体的值
    int i = 999;
    //引用类型可以创建对象
    Date d = new Date();
    //可以调用方法
    int j = f();
    int f(){return 11;}
    //也可以带参数的方法,这里注意如果下面两行调换位置将会报错，与初始化顺序有关
    int a = g();
    int b = h(a);
    int g(){return 11;}
    int h(int s){return s*11;}
}
