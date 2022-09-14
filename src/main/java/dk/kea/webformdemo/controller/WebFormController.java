package dk.kea.webformdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebFormController {

@GetMapping("/")
  public String showFor(){
  return "webform";
}
}
