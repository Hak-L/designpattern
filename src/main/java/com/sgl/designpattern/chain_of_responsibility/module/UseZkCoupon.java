package com.sgl.designpattern.chain_of_responsibility.module;
/**
 * Created by Ni Klaus on 2019/9/9 0009
 */

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author Ni Klaus
 * @Description //TODO 折扣券 执行器
 * @Date 下午 15:21 2019/9/16 0016
 * @Param
 * @return 
 **/
public class UseZkCoupon implements UseCouponBase{
    @Override
    public void doSomething(List couponList, UseCouponBase useCouponBase, BigDecimal discounts){

        System.out.println("使用折扣券逻辑处理");
        //使用折扣券逻辑处理（怎么使用的代码此处我就省略了，具体业务逻辑具体实现就行）

        //交给下一个执行器处理
        useCouponBase.doSomething(couponList,useCouponBase,discounts);
    }
}
