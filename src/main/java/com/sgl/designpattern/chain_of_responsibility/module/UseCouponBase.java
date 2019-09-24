package com.sgl.designpattern.chain_of_responsibility.module;


import java.math.BigDecimal;
import java.util.List;

/**
 *@ClassName UseCouponBase
 *@Description TODO  抽象使用优惠券业务逻辑接口
 *@Author Ni Klaus
 *@Date 2019/9/9 0009 下午 16:58
 *@Version 1.0
 */
interface UseCouponBase{
    // 所有处理逻辑的方法
    void doSomething(List couponList,UseCouponBase useCouponBase, BigDecimal discounts);
}
