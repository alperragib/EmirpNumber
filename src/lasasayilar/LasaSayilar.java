
package lasasayilar;

/**
 *
 * @author alperragib
 */
public class LasaSayilar {

    public static void main(String[] args) {
        int sayi; 
        System.out.println("Lasa Sayilar (1-1000); ");
        for(int i=12; i<=1000; i++)
        {
               sayi=0; 
               
               for(int j=2; j<=i/2; j++)
               { 
                 if(i%j==0)
                 { 
                    sayi++; 
                 }
               } 
                if(sayi==0)
                {
                    String a = String.valueOf(i);
                    String reverse = "";
		
		
                        for(int d = a.length() - 1; d >= 0; d--)
                        {
			reverse = reverse + a.charAt(d);
                        }
                    
                    
                   if(kontrol(Integer.valueOf(reverse))==true)
                   {
                       System.out.println(" ("+i+","+reverse+"),");
                   }
                } 
          }
    }
    
     public static boolean kontrol (int sayi)
    {
        boolean asal = true;

        for (int i = 2; i < sayi; i++) 
        {
        int kalan = sayi % i;

            if (kalan == 0) 
            {
                asal = false;
                break;
            }
        }

    if(asal==true && sayi>1)
    {
    return true;
    }
    else
    {
    return false;
    }
    
}
}
