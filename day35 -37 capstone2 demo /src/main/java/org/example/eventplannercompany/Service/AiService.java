package org.example.eventplannercompany.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AiService {

    private final WebClient openAiClient;

    public String askAI(String prompt) {
        try {
            Map<String, Object> body = Map.of(
                    "model", "gpt-4o-mini",
                    "messages", List.of(
                            Map.of("role", "user", "content", prompt)
                    )
            );

            String result = openAiClient.post()
                    .bodyValue(body)
                    .retrieve()
                    .bodyToMono(String.class)
                    .block();

            JsonNode root = new ObjectMapper().readTree(result);

            return root.path("choices").get(0).path("message").path("content").asText();

        } catch (Exception e) {
            return "AI Error: " + e.getMessage();
        }
    }
}

