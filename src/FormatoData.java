import java.time.LocalDateTime;
import java.util.Scanner;

public class FormatoData {

    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.now();
        System.out.println(data);

        System.out.printf("%td/%tB/%ty", data, data, data);
    }
}

