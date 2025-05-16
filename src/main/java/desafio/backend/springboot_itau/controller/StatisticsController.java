package desafio.backend.springboot_itau.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.backend.springboot_itau.dto.StatisticsResponse;
import desafio.backend.springboot_itau.service.TransactionService;

@RestController
@RequestMapping("estatistica")
public class StatisticsController {
    private final TransactionService transactionService;

    public StatisticsController(TransactionService transactionService){
        this.transactionService = transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics(){
        DoubleSummaryStatistics stats = transactionService.getStatistics();

        return ResponseEntity.ok(new StatisticsResponse(stats));
    }




}
