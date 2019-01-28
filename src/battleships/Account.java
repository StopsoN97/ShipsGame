package battleships;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Account {
    
    public Account()
    {
    
    }
    
    public static int LogIn(String Login, String Password) throws FileNotFoundException
 	{ 
		int mark=0;
                 
                File file = new File("Player "+Login+".txt");
		if(file.isFile())
                {
                    Scanner read = new Scanner(file);
                    if(read.hasNext() && Password.equals(read.next()))
                    {
                        mark=1;
                        System.out.println("Pomyślnie zalogowano...");					
                    }
                    else
                        System.out.println("Wprowadzono złe hasło ! ");	
                }
		else
                    System.out.println("Nie ma takiego uzytkownika ! ");
                
        return mark;  
        }
    
    public static void CreateAnAccount()
	{
           String  Login, Password;
           Scanner read = new Scanner(System.in); 
           System.out.println("Podaj Login: ");
           Login = read.next();
           System.out.println("Podaj Haslo: ");
           Password = read.next();
           File file = new File("Player "+Login+".txt");
           if(file.isFile())
           {
        	   System.out.println("Istnieje taki uzytkownik, spróbuj jeszce raz");
        	   return;
           }
           
           PrintWriter save;
           try{
            save = new PrintWriter("Player "+Login+".txt");
            save.println(Password);
            save.println(Login);
            save.println("0");
            save.println("0");
            save.close();
		
            System.out.println("Założono konto, teraz sie zaloguj");
        }
         catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}  
        }
    
}
