import com.javass.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Delsan
 * @create 2022/2/3 - 上午 02:44
 *
 * IDEA 中代碼模板所處的位置：
 * File -> Settings
 * -> Editor -> Live Templates 内容能修改
 * -> Editor -> General – Postfix Completion 内容不能修改
 *
 *常用模板：
 *
 */
public class TemplatesTest {

    // 模板六：prsf：可生成 private static final
        private static final Customer cust = new Customer();

    // 變型：psf / psfi / psfs
    // 變型：psf --> public static final
    public static final int NUM = 1;     // psf

    // 變型：psfi --> public static final int
    public static final int NUM2 = 2;   // psfi

    // 變型：psfs --> public static final String
    public static final String NATION = "china";    // psfs


    // 模板一：psvm --> 可生成 main 方法
    public static void main(String[] args) {    // main 就是一個模板的快捷鍵

        // 模板二：sout --> System.out.println() 快捷输出。
        System.out.println("hello!");
        // 變型：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));   // soutp
        System.out.println("TemplatesTest.main");   // soutm

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);   // soutv --> Live Templates
        System.out.println("num1 = " + num1);

        System.out.println(num1);   // num1.sout --> Postfix Completion

        // 模板三：fori --> 可生成 for 循环
        String[] arr = new String[]{"Tom","Jerry","HanMeimie","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 變型：iter / itar
        // 變型：iter --> 可生成增强型 for 循环
        for (String s : arr) {  // iter
            System.out.println("s = " + s); // soutp
        }

        // 變型：itar --> 可生成普通型 for 循环
        for (int i = 0; i < arr.length; i++) {  // itar
            String s = arr[i];
            System.out.println(s);  // s.sout
        }

        // 模板四：list.for -->  可生成集合 list 的 for 循环
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) { // list.for
            System.out.println("o = " + o); // soutv
        }
        
        // 變型：list.fori / list.forr
        // 變型：list.fori --> 正序遍历
        for (int i = 0; i < list.size(); i++) {          // list.fori
            System.out.println("list = " + list.get(i)); // soutv --> list --> get --> i
        }

        // 變型：list.forr --> 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {     // list.forr
            System.out.println("list = " + list.get(i)); // soutv --> list --> get --> i
        }

    }

    public void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);

        // 模板五：ifn --> 可生成 if(xxx == null)
        if (list == null) {                          // ifn
            System.out.println("list is null");      // sout
        }

        // 變型：inn / xxx.nn / xxx.null
        // 變型：inn --> if not null --> Live Templates
        if (list != null) {                     // inn
            for (Object o : list) {             // iter
                System.out.println("o = " + o); // soutv
            }
        }

        // 變型：xxx.nn --> Postfix Completion
        if (list != null) { // list.nn

        }

        // 變型：xxx.null --> Postfix Completion
        if (list == null) { // list.null

        }


    }

}
