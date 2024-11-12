package com.estudos.gym.service;

import com.estudos.gym.entity.Plan;

public interface PlanService {
    Iterable<Plan> getAllPlans();
    Plan getPlanById(Long id);
    Plan createPlan(Plan plan);
    Plan updatePlan(Long id, Plan plan);
    void deletePlan(Long id);
}
