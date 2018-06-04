package io.redos.spring.mvc.spittr.data;

import io.redos.spring.mvc.spittr.Spittle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SpittleRepostitoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int j = 0; j < count; j++) {
            spittles.add(new Spittle("Spittle" + count,new Date()));
        }
        return spittles;
    }
}
