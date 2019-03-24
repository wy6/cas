package cn.tju.cas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: Test Class
 * @Author: WangY
 * @Date: Created in 2019/3/24
 * @Modified By：
 */

@Controller
@RequestMapping(value = "/test")
public class HelloWord {

    @GetMapping(value = "/ok")
    @ResponseBody
    public String sayOk() {
        return "This is ok.";
    }

}
