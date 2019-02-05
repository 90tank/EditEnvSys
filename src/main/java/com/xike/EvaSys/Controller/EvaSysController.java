package com.xike.EvaSys.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EvaSysController {

    private static Logger logger = LoggerFactory.getLogger(EvaSysController.class);

    @RequestMapping("/sayhi")
    public String say(){

        logger.info(" say hello   ");

        return "initTest";
    }


}
