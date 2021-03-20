/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author psrib
 */
public class Helper {
    
    public List<Course> getCourseOffer(Department d , String semester)
    {
        CourseSchedule courseSchedule = d.getCourseSchedule(semester);
        List<CourseOffer> courseOffer = courseSchedule.getSchedule();
        List<Course> course = new ArrayList();
        for(CourseOffer co : courseOffer)
        {
            course.add(co.getCourse());
        }
        return course;
    }
    
    public List<CourseOffer> getCourseOfferList(Department d , String semester)
    {
        CourseSchedule courseSchedule = d.getCourseSchedule(semester);
        List<CourseOffer> courseOffer = courseSchedule.getSchedule();
        
        return courseOffer;
    }
    
    public List<Person> getStudent(Department d)
    {
        List<StudentProfile> profile = d.getStudentDirectory().getStudentlist();
        List<Person> list = new ArrayList();
        for(StudentProfile studentProfile : profile)
        {
            list.add(studentProfile.getPerson());
        }
        return list;
        
       
        
    }
    
    public void addStudent(Department d , String studentName , String studentId , String semester , CourseOffer co)
    {
        //CourseSchedule courseschedule = d.getCourseSchedule(semester);
        StudentDirectory sd = d.getStudentDirectory();
        PersonDirectory pd = d.getPersonDirectory();
        Person person =  pd.newPerson(studentId);
        person.setName(studentName);
         
        StudentProfile student = sd.newStudentProfile(person);
        
        
        CourseLoad courseload = student.newCourseLoad(semester); 
  
        courseload.newSeatAssignment(co);
        
    }
    
    public void addProfessor(Department d , String studentName , String studentId , String semester , CourseOffer co)
    {
        //CourseSchedule courseschedule = d.getCourseSchedule(semester);
        PersonDirectory pd = d.getPersonDirectory();
        FacultyDirectory fd = d.getFacultyDirectory();
        Person person1 = pd.newPerson("123456");
        FacultyProfile fp = fd.newStudentProfile(person1);
        co.AssignAsTeacher(fp);
        
    }
    
}
