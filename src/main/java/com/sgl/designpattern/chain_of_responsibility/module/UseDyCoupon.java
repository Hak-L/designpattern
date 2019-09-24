package com.sgl.designpattern.chain_of_responsibility.module;
/**
 * Created by Ni Klaus on 2019/9/9 0009
 */

import java.math.BigDecimal;
import java.util.List;

/**
 *@ClassName CheckDyCoupon
 *@Description TODO 抵用券
 * 注意：抵用券只有 使用范围：1:全部产品  2:指定产品 的限制。没有限制条件类型的限制
 *@Author Ni Klaus
 *@Date 2019/9/9 0009 下午 17:20
 *@Version 1.0
 */
public class UseDyCoupon implements UseCouponBase{

    @Override
    public void doSomething( List couponList, UseCouponBase useCouponBase, BigDecimal discounts) {
        //使用抵用券逻辑处理
        System.out.println("使用抵用券逻辑处理");

        useCouponBase.doSomething(couponList,useCouponBase,discounts);
    }

}
