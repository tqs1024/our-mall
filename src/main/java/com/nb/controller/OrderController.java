package com.nb.controller;

import com.nb.service.OrderService;
import com.nb.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService service;

    @RequestMapping("/order")
    public String order() {
        return "order";
    }

    @ResponseBody
    @RequestMapping("/orderAll")
    public List<OrderVo> getAllOrder(HttpSession session) {
        Long uid = ((Long) session.getAttribute("userId"));
        List<OrderVo> orderVos = service.selectAllById(uid);
        return orderVos;
    }

    @ResponseBody
    @GetMapping("/insertOrder")
    public Boolean insertOreder(Long gid, Integer count, HttpSession session) {
        Long uid = ((Long) session.getAttribute("userId"));
        return service.insertOrder(uid, gid, count);
    }

    @ResponseBody
    @GetMapping("/disabled")
    public Boolean disabledOreder(Long id, HttpSession session) {
        Long uid = ((Long) session.getAttribute("userId"));
        return service.disAbled(uid, id);
    }
}
