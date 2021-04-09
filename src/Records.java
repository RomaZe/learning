import java.nio.charset.Charset;
import java.util.Random;

public class Records {
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;

    Records() {
        this.str1 = generateRandomString();
        this.str2 = generateRandomString();
        this.str3 = generateRandomString();
        this.str4 = generateRandomString();
        this.str5 = generateRandomString();
        this.str6 = generateRandomString();
        this.str7 = generateRandomString();
        this.str8 = generateRandomString();
        this.str9 = generateRandomString();
        this.str10 = generateRandomString();
    }

    Records(String str) {
        str1 = str2 = str3 = str4 = str5 = str6 = str7= str8 = str9 = str10 = str;
    }

    private String generateRandomString(){
        int stringLength = 5;
        String baseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder str = new StringBuilder(5);
        for (int i = 0; i < stringLength; i++) {
            int index = (int)(baseString.length() * Math.random());
            str.append(baseString.charAt(index));
        }
        return str.toString();
    }
}
