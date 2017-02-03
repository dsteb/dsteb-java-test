package de.zenhomes.dsteb.k8s;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {

  @RequestMapping("/*")
  public String index(HttpServletRequest req) {
    String uri = req.getRequestURI();
    System.out.println("Requested: " + uri);
    return "Zenhomes Java Test v1";
  }

}
