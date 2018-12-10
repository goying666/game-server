package com.renchaigao.zujuba.gameserver.controller;

import com.renchaigao.zujuba.domain.response.ResponseEntity;
import com.renchaigao.zujuba.gameserver.service.impl.GameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping(value = "/get")
public class StoreController {
//    @Autowired
//    GameServiceImpl gameServiceImpl;
//
//    @GetMapping(value = "/storeinfo/{userid}", consumes = "application/json")
//    @ResponseBody
//    public ResponseEntity getStoreInfoByUserId(@PathVariable("userid") String userid) {
//        return gameServiceImpl.getStoreInfoByUserId(userid);
//    }
    @RequestMapping("/hello")
    public String helloHtml(Map<String,Object> map){

        map.put("hello","from TemplateController.helloHtml");
        return"/hello";
    }
}
