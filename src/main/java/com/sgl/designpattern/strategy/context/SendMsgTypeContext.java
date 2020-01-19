package com.sgl.designpattern.strategy.context;

import com.sgl.designpattern.strategy.service.MsgTypeService;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 类型枚举策略映射管理容器
 * @Author: sgl
 * @Date: 2020/1/17 上午 11:49
 */
@Component
public class SendMsgTypeContext {

    private final Map<Integer, MsgTypeService> handlerMap = new HashMap<>(8);

    public MsgTypeService getMessageService(Integer type) {
        return handlerMap.get(type);
    }

    public void putMessageService(Integer code, MsgTypeService conditionTypeService) {
        handlerMap.put(code, conditionTypeService);
    }

}
