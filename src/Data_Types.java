public class Data_Types {
    static void main(String[] args) {

        boolean isPassed = true ;
        int count = 12 ;
        byte marks = 13 ;
        short studentCount = 123 ;

        float pi = 3.14f; //f is required for float ; by default java treat as a double
        double newPi =3.14;

        char myLetter = 'a'; // char is in '-' (single code )

        System.out.println(count);
        System.out.println(marks);

        //implicit Conversation

        int countOne= 12;
        long countOneLong = countOne ;

        //explicit Conversation

        long countTwo = 12 ;
        int countTwoInt =(int)countTwo;

    }
}
