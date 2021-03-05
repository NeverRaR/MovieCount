package com.moviecount.mapper;

import com.moviecount.entity.CoWorkRecord;
import com.moviecount.entity.Partner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CoWorkMapper {

    List<CoWorkRecord> selCoWork(String nconst, Integer as_role, Integer cooper);

    List<Partner> selAllCoWork(@Param("style")Integer style);
}
