public class PersonBuilder {
    private String city;
    private String name;
    private String surname;
    private int age;

    public Person build() {
        if (surname == null && city == null && name != null) {
            return new Person(name);
        }
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        if (name == null) {
            throw new IllegalArgumentException("Не введено имя");
        }
        if (surname == null) {
            throw new IllegalArgumentException("Не введена фамилия");
        }
        if (city == null) {
            throw new IllegalArgumentException("Не введён город");
        }
        return new Person(name, surname, age, city);
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
}
