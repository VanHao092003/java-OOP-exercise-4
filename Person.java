public class Person {
    protected String name;
    protected String age;
    protected String job;
    protected String identityCardNumber;
    
    public Person(String name, String age, String jop, String identityCardNumber) {
        this.name = name;
        this.age = age;
        this.job = jop;
        this.identityCardNumber = identityCardNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getJop() {
        return job;
    }
    public void setJop(String jop) {
        this.job = jop;
    }
    public String getIdentityCardNumber() {
        return identityCardNumber;
    }
    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name+ ", age: " + age + ", identity card number: "
         + identityCardNumber + ", job: " +  job;
    }
}
