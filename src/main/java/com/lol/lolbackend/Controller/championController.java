package com.lol.lolbackend.Controller;

import com.lol.lolbackend.Entity.Champions;
import com.lol.lolbackend.Service.championService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")
public class championController {

    @Autowired
    championService service;

    @GetMapping("/champions")
    public List<Champions> getAllChampions() {
        return service.getchampions();
    }

    @GetMapping("/champions/{id}")
    public Optional<Champions> getAChampion(@PathVariable Integer id)
    {
        return service.getOneChampion(id);
    }

    @PostMapping("/champions")
    public void postAChampion(@RequestBody Champions champions) {
        service.saveAOneChampion(champions);
    }

    @DeleteMapping("champions/{id}")
    public void deleteAChampion(@PathVariable Integer id) {
        service.deleteOneChampion(id);
    }

    @PutMapping("champions/{id}")
    public Champions putAChampion(@PathVariable Integer id, @RequestBody Champions champion){
        Champions oldChampion=service.getOneChampion(id).get();
        oldChampion.setIdChampion(id);
        oldChampion.setPriceChampion(champion.getPriceChampion());
        oldChampion.setNameChampion(champion.getNameChampion());
        oldChampion.setImageChampion(champion.getImageChampion());
        service.saveAOneChampion(oldChampion);
        return oldChampion;
    }
}

