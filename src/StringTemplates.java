package src;

import java.time.LocalTime;
import static java.lang.StringTemplate.STR;

class StringTemplates {

    public static void main(String[] args) {
        String userName = "Cagatay";
        int age = 23;
        LocalTime time = LocalTime.now();

        String json = STR."""
        {
            "user": "\{userName}",
            "age": \{age},
            "date": "\{time}"
        }
        """ ;
    }

}