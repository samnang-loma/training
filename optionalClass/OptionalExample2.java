package optionalClass;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> value = findValueByKey("key2");

        value.ifPresentOrElse( v -> System.out.println("Founded key " + v), () -> System.out.println("Value not found"));
        }

    public static Optional<String>findValueByKey(String key) {
        if ("key1".equals(key)) {
            return Optional.of("value1");
        } else {
            return Optional.empty();
        }
    }
}
