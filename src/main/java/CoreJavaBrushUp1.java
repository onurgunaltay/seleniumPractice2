public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

        int myNum =5;
        String website = "Rahul Shetty Academy";
        String letter = "r";
        double dec = 5.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value stored in the myNum variable");

        //Arrays
        int[] arr = new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;

        int[] arr2 = {1,2,3,4,5,6,8,9,7,54,43};

        //for loop

        for (int i=0; i<arr.length; i++){

            System.out.println(arr[i]);
        }

        for (int i=0; i<arr2.length; i++){

            System.out.println(arr2[i]);
        }

        String[] name={"rahul", "shetty", "selenium"};

        for (int i=0; i< name.length; i++){

            System.out.println(name[i]);
        }

        for (String s: name){

            System.out.println(s);
        }



    }
}
