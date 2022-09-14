package com.SpringBoot.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//trabaja con frontend thyme life, es un modelo para aplicaciones pequeñas, proyectos pequeños
@Controller
public class ControllerLegacy {

    @RequestMapping(value="/path2")
    @ResponseBody
    public String mensaje(){
        return "Controller con requestmapping y Responsebody";
    }

/**************************************************************************************************/
    /*----------------Hasta aquí tengo 4 End Points en mi API----------------------------------------*/
// Función End Point: servir info hacia el request
// API: Aplication Program Interface, toda la función ArrayList es una API
/***************************************************************************************************/


}
