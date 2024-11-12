package com.estudos.gym.service.impl;

import com.estudos.gym.entity.PersonalTrainer;
import com.estudos.gym.respository.PersonalTrainerRepository;
import com.estudos.gym.service.PersonalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalTrainerServiceImpl implements PersonalTrainerService {

    @Autowired
    private PersonalTrainerRepository personalTrainerRepository;

    @Override
    public Iterable<PersonalTrainer> getAllPersonalTrainers() {
        return personalTrainerRepository.findAll();
    }

    @Override
    public PersonalTrainer getPersonalTrainerById(Long id) {
        return personalTrainerRepository.findById(id).orElse(null);
    }

    @Override
    public PersonalTrainer createPersonalTrainer(PersonalTrainer personalTrainer) {
        return personalTrainerRepository.save(personalTrainer);
    }

    @Override
    public PersonalTrainer updatePersonalTrainer(Long id, PersonalTrainer personalTrainer) {
        personalTrainer.setId(id);
        return personalTrainerRepository.save(personalTrainer);
    }

    @Override
    public void deletePersonalTrainer(Long id) {
        personalTrainerRepository.deleteById(id);
    }
}
