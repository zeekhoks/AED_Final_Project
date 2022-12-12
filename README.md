# AED_Final_Project
## Know More - Grow More
An entire education management system that manages the overall growth of students in the city by managing schools, universities, dormitories, food supply, and the general administration. This system is designed to contribute to the education growth of the city and make a simpler method of managing students in the city.

## Requirements
Netbeans IDE, Java 17.0.4.1, acivation.jar, db4OUtil.jar, jcalendar.jar, and AbsoluteLayout.jar



## Installation
Go to https://github.com/zeekhoks/AED_Final_Project/tree/main and take a pull of the files. Run it in Netbeans IDE and run the application.


## Class Diagram

Please find the classes below -

![class diagram](https://user-images.githubusercontent.com/113055786/206953645-b7bd4494-76f6-4b68-8df5-9c9b1c8b633a.png)




## Object/Component Diagram -

Please find the object/component diagram below -

![Object Diagram](https://user-images.githubusercontent.com/113055786/206953621-de524abc-10f5-4cdc-be43-f68e5c9f066a.png)


## Configuration 
There is no configuration required for these modules as they don't have any configurable settings. Clear caches for faster loading and viewing of the page.

## Files

Packages -

### DB4OUtil.java - <br>

contains the database configuration file <br>
Ecosystem.java - contains the ecosystem definition which contains the entire system <br>
ConfigureASystem.java - contains all the directories which can help in configuring the enterprises <br>

### SchoolManagement

businesslogic -

Student.java - Contains student constructor with student details. <br>
StudentDirectory.java - Contains arraylist with all student objects. <br>
Teacher.java - Contains Teacher constructor with teacher details. <br>
TeacherDirectory.java - Contains arraylist with all teacher objects. <br>
School Admin - Contains the school admin with access to all crud. <br>
SchoolAdminDirectory.java - Contains arrayList with all school admin objects <br>
Subject.java - Contains the subject constructor with subject details. <br>
SubjectDirectory.java - Contains arrayList with all subject objects. <br>
SchoolStudentMealPlan.java - Contains the meal plans for students. <br>
SchoolStudentMealPlanDirectory.java - Contains the meal plan objects for students <br>
StudentGrades.java - Contains the student grades of the students. <br>

ui -

SchoolAdminDashboard.java - Contains various panels native to the school admin containing all CRUD operations. <br>
TeacherDashboard.java - Contains various panels native to the teacher containing grading and course functionalities. <br>
StudentDashboard.java - Contains various panels native to the student containing course viewing and grade options. <br>

### UniversityManagement

businesslogic - 

Student.java - Contains the student constructor with the student details. <br>
StudentDirectory.java - Contains the arrayList containing all student objects. <br>
Professor.java - Contains the professor constructor with the professor details. <br>
ProfessorDirectory.java - Contains the arrayList with all professor objects. <br>
UniversityAdmin.java - Contains the constructor for the university admin with all crud capabilities. <br>
PlacementCoordinator.java - Contains the constructor for the placement coordinator with appointment capabilities. <br>
Appointment.java - Contains the appointment details for the job placements. <br>
Course.java - Contains course details.<br>
CourseDirectory.java - Contains an arrayList of all courses taken by the student.<br>
StudentMealPlan.java - Contains the student meal plan constructor. <br>


ui - <br>

UniversityAdminDashboard.java - Contains various panels used by the university admin for crud operations. <br>
StudentDashboard.java - Contains various paenls used by the student for crud operations.<br>
ProfessorDashboard.java - Contains various panels used by the professor for crud operations. <br>
PlacementCoordinatorDashboard.java - Contains various panels used by the placement coordinator for crud operations. <br>

### Dormitory Management

businesslogic -

FeesPayment.java - Contains fee payment module. <br>
FeesPaymentHistory.java - Contains the fees arrayList. <br>
RoomBooking.java - Contains the room booking module. <br>
RoomBookingHistory.java - Contains the room booking history module. <br>
SalaryPayment.java - Contains the salary payment to employees module. <br>
SalaryPaymentHistory.java - Contains the salary payment history module. <br>
StuDetails.java - Contains the student details. <br>

ui - 
SystemAdminLoginPage.java - Contains various panels native to the dormitory System Admin containing all CRUD operations <br>
EmpLoginPage.java - Contains various panels native to the dormitory Employee containing adding room, creating student, viewing Dormitory Fees, Employee Salary and Booked Rooms Details functionalities <br>
StudentInitialPage.java - Contains various panels native to the dormitory Student containing signing up and viewing Personal Details and Dormitory Fees Details functionalities <br>

### MealManagement

businesslogic -

MealPlan.java - Contains the meal plan constructor. <br>
MealPlanAdmin.java - Contains the meal plan supplier constructor. <br>
MealPlanAdminDirectory.java - Contains the meal plan supplier directory. <br>
MealPlanDirectory.java - Contains the meal plan arrayList. <br>

ui -

MealPlanAdminDashboard.java - Contains the panels used by the meal plan supplier. <br>



City.java - Contains city constructor with city details <br>
CityDirectory.java - Arraylist of all cities <br>
Community.java - contains all community attributes <br>
CommunityDirectory.java - ArrayList of all communities <br>
Person.java - contains all person attributes such as name, age, gender, SSN, address <br>
SystemAdmin.java - contains all system admin attributes such as admin name, directories <br>
HospitalAdmin.java - contains all the hospital admin attributes such as hospital name, admin name, admin ID <br>
CommunityAdmin.java - contains all community admin attributes such as community name, community id <br>
PatientDetails.java - contains all the patient attributes such as name, gender, age, userid and password <br>
DoctorDetails.java - contains all the doctor attributes such as name, specialization, hospital name, doctorID <br>
DoctorDirectory.java - contains an ArrayList of all doctors <br>
PatientDirectory.java - contains an ArrayList of all patients <br>
PersonDirectory.java - contains an ArrayList of all people <br>
Hospital.java - contains the attributes related to hospitals such as hospital name, community id, zip <br>

## Troubleshooting
For troubleshooting, contact on this email - khokawala.z@northeastern.edu

## Credits
Name - Zainab Khokawala NUID - 002750435
Name - Drashti Bhingradiya - 002774273
Name - Hinal Patel - 002738956
