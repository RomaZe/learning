import java.nio.charset.Charset;
import java.util.Random;

public class Records {
    private String recordName;
    String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10;

    public Records(String recordName, int length) {
        this.recordName = recordName;
        str1 = generateRandomString(length);
        str2 = generateRandomString(length);
        str3 = generateRandomString(length);
        str4 = generateRandomString(length);
        str5 = generateRandomString(length);
        str6 = generateRandomString(length);
        str7 = generateRandomString(length);
        str8 = generateRandomString(length);
        str9 = generateRandomString(length);
        str10 = generateRandomString(length);
    }

    public Records(String recordName, String str) {
        this.recordName = recordName;
        str1 = str2 = str3 = str4 = str5 = str6 = str7= str8 = str9 = str10 = str;
    }

    public String getRecordName() {
        return recordName;
    }

    private String generateRandomString(int length){
        String baseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder str = new StringBuilder();
        while (length > 0) {
            Double index = new Double(baseString.length() * Math.random());
            try {
                str.append(baseString.charAt(index.intValue()));
            } catch (StringIndexOutOfBoundsException ae) {
//                System.out.println("It's not possible to generate random string for Records object");
//                System.out.println("Errors details: " + ae);
                str.append(baseString.charAt(0));
            }
            finally { length--; }
        }
        return str.toString();
    }


    public boolean equalsRecords(Records obj) {
        return Comparator.equals(this, obj);
    }


    public boolean compareByLength(Records obj) throws IllegalAccessException {
        return Comparator.compareByLength(this, obj);
    }

    public static Records getMaxLengthRecord(Records ... objArray) throws IllegalAccessException {
        return Comparator.getMaxLengthRecord(objArray);
    }

    public static Records getMinLengthRecord(Records ... objArray) throws IllegalAccessException {
        return Comparator.getMinLengthRecord(objArray);
    }


}
