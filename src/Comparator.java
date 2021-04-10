import java.lang.reflect.Field;
import java.util.Arrays;

public class Comparator {

    public static boolean equals(Records obj1, Records obj2) {
        if (obj1 == obj2) return true;

        String[] strObj1 = getFieldArray(obj1);
        String[] strObj2 = getFieldArray(obj2);

        return Arrays.equals(strObj1, strObj2);
    }

    public static boolean compareByLength(Records obj1, Records obj2) throws IllegalAccessException {
        String strObj1 = getFieldConcat(obj1);
        String strObj2 = getFieldConcat(obj2);

        return strObj1.length() == strObj2.length();
    }

    public static Records getMaxLengthRecord(Records[] array) throws IllegalAccessException {
        String strObj;
        long maxLength = 0;
        Records maxRecord = null;
        for (Records record : array) {
            strObj = getFieldConcat(record);
            if (strObj.length() > maxLength) {
                maxLength = strObj.length();
                maxRecord = record;
            }
        }
        return maxRecord;
    }

    public static Records getMinLengthRecord(Records[] array) throws IllegalAccessException {
        String strObj;
        long minLength = 0;
        Records minRecord = null;
        for (int i=0; i < array.length; i++) {
            strObj = getFieldConcat(array[i]);
            if (i == 0) {
                minLength = strObj.length();
                minRecord = array[i];
            }
            else
                if (strObj.length() < minLength) {
                    minLength = strObj.length();
                    minRecord = array[i];
            }
        }
        return minRecord;
    }


    private static String getFieldConcat(Records obj) throws IllegalAccessException {
        Object fieldValue;
        StringBuilder string = new StringBuilder();

        Field[] fields = Records.class.getDeclaredFields();
        for (Field field : fields) {
            if ((field.getName()).contains("str")) {
                fieldValue = field.get(obj);
                string.append(fieldValue.toString());
            }
        }
        return string.toString();
    }

    private static String[] getFieldArray(Records obj) {
        String[] records = new String[10];
        records[0] = obj.str1;
        records[1] = obj.str2;
        records[2] = obj.str3;
        records[3] = obj.str4;
        records[4] = obj.str5;
        records[5] = obj.str6;
        records[6] = obj.str7;
        records[7] = obj.str8;
        records[8] = obj.str9;
        records[9] = obj.str10;

        return records;
    }

}
