public class CompareStudent implements Comparable<CompareStudent>{

    private String name;

    public CompareStudent(String name){
        this.name = name;
    }    

    public boolean equals(CompareStudent other){
        if (this.name == other.name) {
            return true;
        }
        else {
            return false;
        }
    }

    public int compareTo(CompareStudent other) {
        return this.name.compareTo(other.name);
    }

    public String toString(){
        return "Student(" + this.name + ")";
    }
}
