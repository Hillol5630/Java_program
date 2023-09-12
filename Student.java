public class Student {


        private int id;
        private String name;
        private int age;


        public Student() {

            id = 0;
            name = "Unknown";
            age = 0;
        }


        public Student(int id, String name, int age) {

            this.id = id;
            this.name = name;
            this.age = age;
        }


        public void displayDetails() {
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + name);
            System.out.println("Student Age: " + age);
            System.out.println();
        }

        public static void main(String[] args) {

            Student student1 = new Student();
            Student student2 = new Student(12345, "Stephen King ", 20);


            System.out.println("Student 1 Details:");
            student1.displayDetails();

            System.out.println("Student 2 Details:");
            student2.displayDetails();
        }
    }

