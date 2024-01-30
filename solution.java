import java.util.*;
class Solution{

    public static void main(String []args){

        ArrayList<Student> studentList = new ArrayList<Student>();
        String [][] input = {{"33","Rumpa","3.68"},{"85","Ashis","3.85"},{"56","Samiha","3.75"},{"19","Samara","3.75"},{"22","Fahim","3.76"}};
        for(String [] s : input){
            Student student = new Solution().new Student(Integer.parseInt(s[0]),s[1],Double.parseDouble(s[2]));
            studentList.add(student);
        }
        // Sort the list
        Collections.sort(studentList, new Solution().new Student(0,"",0));

        // Print the sorted list
        for(Student st: studentList){
            System.out.println(st.getFname());
        }

    }
    public class Student implements Comparator<Student>{

        private int id;
        private String fname;
        private double cgpa;
        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }
    
        public int getId() {
            return id;
        }
        public String getFname() {
            return fname;
        }
        public double getCgpa() {
            return cgpa;
        }
    
        //Comparator
        public int compare(Student s1, Student s2){
            if (s1.getCgpa() == s2.getCgpa()){
                if (s1.getFname().equals(s2.getFname())){
                    return s1.getId() - s2.getId();
                }
                else{
                    return s1.getFname().compareTo(s2.getFname());
                }
            }
            else{
                return Double.compare(s2.getCgpa(), s1.getCgpa());
            } 
            
        }
    }
}

