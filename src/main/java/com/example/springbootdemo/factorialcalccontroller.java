package com.example.springbootdemo;

import com.example.springbootdemo.factorialcalc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


import java.io.IOException;


@Controller
public class factorialcalccontroller {

    @GetMapping("/factorial")
    public String covid(@RequestParam(name="num", required=true,  defaultValue="10") String num, Model model) throws IOException {
        int nth = Integer.parseInt(num);

        model.addAttribute("num", factorialcalc.driver(nth));
        return "factorial";
    }

}
