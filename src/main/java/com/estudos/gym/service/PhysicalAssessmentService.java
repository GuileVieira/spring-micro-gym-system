package com.estudos.gym.service;

import com.estudos.gym.entity.PhysicalAssessment;
import org.springframework.stereotype.Service;

@Service
public interface PhysicalAssessmentService {
    Iterable<PhysicalAssessment> getAllPhysicalAssessments();
    PhysicalAssessment getPhysicalAssessmentById(Long id);
    PhysicalAssessment createPhysicalAssessment(PhysicalAssessment physicalAssessment);
    PhysicalAssessment updatePhysicalAssessment(Long id, PhysicalAssessment physicalAssessment);
    void deletePhysicalAssessment(Long id);
}
