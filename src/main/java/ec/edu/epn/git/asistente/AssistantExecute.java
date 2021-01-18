package ec.edu.epn.git.asistente;

public class AssistantExecute {
    public static void main(String[] args) {
        System.out.println("== Assistant Execute ==");

        Assistant av = new Assistant();
        boolean as1 = av.resultAccepted("Hola Asistente");
        System.out.println("EL comando ha sido aceptado si es verdadero.\nPor lo tanto es: " + as1);

        boolean as2 = av.assistantControl("Busca el documento", "Text1.doc", "");
        System.out.println("El resultado de la búsqueda es: " + as1);
    }
}
