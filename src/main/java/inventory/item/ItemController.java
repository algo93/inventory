package inventory.item;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @RequestMapping("/item")
    @ResponseBody
    public String giveItem()
    {
        return "take Item";
    }
}

