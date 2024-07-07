//Write a program to find all the words in a given String.


public class StringExample3 {
    public static void main(String[] args)
    {
        String str1 = "swati";
        String str2 = "smita";
        String fullname = str1 + str2;//concatenation

        System.out.println( fullname);
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(" All the character are : " + fullname.charAt(i));
                    
                    
        }
       
    }
    
}
