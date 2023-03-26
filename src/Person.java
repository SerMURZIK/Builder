public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isAgeKnown = false;
    private String city;
    private boolean isCityKnown = false;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name) {
        this.name = name;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setCity(city)
                .setSurname(surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    public void happyBirthday() {
        age++;
    }


    public boolean hasAge() {
        return isAgeKnown;
    }

    public boolean hashCity() {
        return isCityKnown;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        isCityKnown = true;
        this.city = city;
    }
}
