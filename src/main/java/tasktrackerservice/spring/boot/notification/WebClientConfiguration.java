package tasktrackerservice.spring.boot.notification;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.springframework.web.reactive.function.client.WebClient;
import tasktrackerservice.spring.boot.notification.api.dto.UserProfileDto;
import tasktrackerservice.spring.boot.notification.entity.UserProfile;

import java.io.IOException;


public class WebClientConfiguration {
/*
    */
/*@JsonDeserialize(using = UserProfile.class)
    public class Item {  ...}*//*

  */
/* public   WebClient  webClient;
    public static void main(String[] args) throws IOException {*//*

*/
/*        String url = "localhost:8085/api/user-profile/find-by-telegram-id/someTelegramId";



        WebClient.Builder builder = WebClient.builder();
        ObjectMapper objectMapper = new ObjectMapper();
        //String json = builder.defaultHeader("Content-Type","application/json");

        //UserProfile userProfile =objectMapper.readValue(new URL("localhost:8085/api/user-profile/find-by-telegram-id/someTelegramId"),UserProfile.class);

        //UserProfile userProfile=new ObjectMapper().readValue(json, UserProfile.class);
        //ObjectMapper objectMapper=builder.defaultHeader("Content-Type","application/json")
        // .build().get().uri(url).retrieve().bodyToMono(ObjectMapper.class).block();

        //String json = builder.defaultHeader("Content-Type", "application/json")
                //.build().get().uri(url).retrieve().bodyToMono(String.class).block();
        String json =webClient.get().uri(url).retrieve().bodyToMono(UserProfile.class);


        UserProfile userProfile = new Gson().fromJson(json, UserProfile.class);


        System.out.println("---------------------------");
        System.out.println(userProfile);
        System.out.println("---------------------------");
    }*//*

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
*/

}
