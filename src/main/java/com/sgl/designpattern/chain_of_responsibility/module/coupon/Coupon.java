package com.sgl.designpattern.chain_of_responsibility.module.coupon;

import com.sgl.designpattern.chain_of_responsibility.module.basemodule.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon extends BasePojo {

	private static final long serialVersionUID = 1L;

	private String couponName; // 优惠券名称
	private String couponDescription; // 优惠券描述
	private Integer couponType; // 优惠券类型：1:满减券  2:折扣券  3:抵用券
	private Integer useType; // 使用范围：1:全部产品  2:指定产品
	private String productId; // 指定产品id（数组）
	private Integer restrictType; // 限制条件类型： 1:到达一定金额 2:到达一定数量 3:无限制
	private Integer restrictTarget; // 限制条件：金额，或数量（必须正整数）
	private BigDecimal amount; // 优惠金额
	private Double discounts; // 折扣
	private Date effectiveTime; // 优惠券开始生效时间
	private Integer timeType; // 1:领取几小时后到期  2:绝对时间
	private Integer timeCount; // time_type 为1时，几小时候后到期
	private Date absoluteTime; // time_type 为2时，优惠券绝对到期时间
	private Integer publishCount; // 发行数量
	private Integer perLimit; // 每人限领张数
	private Integer memberLevel; // 可使用的会员类型：0:无限制
	private Date enableTime; // 开始可以领取的日期
	private String memo; // 备注

}