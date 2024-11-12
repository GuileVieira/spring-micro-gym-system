package com.estudos.gym.service;

import com.estudos.gym.entity.Billing;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BillingService {
     Iterable<Billing> getAllBilling();
     Billing createBilling(Billing billing);
     Billing getBillingById(Long id);
     Billing updateBilling(Long id, Billing billing);
     void deleteBilling(Long id);
}
