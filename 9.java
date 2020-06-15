import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int n=15;
    String[]a=new String[n];
    String[]prom1=new String[n];
    for (int i=0; i < a.length; i++)
    {
      Scanner in = new Scanner(System.in);
      a[i]= in.nextLine();
    }
    for (int i=0;i < a.length;i++)
    {
      if(a[i].indexOf("mc")>-1 || a[i].indexOf("ls")>-1 || a[i].indexOf("cd")>-1)
      {
        prom1[i]=a[i];
      }
      else prom1[i]="";
    }
    System.out.println("\nОбновленный массив: ");
    for (int i=0;i < prom1.length;i++)
    {
      if (prom1[i]!="")
      System.out.println(prom1[i]+"; ");
    }
  }
}