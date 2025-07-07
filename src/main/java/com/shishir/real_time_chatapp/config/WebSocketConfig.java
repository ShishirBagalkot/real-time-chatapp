package com.shishir.real_time_chatapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/**
 * WebSocket configuration class that sets up the STOMP endpoints and message broker.
 * This class enables WebSocket message handling and configures the message broker.
 */

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat") // Register the endpoint for WebSocket connections
                .setAllowedOriginPatterns("*") // Set allowed origins for CORS
                .withSockJS(); // Enable SockJS fallback options for browsers that don't support WebSocket
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic", "/queue"); // Enable a simple in-memory message broker
        registry.setApplicationDestinationPrefixes("/app"); // Set the prefix for application destinations
    }
}