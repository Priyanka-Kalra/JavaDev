package com.priyanka.JdbcSpringEx.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.priyanka.JdbcSpringEx.model.Student;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s) {

        String sql = "insert into student values(?,?,?)";
        int result = jdbc.update(sql, s.getRollNum(), s.getName(), s.getMarks());
        if (result > 0) {
            System.out.println("Student added successfully");
        } else {
            System.out.println("Failed to add student");
        }
    }

    public List<Student> findAll() {

        String sql = "select * from student";
        // RowMapper<Student> mapper = (rs, rowNum) -> {

        //     Student s = new Student();
        //     s.setRollNum(rs.getInt(1));
        //     s.setName(rs.getString(2));
        //     s.setMarks(rs.getInt(3));
        //     return s;

        // };

        return jdbc.query(sql, (rs, rowNum) -> {

            Student s = new Student();
            s.setRollNum(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setMarks(rs.getInt(3));
            return s;

        });

    }

}
