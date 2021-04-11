public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Records rc1 = new Records("Record#1", 7);
        Records rc2 = new Records("Record#2",1);
        Records rc3 = new Records("Record#3","str");
        Records rc4 = new Records("Record#4","int");
        Records rc5 = new Records("Record#5","int");


        // Check whether 2 objects are tha same with standard equals method
        System.out.println("Whether \"rc4\" and \"rc5\" objects are tha same comparing with standard equals method:");
        System.out.println(rc4.equals(rc5));
        System.out.println();

        // Check whether 2 objects are tha same with override equals method
        // For rc4 and rc5 objects the result has to be true
        System.out.println("Whether \"rc4\" and \"rc5\" objects are tha same comparing with custom equals method:");
        System.out.println(rc4.equalsRecords(rc5));
        System.out.println();

        // Check the equals using a custom method. The method compare the length of the concatenation object's fields
        // For rc1 and rc2 objects the result has to be false
        System.out.println("Whether the length of the concatenation object's fields are the same for objects \"rc1\" and \"rc2\"");
        System.out.println(rc1.compareByLength(rc2));
        System.out.println();

        // For rc3 and rc4 objects the result has to be true
        System.out.println("Whether the length of the concatenation object's fields are the same for objects \"rc3\" and \"rc4\"");
        System.out.println(rc3.compareByLength(rc4));
        System.out.println();


        /* Find max and min object in array.
         * Max - object with the maximum length of the concatenation object's fields;
         * Min - object with the minimum length of the concatenation object's fields;
         */
        Records[] records = {rc1, rc2, rc3, rc4};

        Records maxRecord = Records.getMaxLengthRecord(records);
        System.out.print("Maximum record is: ");
        System.out.println(maxRecord.getRecordName());
        System.out.println();

        Records minRecord = Records.getMinLengthRecord(records);
        System.out.print("Minimum record is: ");
        System.out.println(minRecord.getRecordName());
        System.out.println();

    }
}
