package com.lol.lolbackend.Service;

import com.lol.lolbackend.Entity.Champions;
import com.lol.lolbackend.Repository.championRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class championService {

    @Autowired
    championRepository repository;


    public List<Champions> getchampions(){
        return repository.findAll();
    }

    public Optional<Champions> getOneChampion(Integer id){
        return repository.findById(id);
    }

    public void saveAOneChampion(Champions champions){
        repository.save(champions);
    }

    public void deleteOneChampion(Integer id){
        repository.deleteById(id);
    }

}
