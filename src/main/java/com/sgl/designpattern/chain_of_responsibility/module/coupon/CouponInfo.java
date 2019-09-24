package com.sgl.designpattern.chain_of_responsibility.module.coupon;



import com.sgl.designpattern.chain_of_responsibility.module.basemodule.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CouponInfo extends BasePojo{

	private static final long serialVersionUID = 1L;
	private Long couponId; // 优惠券配置表sq_coupon  id主键
	private Date effectiveTime; // 优惠券开始生效时间
	private Date failureTime; // 优惠券失效时间
	private String userSno; // 用户sno
	private Integer couponStatus; // 使用状态：1:未使用；2:已使用；3:已过期  4:已经删除
	private String changeReason; // 操作原因（定时任务过期，删除理由）
	private Integer getWay; // 获取途径（1：活动领取，2：后台赠送，3：退款返还）
	private String getReason; // 获取理由（返还记录订订单号，赠送记录理由）
	private String orderNo; // 订单编号

}