import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge() {
        boolean isEmptyAge = (age != 0) ? true : false;
        return isEmptyAge;
    }

    public boolean hasAddress() {
        boolean isEmptyAddres = (address != null) ? true : false;
        return isEmptyAddres;
    }

    public String getName(String name) {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder newChild = new PersonBuilder();
        return newChild;
    }

    @Override
    public String toString() {
        String s = "";
        if (hasAge() && hasAddress()) {
            s = name + " " + surname + ", " + age + " лет," +
                    " из города " + address + ",";
        } else {
            s = name;
        }
        return s;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
