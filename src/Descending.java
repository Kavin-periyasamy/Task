public class Descending {
    static String a= "Can I block your calendar from 5:30 to 6pm today " +
            "to review/discuss on test case scenarios for HK dashboard cards ";
    public static void main(String[] args)
    {
        String[] arr=a.split(" ");
        int c=arr.length;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(arr[i].length()>arr[j].length())
                {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<c;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
