package com.estudos.gym.controller;


import com.estudos.gym.entity.PhysicalAssessment;
import com.estudos.gym.service.PhysicalAssessmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/assessments")
public class PhysicalAssessmentController {

    @Autowired
    private PhysicalAssessmentService physicalAssessmentService;


    @GetMapping
    public ResponseEntity<Iterable<PhysicalAssessment>> getAllPhysicalAssessments() {
        return ResponseEntity.ok().body(physicalAssessmentService.getAllPhysicalAssessments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PhysicalAssessment> getPhysicalAssessmentById(@PathVariable Long id) {
        return ResponseEntity.ok().body(physicalAssessmentService.getPhysicalAssessmentById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<PhysicalAssessment> createPhysicalAssessment(@RequestBody PhysicalAssessment physicalAssessment) {
        return ResponseEntity.ok().body(physicalAssessment);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PhysicalAssessment> updatePhysicalAssessment(@PathVariable Long id, @RequestBody PhysicalAssessment physicalAssessment) {
        return ResponseEntity.ok().body(physicalAssessmentService.updatePhysicalAssessment(id, physicalAssessment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePhysicalAssessment(@PathVariable Long id) {
        physicalAssessmentService.deletePhysicalAssessment(id);
        return ResponseEntity.ok().build();
    }
}
