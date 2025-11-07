package lang_패키지;

public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;

//        오토박싱 기능이 생기면서 Java 16 이후에는 제거된 생성자
//        Integer i2 = new Integer(5);

//        내부적으로 Integer i3 = new Integer(5);과 같음
        Integer i3 = 5;

        int i4 = i3.intValue();

        int i5 = i3;
    }
}
