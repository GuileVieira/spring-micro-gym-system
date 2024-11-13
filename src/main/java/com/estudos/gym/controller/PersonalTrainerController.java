package com.estudos.gym.controller;


import com.estudos.gym.entity.PersonalTrainer;
import com.estudos.gym.service.PersonalTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personals")
public class PersonalTrainerController {
    @Autowired
    private PersonalTrainerService personalTrainerService;

    @GetMapping
    public ResponseEntity<Iterable<PersonalTrainer>> getAllPersonalTrainers() {
        return ResponseEntity.ok().body(personalTrainerService.getAllPersonalTrainers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalTrainer> getPersonalTrainerById(@PathVariable Long id) {
        return ResponseEntity.ok().body(personalTrainerService.getPersonalTrainerById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<PersonalTrainer> createPersonalTrainer(@RequestBody PersonalTrainer personalTrainer) {
        return ResponseEntity.ok().body(personalTrainerService.createPersonalTrainer(personalTrainer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonalTrainer> updatePersonalTrainer(@PathVariable Long id, @RequestBody PersonalTrainer personalTrainer) {
        return ResponseEntity.ok().body(personalTrainerService.updatePersonalTrainer(id, personalTrainer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonalTrainer(@PathVariable Long id) {
        personalTrainerService.deletePersonalTrainer(id);
        return ResponseEntity.ok().build();
    }
}
