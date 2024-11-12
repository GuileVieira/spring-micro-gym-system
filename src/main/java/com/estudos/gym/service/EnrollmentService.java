package com.estudos.gym.service;

import com.estudos.gym.entity.Enrollment;

public interface EnrollmentService {
    Iterable<Enrollment> getAllEnrollments();
    Enrollment getEnrollmentById(Long id);
    Enrollment createEnrollment(Enrollment enrollment);
    Enrollment updateEnrollment(Long id, Enrollment enrollment);
    void deleteEnrollment(Long id);
}
