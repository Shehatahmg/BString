/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstring;
import java.util.function.BiPredicate;
/**
 *
 * @author MIDO
 */
public class BString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string1="ali";
        String string2 = "adam";
        String longer = BString.BetterString(string1, string2, (s1,s2) -> s1.length() > s2.length());
        String first = BString.BetterString(string1, string2, (s1,s2) -> true);
        
        System.out.println(longer);
        System.out.println(first);
    }
    public static String BetterString(String s1,String s2,BiPredicate<String , String> p) {
    if(p.test(s1, s2)){
        return s1;
    }
    else
        return s2;
    }
}
