package com.drato.graduationthesis.repository;

import com.drato.graduationthesis.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
