package a.c;


import java.lang.*;  // This is redundant but OK, always included

import a.c.ImportTests; // This is redundant but OK, code will compile

import a.b.PackageTests; // This includes classes defined in a but not a.b !

public class ImportTests  {
    public static void main(String[] args){
        System.out.println("Import Tests");
        PackageTests.main(args);
    }
}
