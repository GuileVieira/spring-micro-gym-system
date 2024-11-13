package com.estudos.gym.controller;


import com.estudos.gym.entity.Plan;
import com.estudos.gym.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/plans")
public class PlanController {

   @Autowired
   private PlanService planService;

   @GetMapping
   public ResponseEntity<Iterable<Plan>> getAllPlans() {
       return ResponseEntity.ok().body(planService.getAllPlans());
   }

   @GetMapping("/{id}")
   public ResponseEntity<Plan> getPlanById(@PathVariable Long id) {
       return ResponseEntity.ok().body(planService.getPlanById(id));
   }

   @PostMapping("/create")
   public ResponseEntity<Plan> createPlan(@RequestBody Plan plan) {
       return ResponseEntity.ok().body(planService.createPlan(plan));
   }

   @PutMapping("/{id}")
   public ResponseEntity<Plan> updatePlan(@PathVariable Long id,@RequestBody Plan plan) {
       return ResponseEntity.ok().body(planService.updatePlan(plan.getId(), plan));
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deletePlan(@PathVariable Long id) {
       planService.deletePlan(id);
       return ResponseEntity.ok().build();
   }

}
