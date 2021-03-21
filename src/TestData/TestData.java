/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestData;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Department.DepartmentDirectory;
import info5100.university.example.Persona.Faculty.Alumni.Alumni;
import info5100.university.example.Persona.Faculty.Alumni.AlumniDirectory;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.EmployeeDirectory;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.Employers;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author psrib
 */
public class TestData {

    static TestData testData;
    
    public  static TestData getInstance()
    {
        if(testData==null)
        {
            testData = new TestData();
        }
        
        return testData;
        
    }
    
    ArrayList<Employers> emp = new ArrayList<>();
    AlumniDirectory ad  = new AlumniDirectory();
    EmployeeDirectory ed = new EmployeeDirectory();
    DepartmentDirectory dd = new DepartmentDirectory();
    
    public  DepartmentDirectory getDd() {
        return dd;
    }

    public AlumniDirectory getAd() {
        return ad;
    }
    
    public EmployeeDirectory getED(){
        return ed;
    }

    public StudentDirectory getSd() {
        return sd;
    }

    /**
     * @param args the command line arguments
     */
    static StudentDirectory sd ;
    public static void main(String[] args) {
        // TODO code application logic here
         
        
        
        
    }
    
public void getStudentTakenByProf(String courseID, StudentDirectory sd){
        
        ArrayList<StudentProfile> as = new ArrayList();
        List<StudentProfile> list = sd.getStudentlist();
        for(StudentProfile sp : list)
        {
            List<SeatAssignment> list1 = sp.getCourseLoadBySemester("Fall2020").getSeatassignments();
            for(SeatAssignment seatAssignment : list1)
            {
                if(seatAssignment.getSeat().getCourseoffer().getCourse().getCOurseNumber().equals(courseID))
                {
                    System.out.println(sp.getPerson().getPersonId());
                }
            }
        }
     
        
    }

    public void test1(){
        System.out.println("TEST 1");
        Department department = new Department("Information Systems");

        Course course = department.newCourse("app eng", "info 5100", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        
        courseoffer.generatSeats(10);
        
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("01");
        Person person1 = pd.newPerson("07");
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student1 = sd.newStudentProfile(person1);        
        CourseLoad courseload = student.newCourseLoad("Fall2020");
        CourseLoad courseload1 = student1.newCourseLoad("Fall2021");
//        
        courseload.newSeatAssignment(courseoffer); //register student in class
         
        
        EmployeeDirectory ed = new EmployeeDirectory();
        ArrayList<Employers> emp = new ArrayList<>();
        Employers em = new Employers();
        em.setEmployerName("");
        emp.add(em);
        ed.setEmployers(emp);
        
        StudentProfile sp = sd.findStudent("01");
       // System.out.println("");
        Alumni al = new Alumni();
        al.setStudentProfile(sp);
        al.setGradutationYear(2020);
        al.setEmp(em);
        al.setPosition("SDE");
        al.setSalaryRange(25000);
        al.setPromotions(2);
        HashMap<String, Alumni> map = new HashMap<>();
        map.put("01", al);
        al.setAlumniDir(map);
        StudentProfile sp1 = sd.findStudent("07");
       // System.out.println("");
        //Alumni al = new Alumni();
        Alumni al1 = new Alumni();
        al1.setStudentProfile(sp1);
        al1.setGradutationYear(2021);
        al1.setEmp(em);
        al1.setPosition("SDE2");
        al1.setSalaryRange(15000);
        al1.setPromotions(5);
        map.put("07", al1);
        al1.setAlumniDir(map);
        
        
        
        
    }
    

     public void test2(){
        Department department = new Department("Information Systems");
        Department department1 = new Department("Computer Science");
        ArrayList<Department> ad = new ArrayList<>();
        ad.add(department);
        ad.add(department1);
        dd.setDd(ad);
        
        Course course = department.newCourse("app eng", "info 5100", 4);        
        Course course1 = department1.newCourse("PDP", "cs 5010", 4);

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");
        CourseSchedule courseschedule1 = department1.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        courseoffer.generatSeats(10);
        
        CourseOffer courseoffer1 = courseschedule1.newCourseOffer("cs 5010");
        courseoffer1.generatSeats(10);
        
        PersonDirectory pd = department.getPersonDirectory();
      //  PersonDirectory pd1 = department1.getPersonDirectory();

        Person person =  pd.newPerson("info1");
        Person person1 = pd.newPerson("info2");
        Person person2 = pd.newPerson("cs1");
        Person person3 = pd.newPerson("cs2");
        
        sd = department.getStudentDirectory();
        StudentDirectory sd1 = department1.getStudentDirectory();

        StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student1 = sd.newStudentProfile(person1);
        
        StudentProfile student2 = sd1.newStudentProfile(person2);
        StudentProfile student3 = sd1.newStudentProfile(person3);
        
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
        CourseLoad courseload1 = student1.newCourseLoad("Fall2020"); 
        CourseLoad courseload2 = student2.newCourseLoad("Fall2020"); 
        CourseLoad courseload3 = student3.newCourseLoad("Fall2020");
        FacultyDirectory fd = department.getFacultyDirectory();
       
        FacultyDirectory fd1 = department1.getFacultyDirectory();

        
        Person prof1 = pd.newPerson("prof");
        Person prof2 = pd.newPerson("prof1");

        FacultyProfile fp = fd.newStudentProfile(prof1);
        FacultyProfile fp1 = fd1.newStudentProfile(prof2);
        
        
        courseoffer.AssignAsTeacher(fp);
        fp.AssignAsTeacher(courseoffer);
        courseoffer1.AssignAsTeacher(fp1);
        fp1.AssignAsTeacher(courseoffer1);
        
        

        courseload.newSeatAssignment(courseoffer); //register student in class
        courseload1.newSeatAssignment(courseoffer);
        courseload2.newSeatAssignment(courseoffer1);
        courseload3.newSeatAssignment(courseoffer1);

             
    }
     
     
     
     
     //Alumni Growth Metric
     public void calculateAGM(){
        
        ArrayList<Alumni> all = ad.getAd();
        
        for(Alumni a : all){
            
        }
         
      
                 
     } 
    
}
