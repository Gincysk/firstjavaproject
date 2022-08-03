package com.company;

public class Student {
    private String name;
    private int age;
    private long id;
    private static final String SCHOOL_NAME = "Central School";


    public Student(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void setName(String name)
   {
    this.name = name;
   }

   public String getName()
   {
       return name;
   }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }



    public void greet()
    {
        System.out.println("Good morning");
    }

    public static void printSchool()
    {
        System.out.println(SCHOOL_NAME);
    }
}

