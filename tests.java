import static junit.framework.Assert.assertEquals;

public class TestClass {
    public void testStatement(){
        Movie m1 = new Movie("Movie X", 0);
        Movie m2 = new Movie("Movie Y", 1);
        Movie m3 = new Movie("Movie Z", 2);

        Customer c = new Customer("Joao");

        Rental r1 = new Rental(m1, 5)
        Rental r2 = new Rental(m2, 7)
        Rental r3 = new Rental(m3, 10)

        c.addRental(r1);
        c.addRental(r2);
        c.addRental(r3);

        String expectedResult = "Rental Record for Joao\n";
        expectedResult += "\tMovie X\t6.5\n";
        expectedResult += "\tMovie Y\t21.0\n";
        expectedResult += "\tMovie Z\t12.0\n";
        expectedResult += "Amount owed is 39.5\n";
        expectedResult += "You earned 4 frequent renter points";

        assertEquals(c.statement(), expectedResult);
    }
}
