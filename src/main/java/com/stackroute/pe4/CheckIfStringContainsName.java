package com.stackroute.pe4;//program to check whether the given name is in the given string

public class CheckIfStringContainsName {
    public  String returnTrueIfStringContainsName(String string,String name)
    {
        String stringreturn="";
        String[] str=string.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(name))
            {
                 return "true";
            }
        }
        return "false";
    }
}
