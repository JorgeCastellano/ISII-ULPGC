package kata1;

public class Person {
    private final String name;
    private final Date birthday;
    private static final MILLISECONDS_PER_YEAR = (long)(365.25f*24*60*6*100);
    
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
        Date now = new Date();
        return millisecondsToYears(now.getTime() - birthday.getTime();
    }
    
    private int millisecondsToYears (long milliseconds) {
        return (int) (milliseconds / MILLISECONDS_PER_YEAR);
    }
}
