/*测试main中Demo1中的函数返回值是否正确*/
package com.test;

import com.example.Demo1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by jizhi.qian on 2018/11/14.
 */
public class UnitTest {
    @Test
    public void testAddInt(){
        int a = new Random().nextInt(1000);/*随机生成1000以内的整型数*/
        int b = new Random().nextInt(2000);/*随机生成2000以内的整型数*/

        int c = a + b;
        int r = new Demo1().intAdd(a, b);/*使用demo1中的intAdd函数算出一个r值*/
        Assert.assertTrue("检查intAdd(a, b)函数返回值是否正确", c == r);
    }/*r值和c值相等，则intAdd(a, b)函数返回值正确,不相等，则返回错误*/

    @Test
    public void testSubtractInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract(a, b);
        Assert.assertTrue("檢查intSubtract(a, b)函数返回值是否正确", c == r);
    }

    @Test
    public void testSubtractInt2(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        int c = a - b;
        int r = new Demo1().intSubtract2(a, b);
        Assert.assertTrue("檢查intSubtract2(a, b)函数返回值是否正确", c == r);
    }

    @Test
    public void testMultiplyInt(){
        int a = new Random().nextInt(1000);
        int b = new Random().nextInt(2000);

        long c = a * b;
        long r = new Demo1().intMultiply(a, b);
        Assert.assertTrue("檢查intMultiply(a, b)函数返回值是否正确", c == r);
    }

    @Test
    public void testStringLeng() throws Exception{
        int lenResult = new Demo1().countlength("12345678901");
        Assert.assertFalse("Test leng", lenResult == 11);
    }
}
