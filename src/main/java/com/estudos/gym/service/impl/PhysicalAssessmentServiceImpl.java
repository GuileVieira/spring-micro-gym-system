package com.estudos.gym.service.impl;

import com.estudos.gym.entity.PhysicalAssessment;
import com.estudos.gym.respository.PhysicalAssessmentRepository;
import com.estudos.gym.service.PhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhysicalAssessmentServiceImpl implements PhysicalAssessmentService {

    @Autowired
    private PhysicalAssessmentRepository physicalAssessmentRepository;

    @Override
    public Iterable<PhysicalAssessment> getAllPhysicalAssessments() {
        return physicalAssessmentRepository.findAll();
    }

    @Override
    public PhysicalAssessment getPhysicalAssessmentById(Long id) {
        return physicalAssessmentRepository.findById(id).orElse(null);
    }

    @Override
    public PhysicalAssessment createPhysicalAssessment(PhysicalAssessment physicalAssessment) {
        return physicalAssessmentRepository.save(physicalAssessment);
    }

    @Override
    public PhysicalAssessment updatePhysicalAssessment(Long id, PhysicalAssessment physicalAssessment) {
        physicalAssessment.setId(id);
        return physicalAssessmentRepository.save(physicalAssessment);
    }

    @Override
    public void deletePhysicalAssessment(Long id) {
        physicalAssessmentRepository.deleteById(id);
    }
}
