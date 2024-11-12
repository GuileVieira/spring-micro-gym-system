package com.estudos.gym.service;

import com.estudos.gym.entity.Exercise;
import org.springframework.stereotype.Service;

@Service
public interface ExerciseService {
    Iterable<Exercise> getAllExercises();
    Exercise getExerciseById(Long id);
    Exercise createExercise(Exercise exercise);
    Exercise updateExercise(Long id, Exercise exercise);
    void deleteExercise(Long id);
}
