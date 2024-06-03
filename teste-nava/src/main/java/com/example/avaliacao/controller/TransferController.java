package com.example.avaliacao.controller;

import com.example.avaliacao.model.Transfer;
import com.example.avaliacao.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfers")
@CrossOrigin(origins = "http://localhost:4200")
public class TransferController {
    @Autowired
    private TransferService transferService;

    @PostMapping
    public Transfer scheduleTransfer(@RequestBody Transfer transfer) {
        return transferService.scheduleTransfer(transfer);
    }

    @GetMapping
    public Iterable<Transfer> getAllTransfers() {
        return transferService.getAllTransfers();
    }
}
