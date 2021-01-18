package ec.edu.epn.git.asistente;

public class AssistantExecute {
    public static void main(String[] args) {
        System.out.println("== Assistant Execute ==");

        String command1 = "Hola Asistente";
        String command2 = "Busca el documento";

        String doc1 = "Text1.doc";

        Assistant av = new Assistant();
        boolean as1 = av.resultAccepted(command1);
        if(as1)
           System.out.println("EL comando '--" + command1 + "--' será aceptado si es verdadero.\nPor lo tanto es satisfactorio.");

        boolean as2 = av.assistantControl(command2, doc1, "");
        if(as2)
            System.out.println("El comando '--" + command2 + "--' ha sido aceptado.\n" + "El resultado de la búsqueda del documento " + doc1 + " es Satisfactorio.");
    }
}
