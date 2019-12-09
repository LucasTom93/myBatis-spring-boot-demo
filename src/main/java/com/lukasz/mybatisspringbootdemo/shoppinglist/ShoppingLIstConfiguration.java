package com.lukasz.mybatisspringbootdemo.shoppinglist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ShoppingLIstConfiguration {

    ShoppingListFacade shoppingListFacade() {
        return new ShoppingListFacade(new InMemoryQueryRepository(), new InMemoryCommandRepository());
    }

    @Bean
    ShoppingListFacade shoppingListFacade(QueryRepository queryRepository, CommandRepository commandRepository) {
        return new ShoppingListFacade(queryRepository, commandRepository);
    }
}
