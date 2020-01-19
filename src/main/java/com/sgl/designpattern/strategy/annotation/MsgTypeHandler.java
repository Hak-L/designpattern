package com.sgl.designpattern.strategy.annotation;

import com.sgl.designpattern.strategy.enums.MsgTypeEnum;
import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgTypeHandler {
    MsgTypeEnum value();
}
