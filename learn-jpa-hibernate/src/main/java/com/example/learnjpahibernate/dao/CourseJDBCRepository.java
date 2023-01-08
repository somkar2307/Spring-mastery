package com.example.learnjpahibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.learnjpahibernate.models.Course;

@Repository
public class CourseJDBCRepository {

	@Autowired
	private JdbcTemplate template;

//	private static String INSERT_QUERY = """
//				insert into COURSE(ID,NAME,AUTHOR)
//				values(4,'Learn Threading','pqr');
//			""";
	private static String INSERT_QUERY = """
			insert into COURSE(ID,NAME,AUTHOR)
			values(?,?,?);
		""";

	private static String DELETE_QUERY = """
			delete from COURSE
			where id=?
		""";
	
	private static String SELECT_QUERY = """
			Select * from COURSE where id=?;
		""";
	
	public void save(Course course) {
		template.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor()	);
	}
	
	public void deleteById(long id) {
		template.update(DELETE_QUERY,id);
	}
	public Course findById(long id) {
		return template.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
	}
}
