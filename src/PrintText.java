public class PrintText {

    public  static  void  printingСapitalLetters (String text, int count) {
       for (int i=0; i<count; i++) {
           System.out.println(text.toUpperCase());
       }
    }

    @ MyAnnotation
    public  static  void  printingSmallLetters (String text, int count) {
        for (int i=0; i<count; i++) {
            System.out.println(text.toLowerCase());
        }
    }
}
