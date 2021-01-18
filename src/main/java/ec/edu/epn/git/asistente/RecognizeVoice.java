package ec.edu.epn.git.asistente;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RecognizeVoice {
    private boolean exist;
    private String commands;

    public RecognizeVoice(String commands)
    {
        this.commands = commands;
    }
    public RecognizeVoice()
    {

    }

    public boolean resultAccepted(String command)
    {
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("Hola Asistente");
        commands.add("Busca el documento");
        commands.add("Lee el documento");
        commands.add("Escribe en el documento");
        commands.add("Salir Asistente");
        return commands.contains(command);
    }

    public boolean assistantControl(String command, String name, String text)
    {

        ArrayList<Archive> docs = new ArrayList<Archive>();
        docs.add(new Archive("Text1.doc", "C:\\Asistente\\Docs\\"));
        docs.add(new Archive("Text2.doc", "C:\\Asistente\\Docs\\"));
        docs.add(new Archive("Text3.doc", "C:\\Asistente\\Docs\\"));
        docs.add(new Archive("Text4.doc", "C:\\Asistente\\Docs\\"));
        docs.add(new Archive("Text5.doc", "C:\\Asistente\\Docs\\"));

        if(resultAccepted(command))
        {

            if(command == "Hola Asistente")
                System.out.println("Hola, ¿en que puedo ayudarte?");
            else if(command == "Busca el documento")
            {
                for(int i=0; i<docs.size(); i++) {
                    if (docs.get(i).getName() == name)
                        exist = true;
                }
                if(exist)
                    System.out.println("Documento encontrado");
                else
                    System.out.println("El documento no existe");
            }
            else if(command == "Lee el documento")
            {
                for(int i=0; i<docs.size(); i++)
                {
                    if (docs.get(i).getName() == name)
                    {
                        exist = true;

                        System.out.println("Documento encontrado" + docs.get(i).getName());
                        text = "Hola esta es una prueba para la lectura de un documento.";
                        System.out.println(text);

                    /*File archive = null;
                    FileReader fr = null;
                    BufferedReader br = null;

                    try
                    {
                        archive = new File(docs.get(i).getDirectory());
                        fr = new FileReader(archive);
                        br = new BufferedReader(fr);

                        String line = "Hola este es un documento para su lectura en consola.";
                        while((line = br.readLine()) != null)
                            System.out.println(line);
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        try
                        {
                            if(null != fr)
                                fr.close();
                        }
                        catch(Exception e2)
                        {
                            e2.printStackTrace();
                        }
                    }*/
                    }
                        exist = true;



                }
            }
            else if(command == "Escribe en el documento") {
                for (int i = 0; i < docs.size(); i++) {
                    if (docs.get(i).getName() == name) {
                        exist = true;
                        System.out.println("Documento encontrado" + docs.get(i).getName());
                        System.out.println("¿Qué va a escribir en este documento?");
                        System.out.println(text);

                    /*FileWriter file = null;
                    PrintWriter pw = null;



                    try {
                        file = new FileWriter(docs.get(i).getDirectory() + docs.get(i).getName(), true);
                        pw = new PrintWriter(file);

                        Scanner sc = new Scanner(System.in);

                        for (int j = 0; j < 10; j++)
                            pw.println(sc.next());

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (null != file)
                                file.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }*/
                    }
                }
            }
            else
                System.out.println("Adiós...");
            return true;
        }
        else
            System.out.println("Repita el comando");
        return false;
    }

    public boolean getExist()
    {
        return exist;
    }

    public void setExist(boolean exist)
    {
        this.exist = exist;
    }
}