
public class Main {
    public static void main(String[] args) {
        Mentor mentor=new Mentor();
        mentor.SortAge(23454,"asdfdfdfd",22,'M');
        System.out.print(mentor.getId()+" ");
        System.out.print(mentor.getFullName()+" ");
        System.out.print(mentor.getAge()+" ");
        System.out.println(mentor.getGender());
        Instructor instructor=new Instructor();
        instructor.SortAge(23444,"sdjjhfdhf",23,'D');
        System.out.print(instructor.getId()+" ");
        System.out.print(instructor.getFullName()+" ");
        System.out.print(instructor.getAge()+" ");
        System.out.println(instructor.getGender());
        Student student=new Student();
        student.SortAge(23434,"asfdffdfd",24,'M');
        System.out.print(student.getId()+" ");
        System.out.print(student.getFullName()+" ");
        System.out.print(student.getAge()+" ");
        System.out.println(student.getGender());
        if (mentor.getAge()== mentor.getAge()){
            System.out.println(mentor.getAge());
        }
        if (mentor.getAge()> instructor.getAge()){
            System.out.println(mentor.getAge());
        } else if (mentor.getAge()< instructor.getAge()) {
            System.out.println(instructor.getAge());
        }
        if (mentor.getAge()> student.getAge()){
            System.out.println(mentor.getAge());
        } else if (mentor.getAge()< student.getAge()) {
            System.out.println(student.getAge());
        }


    }


    }