//package telran.java38.student.dao;
//
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import telran.java38.student.model.Student;
//
////@Repository
//public class StudentRepositoryImpl implements StudentRepository {
//
//	Map<Integer, Student> students = new ConcurrentHashMap<>();
//
//	@Override
//	public boolean addStudent(Student student) {
//		return students.putIfAbsent(student.getId(), student) == null;
//	}
//
//	@Override
//	public Student findStudent(int id) {
//		return students.get(id);
//	}
//
//	@Override
//	public Student removeStudent(int id) {
//		return students.remove(id);
//	}
//
//	@Override
//	public Student updateStudent(Student student) {
//		return students.replace(student.getId(), student);
//	}
//
//}
