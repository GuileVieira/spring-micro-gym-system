package com.estudos.gym.service;

import com.estudos.gym.entity.PersonalTrainer;
import org.springframework.stereotype.Service;

@Service
public interface PersonalTrainerService {
    Iterable<PersonalTrainer> getAllPersonalTrainers();
    PersonalTrainer getPersonalTrainerById(Long id);
    PersonalTrainer createPersonalTrainer(PersonalTrainer personalTrainer);
    PersonalTrainer updatePersonalTrainer(Long id, PersonalTrainer personalTrainer);
    void deletePersonalTrainer(Long id);
}
