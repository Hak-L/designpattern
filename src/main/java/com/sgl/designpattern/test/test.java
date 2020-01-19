package com.sgl.designpattern.startTest;/**
 * Created by Ni Klaus on 2019/9/24 0024
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@ClassName test
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/9/24 0024 下午 14:24
 *@Version 1.0
 */
@Controller
public class test {
    @RequestMapping(value = "/login")
    @ResponseBody
    public String testDoor(){
        return "helle spring boot";
    }
}
