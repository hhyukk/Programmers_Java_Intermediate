package util_패키지;

public class BoxExam {
    public static void main(String[] args) {
//        Objecc version
//        Box box = new Box();
//        box.setobj(new Object());
//        Object obj = box.getObj();
//
//        box.setobj("hello");
//        String str = (String) box.getObj();
//        System.out.println(str);
//
//        box.setobj(1);
//        int value = (int) box.getObj();

//        Generic version
        Box<Object> box = new Box<>();
        box.setobj(new Object());
        Object obj = box.getObj();

        Box<String> box2 = new Box<>();
        box2.setobj("hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();
        box3.setobj(4);
        int v2 = box3.getObj();
    }
}
