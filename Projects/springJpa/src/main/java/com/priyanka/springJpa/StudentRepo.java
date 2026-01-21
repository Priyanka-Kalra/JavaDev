package com.priyanka.springJpa;

import com.priyanka.springJpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//<Class,type of primary key>
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    //Jpql
    @Query("select s from Student s where s.name= ?1")
    List<Student> findByName(String name);


//    not required due to 'query dsl'
//    @Query("select s from Student s where s.marks= ?1")
    List<Student> findByMarks(Integer marks);

    @Query("select s from Student s where s.marks>= ?1")
    List<Student> findByMarksGreaterThan(int i);
}
