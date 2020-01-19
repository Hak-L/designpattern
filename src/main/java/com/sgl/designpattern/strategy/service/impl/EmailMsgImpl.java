package com.sgl.designpattern.strategy.service.impl;

import com.sgl.designpattern.strategy.annotation.MsgTypeHandler;
import com.sgl.designpattern.strategy.enums.MsgTypeEnum;
import com.sgl.designpattern.strategy.service.MsgTypeService;
import org.springframework.stereotype.Service;


/**
 * @Description: 邮件消息
 * @Author: sgl
 * @Date: 2020/1/17 上午 10:54
 */
@Service
@MsgTypeHandler(value = MsgTypeEnum.EMAIL_MSG)
public class EmailMsgImpl implements MsgTypeService{

    @Override
    public void sendMsg(Object object) {
        System.out.println("发送邮件消息....");
    }
}
