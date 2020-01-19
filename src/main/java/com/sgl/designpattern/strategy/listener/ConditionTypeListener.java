package com.sgl.designpattern.strategy.listener;

import com.sgl.designpattern.strategy.annotation.MsgTypeHandler;
import com.sgl.designpattern.strategy.context.SendMsgTypeContext;
import com.sgl.designpattern.strategy.service.MsgTypeService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description: 初始化所有消息类型枚举和策略映射
 * @Author: sgl
 * @Date: 2020/1/17 上午 11:47
 */
@Component
public class ConditionTypeListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Map<String, Object> beans = event.getApplicationContext().getBeansWithAnnotation(MsgTypeHandler.class);
        SendMsgTypeContext conditionTypeContext = event.getApplicationContext().getBean(SendMsgTypeContext.class);
        beans.forEach((name, bean) -> {
            MsgTypeHandler typeHandler = bean.getClass().getAnnotation(MsgTypeHandler.class);
            conditionTypeContext.putMessageService(typeHandler.value().getIndex(), (MsgTypeService) bean);
        });
    }
}
