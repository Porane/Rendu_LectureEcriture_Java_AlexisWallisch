import java.io.*;

public class Main 
{

	public static void main(String[] args) 
	{

		try 
		{
			//Lecture d'un fichier texte existant
			BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("montexte.in.txt")));
			String phrase;
			
			//Test si une phrase est pr�sente et lancement d'une proc�dure si c'est le cas
			if((phrase = buff.readLine())!= null) 
			{
				CompteurVoyelles(phrase);
			}
			buff.close();
		}
		//S'il y a une erreur lors de la lecture du fichier texte
		catch(Exception e)
		{
			System.out.println("Erreur lors de la lecture : ");
			System.out.print(e.getMessage());
		}

	}
	
	public static void CompteurVoyelles(String phrase)
	{
		int compteurA = 0;
		int compteurE = 0;
		int compteurI = 0;
		int compteurO = 0;
		int compteurU = 0;
		int compteurY = 0;
		
		//Lecture de la phrase par le programme, � chaque voyelle il ajoute 1 � la variable correspondante
		for(int x = 0; x < phrase.length(); x++)
		{
			switch(phrase.charAt(x))
			{
			case 'a':
				compteurA++;
				break;
			case 'e':
				compteurE++;
				break;
			case 'i':
				compteurI++;
				break;
			case 'o':
				compteurO++;
				break;
			case 'u':
				compteurU++;
				break;
			case 'y':
				compteurY++;
				break;
			}
		}
		try
		{
			//Cr�ation d'un fichier texte notifiant les occurrences de chaque voyelle
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("voyelles.out.txt")));
					
			writer.write("Nombre de A : " + compteurA + "\n");
			writer.write("Nombre de E : " + compteurE + "\n");
			writer.write("Nombre de I : " + compteurI + "\n");
			writer.write("Nombre de O : " + compteurO + "\n");
			writer.write("Nombre de U : " + compteurU + "\n");
			writer.write("Nombre de Y : " + compteurY + "\n");
			
			writer.close();
		}
		//S'il y a une erreur lors de la cr�ation du fichier
		catch(Exception e2)
		{
			System.out.println("Erreur lors de l'�criture : ");
			System.out.print(e2.getMessage());
		}
	}

}
