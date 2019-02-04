package SortingUsingComparator;

/**
 *
 * @author szymon
 */
public class Person {
    
    private String name;
    private String surname;
    private String nick;

    public Person(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }

    @Override
    public String toString() {
        return "name: "+name+" surname: "+surname+" nick: "+nick;
    }
    
    
    
}
