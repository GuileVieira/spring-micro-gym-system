package com.estudos.gym.service.impl;

import com.estudos.gym.entity.Exercise;
import com.estudos.gym.respository.ExerciseRepository;
import com.estudos.gym.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Override
    public Iterable<Exercise> getAllExercises() {
            return exerciseRepository.findAll();
    }

    @Override
    public Exercise getExerciseById(Long id) {
        return exerciseRepository.findById(id).orElse(null);
    }

    @Override
    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    @Override
    public Exercise updateExercise(Long id, Exercise exercise) {

        Exercise exerciseOld = getExerciseById(id);
        if (exerciseOld != null && exercise != null) {
            exerciseOld.setName(exercise.getName() != null ? exercise.getName() : exerciseOld.getName());
            exerciseOld.setDescription(exercise.getDescription() != null ? exercise.getDescription() : exerciseOld.getDescription());
            return exerciseRepository.save(exerciseOld);
        }
        return null;
    }

    @Override
    public void deleteExercise(Long id) {
        exerciseRepository.deleteById(id);
    }
}
