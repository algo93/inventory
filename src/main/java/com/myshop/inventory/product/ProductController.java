package com.myshop.inventory.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {
    @RequestMapping("/product")
    @ResponseBody
    public String giveProduct(){
        return "take Product";
    }
}
