package tasktrackerservice.spring.boot.notification;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.reactive.function.client.WebClient;
import tasktrackerservice.spring.boot.notification.api.dto.UserProfileDto;

import java.io.IOException;

public class example {
    public static void main(String[] args) throws IOException {
        String url = "localhost:8085/api/user-profile/find-by-telegram-id/someTelegramId";

        WebClient.Builder builder = WebClient.builder();
        ObjectMapper objectMapper= new ObjectMapper();
        String user = builder.defaultHeader("Content-Type","application/json").build().get().uri(url).retrieve().bodyToMono( String.class ).block();

        System.out.println("---------------------------");
        System.out.println(objectMapper.readValue(user, UserProfileDto.class));
        System.out.println("---------------------------");
    }
}