package com.company;

class Person {
    private String name, surname, type;
    private int age;
    private long cnp;

    public Person() {
        this.name    = "";
        this.surname = "";
        this.age     = 0;
        this.cnp     = 0;
        this.type    = "";
    }
    
    public Person(String name, String surname, int age, long cnp, String type) {
        this.name    = name;
        this.surname = surname;
        this.age     = age;
        this.cnp     = cnp;
        this.type    = type;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getAge() { return age; }
    public long getCnp() { return cnp; }
    public String getType() { return type; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setAge(int age) { this.age = age; }
    public void setCnp(long cnp) { this.cnp = cnp; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return name + " " + surname + " " + age + " " + cnp + " " + type;
    }
}

class Room{
    private int room_number, room_floor;
    String room_type;
    
    public Room() {
        this.room_number = this.room_floor = 0;
        this.room_type = "";
    }
    
    public Room(int room_number, String room_type, int room_floor) {
        this.room_number = room_number;
        this.room_type   =  room_type;
        this.room_floor  = room_floor;
    }

    public int getRoom_number() { return room_number; }
    public String getRoom_type() { return room_type; }
    public int getRoom_floor() { return room_floor; }

    public void setRoom_number(int room_number) { this.room_number = room_number; }
    public void setRoom_type(String room_type) { this.room_type = room_type; }
    public void setRoom_floor(int room_floor) { this.room_floor = room_floor; }

    @Override
    public String toString() {
        return room_number + " " + room_floor + " " + room_type;
    }
}

class Subject{
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(){
        noOfStudents = 0;    
    }
    
    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room         = room;
        this.noOfStudents = noOfStudents;
        this.teacher      = teacher;
    }

    public Room getRoom() { return room; }
    public int getNoOfStudents() { return noOfStudents; }
    public Person getTeacher() { return teacher; }

    public void setRoom(Room room) { this.room = room; }
    public void setNoOfStudents(int noOfStudents) { this.noOfStudents = noOfStudents; }
    public void setTeacher(Person teacher) { this.teacher = teacher; }

    @Override
    public String toString() {
        return room + " " + noOfStudents + " " + teacher;
    }
}

class Singleton {
    private static final Singleton noname = new Singleton();

    private Singleton() { System.out.println("Hello"); }

    public static Singleton getNoname() { return noname; }
}

public class claseBegin {
    public static void main(String[] args) {
        Person p1 = new Person("Popescu", "Geroge", 25, 1256787L, "Male");
        Person p2 = new Person("Badea", "Andreea", 30, 4256723L, "Female");
        System.out.println(p1 + "\n" + p2);

        Room r1 = new Room(100, "apartament", 1);
        Room r2 = new Room(101, "garsoniera", 1);
        System.out.println(r1.getRoom_number() + " " + r1.getRoom_type() + " " + r1.getRoom_floor());
        System.out.println(r2.getRoom_number() + " " + r2.getRoom_type() + " " + r2.getRoom_floor());

        Subject s1 = new Subject(r1, 20, p1);
        Subject s2 = new Subject(r2, 15, p2);
        System.out.print(s1 + "\n" + s2 + "\n");

        Singleton st = Singleton.getNoname();
        Singleton st1 = Singleton.getNoname();
    }
}
