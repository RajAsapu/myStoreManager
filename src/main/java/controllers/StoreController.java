package controllers;

import dto.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/store")
public class StoreController {

    @GetMapping("/register")
    public String demo(){
        return "Store added";
    }
    /*
     * Service to register a store
     */
    @PostMapping("/register")
    public String registerStore(Store store){
        return "Store added";
    }


    /*
     * Service to update store details
     */
    @PostMapping("/update")
    public String updateStoreDetails(Store store){
        return "Update Store Details";
    }
}
