package com.estudos.gym.service.impl;

import com.estudos.gym.entity.Plan;
import com.estudos.gym.respository.PlanRepository;
import com.estudos.gym.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Iterable<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public Plan getPlanById(Long id) {
        return planRepository.findById(id).orElse(null);
    }

    @Override
    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    @Override
    public Plan updatePlan(Long id, Plan plan) {
        plan.setId(id);
        return planRepository.save(plan);
    }

    @Override
    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }

}
