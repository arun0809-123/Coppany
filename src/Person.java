public abstract class Person {
    int id;
    String fullName;
    int age;
    char gender;
    public Person(){

    }

    public Person(int id, String fullName, int age, char gender) {
    }


    public void SortAge(int id, String fullName, int age , char gender ) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
