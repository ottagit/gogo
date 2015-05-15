import java.io.*;
import java.util.Scanner;

class Notmain
{
 public void calledinMain(String commit)
 {
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter commit message------>> ");
  String msg = scan.nextLine();
  msg = commit;
 }
}

public class Modified
{
 public static void main(String args[])
 {
  Notmain not = new Notmain();
  System.out.println("Calling class....\n");
  not.calleinMain();
 }
}
