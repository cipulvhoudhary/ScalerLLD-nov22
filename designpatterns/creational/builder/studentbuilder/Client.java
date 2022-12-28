package practicedesignpatterns.builder.studentbuilder;

public class Client {

    public static void main(String[] args) {
//        Student.Builder b = Student.getBuilder();
//        b.setId(1);
//        b.setName("vipul");
//        b.setEmail("abc@xyz");
//        b.setPhone(534643);
//        b.setBatch("academy");
//        b.setPsp(95.54);
//        Student st1 = b.build();
//
//        System.out.println(st1.toString());

        Student st1 = Student.getBuilder()
                .setId(1)
                .setName("vipul")
                .setEmail("abc@xyz")
                .setPhone(5454)
                .setBatch("academy")
                .setPsp(95.50)
                .build();

        System.out.println(st1.toString());
    }

}
