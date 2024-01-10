package br.com.andre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/primeira-controller")
public class PrimeiraController {

  @GetMapping("/primeiro-metodo/{id}")
  public String primeiroMetodo(@PathVariable String id) {
    return "O parametro é: " + id;
  }

  @GetMapping("/query-params")
  public String metodoQueryParams(@RequestParam Map<String, String> allParams) {
    return "O metodo com queryParams é: " + allParams.entrySet();
  }

  @PostMapping("/body-params")
  public String metodoBodyParams(@RequestBody Usuario usuario) {
    return "O metodo com bodyParams é: " + usuario.nome;
  }

  @GetMapping("/response-entity/{id}")
  public ResponseEntity<Object> metodoResonseEntity(@PathVariable long id) {
    var usuario = new Usuario("andre");

    if (id > 5) {
      return ResponseEntity.status(HttpStatus.OK).body(usuario);
    }
    return ResponseEntity.badRequest().body("numero menor que 5");
  }

  @PostMapping("/header-params")
  public String metodoHeaderParams(@RequestHeader("name") String name) {
    return "O metodo com bodyParams é: " + name;
  }

  @PostMapping("/header-params-list")
  public String metodoHeaderParams(@RequestHeader Map<String, String> headers) {
    return "O metodo com bodyParams é: " + headers.entrySet();
  }

  record Usuario(String nome) {
  }

}
