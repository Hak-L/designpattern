package com.sgl.designpattern.strategy;

import com.sgl.designpattern.strategy.context.SendMsgTypeContext;
import com.sgl.designpattern.strategy.enums.MsgTypeEnum;
import com.sgl.designpattern.strategy.service.MsgTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StrategyTests {
    @Resource
    private SendMsgTypeContext conditionTypeContext;

    //策略模式测试
    @Test
    public void contextLoads() {

        //这里直接取所有类型枚举测试
        MsgTypeEnum[] typeEnums = MsgTypeEnum.values();
        for (MsgTypeEnum typeEnum : typeEnums) {
            //可以根据不同的类型发送不同的消息
            MsgTypeService typeService = conditionTypeContext.getMessageService(typeEnum.getIndex());
            //实际开发中可以用来传参
            Object object = new Object();
            typeService.sendMsg(object);
        }

    }

}
