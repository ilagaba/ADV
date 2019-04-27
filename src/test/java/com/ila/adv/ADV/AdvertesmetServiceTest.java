package com.ila.adv.ADV;

import com.ila.adv.ADV.Dao.AdvRepo;
import com.ila.adv.ADV.model.Advertesment;
import com.ila.adv.ADV.service.AdvService;
import org.h2.util.DateTimeUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class AdvertesmetServiceTest {
    List<Advertesment> advertesmentList=new ArrayList<>();

    @InjectMocks
    private AdvService advService;

    @Mock
    private AdvRepo advRepo;

    @Before
    public void setUpData(){
        Date date=new Date();
        advertesmentList.add(new Advertesment(1,"Parlor","parlour-serves","Anjali",date,"Hi I provide parlour service"));

    }

    @Test
    public void getAllAdvertesmentPostedTest(){
        when(advService.getAllAdvertesmentPosted()).thenReturn(advertesmentList);
        Assert.assertEquals(1,advertesmentList.size());



    }



}
