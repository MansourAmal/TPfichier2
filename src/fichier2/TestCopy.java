package fichier2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestCopy {

	public static void main(String[] args) {
		/*File inputFile = new File("D:\\fichiers\\in.txt");
		File outputFile = new File("D:\\fichiers\\out.txt");
		try {
			FileReader reader = new FileReader(inputFile);
			FileWriter writer = new FileWriter(outputFile);
			int caractere;
			while ((caractere = reader.read()) != -1) {
				writer.write(caractere); 
			}
			System.out.println("Copie terminée avec succès.");
			reader.close();
			writer.close();
			
		}catch (IOException e){
			e.printStackTrace();
		}*/
		/*Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir votre login : ");
        String login = scanner.nextLine();
        System.out.println("Veuillez saisir votre mot de passe : ");
        String password = scanner.nextLine();*/
        /*

        try {
        	BufferedReader reader = new BufferedReader(new FileReader("D:\\fichiers\\in.txt"));
            String line;
            int nbL=0;
            int nbC=0;
            int ch=0;
            
            while ((line = reader.readLine()) != null) {
                nbL++;
                nbC += line.length(); 
                StringTokenizer tokenizer = new StringTokenizer(line);
                ch += tokenizer.countTokens(); 
            }
            System.out.println("le nombre des ligne est "+nbL);
            System.out.println("le nombre des caractere est "+nbC);
            System.out.println("le nombre des mots est "+ch);

            /*while ((line = reader.readLine()) != null) {
                String[] partie = line.split(" ");
                if (partie.length == 2 && partie[0].equals(login) && partie[1].equals(password)) {
                    System.out.println("Authentification réussi");
                    return;
                }
                
            }
            System.out.println("PB Authentification");
            
        } catch (IOException e) {
            e.printStackTrace();}*/
       
    		try {
    			FileReader reader = new FileReader("D:\\fichiers\\in.txt");
    			FileWriter writer = new FileWriter("D:\\fichiers\\user.txt");
    			int caractere;
                while ((caractere = reader.read()) != -1) {
                     writer.write(++caractere);
                }
                System.out.println("cryptage terminée");
    			reader.close();
    			writer.close();
    			
    		} catch (IOException e) {
                e.printStackTrace();}
    		
	}

}



