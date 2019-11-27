package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author fong
 * @date 2019/11/27 - 2:44 PM
 */
public class TemplateTest {
    //模板六:prsf
    private static final Customer cust = new Customer();
    //psf
    public static final int a = 1;
    //psfi
    public static final int b = 1;
    //psfs
    public static final String s = "fang";
    //模板一:psvm
    public static void main(String[] args) {
        //模板二:sout
        System.out.println();
        //变形:soutp(参数) / soutm(方法) / soutv(变量) / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        int num1 = 10;
        System.out.println(num1);


        //模板三:
        String[] arr = new String[]{"你","我","他"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四:list.for list.fori list.forr(倒序遍历)
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        for (Object o : list) {
            
        }
        //模板四:ifn  inn
        if (list == null) {

        }
        if (list != null) {

        }

    }

    private int e = 1; //df
}
