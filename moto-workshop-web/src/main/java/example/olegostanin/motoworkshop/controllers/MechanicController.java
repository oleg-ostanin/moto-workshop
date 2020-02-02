package example.olegostanin.motoworkshop.controllers;

import example.olegostanin.motoworkshop.services.MechanicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MechanicController {

    private final MechanicService mechanicService;

    public MechanicController(MechanicService mechanicService) {
        this.mechanicService = mechanicService;
    }

    @RequestMapping({"/mechanics", "mechanics/index", "mechanics/index.html", "/mechanics.html"})
    public String listMechanics(Model model){
        model.addAttribute("mechanics", mechanicService.findAll());

        return "mechanics/index";
    }
}
