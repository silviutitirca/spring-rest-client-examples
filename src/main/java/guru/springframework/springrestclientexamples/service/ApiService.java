package guru.springframework.springrestclientexamples.service;

import guru.springframework.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * @author Silviu_Titirca on 12/22/2021
 */
public interface ApiService {
    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}