import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTime {
    public static void main(String[] args) {

        java.time.LocalDateTime agora = java.time.LocalDateTime.now();
        System.out.println(agora);

        ZonedDateTime agoraEmTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(agoraEmTokyo);


        for(String s :ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }


    }


}
