package binaertodecimal.bi2deci.controller;

import binaertodecimal.bi2deci.services.BiToDeci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Converter {
    BiToDeci conv = new BiToDeci();
    @GetMapping("")
    public String introduction(){
        return "List of commands: /convertbinary?input=binary";
    }

    @GetMapping("/convertbinary")
    public String convertBinary(@RequestParam String input){
        return "The binary in decimals is: " + conv.conversion(input);
    }
}
