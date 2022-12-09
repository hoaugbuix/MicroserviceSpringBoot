package com.hoangbuix.inventoryservice.controller;

import com.hoangbuix.inventoryservice.dto.InventoryResponse;
import com.hoangbuix.inventoryservice.service.IInventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author hoangbui
 * @module package com.hoangbuix.inventoryservice.controller;
 * @product microservice-springboot
 * @since 03/12/2022 23:30
 **/
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/inventory")
public class InventoryController {
    private final IInventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }
}