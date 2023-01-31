import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.SocketHandler;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int[] arr2 = {1,2,4,5,8,9,10,122};

        //2,4,5,8,122

        for (int i=0; i< arr2.length;i++) {

            if (arr2[i] % 2 ==0) {
                System.out.println(arr2[i]);
                break;

            }else {
                System.out.println(arr2[i] + " is not multiple of 2");
            }

        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("shetty");
        a.add("academy");
        a.add("selenium");
        System.out.println(a.get(3));

        for (int i=0; i<a.size();i++){
            System.out.println(a.get(i));
        }
        System.out.println("**********************");

        for (String val : a){
            System.out.println(val);
        }

        // item is present in ArryaList
        System.out.println(a.contains("selenium"));
        String[] name={"rahul", "shetty", "selenium"};
        List<String> nameArrayList = Arrays.asList(name);
        nameArrayList.contains("selenium");

    }
}
