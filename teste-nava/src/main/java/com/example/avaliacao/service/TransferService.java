package com.example.avaliacao.service;

import com.example.avaliacao.model.Transfer;
import com.example.avaliacao.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class TransferService {
    @Autowired
    private TransferRepository transferRepository;

    public Transfer scheduleTransfer(Transfer transfer) {
        transfer.setScheduleDate(LocalDate.now());
        transfer.setFee(calculateFee(transfer));
        return transferRepository.save(transfer);
    }

    public double calculateFee(Transfer transfer) {
        long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), transfer.getTransferDate());
        double amount = transfer.getAmount();

        if (daysBetween == 0) {
            return amount * 0.025 + 3;
        } else if (daysBetween <= 10) {
            return amount * 0.00 + 12;
        } else if (daysBetween <= 20) {
            return amount * 0.082;
        } else if (daysBetween <= 30) {
            return amount * 0.069;
        } else if (daysBetween <= 40) {
            return amount * 0.047;
        } else if (daysBetween <= 50) {
            return amount * 0.017;
        } else {
            throw new IllegalArgumentException("No applicable fee for this transfer date");
        }
    }

    public Iterable<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }
}
