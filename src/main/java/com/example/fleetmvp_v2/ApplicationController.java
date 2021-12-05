package com.example.fleetmvp_v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){
        return "index";
    }

    @GetMapping("/hr")
    public String hr(){

        return "/hr/index";
    }
    @GetMapping("/account")
    public String account(){

        return "/account/index";
    }
    @GetMapping("/IT")
    public String atIT(){

        return "/IT/index";
    }
    @GetMapping("/payroll")
    public String payRole(){

        return "/payroll/index";
    }
    @GetMapping("/vehicle")
    public String vehicles(){

        return "/fleet/index";
    }
}


