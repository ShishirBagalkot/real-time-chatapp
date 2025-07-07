package com.shishir.real_time_chatapp.controller;

import com.shishir.real_time_chatapp.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage") // Maps messages sent to /app/sendMessage
    @SendTo("/topic/messages") // Broadcasts the message to all subscribers of /topic/messages
    public ChatMessage sendMessage(ChatMessage chatMessage) {
        return chatMessage;
    }

    @GetMapping("/chat") // Maps GET requests to /chat
    public String chat() {
        return "chat"; // This should correspond to a Thymeleaf template named 'chat.html'
    }
}