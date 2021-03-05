package com.moviecount.controller;

import com.moviecount.entity.Partner;
import com.moviecount.service.CoWorkService;
import com.moviecount.entity.CoWorkRecord;
import com.moviecount.view.AllCooperationResult;
import com.moviecount.view.CoWorkResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/person")
public class CoWorkController {
    @Autowired
    private CoWorkService coWorkService;

    @GetMapping("/cooperation")
    public @ResponseBody
    CoWorkResult getMovie(@RequestParam String nconst,@RequestParam Integer as_role,@RequestParam Integer cooper){

        List<CoWorkRecord> coWorkRecordList= coWorkService.selCoWork(nconst, as_role, cooper);
        CoWorkResult coWorkResult=new CoWorkResult();
        coWorkResult.setErrorCode(0);
        coWorkResult.setData(coWorkRecordList);

        return coWorkResult;
    }

    @GetMapping("/allCooperation")
    public @ResponseBody
    AllCooperationResult getAllCoWork(@RequestParam Integer style){

        List<Partner> partnerList= coWorkService.selAllCoWork(style);
        AllCooperationResult allCooperationResult=new AllCooperationResult();
        allCooperationResult.setErrorCode(0);
        allCooperationResult.setData(partnerList);

        return allCooperationResult;
    }
}
