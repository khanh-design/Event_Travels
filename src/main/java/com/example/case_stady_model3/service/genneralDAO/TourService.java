package com.example.case_stady_model3.service.genneralDAO;

import java.util.List;

public interface TourService<E>{
//    List<E> findAllWithStoredProcedure();
    List<E> findAll(int id);
}
