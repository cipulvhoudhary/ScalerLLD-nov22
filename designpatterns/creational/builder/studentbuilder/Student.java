package practicedesignpatterns.builder.studentbuilder;

public class Student {

    private int id;
    private String name;
    private String email;
    private long phone;
    private String batch;
    private double psp;

    private Student(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.email = b.email;
        this.phone = b.phone;
        this.batch = b.batch;
        this.psp = b.psp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", batch='" + batch + '\'' +
                ", psp=" + psp +
                '}';
    }

    static class Builder {
        private int id;
        private String name;
        private String email;
        private long phone;
        private String batch;
        private double psp;

        // setters for attributes of Builder object
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(long phone) {
            this.phone = phone;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        // return new student object
        public Student build() {
            return new Student(this);
        }
    }

}
