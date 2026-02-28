package ARRAY;

public class sortString {
    public   String sortString(String str) {

        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        return new String(arr);
    }

    public static void main(String[] args) {
        String s="zrscd";
        sortString ob=new sortString();
        System.out.println(ob.sortString(s) );
    }
}
