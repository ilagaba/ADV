package com.ila.adv.ADV.controller;

import com.ila.adv.ADV.model.Advertesment;
import com.ila.adv.ADV.service.AdvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.List;

@RestController
public class AdvController {

    private AdvService advService;
    @Autowired
    public AdvController(AdvService advService) {
        this.advService=advService;
    }

    @RequestMapping("/getAll")
    public List<Advertesment> getAllPostedAdvertesment(){
        List<Advertesment> advertesmentList;
        advertesmentList=advService.getAllAdvertesmentPosted()!=null?
                advService.getAllAdvertesmentPosted(): Collections.emptyList();
        return advertesmentList;
    }

    @RequestMapping("/getAll/{id}")
    public Advertesment filterAdvertesment(@PathVariable("id") int id){
        Advertesment advertesment;
        advertesment=advService.filterAdvertesment(id);
        return advertesment;
    }
    @RequestMapping("/add/{adv}")
    public boolean putNewAdvertesment(@PathVariable("adv") Advertesment adv){
        int size=advService.getAllAdvertesmentPosted().size();
        advService.putNewAdv(adv);
        if (advService.getAllAdvertesmentPosted().size()>size) {
            return true;
        }
        return false;

    }
}
