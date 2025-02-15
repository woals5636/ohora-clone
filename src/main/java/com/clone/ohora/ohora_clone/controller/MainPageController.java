package com.clone.ohora.ohora_clone.controller;

import com.clone.ohora.ohora_clone.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainPageController {

    private final ProductService productService;

    @RequestMapping("/oho_main")
    public String main() {
        log.info("> MainPageController main()...");
        return "oho_main";
    }
}
