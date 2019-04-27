package com.ila.adv.ADV.service;

import com.ila.adv.ADV.Dao.AdvRepo;
import com.ila.adv.ADV.model.Advertesment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdvService {

    private AdvRepo advRepo;


    @Autowired
    public AdvService(AdvRepo advRepo) {
        this.advRepo = advRepo;
    }

    public List<Advertesment> getAllAdvertesmentPosted() {
        return (List<Advertesment>) advRepo.findAll();
    }

    public Advertesment filterAdvertesment(int id) {
        return advRepo.findById(id).orElse(new Advertesment());
    }

    public void putNewAdv(Advertesment adv) {
        advRepo.save(adv);
    }
}
