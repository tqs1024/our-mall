package com.nb.controller;

import com.nb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author : 谭庆山
 * @Date : 2021/7/18 21:11
 * @Description TODO
 */
@Controller
public class GoodsController {

    @Autowired
    public GoodsService service;

    @GetMapping({"/home", "/", "/index"})
    public String home(Model model) {
        model.addAttribute("goods", service.findAll());
        return "home";
    }

    /**
     * @Params [id]
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/19 22:01
     * @Description 传入商品id ，返回商品详情页视图，model携带查询数据
     */
    @GetMapping("/details")
    public String details(@RequestParam Long id, Model model) {
        model.addAttribute("goods", service.findOneDetailsById(id));
        return "details";
    }

    /**
     * @Params []
     * @Return {@link String}
     * @Author 谭庆山
     * @Date 2021/7/20 9:52
     * @Description 传入类别ID返回同类别列表，model携带数据进入sort.html
     */
    @GetMapping("/sort")
    public String sort(@RequestParam Long typeid, Model model) {
        model.addAttribute("goods", service.findGoodsByType(typeid));
        model.addAttribute("sorttype", service.findTypeNameById(typeid));
        return "sort";
    }
}
