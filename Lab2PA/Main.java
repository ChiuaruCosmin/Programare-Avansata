class Student {
    private String _name;
    private Projects _proiect;

    public Student(String name, Projects proiect) {
        this._name = name;
        this._proiect = proiect;
    }
    public String getName() {
        return this._name;
    }
    public void setName(String name) {
        this._name = name;
    }
    public Projects getProiect() {
        return this._proiect;
    }
    public void setProject(Projects project) {
        this._proiect = project;
    }

    @Override
    public String toString() {
        return "Student: " + this._name + ", Project: " + this._proiect;
    }
}

class Projects {
    private String _title;
    private Type _type;

    public Projects(String title, Type type) {
        this._title = title;
        this._type = type;
    }
    public String getTitle() {
        return this._title;
    }
    public void setTitle(String title) {
        this._title = title;
    }
    public Type getType() {
        return this._type;
    }
    public void setTitle(Type type) {
        this._type = type;
    }

    @Override
    public String toString() {
        return "Title: " + this._title + ", Type: " + this._type;
    }
}

public class Main {
    public static void main(String[] args) {
        Projects p1 = new Projects("Proiect1", Type.THEORETICAL);
        Projects p2 = new Projects("Proiect2", Type.PRACTICAL);
        Projects p3 = new Projects("Proiect3", Type.THEORETICAL);
        Projects p4 = new Projects("Proiect4", Type.PRACTICAL);

        Projects proiecte[] = {p1, p2, p3, p4};

        for(int i = 0; i < proiecte.length; i++) {
            System.out.println(proiecte[i]);
        }

        Student s1 = new Student("Marian", p1);
        Student s2 = new Student("Marius", p2);
        Student s3 = new Student("Mihai", p3);
        Student s4 = new Student("Maria", p4);

        Student studenti[] = {s1, s2, s3, s4};

        for(int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i]);
        }
    }
}