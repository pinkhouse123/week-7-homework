package week7homework;

public class Person {
    int age;
    String firstName, lastName;
    public String getFirstName(String fstNm)//instance method with return type with parameter
    {

        return fstNm;
    }
    public String getLastName(String lstNm) //instance method with return type with parameter
    {

        return lstNm;
    }
    public int getAge(int a) ////instance method with return type with parameter
    {

        return a;
    }
    public void setFirstName(String f) //instance method no return type with parameter
    {

        firstName = f;
    }
    public void setLastName(String l)//instance method no return type with parameter
    {
        lastName = l;
    }

    public void setAge(int b)//instance method no return type with parameter
    {
        if (age < 0 && age > 100) {
            age = 0;
        }
        age = b;
    }

    public boolean isTeen() //instance method with return type no parameter
    {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;

    }

    public String getFullName()//instance method with return type no parameter
    {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";

        } else if (firstName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " "+lastName;

        }
    }

    public static void main(String[] args) //main method
    {
        Person person = new Person();
        person.setFirstName("");//first name is set to empty string
        person.setLastName("");//last name is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");//first name is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");//last name is set to smith
        System.out.println("fullName= " + person.getFullName());

    }
}

