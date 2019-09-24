package com.sgl.designpattern.chain_of_responsibility.module;
/**
 * Created by Ni Klaus on 2019/9/9 0009
 */

import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Ni Klaus
 * @Description //TODO 使用优惠券路由
 * @Date 上午 11:15 2019/9/17 0017
 * @Param 
 * @return 
 **/
@Data
public class UseCouponChain implements UseCouponBase{
    // 所有 case 列表
    private List<UseCouponBase> mCaseList = new ArrayList<>();
    // 索引，用于遍历所有 case 列表
    private int index = 0;

    // 添加 case
    public UseCouponChain addBaseCase(UseCouponBase base) {
        mCaseList.add(base);
        return this;
    }

    @Override
    public void doSomething(List couponList,UseCouponBase useCouponBase,BigDecimal discounts) {
        //所有遍历完了，直接返回
        if(index == mCaseList.size()){
            return;
        }
        //获取当前 case
        UseCouponBase currentCase = mCaseList.get(index);
        //修改索引值，以便下次回调获取下个节点，达到遍历效果
        index++;
        //调用 当前 case 处理方法
        currentCase.doSomething(couponList,useCouponBase,discounts);
    }
}
