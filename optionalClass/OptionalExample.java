package optionalClass;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();

        Optional<String> nonEmpty = Optional.of("Hello, world!");

//        Optional<String> nullOptional = Optional.ofNullable(null);
//        checking if the value is presented
        if(nonEmpty.isPresent()) {
            System.out.println("value is presented: " + nonEmpty.get());
        }
//        using isPresent()
        nonEmpty.ifPresent(value -> System.out.println("Value using isPresent: " + value));
//        a default value using with orElse
        String defaultValue = empty.orElse("Default value");
        System.out.println("Deffault value: " + defaultValue);
//        using orElseGet()
        String defaultValueGet = empty.orElseGet(()-> "Default value get");
        System.out.println("Deffault value: " + defaultValueGet);


    }
}
