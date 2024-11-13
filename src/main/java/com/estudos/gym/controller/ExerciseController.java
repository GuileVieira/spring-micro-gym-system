package com.estudos.gym.controller;

import com.estudos.gym.entity.Exercise;
import com.estudos.gym.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping
    public ResponseEntity<Iterable<Exercise>> getAllExercises() {
        return ResponseEntity.ok().body(exerciseService.getAllExercises());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExerciseById(@PathVariable Long id) {
        return ResponseEntity.ok().body(exerciseService.getExerciseById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) {
        return ResponseEntity.ok().body(exerciseService.createExercise(exercise));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable Long id, @RequestBody Exercise exercise) {
        return ResponseEntity.ok().body(exerciseService.updateExercise(id, exercise));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExercise(@PathVariable Long id) {
        exerciseService.deleteExercise(id);
        return ResponseEntity.noContent().build();
    }

}
