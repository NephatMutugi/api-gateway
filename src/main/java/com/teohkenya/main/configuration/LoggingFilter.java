package com.teohkenya.main.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ Author NMuchiri
 **/
@Component
public class LoggingFilter implements GlobalFilter {

/*---------------------GLOBAL VARIABLES ----------------------*/

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        logger.info("Path of the request received ->{}",exchange.getRequest().getPath());

        return chain.filter(exchange);
    }
}
