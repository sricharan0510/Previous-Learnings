import java.util.*;
public class strings
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // String s = "kittu";
        // System.out.println(s.charAt(2)); //Accessing a character in string with index
        // System.out.println(s.length());  //To fnd length of string

        //  //for-each loop won't work on strings in java

        // String s1 = "Hello Uorld";   //immutable:we can't change this string
        // // For updating:- 3Steps
        // char[] arr = s1.toCharArray();    //1.converting string to char array
        // arr[6] = 'W';                     //2.Changing in char arry with ndex
        // String res = new String(arr);     //3.Again Converting char array to string
        // System.out.println(res);

        // for(int i=0;i<s.length();i++)
        // {
        //     System.out.print(s.charAt(i)+" ");
        // }
        // System.out.println();
        // for(char ch :s.toCharArray())  //perform for each loop by converting string to char array
        // {
        //     System.out.print(ch+" ");
        // }
        // System.out.println();

        // //Creating char array without using builtin method
        // char[] a = new char[s.length()];
        // int i=0;
        // for(int j=0;j<s.length();j++)
        // {
        //     a[i]=s.charAt(j);
        //     i++;
        // }
        // System.out.println(a);

        // //String in reverse
        // for(i=s.length()-1;i>=0;i--)
        // {
        //     System.out.print(s.charAt(i)+" ");
        // }
        // System.out.println();

        // String s2="";
        // s2 += 'a';
        // s2 += 'b';
        // s2 += 'c';
        // System.out.println(s2);


        // String st = sc.nextLine();
        // String str="";
        // for(int m=st.length()-1;m>=0;m--)
        // {
        //   str += st.charAt(m);
        // }
        // System.out.println(str);


        // //"""STRING METHODS"""
        // String lc = s.toLowerCase();
        // System.out.println(lc);
        // String uc = s.toUpperCase();
        // System.out.println(uc); 
        // String sc1 = "arnav";
        // String sc2 = "arnab";
        // System.out.println(sc1.compareTo(sc2));
        // System.out.println(sc2.compareTo(sc1));
        // String sm = "hello";
        // String rep = sm.repeat(3);
        // System.out.println(rep);
        // System.out.println(sm.startsWith("hel"));
        // System.out.println(sm.endsWith("llo"));
        // System.out.println(sm.indexOf('l'));
        // System.out.println(sm.indexOf('l',6));
        // System.out.println(sm.lastIndexOf('l'));
        // String temp = "       hello     ";
        // String strippedString = temp.strip();
        // System.out.println(strippedString);


        // String k = "Hello World";               //contains method used for check second string
        // String l = "llo";                       //is present in first or not
        // String m = "low";
        // char ch = 'o';                       
        // System.out.println(k.contains(l));      //True
        // System.out.println(k.contains(m));      //false
        // System.out.println(k.contains(""+ch));


        // //Split method : return type is string array
        // String sp = "This is  java programming";
        // String[] brr = sp.split(" ");
        // System.out.println(Arrays.toString(brr));

        // String d = "31-Aug-2023";
        // String[] darr = d.split("-");
        // System.out.println(Arrays.toString(darr));


        // //count of vowels in a string
        // String check = "Hello This is java Programming";
        // String vowels = "AEIOUaeiou";
        // int vCount = 0;
        // for(int p=0;p<check.length();p++)
        // {
        //     if(vowels.contains(""+s.charAt(p)))
        //     {
        //         vCount++;
        //     }
        // }
        // System.out.println(vCount);

        
        // String s9 = "Professor";               //immutable:we can't change this string
        // // For updating:- 3Steps
        // char[] ar = s9.toCharArray();          //1.converting string to char array
        // Arrays.sort(ar);                       //2.Changing in char arry with ndex
        // String rt = new String(ar);            //3.Again Converting char array to string
        // System.out.println(rt);


    sc.close();
    }
}





// import java.util.*;
// public class count
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String ch = "~!@#$%^&*()_+-=/<>?:{}[];',.";
//         int v=0;
//             for(int j=0;j<s.length();j++)
//             {
//                 if(ch.contains(""+s.charAt(j)))
//                 {
//                     v++;
//                 }
//             }
//         System.out.print(v);
//     }
// }

// import java.util.*;
// public class ele
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         char[] a=s.toCharArray();
//         int j=0;
//         for(int i=a.length-1;i>=0;i--)
//         {
//             a[j]=s.charAt(i);
//             j++;
//         }
//         System.out.print(a);
//     }
// }


// import java.util.*;
// public class Code {
//     public static String reverseEquation(String s)
//     {
// 	    String result = "";
//         String str = "";
//         for(int i = 0; i < s.length(); i++) 
// 	    {
// 		    if (s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='/' || s.charAt(i)=='*')
//     		{
// 			    result = s.charAt(i) + str + result;
// 			    str = "";
// 		    }
// 		    else
// 		    {
// 			    str += s.charAt(i);
// 		    }
// 	    }
// 	    result = str + result;
// 	    return result;
//     }
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
// 	    String s = sc.nextLine();
//         System.out.println(reverseEquation(s));
//     }
// }