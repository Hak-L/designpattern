package com.sgl.designpattern.chain_of_responsibility.module;
/**
 * Created by Ni Klaus on 2019/9/9 0009
 */


import java.math.BigDecimal;
import java.util.List;

/**
 *@ClassName CheckDyCoupon
 *@Description TODO 使用满减券
 *@Author Ni Klaus
 *@Date 2019/9/9 0009 下午 17:20
 *@Version 1.0
 */
public class UseMjCoupon implements UseCouponBase{
    @Override
    public void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts) {

        System.out.println("使用满减券逻辑处理");
        //使用满减券逻辑处理（怎么使用的代码此处我就省略了，具体业务逻辑具体实现就行）

        //交给下一个处理
        useCouponBase.doSomething(couponList,useCouponBase,discounts);
    }
}