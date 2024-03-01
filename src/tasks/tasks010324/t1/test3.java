package tasks.tasks010324.t1;

import java.util.ArrayList;
import java.util.List;

public class test3 {
    public static void main(String[] args) {
        List<String> user1 = List.of("Pop", "Hip-hop", "Rock");
        List<String> user2 = List.of("Rock", "Indie", "Rap");
        getCommonItems(user1, user2);
    }

    static List<String> getCommonItems(List<String> user1, List<String> user2) {
        List<String> count = new ArrayList<>();
        for (String item : user1){
            if (user2.contains(item)){
                count.add(user2.toString());

            }
            System.out.println(item);
        }

        return count;
    }
}
