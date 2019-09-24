package com.sgl.designpattern.chain_of_responsibility.controller;
/**
 * Created by Ni Klaus on 2019/9/24 0024
 */

import com.sgl.designpattern.chain_of_responsibility.module.UseCouponChain;
import com.sgl.designpattern.chain_of_responsibility.module.UseDyCoupon;
import com.sgl.designpattern.chain_of_responsibility.module.UseMjCoupon;
import com.sgl.designpattern.chain_of_responsibility.module.UseZkCoupon;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *@ClassName UseCoupon
 *@Description TODO  消费优惠券  -------  责任链模式
 *@Author Ni Klaus
 *@Date 2019/9/24 0024 下午 15:02
 *@Version 1.0
 */
@Controller
public class UseCoupon {

    public static void main(String[] args) {
        //新建一个各类优惠券处理路由
        UseCouponChain useCouponChain = new UseCouponChain();
        //需要处理哪些优惠券按顺序添加进路由就行
        useCouponChain.addBaseCase(new UseMjCoupon())
                .addBaseCase(new UseZkCoupon())
                .addBaseCase(new UseDyCoupon());
        /*这里couponList 是形参，
        具体业务中可以是用户的可用优惠券列表，
        可以传入执行器中进行业务逻辑处理*/
        List couponList = new ArrayList<>();
        //执行业务逻辑处理
        useCouponChain.doSomething(couponList,useCouponChain,new BigDecimal(0));
    }

}
