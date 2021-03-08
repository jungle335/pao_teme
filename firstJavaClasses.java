package com.company;

class personC {
    private String name, surname, type;
    private int age;
    private long cnp;

    public personC() {
        this.name    = "";
        this.surname = "";
        this.age     = 0;
        this.cnp     = 0;
        this.type    = "";
    }

    public personC(String name, String surname, int age, long cnp, String type) {
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

class roomC{
    private int roomC_number, roomC_floor;
    String roomC_type;

    public roomC() {
        this.roomC_number = this.roomC_floor = 0;
        this.roomC_type = "";
    }

    public roomC(int roomC_number, String roomC_type, int roomC_floor) {
        this.roomC_number = roomC_number;
        this.roomC_type   =  roomC_type;
        this.roomC_floor  = roomC_floor;
    }

    public int getroomC_number() { return roomC_number; }
    public String getroomC_type() { return roomC_type; }
    public int getroomC_floor() { return roomC_floor; }

    public void setroomC_number(int roomC_number) { this.roomC_number = roomC_number; }
    public void setroomC_type(String roomC_type) { this.roomC_type = roomC_type; }
    public void setroomC_floor(int roomC_floor) { this.roomC_floor = roomC_floor; }

    @Override
    public String toString() {
        return roomC_number + " " + roomC_floor + " " + roomC_type;
    }
}

class subJect{
    private roomC roomC;
    private int noOfStudents;
    private personC teacher;

    public subJect(){
        noOfStudents = 0;
    }

    public subJect(roomC roomC, int noOfStudents, personC teacher) {
        this.roomC        = roomC;
        this.noOfStudents = noOfStudents;
        this.teacher      = teacher;
    }

    public roomC getroomC() { return roomC; }
    public int getNoOfStudents() { return noOfStudents; }
    public personC getTeacher() { return teacher; }

    public void setroomC(roomC roomC) { this.roomC = roomC; }
    public void setNoOfStudents(int noOfStudents) { this.noOfStudents = noOfStudents; }
    public void setTeacher(personC teacher) { this.teacher = teacher; }

    @Override
    public String toString() {
        return roomC + " " + noOfStudents + " " + teacher;
    }
}

class singleTon {
    private static final singleTon noname = new singleTon();

    private singleTon() { System.out.println("Hello"); }

    public static singleTon getNoname() { return noname; }
}

public class claseBegin {
    public static void main(String[] args) {
        personC p1 = new personC("Popescu", "Geroge", 25, 1256787L, "Male");
        personC p2 = new personC("Badea", "Andreea", 30, 4256723L, "Female");
        System.out.println(p1 + "\n" + p2);

        roomC r1 = new roomC(100, "apartament", 1);
        roomC r2 = new roomC(101, "garsoniera", 1);
        System.out.println(r1.getroomC_number() + " " + r1.getroomC_type() + " " + r1.getroomC_floor());
        System.out.println(r2.getroomC_number() + " " + r2.getroomC_type() + " " + r2.getroomC_floor());

        subJect s1 = new subJect(r1, 20, p1);
        subJect s2 = new subJect(r2, 15, p2);
        System.out.print(s1 + "\n" + s2 + "\n");

        singleTon st = singleTon.getNoname();
        singleTon st1 = singleTon.getNoname();
    }
}
