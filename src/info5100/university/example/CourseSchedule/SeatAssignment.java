/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {

 
    Seat seat;
    CourseLoad courseload;
    String grade;

    public String getGrade() {
        return grade;
    }
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
        grade = "U";
    }
        public SeatAssignment(){

    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public void assignGradeToStudent(String g){
        grade = g;
    }
    
}
