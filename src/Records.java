import java.nio.charset.Charset;
import java.util.Random;

public class Records {
    private String recordName;
    String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10;

    Records(String recordName, int length) {
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

    Records(String recordName, String str) {
        this.recordName = recordName;
        str1 = str2 = str3 = str4 = str5 = str6 = str7= str8 = str9 = str10 = str;
    }

    public static Records setRecords(String recordName, int length) {
        return new Records(recordName, length);
    }

    public static Records setRecords(String recordName, String str) {
        return new Records(recordName, str);
    }

    public String getRecordName() {
        return recordName;
    }

    private String generateRandomString(int length){
        String baseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = (int)(baseString.length() * Math.random());
            str.append(baseString.charAt(index));
        }
        return str.toString();
    }


    public boolean equalsRecords(Records obj) {
        return Comparator.equals(this, obj);
    }


    public boolean compareByLength(Records obj) throws IllegalAccessException {
        return Comparator.compareByLength(this, obj);
    }

    public static Records getMaxLengthRecord(Records[] obj) throws IllegalAccessException {
        return Comparator.getMaxLengthRecord(obj);
    }

    public static Records getMinLengthRecord(Records[] obj) throws IllegalAccessException {
        return Comparator.getMinLengthRecord(obj);
    }


}
