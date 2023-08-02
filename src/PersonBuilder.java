public class PersonBuilder implements Builder {
    protected Person result;
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

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

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person p1 = new Person(name, surname, age);
        Person p2 = new Person(name, surname);
        if (p1.hasAge()) {
            result = p1;
        } else {
            result = p2;
        }
        return result;
    }
}
