package com.example.rick.factory;

import com.example.rick.factory.booking.MakeBookingFactoryTest;
import com.example.rick.factory.lists.LocateGymFactoryTest;
import com.example.rick.factory.lists.SessionListFactoryTest;
import com.example.rick.factory.lists.TraineeListFactoryTest;
import com.example.rick.factory.member.*;
import com.example.rick.factory.schedules.CreateUserScheduleFactoryTest;
import com.example.rick.factory.schedules.TrackProgressFactoryTest;
import com.example.rick.factory.schedules.TrackVisitsFactoryTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Rick on 23-Apr-16.*/


 @RunWith(Suite.class)
 @Suite.SuiteClasses({
        InfoFactoryTest.class,
        TypeFactoryTest.class,
        MakeBookingFactoryTest.class,
        AccountFactoryTest.class,
        CreateUserScheduleFactoryTest.class,
        TrackVisitsFactoryTest.class,
        TrackProgressFactoryTest.class,
        UserPasswordFactoryTest.class,
        LocateGymFactoryTest.class,
        SessionListFactoryTest.class,
        TraineeListFactoryTest.class
 })
 public class TestSuiteGymApp {}
