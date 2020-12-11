public class main {
    public static void main(String[] args) {

        NationalService service1 = new MilitaryService(100);

        test(service1);

        NationalService service2 = new CivilService();

        test(service2);
    }

    private static void test (NationalService service) {
        System.out.println(service.getDaysLeft());

        service.work();

        System.out.println(service.getDaysLeft());
    }
}
