package lang_패키지;

public class StringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");

        String str = sb.toString();
        System.out.println(str);

        StringBuffer sb2 = new StringBuffer();

//        append메서드는 this(자기자신)을 반환하기 때문에 sb3와 sb2는 같음
//        메소드 체이닝(Method Chaining): 자기 자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방식
        StringBuffer sb3 = sb2.append("hello");
        if (sb2 == sb3) {
            System.out.println("sb2 == sb3");
        }

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }
}
