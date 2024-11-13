package com.estudos.gym.controller;

import com.estudos.gym.entity.Enrollment;
import com.estudos.gym.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public ResponseEntity<Iterable<Enrollment>> getAllEnrollments() {
        return ResponseEntity.ok().body(enrollmentService.getAllEnrollments());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Enrollment> getEnrollmentById(@PathVariable Long id) {
        return ResponseEntity.ok().body(enrollmentService.getEnrollmentById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Enrollment> createEnrollment(@RequestBody Enrollment enrollment) {
        return ResponseEntity.ok().body(enrollmentService.createEnrollment(enrollment));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Enrollment> updateEnrollment(@PathVariable Long id, @RequestBody Enrollment enrollment) {
        return ResponseEntity.ok().body(enrollmentService.updateEnrollment(id, enrollment));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEnrollment(@PathVariable Long id) {
        enrollmentService.deleteEnrollment(id);
        return ResponseEntity.ok().build();
    }


}
