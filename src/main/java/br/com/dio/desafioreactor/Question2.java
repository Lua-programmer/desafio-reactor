package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

import java.util.List;

public class Question2 {

    /*
    Recebe uma lista de usuários e retorna a quantos usuários admin tem na lista
     */
    public Mono<Long> countAdmins(final List<User> users){
        return Mono.just(users)
                .flatMapIterable(users1 -> users1)
                .filter(user -> user.isAdmin().equals(true))
                .count();
    }

}
