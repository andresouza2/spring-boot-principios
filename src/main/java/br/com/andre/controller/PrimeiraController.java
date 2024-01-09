package br.com.andre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

  @GetMapping("/primeiroMetodo/{id}")
  public String primeiroMetodo(@PathVariable String id) {
    return "O parametro é: " + id;
  }

  @GetMapping("/queryParams")
  public String metodoQueryParams(@RequestParam String id, @RequestParam String nome) {
    return "O metodo com queryParams é: " + id + " e " + nome;
  }

}
