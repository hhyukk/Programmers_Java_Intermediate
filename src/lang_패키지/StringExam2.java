package lang_패키지;

public class StringExam2 {
    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

//        문자열 + 문자열을 실행하면 내부적으로는 StringBuffer().append()가 실행됨
        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

//        StringBuffer 객체가 100번 생성되기 때문에 좋지 않은 코드
        String str5 = "";
        for (int i = 0; i < 100; i++) {
            str5 = str5 + "*";
        }
        System.out.println(str5);

//        객체를 생성해서 반복문으로 append를 직접 실행
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
    }
}
