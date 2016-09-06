package cpe200;

public class Student {

    public Student() {
        //not really sure of the status' default value
        this("", "", 1990, false);
    }
    public Student(String n, String id)
    {
        this(n, id, 1990, false);
    }
    public Student(String n, String id, int yob)
    {
        this(n, id, yob, false);
    }
    public Student(String n, String id, int yob, boolean stat)
    {
        this.studentName = !n.equalsIgnoreCase("")?n:"John Doe";
        this.stuID = isValidStudent_id(id)?id:"560610000";
        this.yob = (yob>1989)?yob:1990;
        this.status = stat;
    }
    public void setName(String name)
    {
        this.studentName = !name.equalsIgnoreCase("")?name:this.studentName;
    }
    public void setStudent_id(String id)
    {
        this.stuID = isValidStudent_id(id)?id:this.stuID;
    }
    public void setYearOfBirth(int yob)
    {
        this.yob = (yob>1989)?yob:this.yob;
    }

    public String getName()
    {
        return this.studentName;
    }
    public String getStudent_id()
    {
        return this.stuID;
    }
    public int getYearOfBirth()
    {
        return this.yob;
    }
    public boolean isActive()
    {
        return this.status;
    }


    @Override
    public String toString() {
        String o = studentName + " (" + stuID + ") was born in " + yob + " is an " + (isActive()?"ACTIVE":"INACTIVE") + " student.";
        return o;
    }

    private boolean isValidStudent_id(String id)
    {
        return id.matches(Regex)?true:false;
    }

    private boolean isValidYOB(int yob) {
        return (yob > 1989)?true:false;
    }

    // declare your attributes here
    private static final String Regex= "^5([6-9]?)061([0-2]?)([0-9]{3})$";
    private String studentName;
    private String stuID;
    private int yob;
    private boolean status;

}
