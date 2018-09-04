import java.util.HashMap;

/**
 * @author zq
 * @Created Time on 2018/9/2/002
 */
public class TestDebugger {
    private static final int a=1;
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "tom");
        map.put("age", "12");
        map.put("school", "TsingHua");
        map.put("major", "computer");
        String age = map.get("age");
        System.out.println("age = " + age);
        map.remove("major");
        System.out.println(map);
        System.out.println("age = " + age);
        System.out.println("TestDebugger.main");

        /*if (map == null) {

        }
        if (map != null) {

        }*/

//哈哈
    }
    public  void speak(){
        System.out.println("22");
        for (int i = 0; i < 10; i++) {

        }

    }


}
