package dk.kea.webformdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WebFormController {

@GetMapping("/")
  public String showFor(){
  return "webform";
}

@PostMapping("/lavhilsen")
  public String hilsenSide(@RequestParam("navn")String name, @RequestParam("alder")int age, RedirectAttributes redirectAttributes){
  System.out.println(name + age); //erstattes med database create/update/delete
  redirectAttributes.addAttribute("navn", name);
  redirectAttributes.addAttribute("alder", age);

  return "redirect:/lavhilsen";
}
@GetMapping("/lavhilsen")
  public String lavHilsenSide(@RequestParam("navn")String name, @RequestParam("alder")int age, Model model){

  model.addAttribute("navn",name);
  model.addAttribute("alder", age);

  return "hilsenside";

}

}
