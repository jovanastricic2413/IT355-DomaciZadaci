/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.jovanastricic;

import com.it355.jovanastricic.model.Usluga;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jovana BGD
 */
@Controller
public class UslugaController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/usluga", method = RequestMethod.GET)
    public ModelAndView student() {
        System.out.println("Calling MessageSource");
        System.out.println(messageSource.getMessage("tip_usluga", null, new Locale("en-Latn-US")));
        return new ModelAndView("addUsluga", "command", new Usluga());
    }

    @RequestMapping(value = "/addUsluga", method = RequestMethod.POST)
    public String addUsluga(@ModelAttribute Usluga usluga, ModelMap model) {
        model.addAttribute("tip_usluga", usluga.getTip_usluga());
        model.addAttribute("naziv_usluga", usluga.getNaziv_usluga());
        model.addAttribute("cena_usluga", usluga.getCena_usluga());

        return "usluga";
    }
}
