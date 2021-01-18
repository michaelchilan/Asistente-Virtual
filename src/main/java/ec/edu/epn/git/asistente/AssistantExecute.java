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

        System.out.println("\n\n== New Executions ==");

        String command3 = "Lee el documento";
        String command4 = "Escribe en el documento";
        String command7 = "Salir Asistente";

        String doc2 = "Text4.doc";
        String doc3 = "Test2.doc";

        String text = "ESTA ES UNA PRUEBA PARA LA EJECUCIÓN DEL COMANDO DE ESCRITURA";

        boolean as3 = av.assistantControl(command3, doc2, "");
        if(as3)
            System.out.println("EL comando '--" + command3 + "--' será aceptado si es verdadero.\nEl contenido del documento es:\n" + doc2);

        boolean as4 = av.assistantControl(command4, doc3, text);
        if(as4)
            System.out.println("EL comando '--" + command4 + "--' será aceptado si es verdadero.\nEl texto agregado es:\n" + text);
    }
}
