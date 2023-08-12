package com.hackerton.pieSystem.controller;


import java.util.List;

import com.hackerton.pieSystem.domain.KospiStock;
import com.hackerton.pieSystem.domain.KospiStockDto;
import com.hackerton.pieSystem.domain.StockSummary;
import jakarta.servlet.http.HttpServletRequest;

import com.hackerton.pieSystem.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

//    @GetMapping("/stock/{itemCode}")
//    public StockSummary getStockInfo(@PathVariable String itemCode) {
//        return stockService.getStockSummary(itemCode);
//    }

    @GetMapping("/kospi/all")
    public List<KospiStockDto> getKosPiStockList(HttpServletRequest request) {
        return stockService.getKosPiStockList();
    }

    @GetMapping("/kospi/update")
    public void fetchAndUpdateKospiData(HttpServletRequest request) {
        stockService.fetchAndUpdateKospiData();
    }

    @GetMapping("/kospi/findall")
    public List<KospiStock> findAll(HttpServletRequest request) {
        return stockService.findAll();
    }
}
