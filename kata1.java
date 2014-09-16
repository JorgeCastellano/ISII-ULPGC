package kata1;

public class Person {
    private final String name;
    private final Date birthday;
    
    public Person(Date birthdayo, String nameo){
        this.name = nameo;
        this.birthday = birthdayo;
    }
    
    public String getName() {
        return name;
    }
    
    public Date getBirthday() {
        return birthday;
    }
        
    public int getAge() {
        return 0;
    }
}
