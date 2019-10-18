package xv.training.SpringBootApi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import xv.training.SpringBootApi.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{
	//find student by name
	List<Student>findByName(String name);
	
	//find student by name
	List<Student>findByAge(int age);
	
	//find student by name
	List<Student> findByQualification(String qualification);

	//find student by name and qualification
	List<Student> findByNameAndQualification(String name, String qualification);
	
	//find student by name and age
	List<Student> findByNameAndAge(String name, int age);
	
	@Query("select s from Student s where s.name = ?1")
	List<Student>findByName1(String name);
}
