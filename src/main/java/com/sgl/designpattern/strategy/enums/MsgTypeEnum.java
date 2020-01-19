package com.sgl.designpattern.strategy.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author sgl
 * @Description 发送消息类型
 * @Date 2020/01/16 上午 10:13
 **/
@Getter
@AllArgsConstructor
public enum MsgTypeEnum {
	EMAIL_MSG(1, "邮件消息"),
	SHORT_MSG(2, "短信消息");
	private int index;
	private String description;

}
