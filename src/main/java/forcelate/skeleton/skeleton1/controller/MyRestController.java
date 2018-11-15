package forcelate.skeleton.skeleton1.controller;

import forcelate.skeleton.skeleton1.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @Autowired
    ItemService itemService;

    @GetMapping("/get")
    public double getItem() {
        return itemService.getItems();
    }
}

