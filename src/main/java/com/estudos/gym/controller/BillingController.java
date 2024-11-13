package com.estudos.gym.controller;

import com.estudos.gym.entity.Billing;
import com.estudos.gym.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @Autowired
    private BillingService billingService;


    @GetMapping
    public ResponseEntity<Iterable<Billing>> getAllBilling() {
        return ResponseEntity.ok().body(billingService.getAllBilling());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Billing> getBillingById(@PathVariable Long id) {
        return ResponseEntity.ok().body(billingService.getBillingById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Billing> createBilling(@RequestBody Billing billing) {
        return ResponseEntity.ok().body(billingService.createBilling(billing));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Billing> updateBilling(@PathVariable Long id, @RequestBody Billing billing) {
        return ResponseEntity.ok().body(billingService.updateBilling(id, billing));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBilling(@PathVariable Long id) {
        billingService.deleteBilling(id);
        return ResponseEntity.ok().build();
    }

}
