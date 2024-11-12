package com.estudos.gym.service.impl;

import com.estudos.gym.entity.Enrollment;
import com.estudos.gym.respository.EnrollmentRepository;
import com.estudos.gym.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Override
    public Iterable<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    @Override
    public Enrollment getEnrollmentById(Long id) {
        return enrollmentRepository.findById(id).orElse(null);
    }

    @Override
    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment updateEnrollment(Long id, Enrollment enrollment) {

        enrollment.setId(id);
        return enrollmentRepository.save(enrollment);
    }

        @Override
        public void deleteEnrollment(Long id) {
            enrollmentRepository.deleteById(id);
        }
}
