package ec.edu.epn.git.asistente;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssistantTest {

    Assistant rv;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp() {
        System.out.println("setUp()");
        rv = new Assistant();
    }

    @Test
    public void given_the_command_confirm_that_they_are_true_1() {
        System.out.println("Test 1");
        assertTrue("true", rv.resultAccepted("Hola Asistente"));
    }

    @Test
    public void given_the_command_confirm_that_they_are_true_2() {
        System.out.println("Test 2");
        assertTrue("true", rv.resultAccepted("Busca el documento"));
    }

    @Test
    public void given_the_command_confirm_that_they_are_true_3() {
        System.out.println("Test 3");
        assertTrue("true", rv.resultAccepted("Lee el documento"));
    }

    @Test
    public void given_the_command_confirm_that_they_are_true_4() {
        System.out.println("Test 4");
        assertTrue("true", rv.resultAccepted("Escribe en el documento"));
    }

    @Test
    public void given_the_command_confirm_that_they_are_true_5() {
        System.out.println("Test 5");
        assertTrue("true", rv.resultAccepted("Salir Asistente"));
    }

    @Test
    public void given_the_command_check_that_it_meets_its_functionality_1() {
        System.out.println("Test 6");
        assertTrue("true", rv.assistantControl("Hola Asistente", "", ""));
    }

    @Test
    public void given_the_command_check_that_it_meets_its_functionality_2() {
        System.out.println("Test 7");
        assertTrue("true", rv.assistantControl("Busca el documento", "Text1.doc", ""));
    }

    @Test
    public void given_the_command_check_that_it_meets_its_functionality_3() {
        System.out.println("Test 8");
        assertTrue("true", rv.assistantControl("Escribe en el documento", "Text1.doc", "Hola mundo"));
    }
    @Test
    public void given_the_command_check_that_it_meets_its_functionality_4() {
        System.out.println("Test 9");
        assertTrue("true", rv.assistantControl("Lee el documento", "Text1.doc", ""));
    }
    @Test
    public void given_the_command_check_that_it_meets_its_functionality_5() {
        System.out.println("Test 10");
        assertTrue("true", rv.assistantControl("Salir Asistente", "", ""));
    }
}