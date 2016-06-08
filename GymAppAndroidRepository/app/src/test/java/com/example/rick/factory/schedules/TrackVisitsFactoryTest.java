package com.example.rick.factory.schedules;

import com.example.rick.gymapp_android.domain.schedules.TrackVisits;
import com.example.rick.gymapp_android.factory.schedules.TrackVisitsFactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Rick on 25-Apr-16.
 */
public class TrackVisitsFactoryTest {
    @Test
    public void testCreate() throws Exception {
        TrackVisits visit = TrackVisitsFactory.getTrackVisit("17-04-2016, 19:00", "Parow");
        Assert.assertEquals("Parow",visit.getGymVisisted());

    }

    @Test
    public void testUpdate() throws Exception {
        TrackVisits visit = TrackVisitsFactory.getTrackVisit("17-04-2016, 19:00", "Parow");
        TrackVisits vistUpdate = new TrackVisits
                .Builder()
                .copy(visit)
                .setGymVisisted("Cavendish")
                .build();
        Assert.assertEquals("Cavendish",vistUpdate.getGymVisisted());

    }
}
