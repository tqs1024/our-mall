package com.nb.controller;

import com.nb.entity.Shoppingcart;
import com.nb.service.ShoppingCartService;
import com.nb.vo.ShoppingCartOV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 谭杭
 * @version 1.0
 * @description TODO()
 * @date 2021/7/19 16:06
 */
@Controller
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * 查找用户购物车商品
     */
    @RequestMapping("/queryall")
    public String queryAll(HttpSession session, Model model) {
        Long uid = (Long) session.getAttribute("userId");
        List<ShoppingCartOV> goods = shoppingCartService.selectAllByUser(uid);

        model.addAttribute("goods", goods);
        System.out.println(goods);
        return "ShoppingCart";
    }

    /**
     * 插入订单
     */
    @GetMapping("/insert")
    public String insertGoodsToShoppingCart(Long gid, Model model, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        Shoppingcart shoppingcart = new Shoppingcart();
        shoppingcart.setGid(gid);
        shoppingcart.setUid(userId);
        System.out.println(shoppingcart);
        int row = shoppingCartService.insertGoodsToShappingCart(shoppingcart);
        if (row != 0) {
            System.out.println("添加购物车成功");
            model.addAttribute("judge", "OK");
            model.addAttribute("message", "添加购物车成功");
        } else {
            System.out.println("添加购物车失败");
            model.addAttribute("judge", "ERROR");
            model.addAttribute("message", "添加购物车失败");
        }
        return "redirect:/queryall";
    }

    /**
     * 删除订单
     */
    @GetMapping("/deleteshoppingcart")
    public String deleteGoodsFromShoppingCart(Long id, ModelAndView model) {
        int row = shoppingCartService.deleteGoodsInShoppingCart(id);

        if (row != 0) {
            System.out.println("删除成功");
            model.addObject("judge", "OK");
            model.addObject("message", "删除成功");
        } else {
            System.out.println("删除失败");
            model.addObject("judge", "ERROR");
            model.addObject("message", "删除失败");
        }
        return "forward:/queryall";
    }


}
