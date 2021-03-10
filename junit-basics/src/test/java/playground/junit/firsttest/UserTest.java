package playground.junit.firsttest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User Class Test Suite")
class UserTest {
    @BeforeAll
    //metoda musi być statyczna
    static void before() {
        System.out.println("Test suite: start");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Test case: start");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Test case: end");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("Test suit: end");
    }

    //@Disabled
    @Test
    @DisplayName("When user is created, then getUserName" +
            "method should return correct name")
    // public void whenUserIsCreatedThenGetUserNameReturnCorrectName() {
    //test1
        void testUserName () {
            //given - dane potrzebne do rozruchu metody która znajdzie się w sekcji when
            User user = new User("Milena", "Wo");

            //when
            String userName = user.getUserName();

            //then - informacje które będę oczekiwać od metody (jakie dane zwraca metoda

            //junit5 - assertion
            Assertions.assertEquals("Milena", userName);
            //assertJ - assertion
            //assertThat(userName) AbstractStringAssert capture of ?
                  //.isEqualTo("Milena") capture of ?
                  //.startsWith("M")
                  //.endsWith("a")
                  //.isNotEmpty();

        }

    private void assertThat(String userName) {
    }

    @Test
    //test2
    void testSpecificName() {
        //given - dane potrzebne do rozruchu metody która znajdzie się w sekcji when
        User user = new User("Milena", "Wo");

        //when
        String SpecificName = user.getSpecificName();

        //then - informacje które będę oczekiwać od metody (jakie dane zwraca metoda
        Assertions.assertEquals("Milena_Wo", SpecificName);
    }


    //kiedy moja klasa user będzie działać dobrze?
    //jeżeli wywołam metode get user name i dostanę oczekiwaną wartość
    //User Milena = new User ("Milena")
    //oczekuję ze get name user zwróci Milena

}