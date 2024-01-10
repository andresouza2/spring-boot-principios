package br.com.andre.ioc_di;

import org.springframework.stereotype.Component;

@Component
public class MeuComponent {

  public String chamarMeuComponent() {
    return "chamou meu component";
  }

}
