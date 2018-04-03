package com.qudini.codetest.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.qudini.codetest.models.Customer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

@Component
public class CustomerHandler {

  public CustomerHandler() {
    ObjectMapper mapper = new ObjectMapper();
    mapper.registerModule(new JodaModule());
  }

  public Mono<ServerResponse> post(ServerRequest request) {
    Flux<Customer> result = request.bodyToFlux(Customer.class);
    //result.toIterable().forEach(System.out::println);
    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(result.sort(Comparator.comparing(Customer::getDuetime)), Customer.class);

  }
}
