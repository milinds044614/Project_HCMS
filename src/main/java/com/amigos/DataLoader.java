package com.amigos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amigos.entities.ApplicationStatus;
import com.amigos.entities.AppraisalForms;
import com.amigos.entities.CandidateProfiles;
import com.amigos.entities.Certifications;
import com.amigos.entities.Departments;
import com.amigos.entities.EducationDetails;
import com.amigos.entities.EmployeeManagers;
import com.amigos.entities.Employees;
import com.amigos.entities.Roles;
import com.amigos.entities.Trainers;
import com.amigos.services.ApplicationStatusService;
import com.amigos.services.AppraisalFormsService;
import com.amigos.services.CandidateProfilesService;
import com.amigos.services.CertificationsService;
import com.amigos.services.DepartmentsService;
import com.amigos.services.EducationDetailsService;
import com.amigos.services.EmployeeManagersService;
import com.amigos.services.EmployeesService;
import com.amigos.services.RolesService;
import com.amigos.services.TrainersService;

@Component
public class DataLoader implements CommandLineRunner {

	@Autowired
	private RolesService roleService;

	@Autowired
	private EmployeesService employeeService;

	@Autowired
	private DepartmentsService departmentService;
	
	@Autowired
	private TrainersService trainerService;
	
	@Autowired
	private ApplicationStatusService applicationStatusService;
	
	@Autowired
	private AppraisalFormsService appraisalFomrsService;
	
	@Autowired 
	private CandidateProfilesService candidateProfilesService;
	
	@Autowired 
	private CertificationsService certificationService;
	
	@Autowired
	private EducationDetailsService eudcationDetialsService;

	@Autowired
	private EmployeeManagersService employeeManagersService;
	@Override
	public void run(String... args) throws Exception {

		Roles role1 = new Roles();
		role1.setRoleName("Manager");
		role1.setDescription("Manager role desc");
		roleService.addRole(role1);

		Roles role2 = new Roles();
		role2.setRoleName("Developer");
		role2.setDescription("Developer role desc");
		roleService.addRole(role2);

		Departments d1 = new Departments();
		d1.setDepartmentName("IT");
		d1.setDescription("IT Desc");
		departmentService.addDepartment(d1);

		Departments d2 = new Departments();
		d2.setDepartmentName("HR");
		d2.setDescription("HR Desc");
		departmentService.addDepartment(d2);
		
		Trainers t1=new Trainers();
		t1.setExternal(false);
		trainerService.addTrainer(t1);
		
		ApplicationStatus As1=new ApplicationStatus();
		As1.setApplicationDate(LocalDate.of(2010, 12, 21));
		As1.setApplicationNotes("I am fresher");
		As1.setStatus("Process");
		applicationStatusService.addApplicationStatus(As1);
		
		AppraisalForms Af1=new AppraisalForms();
		Af1.setSubmissionDate(LocalDate.of(2010, 12, 21));
		appraisalFomrsService.addAppraisalForms(Af1);
		
		
		Certifications c1=new Certifications();
		c1.setCertificationAuthority("GOV");
		//c1.setCertificationId(1);
		c1.setCertificationName("java");
		c1.setExpiryDate(LocalDate.of(2019, 2, 2));
		c1.setIssueDate(LocalDate.of(2018, 2, 2));
		certificationService.addCertifications(c1);
		
		
		
		
		
		EmployeeManagers Em1=new EmployeeManagers();
		
		
		Employees manager = new Employees();
		manager.setFirstName("Rahul");
		manager.setLastName("Dravid");
		manager.setGender("M");
		manager.setDateOfBirth(LocalDate.of(1990, 6, 18));
		manager.setEmail("xyz@gmail.com");
		manager.setPhone("9876543210");
		manager.setAddress("Karnataka");
		manager.setNationalId("6756756");
		manager.setMaritalStatus("Married");
		manager.setEmergencyContactName("Vijeta");
		manager.setEmergencyContactPhone("7456346457");
		manager.setPosition("Software Manager");
		manager.setSkillSet("Java , Spring Boot, AWS , Microservices");
		manager.setEmploymentStartDate(LocalDate.of(2019, 2, 2));
		manager.setEmploymentEndDate(null);
		manager.setSalary(new BigDecimal("190000.0"));
		manager.setEmploymentStatus("ACTIVE");
		manager.setBankAccountNumber("746574365");
		manager.setManager(null);
		manager.setDepartment(d2);
		manager.setRole(role2);

		Employees emp1 = new Employees();
		emp1.setFirstName("Rohit");
		emp1.setLastName("Sharma");
		emp1.setGender("M");
		emp1.setDateOfBirth(LocalDate.of(1990, 5, 15));
		emp1.setEmail("abc@gmail.com");
		emp1.setPhone("1234567890");
		emp1.setAddress("Mumbai");
		emp1.setNationalId("112343");
		emp1.setMaritalStatus("Single");
		emp1.setEmergencyContactName("Ritika");
		emp1.setEmergencyContactPhone("9087654321");
		emp1.setPosition("Software Developer");
		emp1.setSkillSet("Java , Spring Boot");
		emp1.setEmploymentStartDate(LocalDate.of(2020, 1, 1));
		emp1.setEmploymentEndDate(null);
		emp1.setSalary(new BigDecimal("80000.0"));
		emp1.setEmploymentStatus("ACTIVE");
		emp1.setBankAccountNumber("36758793465");
		emp1.setManager(manager);
		emp1.setDepartment(d1);
		emp1.setRole(role1);

		employeeService.addEmployee(manager);
		employeeService.addEmployee(emp1);
		

	}

}
