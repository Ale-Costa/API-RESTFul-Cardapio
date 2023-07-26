package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @PostMapping
    public Food saveFood(@RequestBody FoodRequestDTO food){
        Food foodData = new Food(food);
        repository.save(foodData);
        return foodData;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodlist = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodlist;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteFood(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok("Alimento deletado com sucesso!");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFood(@PathVariable Long id, @RequestBody FoodRequestDTO food) {
        if (repository.existsById(id)) {
            Food foodData = repository.findById(id).orElseThrow();
            foodData.setTitle(food.title());
            foodData.setImage(food.image());
            foodData.setPrice(food.price());
            repository.save(foodData);
            return ResponseEntity.ok(foodData);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
