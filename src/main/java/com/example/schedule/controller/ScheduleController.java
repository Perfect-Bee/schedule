package com.example.schedule.controller;

import com.example.schedule.dto.ScheduleCreateRequest;
import com.example.schedule.dto.ScheduleCreateResponse;
import com.example.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;

    @PostMapping("/schedule")
    public ResponseEntity<ScheduleCreateResponse> create(
            @RequestBody ScheduleCreateRequest request
    ){
        ScheduleCreateResponse result = scheduleService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    //Get전체/단건

    //Put

    //Delete
}
