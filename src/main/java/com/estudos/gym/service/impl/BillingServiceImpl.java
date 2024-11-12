package com.estudos.gym.service.impl;

import com.estudos.gym.entity.Billing;
import com.estudos.gym.respository.BillingRepository;
import com.estudos.gym.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private BillingRepository billingRepository;

    @Override
    public Iterable<Billing> getAllBilling() {
        return billingRepository.findAll();
    }

    @Override
    public Billing createBilling(Billing billing) {
        return billingRepository.save(billing);
    }

    @Override
    public Billing getBillingById(Long id) {
        return billingRepository.findById(id).orElse(null);
    }

    @Override
    public Billing updateBilling(Long id, Billing billing) {
           billing.setId(id);
           return billingRepository.save(billing);
    }

    @Override
    public void deleteBilling(Long id) {
        billingRepository.deleteById(id);
    }
}
