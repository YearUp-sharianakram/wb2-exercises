package com.pluralsight;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    public static String PromptForString(String prompt){
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String PromptForString(){
        return scanner.nextLine();
    }



    public static boolean PromptForYesNo(String prompt){
      do {
          System.out.print(prompt + " ( Y for Yes, N for No ) ?");
          String userinput = scanner.nextLine();
          if (userinput.equalsIgnoreCase("Y") || userinput.equalsIgnoreCase("Yes") ) {
              return true;
          } else if (userinput.equalsIgnoreCase("N") || userinput.equalsIgnoreCase("No")) {
              return false;
          }
      }while(true);

    }

    public static int PromptForInt(String prompt){
        System.out.println(prompt);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static short PromptForShort(String prompt){
        System.out.print(prompt);
        short userinput = scanner.nextShort();
        scanner.nextLine();
        return  userinput;
    }

    public static byte PromptForByte(String prompt){
        System.out.print(prompt);
        byte userinput =scanner.nextByte();
        return userinput;
    }

}
