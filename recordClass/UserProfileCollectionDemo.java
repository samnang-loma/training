package recordClass;

import java.util.ArrayList;
import java.util.List;

public class UserProfileCollectionDemo {
    public record UserProfile (int id, String name, String email) {
    }
    public static void main(String[] args) {
        List<UserProfile> userProfiles = new ArrayList<>();
        userProfiles.add(new UserProfile(1, "Alice", "alice@example.com"));
        userProfiles.add(new UserProfile(2, "Bob", "bob@example.com"));
        userProfiles.add(new UserProfile(3, "Charlie", "charlie@example.com"));

        // Iterating through the list
        for (UserProfile user : userProfiles) {
            System.out.println(user);
        }

        int searchId = 2;
        UserProfile foundUser = userProfiles.stream()
                .filter(user -> user.id() == searchId)
                .findFirst()
                .orElse(null);

        if (foundUser != null) {
            System.out.println("Found user: " + foundUser);
        } else {
            System.out.println("User with ID " + searchId + " not found.");
        }
    }
}
