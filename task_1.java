public class ProgramTest {
    public class Program {
        public boolean checkIsAdult(int age) {
            return age >= 18;
        }
    }
    // Напиши код здесь
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Пользователю больше 18 лет", true, isAdult);
    }
}