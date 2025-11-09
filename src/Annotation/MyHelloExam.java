package Annotation;

import java.lang.reflect.Method;

public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();

//        getClass()는 Object의 메서드로, 해당 인스턴스를 만들때 사용한 클래스의 정보를 반환
//        getDeclaredMethod("hello")는 hello라는 이름의 메서드에 대한 정보를 반환
        try {
            Method method = hello.getClass().getDeclaredMethod("hello");

//            isAnnotationPresent()는 특정 Annotation이 메서드에 적용이 되어있는지 알아내는 메서드
//            즉 method가 Count100이라는 Annotation을 적용하고 있는지 확인하고 적용되어 있다면 true 반환
            if (method.isAnnotationPresent(Count100.class)) {
                for (int i = 0; i < 100; i++) {
                    hello.hello();
                }
            } else {
                hello.hello();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
